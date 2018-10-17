import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.MalformedURLException;
import javax.swing.*;

public class BinaryConverter implements MouseListener {
	JTextField inputText = null;
	JLabel answerLabel = null;


	
	public static void main(String[] args) {
		BinaryConverter form = new BinaryConverter();
		form.getGoing();
	}
	
	private void getGoing() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    JPanel panel = new JPanel();
	    frame.add(panel);
	    frame.pack();
	    JTextField answer = new JTextField(50);
	    answer.setText("Convert 8 bits of binary into ASCII");
	    answer.setVisible(true);
	    frame.add(answer);
	    frame.pack();
	    
	}
	 
	 
	   
	 
	 
	String convert(String input) {
         if(input.length() != 8){
              JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
              return "-";
         }
         String binary = "[0-1]+";    //must contain numbers in the given range
         if (!input.matches(binary)) {
              JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
              return "-";
         }
         try {
              int asciiValue = Integer.parseInt(input, 2);
              char theLetter = (char) asciiValue;
              return "" + theLetter;
         } catch (Exception e) {
              JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
              return "-";
         }
    }

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
