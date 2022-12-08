import java.util.*;
public class Lab403 {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Message : ");
		String messege = scan.nextLine();
		int index =0;
		if(messege.toLowerCase().indexOf("nichi")>=0)
		{
			index++;
		}
		if(index ==1)
		{
			System.out.println("Nichi is a sentence");
		}
		else {
			System.out.println(messege);
		}

	}

}
