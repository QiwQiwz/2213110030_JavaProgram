
public class Author {
	private String name;
	private String email;
	private char gender;

	public Author(String name, String email, char gender) {
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	public Author(String name,String email) {
		this.name=name;
		this.email=email;
		gender=0;
	}
	public Author() {
		name="";
		 email="";
		gender=0;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public String getGenderName() {
		if(Character.toUpperCase(gender)=='m') {
			return "Male";
		}else if(Character.toUpperCase(gender)=='f'){
			return "Female";
		}
		else return"";
	}
	public String toString() {
		return "Author Name: "+name+" ("+email+";"+getGenderName()+")";
	}
	public String toString2() {
		return "Author Name: "+name+" ("+email+")";
	}

}
