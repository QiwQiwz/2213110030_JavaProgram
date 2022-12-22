import java.util.*;
public class StockProduct {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		Product[] productList = new Product[4];
		for(Product PRO:productList) {
			PRO =new Product();
			System.out.print("Input product Id   : ");
			PRO.setId(scan.next());
			System.out.print("Input product Unit : ");
			PRO.setUnit(scan.nextInt());
			while(!PRO.checkUnit()) {
				System.out.print("Input product Unit, again: ");
				PRO.setUnit(scan.nextInt());
			}
			
		}

	}

}
