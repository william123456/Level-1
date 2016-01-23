import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GetLatestTweet {
	JFrame frame;
	JPanel panel;
	JButton button1;
	JTextField textField;

	public static void main(String[] args) {
		GetLatestTweet gLT = new GetLatestTweet();
		gLT.UI();

	}

	public void UI() {
		frame = new JFrame();
		panel = new JPanel();
		button1 = new JButton();
		textField = new JTextField();
		textField.setBounds(0, 0, 500, 100);
		frame.add(panel);
		panel.add(button1);
		panel.add(textField);
		frame.setVisible(true);
		frame.pack();
		
		
	}
}
