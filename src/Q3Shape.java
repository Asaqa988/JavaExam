
import java.awt.Shape;



public class Q3Shape {

	    public static void main(String[] args) {
	        Q3Shape shapeCalculator = new Q3Shape();
	        
	        Circle circle = new Circle(5);
	        Square square = new Square(4);
	        Rectangle rectangle = new Rectangle(3, 6);
	        
	        
	        System.out.println("Circle area: " + shapeCalculator.getArea(circle));
	        System.out.println("Square area: " + shapeCalculator.getArea(square));
	        System.out.println("Rectangle area: " + shapeCalculator.getArea(rectangle));
	    }

	    public double getArea(Object shape) {
	        return switch (shape) {
	            case Circle c -> Math.PI * c.getRadius() * c.getRadius(); 
	            case Square s -> s.getSide() * s.getSide(); 
	            case Rectangle r -> r.getWidth() * r.getHeight();
	            default -> throw new IllegalArgumentException("Unexpected shape: " + shape);
	        };
	    }
	}

	class Circle {
	    private final double radius;
	    
	    public Circle(double radius) {
	        this.radius = radius;
	    }
	    
	    public double getRadius() {
	        return radius;
	    }
	}

	class Square {
	    private final double side;
	    
	    public Square(double side) {
	        this.side = side;
	    }
	    
	    public double getSide() {
	        return side;
	    }
	}

	class Rectangle {
	    private final double width;
	    private final double height;
	    
	    public Rectangle(double width, double height) {
	        this.width = width;
	        this.height = height;
	    }
	    
	    public double getWidth() {
	        return width;
	    }
	    
	    public double getHeight() {
	        return height;
	    }
	}




