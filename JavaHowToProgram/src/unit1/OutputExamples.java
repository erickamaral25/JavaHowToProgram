package unit1;

import java.util.Scanner;

public class OutputExamples 
{
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int n1, n2, total; //var declartion
		
		System.out.println("Enter the first integer:"); //prompt
		n1 = input.nextInt(); //read the info from user
		
		System.out.println("Enter the second integer:"); //prompt
		n2 = input.nextInt(); //read the info from user
		
		total = n1 + n2;
		
		System.out.printf("The sum of the two values is: %d", total); //show the sum of the two values
		
	}

}
