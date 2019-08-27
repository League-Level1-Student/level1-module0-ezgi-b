package _10_cuteness_tv;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class cutenessTV implements ActionListener {
	Dimension FRAME = new Dimension(300,200);
	Dimension BUTTON = new Dimension(120,80);
	
	
	JButton VG = new JButton("VG");
	JButton RG = new JButton("RG");
	JButton JG = new JButton("JG");
	
	
	public static void main(String[] args) {
		cutenessTV lionkit = new cutenessTV();
		lionkit.setUpGUI();
	}
	
	public void setUpGUI(){
		JFrame theEdge = new JFrame();
		theEdge.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		theEdge.setPreferredSize(FRAME);
		theEdge.setVisible(true);
		
		
		JPanel SM = new JPanel();
		
		
		VG.setPreferredSize(BUTTON);
		VG.addActionListener(this);
		
		RG.setPreferredSize(BUTTON);
		RG.addActionListener(this);
		
		JG.setPreferredSize(BUTTON);
		JG.addActionListener(this);
		
		
		theEdge.add(SM);
		SM.add(VG);
		SM.add(RG);
		SM.add(JG);
		theEdge.pack();
	}
	
	
	void showMaui() {
	     playVideo("https://www.youtube.com/watch?v=79DijItQXMM");
	}
	

	void showFrog() {
	     playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
	}
	

	void showFluffyUnicorns() {
	     playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
	}
	

	void playVideo(String videoID) {
	     try {
	          URI uri = new URI(videoID);
	          java.awt.Desktop.getDesktop().browse(uri);
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		JButton buttonPressed = (JButton) e.getSource();
		
		if(buttonPressed.equals(VG)) {
			showMaui();
		}
		
		if(buttonPressed.equals(RG)) {
			showFrog();
		}
		
		if(buttonPressed.equals(JG)) {
			showFluffyUnicorns();
		}
		
	}
}
