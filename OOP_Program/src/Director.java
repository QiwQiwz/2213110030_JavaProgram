
public class Director {
	private String name;
	private String email;
	private char gender;
	
	public Director(String name,String email,char gender) {
		this.name =name;
		this.email = email;
		this.gender =gender;
	}
	public Director(String name,String email) {
		this.name = name;
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public String getGenderName() {
		//return (gender == 'M')? "Male":"Famale";
		if(Character.toUpperCase(gender) == 'm') {
			return "Male";
		}
		if(Character.toUpperCase(gender) == 'f') {
			return "Famale";
		}
		else {
			return "";
		}
	}
	public String toString() {
		return getName()+" ("+getEmail()+";"+getGenderName()+")";
	}
}
