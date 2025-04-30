import java.nio.charset.StandardCharsets;

public class UTF8Decorator extends DataSourceDecorator {

    public UTF8Decorator(DataSource source) {
        super(source);
    }

    @Override
    public void writeData(String data) {
        // Convert data to UTF-8 before writing
        String utf8Data = new String(data.getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8);
        super.writeData(utf8Data);
    }

    @Override
    public String readData() {
        // Read data and ensure it's in UTF-8 format
        String utf8Data = super.readData();
        byte[] utf8Bytes = utf8Data.getBytes(StandardCharsets.UTF_8);
        return new String(utf8Bytes, StandardCharsets.UTF_8);
    }
}
