package hello;
import java.util.Scanner;
public class CompoundInterest {

	public static void main(String[] args) {
	
		double amount;
		double principal;
		double rate; 
		int yr;
		
		System.out.println("enter the principal");
		Scanner a = new Scanner(System.in);
		principal = a.nextDouble();
		
		System.out.println("Enter the rate");
		Scanner b = new Scanner(System.in);	
		rate = b.nextDouble();
		
		System.out.println("Enter number of years ");
		Scanner c = new Scanner(System.in);	
		yr = c.nextInt();
		
		
		for(int year=1; year<=yr;year++ ){
			
			amount = principal*Math.pow(1+rate, year);
			System.out.println(year +" "+amount);
			
		}

	}

}
