package geometry;

import java.util.ArrayList;

public class Main{

	
	public static void main(String[] args) {
		//Rhombus rhombus = new Rhombus();
		//Shape shape = new Shape();
		ArrayList<Shape> shapes = new ArrayList<>();
		shapes.add(new Rectangle(3.2, 6.2));
		shapes.add(new Circle(5.4));
		shapes.add(new Triangle(4.2, 5.6));

		for (Shape shape : shapes) {
			System.out.println("Area: " + shape.getArea());
		}
		
	}

}
