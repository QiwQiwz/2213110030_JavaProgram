import java.util.*;
import java.text.*;//form

public class IncomeTaxCalculator {
	static final double TAX_RATE_ABOVE_20K = 0.1;
	static final double TAX_RATE_ABOVE_40K = 0.2;
	static final double TAX_RATE_ABOVE_60K = 0.3;
	public static void main(String[] args) 
	{
		DecimalFormat frm = new DecimalFormat("0.00");
		for(int i =1;i<8;i++)
		{
			Scanner scan = new Scanner(System.in);
			System.out.print("Enter the taxable: $");
			int taxableIncome = scan.nextInt();
			if(taxableIncome<=20000)
			{
				double taxPayable =0.00;
				System.out.print("The income tax payable is: $"+frm.format(taxPayable));
			}
			else if(taxableIncome<=40000)
			{
				double taxPayable = (taxableIncome-20000)*TAX_RATE_ABOVE_20K;
				System.out.print("The income tax payable is: $"+frm.format(taxPayable));
			}
			else if(taxableIncome<=60000)
			{
				double taxPayable = (taxableIncome-30000)*TAX_RATE_ABOVE_40K;
				System.out.print("The income tax payable is: $"+frm.format(taxPayable));
			}
			else
			{
				double taxPayable = (taxableIncome-60000)*TAX_RATE_ABOVE_60K;
				System.out.print("The income tax payable is: $"+frm.format(taxPayable));
			}
		}
		
	}

}
