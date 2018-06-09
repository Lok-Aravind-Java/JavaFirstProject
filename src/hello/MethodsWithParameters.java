package hello;
import java.util.Scanner;
public class MethodsWithParameters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		MWPexample exp = new MWPexample();
		System.out.println("Enter your name :");
		String name = input.nextLine();

	       exp.wish(name);
		

	}

}
