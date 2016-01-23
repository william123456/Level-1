import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class FortuneCookie implements ActionListener {
	JFrame frame;
	JPanel panel;
	JButton button1;
	String s;
	int randNumber;

	public static void main(String[] args) {
		FortuneCookie fC = new FortuneCookie();
		fC.UI();
	}

	public void UI() {
		frame = new JFrame();
		panel = new JPanel();
		button1 = new JButton();
		frame.add(panel);
		panel.add(button1);
		button1.addActionListener(this);
		button1.setText("Click for your fortune!");
		frame.setVisible(true);
		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		randNumber = rand.nextInt(3);
		if (randNumber == 0) {
			s = "You will win the lottery.";

		} else if (randNumber == 1) {
			s = "You will be happy.";

		} else if (randNumber == 2) {
			s = "You will be immortal.";

		}
		JOptionPane.showMessageDialog(null, s);
	}

}
