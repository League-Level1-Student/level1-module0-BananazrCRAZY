package _03_gui_from_scratch._4_cuteness_tv;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class cutenessTV implements ActionListener {
	public void cute() {
		JFrame f = new JFrame();
		JButton duck = new JButton("Duck");
		JButton frog = new JButton("Frog");
		JButton fluUni = new JButton("Fluffy Unicorn");
		JPanel p = new JPanel();
		
		p.add(duck);
		p.add(frog);
		p.add(fluUni);
		f.add(p);
		
		duck.addActionListener(this);
		frog.addActionListener(this);
		fluUni.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

	}
}
