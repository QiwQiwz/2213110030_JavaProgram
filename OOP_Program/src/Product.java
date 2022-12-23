
public class Product {

	private String id;
	private int unit;
	private double price;

	// methods
	public void setId(String ID) {
		id = ID;
	}

	public String getId() {
		return id;
	}

	public void setUnit(int UNIT) {
		unit = UNIT;
	}

	public int getUnit() {
		return unit;
	}

	public void setPrice(double PRICE) {
		price = PRICE;
	}

	public double getPrice() {
		return price;
	}

	public double calculate() {
		double Total = unit * price;
		return Total;
	}

	public boolean checkUnit() {
		return unit > 0;
	}

	public boolean checkPrice() {
		return price > 0;
	}

}