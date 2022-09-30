package com.perisic.basicrmi.server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import com.perisic.basicrmi.rmiinterface.TheInterface;

/**
 * Implements the Service. 
 * @author Marc Conrad
 *
 */
public class TheImplementation extends UnicastRemoteObject implements TheInterface {
	
	protected TheImplementation() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}
	private static final long serialVersionUID = -3763231206310448L;
	@Override
	public String getGreeting() throws RemoteException {
		
		return "Hello. This is Marc Conrad's Server! How are you today?";
	}

}
