package com.perisic.basicrmi.server;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import com.perisic.basicrmi.rmiinterface.TheInterface;

/**
 * Basic RMI Server
 * @author Marc Conrad
 *
 */
public class TheServer {

	public static void main(String[] args) {
		System.out.println("Attempting to start the Hello Server..."); 
		try {
			TheInterface impl = new TheImplementation();
			Registry reg = LocateRegistry.createRegistry(1099);
			reg.rebind("HelloService2021",impl);

			System.out.println("Service started. Welcome to the RMI Hello Service!");

		} catch (RemoteException e) {
			System.out.println("An error occured: "+e.toString()); 
			e.printStackTrace();
		} 

	}

}


