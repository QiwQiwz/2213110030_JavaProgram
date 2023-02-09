
public class FictionBook implements Author2,Book2 {
	private String author_name;
	private static String email;
	private String title;
	private int publicYear;
	
	public FictionBook(String title,int publicYear) {
		this.title=title;
		this.publicYear=publicYear;
	}
	
	public void setAuthorName(String name) {
		author_name = name;
	}
	
	public void SetEmail(String email) {
		this.email=email;
	}
	
	public boolean checkFormatName() {
		String firstname = author_name;
		if(firstname == author_name.substring(0,author_name.indexOf(' '))) {
			return true;
		}
		else
		{
			return false;
		}
		
	}
	@Override
	public String getLastName() {
		String lastName = author_name.substring(author_name.indexOf(' '));
		lastName = lastName.substring(0,0);
		return lastName.toUpperCase();
	}
	@Override
	public String getFirstName() {
		String firstName = author_name.substring(0,author_name.indexOf(' '));
		return firstName.toUpperCase();
	}
	@Override
	public static boolean checkEmail()	{
		if(email.endsWith("@gmail.com")||email.endsWith("@hotmail.com"));
		{
			return true;
		}
	}
	
	public int totalPublicYear() {
		return 2023-publicYear;
	}
	
	public String toString() {
		return getTitle() + " write by "+getLastName()+getFirstName()+"("+email+")\nPublished for "+totalPublicYear()+" yeras.";
	}

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return title;
	}

}
