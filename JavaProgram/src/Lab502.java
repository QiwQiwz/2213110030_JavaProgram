import java.util.Scanner;

import javax.swing.*;
public class Lab502 {
    static String email;
	public static void main(String[] args) 
	{
		inputEmail();
		email =JOptionPane.showInputDialog("Input your e-mail");
		checkEmailError(email);		

	}
	
	public static void checkEmailError(String chkemail) 
	{
		while(chkemail.startsWith("@")||chkemail.contains(" "))
		{
			chkemail = JOptionPane.showInputDialog("Input your e-mail, again:");
		}
		chkemail = chkemail.toLowerCase();
		JOptionPane.showMessageDialog(null, cherckEmail(chkemail)?"Your e-mail is "+chkemail:"Your e-mail is not hotmail or gmail dot com ");

	}
	public static boolean cherckEmail(String chkemail)
	{
		if(chkemail.endsWith("@gmail.com")||chkemail.endsWith("@hotmail.com"))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static void inputEmail()
	{
		String answer="";
		do {
		email =JOptionPane.showInputDialog("Input your e-mail");
		checkEmailError(email);	
		answer = JOptionPane.showInputDialog("Continue[y||Y to continue]");
		}
		while(answer.equalsIgnoreCase("y"));
	
	}

}
