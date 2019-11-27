import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.awt.BorderLayout;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.DropMode;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TestWindow {
	
	
	ScriptEngineManager manager;
	ScriptEngine engine;
	
	String calcLine;
	String result = "";

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestWindow window = new TestWindow();
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
	public TestWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.GRAY);
		frame.setBounds(100, 100, 611, 256);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextArea txtrCalculate = new JTextArea();
		txtrCalculate.setEditable(false);
		txtrCalculate.setFont(new Font("Arial", Font.PLAIN, 22));
		txtrCalculate.setLineWrap(true);
		txtrCalculate.setBounds(15, 16, 561, 63);
		frame.getContentPane().add(txtrCalculate);
		
		JButton button_1 = new JButton("1");
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				calcLine = txtrCalculate.getText();
		    	calcLine += "1";
		    	txtrCalculate.setText(calcLine);
			}
		});
		button_1.setBounds(15, 95, 57, 29);
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("2");
		button_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				calcLine = txtrCalculate.getText();
		    	calcLine += "2";
		    	txtrCalculate.setText(calcLine);
			}
		});
		button_2.setBounds(71, 95, 57, 29);
		frame.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("3");
		button_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				calcLine = txtrCalculate.getText();
		    	calcLine += "3";
		    	txtrCalculate.setText(calcLine);
			}
		});
		button_3.setBounds(127, 95, 57, 29);
		frame.getContentPane().add(button_3);
		
		JButton button_4 = new JButton("4");
		button_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				calcLine = txtrCalculate.getText();
		    	calcLine += "4";
		    	txtrCalculate.setText(calcLine);
			}
		});
		button_4.setBounds(183, 95, 57, 29);
		frame.getContentPane().add(button_4);
		
		JButton button_5 = new JButton("5");
		button_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				calcLine = txtrCalculate.getText();
		    	calcLine += "5";
		    	txtrCalculate.setText(calcLine);
			}
		});
		button_5.setBounds(239, 95, 57, 29);
		frame.getContentPane().add(button_5);
		
		JButton button_6 = new JButton("6");
		button_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				calcLine = txtrCalculate.getText();
		    	calcLine += "6";
		    	txtrCalculate.setText(calcLine);
			}
		});
		button_6.setBounds(295, 95, 57, 29);
		frame.getContentPane().add(button_6);
		
		JButton button_7 = new JButton("7");
		button_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				calcLine = txtrCalculate.getText();
		    	calcLine += "7";
		    	txtrCalculate.setText(calcLine);
			}
		});
		button_7.setBounds(351, 95, 57, 29);
		frame.getContentPane().add(button_7);
		
		JButton button_8 = new JButton("8");
		button_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				calcLine = txtrCalculate.getText();
		    	calcLine += "8";
		    	txtrCalculate.setText(calcLine);
			}
		});
		button_8.setBounds(407, 95, 57, 29);
		frame.getContentPane().add(button_8);
		
		JButton button_9 = new JButton("9");
		button_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				calcLine = txtrCalculate.getText();
		    	calcLine += "9";
		    	txtrCalculate.setText(calcLine);
			}
		});
		button_9.setBounds(463, 95, 57, 29);
		frame.getContentPane().add(button_9);
		
		JButton button_0 = new JButton("0");
		button_0.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				calcLine = txtrCalculate.getText();
		    	calcLine += "0";
		    	txtrCalculate.setText(calcLine);
			}
		});
		button_0.setBounds(519, 95, 57, 29);
		frame.getContentPane().add(button_0);
		
		JButton button_plus = new JButton("+");
		button_plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				calcLine = txtrCalculate.getText();
		    	calcLine += "+";
		    	txtrCalculate.setText(calcLine);
			}
		});
		button_plus.setBounds(15, 140, 115, 29);
		frame.getContentPane().add(button_plus);
		
		JButton button_minus = new JButton("-");
		button_minus.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				calcLine = txtrCalculate.getText();
		    	calcLine += "-";
		    	txtrCalculate.setText(calcLine);
			}
		});
		button_minus.setBounds(127, 140, 115, 29);
		frame.getContentPane().add(button_minus);
		
		JButton button_multiply = new JButton("*");
		button_multiply.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				calcLine = txtrCalculate.getText();
		    	calcLine += "*";
		    	txtrCalculate.setText(calcLine);
			}
		});
		button_multiply.setBounds(239, 140, 115, 29);
		frame.getContentPane().add(button_multiply);
		
		JButton button_divide = new JButton("/");
		button_divide.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				calcLine = txtrCalculate.getText();
		    	calcLine += "/";
		    	txtrCalculate.setText(calcLine);
			}
		});
		button_divide.setBounds(351, 140, 115, 29);
		frame.getContentPane().add(button_divide);
		
		JButton button_equals = new JButton("=");
		button_equals.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				manager = new ScriptEngineManager();
		    	engine = manager.getEngineByName("JavaScript");
		    	   
		    	
		    	try {
		    		result += (engine.eval(calcLine)).toString();
		    	} catch (ScriptException e1) {
		    	// TODO Auto-generated catch block
		    		e1.printStackTrace();
		    	}
		    	   
		    	txtrCalculate.setText(result.toString());
			}
		});
		button_equals.setBounds(463, 140, 57, 29);
		frame.getContentPane().add(button_equals);
		
		JButton btn_clear = new JButton("CE");
		btn_clear.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				txtrCalculate.setText("");
		    	result = "";
		    	calcLine = "";
		    	System.out.println("Cleared all variables and GUI!");
			}
		});
		btn_clear.setBounds(519, 140, 57, 29);
		frame.getContentPane().add(btn_clear);
	}
}
