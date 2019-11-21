import javax.swing.JFrame;
public class CalculatorTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Calculator myCalculator = new Calculator(); // create new Frame
		 myCalculator.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );//when we click the x button
	     //the JFrame will be closed
	       
		 myCalculator.setSize(516, 300 ); // set frame size
		 myCalculator.setVisible( true ); // display frame

	}

}
