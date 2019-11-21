import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.*;
import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;


@SuppressWarnings("serial") //what does this line of code do?
public class Calculator extends JFrame  implements ActionListener {
	
	
	ScriptEngineManager manager;
	ScriptEngine engine;
	
	JButton btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
	JButton btnAdd, btnSub, btnCalc, btnClear;
	JTextArea txtCalc;
	String calcLine;
	Integer result = 0;
	

	public Calculator() {
		
		super("Calculator");
		setLayout(null);
		getContentPane().setBackground(Color.lightGray);
		
		btn0 = new JButton();
		btn0.setText("0");
		btn0.setLocation(0, 150);
		btn0.setSize(50, 50);
		btn0.setActionCommand("ZERO");
		btn0.addActionListener(this);
        add(btn0);
        
        btn1 = new JButton();
        btn1.setText("1");
        btn1.setLocation(50, 150);
        btn1.setSize(50, 50);
        btn1.setActionCommand("ONE");
        btn1.addActionListener(this);
        add(btn1);
        
        btn2 = new JButton();
        btn2.setText("2");
        btn2.setLocation(100, 150);
        btn2.setSize(50, 50);
        btn2.setActionCommand("TWO");
        btn2.addActionListener(this);
        add(btn2);
        
        btn3 = new JButton();
        btn3.setText("3");
        btn3.setLocation(150, 150);
        btn3.setSize(50, 50);
        btn3.setActionCommand("THREE");
        btn3.addActionListener(this);
        add(btn3);
        
        btn4 = new JButton();
        btn4.setText("4");
        btn4.setLocation(200, 150);
        btn4.setSize(50, 50);
        btn4.setActionCommand("FOUR");
        btn4.addActionListener(this);
        add(btn4);
        
        btn5 = new JButton();
        btn5.setText("5");
        btn5.setLocation(250, 150);
        btn5.setSize(50, 50);
        btn5.setActionCommand("FIVE");
        btn5.addActionListener(this);
        add(btn5);
        
        btn6 = new JButton();
        btn6.setText("6");
        btn6.setLocation(300, 150);
        btn6.setSize(50, 50);
        btn6.setActionCommand("SIX");
        btn6.addActionListener(this);
        add(btn6);
        
        btn7 = new JButton();
        btn7.setText("7");
        btn7.setLocation(350, 150);
        btn7.setSize(50, 50);
        btn7.setActionCommand("SEVEN");
        btn7.addActionListener(this);
        add(btn7);
        
        btn8 = new JButton();
        btn8.setText("8");
        btn8.setLocation(400, 150);
        btn8.setSize(50, 50);
        btn8.setActionCommand("EIGHT");
        btn8.addActionListener(this);
        add(btn8);
        
        btn9 = new JButton();
        btn9.setText("9");
        btn9.setLocation(450, 150);
        btn9.setSize(50, 50);
        btn9.setActionCommand("NINE");
        btn9.addActionListener(this);
        add(btn9);
        
        btnAdd = new JButton();
        btnAdd.setText("+");
        btnAdd.setLocation(0, 200);
        btnAdd.setSize(100, 50);
        btnAdd.setActionCommand("ADD");
        btnAdd.addActionListener(this);
        add(btnAdd);
        
        btnSub = new JButton();
        btnSub.setText("-");
        btnSub.setLocation(100, 200);
        btnSub.setSize(100, 50);
        btnSub.setActionCommand("SUB");
        btnSub.addActionListener(this);
        add(btnSub);
        
        btnCalc = new JButton();
        btnCalc.setText("=");
        btnCalc.setLocation(200, 200);
        btnCalc.setSize(100, 50);
        btnCalc.setActionCommand("CALC");
        btnCalc.addActionListener(this);
        add(btnCalc);
        
        btnClear = new JButton();
        btnClear.setText("CLEAR");
        btnClear.setLocation(300, 200);
        btnClear.setSize(100, 50);
        btnClear.setActionCommand("CLEAR");
        btnClear.addActionListener(this);
        add(btnClear);
        
        txtCalc = new JTextArea(); //declare new GUI label
        txtCalc.setLineWrap(true); //Allow string to continue to next line
        txtCalc.setWrapStyleWord(true); //Ensure each string is on a new line
        txtCalc.setEditable(false); //Ensure there is no user input in the text area
        txtCalc.setLocation(5, 5); //Set Position of Welcome label
        txtCalc.setSize(490, 140); //Set size of GUI label
        
        txtCalc.setBackground(Color.DARK_GRAY); //Set background to dark grey
        txtCalc.setForeground(Color.WHITE); //Set text color to WHITE
        txtCalc.setFont(new Font ("Arial", Font.LAYOUT_LEFT_TO_RIGHT, 16)); //Set font & font size & orientation
        add(txtCalc); //Add label to GUI
		
	}
	
	public void actionPerformed (ActionEvent e){
	       //Let check what event is invoke
	       if(e.getActionCommand().equals("ZERO")){
	    	   calcLine = txtCalc.getText();
	    	   calcLine += "0";
	    	   txtCalc.setText(calcLine);
	       }
	       
	       if(e.getActionCommand().equals("ONE")){
	    	   calcLine = txtCalc.getText();
	    	   calcLine += "1";
	    	   txtCalc.setText(calcLine);
	       }
	       
	       if(e.getActionCommand().equals("TWO")){
	    	   calcLine = txtCalc.getText();
	    	   calcLine += "2";
	    	   txtCalc.setText(calcLine);
	       }
	       
	       if(e.getActionCommand().equals("THREE")){
	    	   calcLine = txtCalc.getText();
	    	   calcLine += "3";
	    	   txtCalc.setText(calcLine);
	       }
	       
	       if(e.getActionCommand().equals("FOUR")){
	    	   calcLine = txtCalc.getText();
	    	   calcLine += "4";
	    	   txtCalc.setText(calcLine);
	       }
	       
	       if(e.getActionCommand().equals("FIVE")){
	    	   calcLine = txtCalc.getText();
	    	   calcLine += "5";
	    	   txtCalc.setText(calcLine);
	       }
	       
	       if(e.getActionCommand().equals("SIX")){
	    	   calcLine = txtCalc.getText();
	    	   calcLine += "6";
	    	   txtCalc.setText(calcLine);
	       }
	       
	       if(e.getActionCommand().equals("SEVEN")){
	    	   calcLine = txtCalc.getText();
	    	   calcLine += "7";
	    	   txtCalc.setText(calcLine);
	       }
	       
	       if(e.getActionCommand().equals("EIGHT")){
	    	   calcLine = txtCalc.getText();
	    	   calcLine += "8";
	    	   txtCalc.setText(calcLine);
	       }
	       
	       if(e.getActionCommand().equals("NINE")){
	    	   calcLine = txtCalc.getText();
	    	   calcLine += "9";
	    	   txtCalc.setText(calcLine);
	       }
	       
	       if(e.getActionCommand().equals("ADD")){
	    	   calcLine = txtCalc.getText();
	    	   calcLine += "+";
	    	   txtCalc.setText(calcLine);
		       
	       }
	       
	       if(e.getActionCommand().equals("SUB")){
	    	   calcLine = txtCalc.getText();
	    	   calcLine += "-";
	    	   txtCalc.setText(calcLine);
	       }
	       
	       if(e.getActionCommand().equals("CALC")){
	    	   
	    	   manager = new ScriptEngineManager();
	    	   engine = manager.getEngineByName("JavaScript");
	    	   
	    	
	    	   try {
	    		   result += (int) engine.eval(calcLine);
	    	   } catch (ScriptException e1) {
	    		   // TODO Auto-generated catch block
	    		   e1.printStackTrace();
	    	   }
	    	   
	    	   txtCalc.setText(result.toString());
		       
	    	   
	       }
	       
	       if(e.getActionCommand().equals("CLEAR")){
	    	   
	    	   txtCalc.setText("");
	    	   result = 0;
	    	   calcLine = "";
	    	   System.out.println("Cleared all variables and GUI!");
	    	   
	       }
	       
	}
}
