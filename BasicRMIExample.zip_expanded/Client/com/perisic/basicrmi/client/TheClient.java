package com.perisic.basicrmi.client;

import java.rmi.Naming;

import com.perisic.basicrmi.rmiinterface.*;;
/**
 * Basic Example of an RMI Client
 * @author Marc Conrad
 *
 */
public class TheClient {
	public static void main (String [] args ) { 
		System.out.println("(1) Starting the Client..."); 
		try {
			System.out.println("(2) Finding my remote Object...");
			TheInterface myHello =   (TheInterface) Naming.lookup("rmi://localhost/HelloService2021");

			System.out.println("(3) Using the remote Object:"); 

			System.out.println("The Server says: "+myHello.getGreeting()); 


		} catch (Exception e) {
			System.out.println("A problem occured: "+e.toString());
			e.printStackTrace();
			System.out.println("Is your server running?");
		} 
		System.out.println("(4) Exiting the Client. Thank you"); 

	}

}
