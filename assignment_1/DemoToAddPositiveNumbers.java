package assignment_1;

import java.util.Scanner;

public class DemoToAddPositiveNumbers {
	
	int num1=0;
	int num2=0;
	
	Scanner sc=new Scanner(System.in);
	
	public void display()
	{
		System.out.println("enter your first number");
		num1=sc.nextInt();
		System.out.println("enter your second number");
		num2=sc.nextInt();
		
		if((num1>=0)&&(num2>=0))
		{
		System.out.println("your sum is " +(num1+num2));
		}
		else{
				System.out.println("cannot enter negative number");
			}
		
	}

	public static void main(String args[])
	{
		DemoToAddPositiveNumbers d=new DemoToAddPositiveNumbers();
		d.display();
	}
}
