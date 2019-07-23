package _03_photo_quiz;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public void run() throws Exception {
		int score = 0;
		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		
		// This will make sure the program exits when you close the window
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		String snailAddress = new String("https://upload.wikimedia.org/wikipedia/commons/6/69/Grapevinesnail_01.jpg");
		
		Component snailImage = createImage(snailAddress);
		
		quizWindow.add(snailImage);
		
		quizWindow.pack();
		String answer = JOptionPane.showInputDialog("What is the scientific class of snails?");
		if(answer.equals("Gastropoda")) {
			JOptionPane.showMessageDialog(null, "CORRECT");
			score+=1;
		}else{
			JOptionPane.showMessageDialog(null, "INCORRECT");
		}
		
		quizWindow.remove(snailImage);
		String firepawAddress = new String("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTMFSrxTrxM9Qj9XMcQXsOcJw86o7eNcXu2w5KdX8Wnm-f8Ja2I");
		Component firepawImage = createImage(firepawAddress);
		quizWindow.add(firepawImage);
		quizWindow.pack();
		
		String answerTwo = JOptionPane.showInputDialog("What is Firepaw's warrior name?");
		if(answerTwo.equals("Fireheart")) {
			JOptionPane.showMessageDialog(null, "CORRECT");
			score+=1;
		}else{
			JOptionPane.showMessageDialog(null, "INCORRECT");
		}
		JOptionPane.showMessageDialog(null, "Your score is "+score);
		// 1. find an image on the internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// “Copy Image Address”)

		// 2. create a variable of type "Component" that will hold your image

		// 3. use the "createImage()" method below to initialize your Component

		// 4. add the image to the quiz window

		// 5. call the pack() method on the quiz window

		// 6. ask a question that relates to the image

		// 7. print "CORRECT" if the user gave the right answer

		// 8. print "INCORRECT" if the answer is wrong

		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)

		// 10. find another image and create it (might take more than one line
		// of code)

		// 11. add the second image to the quiz window

		// 12. pack the quiz window

		// 13. ask another question

		// 14+ check answer, say if correct or incorrect, etc.

	}

	private Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
