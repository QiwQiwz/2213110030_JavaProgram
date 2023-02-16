import java.io.*;
import java.text.DecimalFormat;
import java.util.*;
public class ATMChecking extends ATMData {
	private int money;
	static DecimalFormat frm = new DecimalFormat("***,***.00");
	public ATMChecking(String id,String pass,int money) throws IOException {
		super(id,pass);
		this.money=money;
	}
	
	public boolean checkBookBank() throws IOException {
		
		Scanner read = new Scanner(new File("ATMBookBank"));
		boolean chk = false;
		while(read.hasNext()) {
			String id = read.next();
			String pass = read.next();
			String money = read.next();
			
			if((id.equals(super.getId())&&pass.equals(super.getPass()))&&this.money>=Integer.parseInt(money)) {
				chk =true;
			}
			else {
				chk=false;
			}
		}
		
		return chk;
	}
	public void show()throws IOException {
		Scanner read =new Scanner(new File("ATMBookBank"));
		int i=0;
		while(read.hasNext()) {
			String id = read.next();
			String pass = read.next();
			String money = read.next();
			if((id.equals(super.getId())&&pass.equals(super.getPass()))&&this.money>=Integer.parseInt(money)) {
				i=Integer.parseInt(money);
			}
		}
		System.out.println("You drawing for"+this.money%2f+", get");
		int thou =1000;
		int five =500;
		int one =100;
		thou = this.money/1000;
		five = (this.money/thou)/five;
		one = (this.money/thou)/five/one;
	}
}
