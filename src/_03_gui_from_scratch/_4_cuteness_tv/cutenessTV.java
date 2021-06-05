package _03_gui_from_scratch._4_cuteness_tv;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class cutenessTV implements ActionListener {
	JButton duck = new JButton("Duck");
	JButton frog = new JButton("Frog");
	JButton fluUni = new JButton("Fluffy Unicorn");
	public void cute() {
		JFrame f = new JFrame();
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

	void showDucks() {
		playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
	}

	void showFrog() {
		playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
	}

	void showFluffyUnicorns() {
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