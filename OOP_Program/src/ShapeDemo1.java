import java.util.*;
public class ShapeDemo1 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input radius: ");
		double radius = scan.nextDouble();
		System.out.print("Input height: ");
		double height = scan.nextDouble();
		Circle circle = new Circle(radius,null);
		System.out.println();
		System.out.println(circle);
		System.out.println("Circle[area="+circle.getArea()+"]");
		
		Cylinder cy = new Cylinder(radius,height);
		System.out.println();
		System.out.println(cy);
		System.out.println("Cylinder[area="+cy.getArea()+"]");
		System.out.println("Cylinder[volume="+cy.getVolume()+"]");
		

	}

}
