package _03_gui_from_scratch._4_cuteness_tv;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class cutenessTV implements ActionListener {
	JButton duck = new JButton("Duck");
	JButton frog = new JButton("Frog");
	JButton uni = new JButton("Fluffy Unicorn");
	public void cute() {
		JFrame f = new JFrame();
		JPanel p = new JPanel();

		p.add(duck);
		p.add(frog);
		p.add(uni);
		f.add(p);

		duck.addActionListener(this);
		frog.addActionListener(this);
		uni.addActionListener(this);
		
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == duck) {
			showDucks();
		} else if (e.getSource() == frog) {
			showFrog();
		} else if (e.getSource() == uni) {
			showFluffyUnicorns();
		}
		
	}

	void showDucks() {
		JOptionPane.showMessageDialog(null, "Duck video here");
		playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
	}

	void showFrog() {
		JOptionPane.showMessageDialog(null, "Frog video here");
		playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
	}

	void showFluffyUnicorns() {
		JOptionPane.showMessageDialog(null, "Fluffy Unicorn video here");
		playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
	}

	void playVideo(String videoID) {
		//Workaround for Linux because "Desktop.getDesktop().browse()" doesn't 
		//work on some Linux implementations 
		try {
			if (System.getProperty("os.name").toLowerCase().contains("linux")) {
				if (Runtime.getRuntime().exec(new String[] { 
						"which", "xdg- open" }).getInputStream().read() != -1) {
					Runtime.getRuntime().exec(new String[] { "xdg-open", videoID }); 
				}
			} else {
				URI uri = new URI(videoID);
				java.awt.Desktop.getDesktop().browse(uri);
			}      } catch (Exception e) {
				e.printStackTrace();
			}
	}
}