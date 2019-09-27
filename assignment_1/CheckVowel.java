package assignment_1;

import java.util.Scanner;

public class CheckVowel {
	
	static char c;
	
	static Scanner sc=new Scanner(System.in);
	
	public void display(char ca)
	{
		if(ca=='a'||ca=='b'|| ca=='c'||ca=='d'||ca=='e'||ca=='A'||ca=='B'||ca=='C'||ca=='D'||ca=='E')
		{
			System.out.println(ca+" is a vowel");
		}
		else {
			System.out.println(ca+ " is not a vowel");
		}
		
	}

	public static void main(String args[])
	{
		
		System.out.println("enetr a character");
		c=sc.next().charAt(0);
		CheckVowel ch=new CheckVowel();
		ch.display(c);
	}
}
