
import java.util.*;

public class checkStockProduct {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("How many product lint in stock : ");
		int stock = scan.nextInt();
		Product[] chkProduct = new Product[stock];
		for (int i = 0; i < chkProduct.length; i++) {
			chkProduct[i] = new Product();
			System.out.print("Input product Id : ");
			chkProduct[i].setId(scan.next());
			System.out.print("Input product Unit : ");
			chkProduct[i].setUnit(scan.nextInt());
			System.out.println();
		}
		Line();
		System.out.println("list of product in 'LOW' status");
		Line();
		for (Product chk : chkProduct) {
			if (chk.getUnit() < 5) {
				System.out.println(">> " + chk.getId() + " has " + chk.getUnit() + " units");
			}
		}
		Line();
		System.out.println("list of product in 'NORMAL' status");
		Line();
		for (Product chk : chkProduct) {
			if (chk.getUnit() >4 && chk.getUnit()<=50) {
				System.out.println(">> " + chk.getId() + " has " + chk.getUnit() + " units");
			}
		}
		Line();
		System.out.println("list of product in 'HIGH' status");
		Line();
		for (Product chk : chkProduct) {
			if (chk.getUnit() >=50) {
				System.out.println(">> " + chk.getId() + " has " + chk.getUnit() + " units");
			}
		}

	}

	public static void Line() {
		for (int i = 0; i < 35; i++) {
			System.out.print("-");
		}
		System.out.println();
	}

}