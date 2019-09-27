package assignment_1;

import java.util.Scanner;

public class DemoToSwapNumbers {
	
	int a=0;
	int b=0;
	
	Scanner sc=new Scanner(System.in);
	
	public void display()
	{
		System.out.println("enter a:");
		a=sc.nextInt();
		System.out.println("enter b:");
		b=sc.nextInt();
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a="+a+"  b="+b);
		
	}

	public static void main(String args[])
	{
		DemoToSwapNumbers d=new DemoToSwapNumbers();
		d.display();
	}
}
