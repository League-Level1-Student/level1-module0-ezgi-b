package _08_jack_in_the_box;

import java.applet.AudioClip;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

public class JackInTheBox implements ActionListener{
	Timer time = new Timer(1500, this);
	public static void main(String[] args) {
		JackInTheBox Jack = new JackInTheBox();
		Jack.GUI();
	}
	Dimension BUTTON = new Dimension(350, 200);
	Random num = new Random();
	int random = num.nextInt(11)+2;
	int clicks = 0;
	void GUI() {
		JFrame frame = new JFrame();
		JButton surprise = new JButton("JACK");
		surprise.setPreferredSize(BUTTON);
		frame.add(surprise);
		frame.setVisible(true);
		surprise.addActionListener(this);
		frame.pack();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		clicks++;
		
		if(clicks==random) {
			playSound("homer-woohoo.wav");
			showPicture("jackInTheBox.png");
			clicks=0;
			random = num.nextInt(11)+2;
		}
		
		if(e.getSource().equals(time)) {
			frame.dispose();
			time.stop();
		}
		
	}
	
	
	
	JFrame frame = new JFrame();
	private void showPicture(String fileName) {
	    try {
	    	Dimension JACKK = new Dimension(600, 400);
	        JLabel imageLabel = createLabelImage(fileName);
	        
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.add(imageLabel);
	        frame.setVisible(true);
	        imageLabel.setPreferredSize(JACKK);
	        frame.pack();
	        time.start();
	        
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
	private JLabel createLabelImage(String fileName) {
		try {
	            URL imageURL = getClass().getResource(fileName);
	            if (imageURL == null) {
		       System.err.println("Could not find image " + fileName);
		       return new JLabel();
	            } else {
	                Icon icon = new ImageIcon(imageURL);
	                JLabel imageLabel = new JLabel(icon);
	                return imageLabel;
	            }
	        } catch (Exception e) {
	            System.err.println("Could not find image " + fileName);
	            return new JLabel();
	        }
	}
	
	
	private void playSound(String soundFile) { 
	    try {
	        AudioClip sound = JApplet.newAudioClip(getClass().getResource(soundFile));
	        sound.play();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
	

}
