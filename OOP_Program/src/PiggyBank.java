
public class PiggyBank {
//attributes
	public int one;
	public int two;
	public int five;
	public int ten;
	public int size;

	// methods
	public void setPiggybank(int s) {
		clear();
		size = s;
	}// end of setPiggybank()

	public int getPiggyBank() {
		return size;
	}// end of getPiggyBank

	public void clear() {
		one = two = five = ten = 0;
	}// end of clear()

	public int getTotal() {
		return one + (two * 2) + (five * 5) + (ten * 10);
	}// end of getTotal()

	public void addOne(int c) {
		if (getTotal() + c <= size) {
			one += c;
		} else {
			System.err.println("Piggy Bank Full");
		}
	}// end of addOne()

	public void addTwo(int c) {
		if (getTotal() + c * 2 <= size) {
			one += c;
		} else {
			System.err.println("Piggy Bank Full");
		}
	}// end of adddTwo()

	public void addFive(int c) {
		if (getTotal() + c * 5 <= size) {
			one += c;
		} else {
			System.err.println("Piggy Bank Full");
		}
	}// end of addFive()

	public void addTen(int c) {
		if (getTotal() + c * 10 <= size) {
			one += c;
		} else {
			System.err.println("Piggy Bank Full");
		}
	}// end of addTem()
}// end of class PiggyBank
