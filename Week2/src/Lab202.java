import java.util.*;
public class Lab202 {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Input the number of minutes: ");
		int InputMinutes = scan.nextInt();
		int hrs = InputMinutes/60;
		int day = hrs/24;
		int year = day/365;
		float days = day%365;
		System.out.print(InputMinutes+" minutes is approximately "+year+" years and "+days+" days");

	}

}
