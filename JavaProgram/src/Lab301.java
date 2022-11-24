import javax.swing.*;//Dialog
import java.text.*;//form

public class Lab301 {
	static final int pricePerson = 299;

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###.00");
		int numberOfCustomer = Integer.parseInt(JOptionPane.showInputDialog("How many customer per bill"));
		double totalPrice = numberOfCustomer * pricePerson;
		int membercard;
		do {
			membercard = JOptionPane.showConfirmDialog(null,
					"Total Price is " + totalPrice + " baht." + "\nDo you have a member card?");
		} while (membercard == 2);
		if (membercard == 0) {
			totalPrice = totalPrice * 90 / 100;
			JOptionPane.showMessageDialog(null, "Amount to be paid is" + frm.format(totalPrice) + " baht.");
		} else if (membercard == 1) {
			JOptionPane.showMessageDialog(null, "Amount to be paid is" + frm.format(totalPrice) + " baht.");
		}
	}

}
