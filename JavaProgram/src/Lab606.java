import javax.swing.*;
public class Lab606 {

	public static void main(String[] args) {
		int[] nums= {25, 78, 41, 22, 36, 85, 37};
		int index =Integer.parseInt(JOptionPane.showInputDialog("Input Index of array:"));
		while(checkIndex(nums,index))
		{
			index =Integer.parseInt(JOptionPane.showInputDialog("Input Index of array,again:"));
			
		}
		String prevData = (prevData(nums,index)!=-1)?"Previous data, nums["+(index-1)+"] is "+prevData(nums,index):"No previos data";
		String nextData = (nextData(nums,index)!=-1)?"Next data, nums["+(index+1)+"] is "+nextData(nums,index):"No next data";
		JOptionPane.showMessageDialog(null, "Current data,nums["+index+"] is "+currentData(nums,index)+"\n"+prevData+"\n"+nextData);

	}//end of main()
	
	public static boolean checkIndex(int[] num,int index)
	{
		return index < 0||index>num.length-1;
	}//end of checkIndex()
	
	
	public static int currentData(int[]num,int index)
	{
		return num[index];
	}
	public static int prevData(int[]num,int index)
	{
		return index ==0?-1:num[index-1];
	}//end of prevData()
	
	public static int nextData(int[]num,int index)
	{
		return index == num.length-1?-1:num[index+1];
	}

}
