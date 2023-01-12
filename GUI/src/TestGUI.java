import java.awt.*;
import javax.swing.*;

public class TestGUI extends JFrame {
	private static final int width = 400;
	private static final int Hight = 300;
	// components
	private JLabel lblLength, lblWidth, lblArea, lblPerimeter;
	private JTextField txtLength,txtWidth,txtArea,txtPerimeter; 
	//constructor Method

	public TestGUI() {
		setTitle("Area and Perimeter");
		setSize(width, Hight);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		lblLength = new JLabel("Enter the length: ",SwingConstants.CENTER);//จัดตำแหน่ง
		lblWidth = new JLabel("Enter the width: ",SwingConstants.CENTER);
		lblArea = new JLabel("Area: ",SwingConstants.CENTER);
		lblPerimeter = new JLabel("Perimeter: ",SwingConstants.CENTER);
		//textfield
		//txtLength = new JTextField("10");
		
		GridLayout L = new GridLayout(4, 1);
		setLayout(L);
		
		add(lblLength);//add(txtLength);
		add(lblWidth);
		add(lblArea);
		add(lblPerimeter);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestGUI prog = new TestGUI();

	}

}
