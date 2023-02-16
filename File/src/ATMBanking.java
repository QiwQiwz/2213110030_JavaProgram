import java.util.*;
import java.io.*;
import java.text.*;
public class ATMBanking {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		DecimalFormat frm = new DecimalFormat("0-000-000-00-0");
		System.out.print("Enter Account number : ");
		String id = console.nextLine();
		while(id!=frm.format(id)) {
			System.out.print("Input wrong type, Enter account number : ");
			id = console.nextLine();
		}
		
		//ATMChecking bank = new ATMChecking(id,pass,money);

	}

}
