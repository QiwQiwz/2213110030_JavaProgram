import javax.swing.*;
public class MusicWorldApp {

	public static void main(String[] args) 
	{
		String id;
		id = JOptionPane.showInputDialog("This program calcurates the total cost of a CD order"
				                         +"\nPlease enter the ID of the CD");
		String title;
		title = JOptionPane.showInputDialog("Please enter the title od the CD");
		float price = Float.parseFloat(JOptionPane.showInputDialog("Please enter price of the CD in U.S.dollars"));
		int quantity = Integer.parseInt(JOptionPane.showInputDialog("Please enter the quantity to be purchased"));
		float subtotal = price*quantity;
		float tax = 6.25f;
		float total = subtotal+(subtotal*tax)/100;
		JOptionPane.showMessageDialog(null,"Summary of the transaction:\n"+"\nCD ID:"+id+"\nCD Title:"+title+
				"\nCD Unit Price:"+price+"\nCD Quantity:"+quantity+"\n\nSubtotal: $"
		              +subtotal+"\nTax rate:"+tax+"%"+"\nTotal: $"+total+"\n\nEnd of Program");

	}

}
