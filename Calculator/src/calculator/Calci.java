package calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Calci {

	private JFrame frame;
	private JTextField textField;
	
	double first;
	double second;
	double result;
	String operation;
	String answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() { 
			public void run() {
				try {
					Calci window = new Calci();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calci() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 291, 363);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Dialog", Font.BOLD, 18));
		textField.setBounds(20, 11, 233, 65);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnBackSpace = new JButton("\uF0E7");
		btnBackSpace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backSpace=null;
				if(textField.getText().length()>0) {
					StringBuilder str = new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					backSpace = str.toString();
					textField.setText(backSpace);
	
				}
				
			}
		});
		btnBackSpace.setFont(new Font("Wingdings", Font.BOLD, 18));
		btnBackSpace.setBounds(20, 80, 59, 48);
		frame.getContentPane().add(btnBackSpace);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setFont(new Font("Dialog", Font.BOLD, 18));
		btn7.setBounds(20, 127, 59, 48);
		frame.getContentPane().add(btn7);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setFont(new Font("Dialog", Font.BOLD, 18));
		btn4.setBounds(20, 174, 59, 48);
		frame.getContentPane().add(btn4);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn1.getText();
				textField.setText(number);
			}
		});
		btn1.setFont(new Font("Dialog", Font.BOLD, 18));
		btn1.setBounds(20, 221, 59, 48);
		frame.getContentPane().add(btn1);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn0.getText();
				textField.setText(number);
			}
		});
		btn0.setFont(new Font("Dialog", Font.BOLD, 18));
		btn0.setBounds(20, 268, 59, 48);
		frame.getContentPane().add(btn0);
		
		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnClear.setFont(new Font("Dialog", Font.BOLD, 18));
		btnClear.setBounds(78, 80, 59, 48);
		frame.getContentPane().add(btnClear);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setFont(new Font("Dialog", Font.BOLD, 18));
		btn8.setBounds(78, 127, 59, 48);
		frame.getContentPane().add(btn8);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setFont(new Font("Dialog", Font.BOLD, 18));
		btn5.setBounds(78, 174, 59, 48);
		frame.getContentPane().add(btn5);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setFont(new Font("Dialog", Font.BOLD, 18));
		btn2.setBounds(78, 221, 59, 48);
		frame.getContentPane().add(btn2);
		
		JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btnDot.getText();
				textField.setText(number);
			}
		});
		btnDot.setFont(new Font("Dialog", Font.BOLD, 18));
		btnDot.setBounds(78, 268, 59, 48);
		frame.getContentPane().add(btnDot);
		
		JButton btnDoublezero = new JButton("00");
		btnDoublezero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btnDoublezero.getText();
				textField.setText(number);
			}
		});
		btnDoublezero.setFont(new Font("Dialog", Font.BOLD, 18));
		btnDoublezero.setBounds(136, 80, 59, 48);
		frame.getContentPane().add(btnDoublezero);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setFont(new Font("Dialog", Font.BOLD, 18));
		btn9.setBounds(136, 127, 59, 48);
		frame.getContentPane().add(btn9);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setFont(new Font("Dialog", Font.BOLD, 18));
		btn6.setBounds(136, 174, 59, 48);
		frame.getContentPane().add(btn6);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setFont(new Font("Dialog", Font.BOLD, 18));
		btn3.setBounds(136, 221, 59, 48);
		frame.getContentPane().add(btn3);
		
		JButton btnEquals = new JButton("=");
		btnEquals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				second = Double.parseDouble(textField.getText());
				if(operation=="+") {
					result=first+second;
					answer = String.format("%2f", result);
					textField.setText(answer);
				}
				else if(operation=="-") {
					result=first-second;
					answer = String.format("%2f", result);
					textField.setText(answer);
				}
				else if(operation=="*") {
					result=first*second;
					answer = String.format("%2f", result);
					textField.setText(answer);
				}
				else if(operation=="/") {
					result=first/second;
					answer = String.format("%2f", result);
					textField.setText(answer);
				}
				if(operation=="%") {
					result=first%second;
					answer = String.format("%2f", result);
					textField.setText(answer);
				}
					
					
					
					
						
			}
		});
		btnEquals.setFont(new Font("Dialog", Font.BOLD, 18));
		btnEquals.setBounds(136, 268, 59, 48);
		frame.getContentPane().add(btnEquals);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first= Double.parseDouble(textField.getText());
				textField.setText("");
				operation="+";
			}
		});
		btnPlus.setFont(new Font("Dialog", Font.BOLD, 18));
		btnPlus.setBounds(194, 80, 59, 48);
		frame.getContentPane().add(btnPlus);
		
		JButton btnMinus = new JButton("-");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first= Double.parseDouble(textField.getText());
				textField.setText("");
				operation="-";
			}
		});
		btnMinus.setFont(new Font("Dialog", Font.BOLD, 18));
		btnMinus.setBounds(194, 127, 59, 48);
		frame.getContentPane().add(btnMinus);
		
		JButton btnMulti = new JButton("*");
		btnMulti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first= Double.parseDouble(textField.getText());
				textField.setText("");
				operation="*";
			}
		});
		btnMulti.setFont(new Font("Dialog", Font.BOLD, 18));
		btnMulti.setBounds(194, 174, 59, 48);
		frame.getContentPane().add(btnMulti);
		
		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first= Double.parseDouble(textField.getText());
				textField.setText("");
				operation="/";
			}
		});
		btnDiv.setFont(new Font("Dialog", Font.BOLD, 18));
		btnDiv.setBounds(194, 221, 59, 48);
		frame.getContentPane().add(btnDiv);
		
		JButton btnPercent = new JButton("%");
		btnPercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first= Double.parseDouble(textField.getText());
				textField.setText("");
				operation="%";
			}
		});
		btnPercent.setFont(new Font("Dialog", Font.BOLD, 18));
		btnPercent.setBounds(194, 268, 59, 48);
		frame.getContentPane().add(btnPercent);
	}
}
