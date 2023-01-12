import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class TempConversion extends JFrame{
	//Components
	private JLabel lblCelsius;
	private JLabel lblFahrenheit;
	
	private TextField tfC;
	private TextField tfF;
	
	private static final int width = 600;
	private static final int Hight = 100;
	private static final double FTOC = 5.0/9.0;
	private static final double CTOF = 9.0/5.0;
	private static final int OFFSET = 32;
	public TempConversion() {
		Container c = getContentPane();
		c.setLayout(new GridLayout(1,4));
		
		lblCelsius = new JLabel("Temp in Celsius: ");
		lblFahrenheit = new JLabel("Temp in Fahrenheit: ");
		tfC = new TextField(10);
		tfF = new TextField(10);
		
		c.add(lblCelsius);
		c.add(tfC);
		c.add(lblFahrenheit);
		c.add(tfF);
		
		CelsHandler celsiusHandler = new CelsHandler();
		tfC.addActionListener(celsiusHandler);
		
		 FahrHandler fahrenheit = new  FahrHandler();
		tfF.addActionListener(fahrenheit);
		
		setTitle("Temperature Conversion");
		setSize(width, Hight);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	
		
	}
	
	private class FahrHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			double celsius,fahrenheit;
			fahrenheit = Double.parseDouble(tfF.getText());
			celsius = (fahrenheit-OFFSET) * FTOC  ;
			tfC.setText(String.format("%.2f",celsius));			
		}
	}

	private class CelsHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			double celsius,fahrenheit;
			celsius = Double.parseDouble(tfC.getText());
			fahrenheit = celsius * CTOF + OFFSET ;
			tfF.setText(String.format("%.2f",fahrenheit));
			
		}
	}

	public static void main(String[] args) {
		TempConversion tempCon = new TempConversion();

	}

}
