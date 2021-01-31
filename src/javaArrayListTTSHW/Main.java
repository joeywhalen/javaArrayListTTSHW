package javaArrayListTTSHW;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Ask user for 5 numbers, store them in an ArrayList, and use numbers for math
		
		Scanner userInput = new Scanner(System.in);
		ArrayList<Integer> fiveNumbs = new ArrayList<Integer>();//create an ArrayList object
		//fiveNumbs.add(16);
		
		//System.out.println(fiveNumbs);
		
		System.out.println("Please enter a number:");// begin request of numbers for ArrayList
		String Num1 = userInput.nextLine();
		int Numb1 = Integer.parseInt(Num1);
		
		System.out.println("Please enter a number:");// begin request of numbers for ArrayList
		String Num2 = userInput.nextLine();
		int Numb2 = Integer.parseInt(Num2);
		
		System.out.println("Please enter a number:");// begin request of numbers for ArrayList
		String Num3 = userInput.nextLine();
		int Numb3 = Integer.parseInt(Num3);
		
		System.out.println("Please enter a number:");// begin request of numbers for ArrayList
		String Num4 = userInput.nextLine();
		int Numb4 = Integer.parseInt(Num4);
		
		System.out.println("Please enter a number:");// begin request of numbers for ArrayList
		String Num5 = userInput.nextLine();
		int Numb5 = Integer.parseInt(Num5);
		
		fiveNumbs.add(Numb1);
		fiveNumbs.add(Numb2);
		fiveNumbs.add(Numb3);
		fiveNumbs.add(Numb4);
		fiveNumbs.add(Numb5);
		
		int sumFiveNumbs = 0;
		for (int i : fiveNumbs)
			sumFiveNumbs += i;
		
		System.out.printf("The sum of the numbers is %s:\n", sumFiveNumbs);
		
		//sumFiveNumbs = (Numb1 + Numb2);
		
		
		//System.out.println(Numb1);
		//System.out.println(Numb2);
		//ArrayList<Integer> fiveNumbs = userInput.nextLine();
		

	}

}
