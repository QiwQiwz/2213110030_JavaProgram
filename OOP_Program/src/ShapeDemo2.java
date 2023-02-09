import java.util.*;
public class ShapeDemo2 {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		Cylinder cy[]= new Cylinder[5];
		for(int i =0;i<cy.length;i++) {
			System.out.print("Input radius "+(i+1)+": ");
			double radius = scan.nextDouble();
			System.out.print("Input height "+(i+1)+": ");
			double height = scan.nextDouble();
			
			cy[i]=new Cylinder(radius,height);
			System.out.println();
		}
		int count =1;
		for(Cylinder c:cy) {
			System.out.println("Cylinder "+count+", volume"+c.getVolume());
			count++;
		}

	}

}
