public class Demo {
    public static void main(String[] args) {
        String salaryRecords = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000";
        
        // Create a chain of decorators: Compression -> Encryption -> File
        DataSourceDecorator encoded = new CompressionDecorator(
                                         new EncryptionDecorator(
                                             new FileDataSource("out/OutputDemo.txt")));

        // Write the data using the decorator chain
        encoded.writeData(salaryRecords);
        
        // Create a plain FileDataSource for reading the raw file content
        DataSource plain = new FileDataSource("out/OutputDemo.txt");

        // Output to demonstrate the various decorators
        System.out.println("- Input ----------------");
        System.out.println(salaryRecords);
        System.out.println("- Encoded --------------");
        System.out.println(plain.readData());  // This will show the base file content
        System.out.println("- Decoded --------------");
        System.out.println(encoded.readData());  // This will show decoded and decompressed data
    }
}
