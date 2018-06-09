package hello;
import java.util.Scanner;
public class BasicCalculator {

	public static void main(String[] args) {
		
		Scanner calculator = new Scanner(System.in);
		
		double firstnumber,secondnumber,answer;
		System.out.println("enter the first number");
		firstnumber = calculator.nextDouble();
		
		System.out.println("enter the second number");
		secondnumber = calculator.nextDouble();
		
	
		answer = firstnumber + secondnumber ;
		
		System.out.println("the answer is " + answer );
	
	}

}
