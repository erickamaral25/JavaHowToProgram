package unit1;

import java.util.Scanner;

public class BMI 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		float weight, height, bmi;
		String bmiClass;
		
		System.out.println("Please, enter your weight:");
		weight = input.nextFloat();
		
		System.out.println("And now, please, enter your height:");
		height = input.nextFloat();
		
		System.out.println("Calculating your BMI...");
		
		bmi = weight/(height*height);

		System.out.println("Defining your BMI Class...");
		
		if(bmi < 18.5)	
			bmiClass = "Underweight";
		else
			if(bmi < 25)
				bmiClass = "Normal";
			else
				if(bmi < 30)
					bmiClass = "Overweight";
				else
					bmiClass = "Obese";
		

		System.out.printf("Your BMI value is %f and you are: %s \n ", bmi, bmiClass);
		
		System.out.println("-----------------------------------------------");
		System.out.println("| BMI Values:\t\t\t\t\t|");
		System.out.println("| Underweight:\t less than 18.5\t\t\t|");
		System.out.println("| Normal:\t between 18.5 and 24.9\t\t|");
		System.out.println("| Overweight:\t between 25 and 29.9\t\t|");
		System.out.println("| Obese:\t 30 or greater\t\t\t|");
		System.out.println("------------------------------------------------");
		
		

	}

}
