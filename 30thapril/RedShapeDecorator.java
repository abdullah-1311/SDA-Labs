public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape decoratedShape) {
       super(decoratedShape);		
    }
 
    @Override
    public void draw() {
       decoratedShape.draw();	       
       setRedBorder(decoratedShape);
    }
 
    private void setRedBorder(Shape decoratedShape){
       System.out.println("Border Color: Red");
    }
 
    @Override
    public double getPrice() {
       return decoratedShape.getPrice() + 5.0; // Add price for red border decoration
    }
 }
 