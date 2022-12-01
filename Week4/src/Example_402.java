import javax.swing.*;
public class Example_402 {

	public static void main(String[] args) 
	{
		String InputEmail = JOptionPane.showInputDialog("Input your e-mail:");
		while(InputEmail.startsWith("@")||InputEmail.contains(" "))
		{
			InputEmail = JOptionPane.showInputDialog("Input your e-mail, again:");
		}
		InputEmail = InputEmail.toLowerCase();
		/*if(InputEmail.endsWith("@gmail.com")||InputEmail.endsWith("@hotmail.com"))
		{
			JOptionPane.showMessageDialog(null, "Your e-mail is "+InputEmail);
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Your e-mail is not hotmail or gmail dot com ");
		}*/
		boolean checkEmail = InputEmail.endsWith("@gmail.com")||InputEmail.endsWith("@hotmail.com");
		JOptionPane.showMessageDialog(null, (checkEmail)?"Your e-mail is "+InputEmail:"Your e-mail is not hotmail or gmail dot com ");

	}

}
