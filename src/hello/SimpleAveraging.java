package hello;
import java.util.Scanner;
public class SimpleAveraging {

	public static void main(String[] args) {
		double grade;
		double total = 0;
		int counter = 0;
		double average;
				
		Scanner input = new Scanner(System.in);
		System.out.println("enter any number : ");
		
		
	while (counter<=10 ){
		grade = input.nextDouble();
		total = total+grade;
		counter++;
	}
	average = total/10;
		
         System.out.println("the average is "+  average );
	}

}
