
package hello;
import java.util.Scanner;
public class UserInputData {
	
	private static Scanner wifi;


	public static void main(String[] args) {
		int x=10;
	
		if(x<=10) {
			for ( int i=1;i<=3;i++){
				 
		 wifi = new Scanner(System.in);
/*		System.out.println("enter some value");
		int x = scan.nextInt();
		
		
		System.out.println("the entered value is ");
		System.out.println(x);
		*/
           
		System.out.println(wifi.nextDouble());
			}
		}
		else {
			System.out.println("the number of trials are done");
		}
	}

}
