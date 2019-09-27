package assignment_1;

import java.util.Scanner;

public class DemoToFindLeapYear {
	
	int year=0;
	boolean leapyear=false;
	
	Scanner sc=new Scanner(System.in);
	
	public void display()
	{
		System.out.println("enter year:");
		year=sc.nextInt();
		
		leapyear=((year%4==0)&&(year%100!=0)||(year%400==0)); 
		
		if (leapyear)
		{
			System.out.println(year+" is a leap year");
		}
		else 
		{
			System.out.println(year+"is not a leap year");
		}
		
		
	}

	public static void main(String args[])
	{
		DemoToFindLeapYear d=new DemoToFindLeapYear();
		d.display();
	}
}
