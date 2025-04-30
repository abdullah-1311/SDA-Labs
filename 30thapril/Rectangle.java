public class Rectangle implements Shape {

    @Override
    public void draw() {
       System.out.println("Shape: Rectangle");
    }
 
    @Override
    public double getPrice() {
       return 10.0; // Base price for Rectangle
    }
 }
 