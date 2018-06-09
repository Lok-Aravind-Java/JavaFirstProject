package hello;
import java.util.Scanner;
public class Manymethods {

	public static void main(String[] args) {

         Scanner abc = new Scanner (System.in);
            MM1 tuna = new MM1();
            
         System.out.println("Enter your father name : ");
         
         String temp = abc.nextLine();
         tuna.setname(temp);
         tuna.saying();
	}

}
