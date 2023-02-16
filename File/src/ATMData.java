
public class ATMData {
	private String accoutNumber;
	private String password;
	
	public ATMData(String accoutNumber,String password ) {
		this.accoutNumber = accoutNumber;
		this.password =password;
	}
	public String getId() {
		return this.accoutNumber;
	}
	public String getPass() {
		return this.password;
	}
}
