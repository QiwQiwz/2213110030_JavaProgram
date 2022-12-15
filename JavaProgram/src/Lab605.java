import javax.swing.*;
public class Lab605 {

	public static void main(String[] args) {
		int[] number=new int[5];
		for(int i =0;i<number.length;i++)
		{
			number[i]=Integer.parseInt(JOptionPane.showInputDialog("input number "+(i+1)+" :"));
		}
		showEven(number);
		showOdd(number);

	}
	
	public static void showEven(int[] num)
	{
		String even ="";
		for(int i=0;i<num.length;i++)
		{
			if(num[i]%2==0)
			{
				even+=num[i]+" ";
			}
		}
		JOptionPane.showMessageDialog(null,"List of evennumber:\n"+even);
	}
	
	public static void showOdd(int[] num)
	{
		String Odd ="";
		for(int i=0;i<num.length;i++)
		{
			if(num[i]%2!=0)
			{
				Odd+=num[i]+" ";
			}
		}
		JOptionPane.showMessageDialog(null,"List of oddnumber:\n"+Odd);
	}
}
