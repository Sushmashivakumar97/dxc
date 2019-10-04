package com.dxc.pms.client;

import java.util.Scanner;

import com.dxc.pms.dao.PassengerDAO;
import com.dxc.pms.dao.PassengerDAOImpl;
import com.dxc.pms.model.Passenger;

public class Main {
	public static void main(String[] args) {
		PassengerDAO passengerDAO=new PassengerDAOImpl();
		
		while(true)
		{
			@SuppressWarnings("resource")
			Scanner sc=new Scanner(System.in);
			System.out.println("M E N U ");
            System.out.println("1. Add The passenger : ");
            System.out.println("2. Get All The passenger : ");
            System.out.println("3. E X I T");
            
            int choice=0;
            System.out.println("enter d choice (1-3");
            choice=sc.nextInt();
            
            switch(choice)
            {
            case 1:
            	System.out.println("Please enter pnr number :");
            	int pnrNumber = sc.nextInt();
            	System.out.println("Please enter passenger name :");
            	String passengerName = sc.next();
            	System.out.println("Please enter source:");
            	String source = sc.next();
            	System.out.println("Please enter destination :");
            	String destination = sc.next();
            	System.out.println("Please enter fare :");
            	int fare = sc.nextInt();
            	
            	Passenger passenger=new Passenger(pnrNumber, passengerName, source, destination, fare);
            	
            	passengerDAO.addPassenger(passenger);
            	break;
            case 2:
            		System.out.println(passengerDAO.getAllPassenger());
            		break;
            
            case 3:
            		System.out.println("thanks");
            		System.exit(0);
            	
            default:
            		System.out.println("enter valid choice");
            		
            }
		}
	}

}
