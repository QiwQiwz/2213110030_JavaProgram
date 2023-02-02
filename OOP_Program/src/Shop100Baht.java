import javax.swing.*;

public class Shop100Baht {

	public static void main(String[] args) {
		Product arnupab = new Product();
		int confirm = JOptionPane.showConfirmDialog(null, "is the program run on PattanakarnBranch?","runprogram",0);
		if(confirm ==0) {
			 arnupab=new PattanakarnBranch();
			}
		arnupab.setUnit(Integer.parseInt(JOptionPane.showInputDialog("Input the number of product:")));
		JOptionPane.showMessageDialog(null, arnupab);
	}

}
