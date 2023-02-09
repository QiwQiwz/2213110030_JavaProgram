import javax.swing.*;
public class ShapeDemo3 {

	public static void main(String[] args) {
		Cylinder cy[]= new Cylinder[5];
		for(int i =0;i<cy.length;i++) {
			
			double radius = Double.parseDouble(JOptionPane.showInputDialog("Input radius "+(i+1)+": "));
			
			double height =Double.parseDouble(JOptionPane.showInputDialog("Input height "+(i+1)+": "));
			
			cy[i]=new Cylinder(radius,height);
			
		}
		int count =1;
		String str="";
		for(Cylinder c:cy) {
			str=str+"Cylinder "+count+", volume="+c.getArea()+"\n";
			count++;
		}
		JOptionPane.showMessageDialog(null, str);

	}

}
