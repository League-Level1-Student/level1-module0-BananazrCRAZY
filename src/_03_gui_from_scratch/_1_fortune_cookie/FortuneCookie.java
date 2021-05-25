package _03_gui_from_scratch._1_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {
	public void showButton() {
		System.out.println("Button Clicked");
		JFrame frame = new JFrame();
		frame.setVisible(true);
		
		JButton b = new JButton();
		b.setSize(100, 75);
		frame.add(b);
		frame.pack();
		
		b.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		int ran = new Random().nextInt(5);
		if (ran == 0) {
			JOptionPane.showMessageDialog(null, "Your fortune is:\nYou will be rich!");
		} else if (ran == 1) {
			JOptionPane.showMessageDialog(null, "Your fortune is:\nThere will be loss in your near future.");
		} else if (ran == 2) {
			JOptionPane.showMessageDialog(null, "Your fortune is:\nYou will win the lottery with the number 7.");
		} else if (ran == 3) {
			JOptionPane.showMessageDialog(null, "Your fortune is:\nYou will be #1 in something.");
		} else {
			JOptionPane.showMessageDialog(null, "Your fortune is:\nNO LUCK");
		}
	}
}
