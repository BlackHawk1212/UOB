package com.perisic.beds.peripherals;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import com.perisic.beds.questionnaire.QuestionSet;
/**
 * A Simple Graphical User Interface to implement a questionnaire. 
 * @author Marc Conrad
 *
 */
public class QuestionsGUI extends JFrame implements ActionListener  {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1077856539035586635L;
	
	// The GUI only interacts with the QuestionnairePanel class. 
	private QuestionSet questionnaire = new QuestionSet(); 
	
	// Cookie for virtual identity implementation.
	private String myCookie = "not yet set"; 
/**
 * Two possible actions are implemented here: 
 * start the questionnaire and analyses the answers. 
 * To do: refactor code to separate into different concerns; also:  
 * password protect the actions (questionnaire, analysis of data). 
 */
	public void actionPerformed(ActionEvent e) {

		if(e.getSource().equals(nextButton)) { 
			
			for(int i = 0; i < questionnaire.numberOfQuestions(); i++) {

				String message = questionnaire.getQuestion(i); 
				String [] options = questionnaire.getOptions(i); 

				int selectedValue = JOptionPane.showOptionDialog(null, 
						message, "Question "+i, JOptionPane.DEFAULT_OPTION, 
						JOptionPane.QUESTION_MESSAGE, null, options, options[0]);  
				
				questionnaire.submitAnswer(i, options[selectedValue]);
			}
		} else if(e.getSource().equals(analyzeButton)) { 
			questionnaire.reportAnswers(myCookie); 
		} else if(e.getSource().equals(loginButton)) { 
			String str = JOptionPane.showInputDialog("Please enter the password.");
			System.out.println("Checking Password..."); 
			String result = questionnaire.login(str); 
			if( result.equals("wrongpassword") ) { 
				System.out.println("Wrong Password"); 
			} else { 
				myCookie = result;
				System.out.println("Successful Login!"); 
			}
			
		}
		
	}

	JButton nextButton = new JButton("Start Questionnaire");	
	JButton analyzeButton = new JButton("Analyze Answers"); 
	JButton loginButton = new JButton("Login"); 

/**
 * Constructor	
 */
	
	private QuestionsGUI() {
		super();
		setSize(200, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		
	
		
		JPanel panel = new JPanel(); 
				
		panel.add(nextButton); 
		nextButton.addActionListener(this); 
		
		panel.add(loginButton); 
		loginButton.addActionListener(this); 
		
		panel.add(analyzeButton); 
		analyzeButton.addActionListener(this); 
				
		getContentPane().add(panel);
		panel.repaint();
		

	}
	
	public static void main(String [] args ) { 
		QuestionsGUI myGUI = new QuestionsGUI(); 
		myGUI.setVisible(true); 
		
	}

}