import javax.swing.*;
import java.awt.event.*;
public class FrameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*JFrame window = new JFrame("Hello, World!");
		window.setSize(300, 300);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);*/
		MyFrame window = new MyFrame();
	}

}

class MyFrame extends JFrame{
	private JLabel inputLbl;
	private JButton submitBtn;
	private JTextField inputTxt;
	private JPanel onePnl;
	
	public MyFrame(){
		setTitle("My Example Window");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		
		inputLbl = new JLabel("Enter name");
		submitBtn = new JButton("Click this");
		inputTxt = new JTextField(20);
		onePnl = new JPanel();
		
		WelcomeListener wl = new WelcomeListener();
		submitBtn.addActionListener(wl);
		//submitBtn.addActionListener(new WelcomeListener());
		
		onePnl.add(inputLbl);
		onePnl.add(inputTxt);
		onePnl.add(submitBtn);
		
		add(onePnl);
		setVisible(true);
	}
	
	private class WelcomeListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			System.out.println("here");
			String s = inputTxt.getText();
			JOptionPane.showMessageDialog(null, "Welcome, " + s);
		}
		
	}
}
