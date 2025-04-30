public class Circle implements Shape {

    @Override
    public void draw() {
       System.out.println("Shape: Circle");
    }
 
    @Override
    public double getPrice() {
       return 15.0; // Base price for Circle
    }
 }
 