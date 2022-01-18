package com.Question4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tester=1;
		int number=0;
		Scanner sc=new Scanner(System.in);
		do
		{
			try
			{
			System.out.println("“Please enter a number or enter ‘-1’ if you want to quit” : ");
			number=sc.nextInt();
		
			if(number==-1)
			{
				tester=0;;
				continue;
			}
			if(number%2==0)
				System.out.println("“You have entered an even integer. ”");
			else
				System.out.println("“You have entered an odd number. ”");
				
			}
			catch(InputMismatchException e)
			{
				System.out.println("“You must enter an integer.”");
			}
			sc.nextLine();
		}while(tester!=0);
		System.out.println("Exit from the program");
		
		sc.close();

	}

}

