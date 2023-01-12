import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import java.text.*;
import javax.swing.*;

import javax.swing.JCheckBox;public class CalculateTwoNumber extends JFrame {

	private JPanel contentPane;
	private JTextField Text2;
	private JTextField Text1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculateTwoNumber frame = new CalculateTwoNumber();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CalculateTwoNumber() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 604, 430);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNum1 = new JLabel("Enter Number1");
		lblNum1.setBounds(51, 26, 141, 28);
		lblNum1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contentPane.add(lblNum1);
		
		Text2 = new JTextField();
		Text2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		Text2.setBounds(277, 83, 254, 34);
		contentPane.add(Text2);
		Text2.setColumns(10);
		
		JLabel lblNum2 = new JLabel("Enter Number2");
		lblNum2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNum2.setBounds(51, 81, 120, 41);
		contentPane.add(lblNum2);
		
		final JLabel lblResult = new JLabel("Result");
		lblResult.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblResult.setBounds(447, 300, 73, 34);
		contentPane.add(lblResult);
		
		JLabel lblOperator = new JLabel("Operator");
		lblOperator.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblOperator.setBounds(51, 143, 81, 18);
		contentPane.add(lblOperator);
		
		final JComboBox chOperator = new JComboBox();
		chOperator.setFont(new Font("Tahoma", Font.PLAIN, 14));
		chOperator.setBounds(277, 143, 89, 22);
		
		chOperator.addItem("+");
		chOperator.addItem("-");
		chOperator.addItem("*");
		chOperator.addItem("/");
		contentPane.add(chOperator);
		
		JLabel lblDigit = new JLabel("How to show digit");
		lblDigit.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblDigit.setBounds(51, 181, 138, 21);
		contentPane.add(lblDigit);
		
		final JRadioButton Digit1na = new JRadioButton("1 Digit");
		Digit1na.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Digit1na.setBounds(269, 181, 109, 23);
		contentPane.add(Digit1na);
		
		final JRadioButton Digit2na = new JRadioButton("2 Digit");
		Digit2na.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Digit2na.setBounds(269, 215, 109, 23);
		contentPane.add(Digit2na);
		
		ButtonGroup group = new ButtonGroup();
		group.add(Digit1na);
		group.add(Digit2na);
		
		JLabel lblShow = new JLabel("Option to show");
		lblShow.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblShow.setBounds(51, 248, 141, 18);
		contentPane.add(lblShow);
		
		final JCheckBox chkDialogBox = new JCheckBox("Show Result at DialogBlox");
		chkDialogBox.setFont(new Font("Tahoma", Font.PLAIN, 12));
		chkDialogBox.setBounds(269, 248, 217, 23);
		contentPane.add(chkDialogBox);
		
		Text1 = new JTextField();
		Text1.setBounds(277, 21, 254, 33);
		contentPane.add(Text1);
		Text1.setColumns(10);
		
		final JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1,num2,sum=0;
				String operator;
				//JButton
				if(e.getSource()==btnOk) {
					num1 = Double.parseDouble(Text1.getText());
					num2 = Double.parseDouble(Text2.getText());
					operator = (String)chOperator.getSelectedItem();
					if(operator.equals("+")) {
						sum = num1+num2;
					}
					if(operator.equals("-")) {
						sum = num1-num2;
					}
					if(operator.equals("*")) {
						sum = num1*num2;
					}
					if(operator.equals("/")) {
						sum = num1/num2;
					}
					//JRadioButton
					DecimalFormat frmNumber = null;
					if(Digit1na.isSelected()) {
						frmNumber = new DecimalFormat("#,###.0");
					}
					if(Digit2na.isSelected()) {
						frmNumber = new DecimalFormat("#,###.00");
					}
					
					//sum = num1+num2;
					lblResult.setText(frmNumber.format(sum));
					
					if(chkDialogBox.isSelected()) {
						JOptionPane.showMessageDialog(null,"Result is : "+sum);
					}
					
				}
			}
		});
		btnOk.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnOk.setBounds(129, 303, 109, 28);
		contentPane.add(btnOk);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnExit.setBounds(269, 303, 109, 28);
		contentPane.add(btnExit);
		
		
		
		
		
		
	}
}
