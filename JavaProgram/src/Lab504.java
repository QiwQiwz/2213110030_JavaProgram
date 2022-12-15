import java.util.*;
public class Lab504 {
	static String fullname ="";
	public static void main(String[] args) 
	{
		
		Scanner scan =new Scanner(System.in);
		System.out.print("Please enter your name, separated by a space."+"\n:");
		fullname = scan.nextLine();
		String firstname = fullname.substring(0,fullname.indexOf(' '));
		System.out.println(abbviatName(fullname)+firstname);
	}
	
	public static String abbviatName(String fullname)
	{
		String midname ="";
		for(int i =0;i<fullname.length();i++)
		{
			if(fullname.charAt(i)==' ')
			{
				midname+=fullname.charAt(i+1)+".";
			}
		}
		return midname;
	}

}
