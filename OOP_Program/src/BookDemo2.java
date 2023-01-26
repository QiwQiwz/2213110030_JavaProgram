import javax.swing.*;
public class BookDemo2 {

	public static void main(String[] args) {
		String name =JOptionPane.showInputDialog("Input author name:");
		String email =JOptionPane.showInputDialog("Input author e-mail:");
		Author1 auth =new Author1(name,email);
		String title =JOptionPane.showInputDialog("Input book title : ");
		int page =Integer.parseInt(JOptionPane.showInputDialog("Input book page : "));
		int confirm = JOptionPane.showConfirmDialog(null,"is the page correct?","confirm",0);
		while(confirm ==1) {
		page =Integer.parseInt(JOptionPane.showInputDialog("Input book page, again : "));
			confirm = JOptionPane.showConfirmDialog(null,"is the page correct?","Confirm",0);
		}
		Book1 book = new Book1(title,auth,page);
		JOptionPane.showMessageDialog(null,"Book Title: "+book.getTitle()+"\nAuthor name: "+book.getAuthor()+" ("+book.getPage()+" page)"
		+"\nAuthor e-mail: "+book.getAuthor().getEmail());
		
		}
		
		
		

	

}
