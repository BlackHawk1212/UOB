package com.perisic.beds.questionnaire;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.util.Vector;

import com.perisic.beds.peripherals.ShowImageFromURL;
import com.perisic.beds.rmiinterface.Question;
import com.perisic.beds.rmiinterface.RemoteQuestions; 
/**
 * Represents the questionnaire locally. All requests from peripherals will be 
 * through this class. 
 * @author Marc Conrad
 *
 */
public class QuestionSet {

	RemoteQuestions myQuestions; 
	/**
	 * Retrieves the questions from the server. 
	 * To do: connect to different servers, make configurable. 
	 */
	public QuestionSet() {
		super();
		try {
			myQuestions =   (RemoteQuestions) Naming.lookup("rmi://localhost/QuestionService1819");
		} catch (Exception e) {
			System.out.println("A problem occured: "+e.toString());
			e.printStackTrace();
			System.out.println("Is your server running?");
		} 
	}
	/**
	 * How many questions are there in the questionnaire?
	 * @return number of questions.
	 */

	public int numberOfQuestions() { 
		try {
			return myQuestions.getNumberOfQuestions();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0; 
		} 
	}
	/**
	 * Retrieve a specific question. 		
	 * @param i the number of the question.
	 * @return text of the question. 
	 */
	public String getQuestion(int i) { 
		try {
			return myQuestions.getQuestion(i).getQuestionText();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "no connection to server"; 
		} 
	}
	/** 
	 * Gives a set of options for this question. 
	 * @param i the number of the question.
	 * @return an array of options. 
	 */
	public String [] getOptions(int i) { 
		try {
			return myQuestions.getQuestion(i).getAnswers();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null; 
		} 
	}
	/**
	 * Submit the answer to a given question.
	 * @param i the question.
	 * @param answer the chosen answer.
	 */
	public void submitAnswer(int i, String answer) { 
		try {
			myQuestions.submitAnswer(i, answer);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	/** 
	 * Reports the answers in various ways. 
	 */
	public void reportAnswers(String cookie) { 

		try {
           Vector<Question> answers = myQuestions.getData(cookie); 
           if(answers == null ) { 
				System.out.println("You must be logged in to retrieve the Answers"); 
			} else { 
			Answers myAnswers = new Answers(answers);
			

				System.out.println("Basic analysis:");
				System.out.println(myAnswers.basicAnalysis());

				ShowImageFromURL.show(myAnswers.getBarChartURL());
			}
		} catch (RemoteException e) {
			System.out.println("Something went wrong: "+e.toString());
			e.printStackTrace();
		}  
	}
	public String login(String str) {
		try {
			return myQuestions.login(str);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		// TODO Auto-generated method stub
		return null;
	}

}
