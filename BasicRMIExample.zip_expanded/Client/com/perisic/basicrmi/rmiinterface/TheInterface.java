package com.perisic.basicrmi.rmiinterface;


import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * RMI interface for a basic service that return a greeting
 * @author Marc Conrad
 *
 */
public interface TheInterface extends Remote {

	/**
	 * Says Hello
	 * @return
	 * @throws RemoteException
	 */
	public String getGreeting() throws RemoteException; 
	/**
	 * Retrieve specific question from the server. 
	 * @param i number of the question. 
	 * @return the Question. 
	 * @throws RemoteException
	 */
}
