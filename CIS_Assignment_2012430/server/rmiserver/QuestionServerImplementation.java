package rmiserver;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Vector;

import com.perisic.beds.rmiinterface.Question;
import com.perisic.beds.rmiinterface.RemoteQuestions;

/**
 * Implementation of the questionnaire. Note that chosen answers are collected in this
 * object as well. That means that if the object is destroyed, for instance server restart
 * the collected data is all gone. 
 * To do: make data persistent, for instance link collected data to a database or save data
 * in a text file.  
 * @author Marc Conrad
 *
 */
public class QuestionServerImplementation 
extends UnicastRemoteObject implements RemoteQuestions{
	private static final long serialVersionUID = -3763231206310491048L;
	Vector<Question> myQuestions = new Vector<Question>(); 
	/**
	 * All questions and answers are initialised in the constructor of this class. 
	 * To do: read questions and options from an external data file. 
	 * @throws RemoteException
	 */
	QuestionServerImplementation() throws RemoteException {
		super();
		System.out.println("QuestionServerImplementation Created");
		String[] answers = {"Poor", "Less than Satisfactory", "Satisfactory","Good","Very Good" }; 
		
		
		
		Question question1 = new Question("Doctor Being Polite", answers ); 
		myQuestions.add(question1); 

		Question question2 = new Question("Making You Feel at ease", answers );
		myQuestions.add(question2); 

		Question question3 = new Question("Explaining your condition and treatment", answers );
		myQuestions.add(question3); 
		
		Question question4 = new Question("Providing or arranging treatment for you", answers );
		myQuestions.add(question4); 
		
		Question question5 = new Question("Involving you in decisions about your treatment", answers );
		myQuestions.add(question5); 
	
		Question question6 = new Question("Doctor will keep the information  confidential", answers ); 
		myQuestions.add(question6); 

		Question question7 = new Question("The Doctor is honest and trustworthy", answers );
		myQuestions.add(question7); 

		Question question8 = new Question("Clean explanation is given why tests are done", answers ); 
		myQuestions.add(question8); 

		Question question9 = new Question("Visiting the clinic is not stressful", answers );
		myQuestions.add(question9); 
		
	}

	/**
	 * Implementation of remote interface method. 
	 */
	@Override
	public int getNumberOfQuestions() throws RemoteException {
		return myQuestions.size();
	}
	/**
	 * Implementation of remote interface method. 
	 */
	@Override
	public Question getQuestion(int i) throws RemoteException {
		return myQuestions.elementAt(i);
	}
	/**
	 * Implementation of remote interface method. 
	 */	
	@Override
	public void submitAnswer(int i, String answer) throws RemoteException {
		myQuestions.elementAt(i).addAnswer(answer);
	}
	/**
	 * Implementation of remote interface method. 
	 */	
	@Override
	public Vector<Question> getData() { 
		return myQuestions; 
	}

}
