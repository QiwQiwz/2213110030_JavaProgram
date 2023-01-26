
public class PersonalInfo {
	private Person name;
	private Date bDay;
	private int personId;
	
	public PersonalInfo() {
		name = new Person();
		bDay = new Date();
		personId = 0;
	}
	public PersonalInfo(String first,String last,int month,int day,int year,int ID) {
		name = new Person(first,last);
		bDay = new Date(month,day,year);
		personId = ID;
	}
	public void setPersonalInfo(String first,String last,int month,int day,int year,int ID) {
		name.setName(first, last);
		bDay.setDate(month, day, year);
		personId = ID;
	}
	public String toString() {
		return "Name :"+name.toString()+"\nDate of birth: "+bDay.toString()+"\nPersonal ID: "+personId;
	}

}
