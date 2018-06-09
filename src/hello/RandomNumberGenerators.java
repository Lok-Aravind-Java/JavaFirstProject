package hello;
import java.util.Random;
public class RandomNumberGenerators {

	public static void main(String[] args) {
	int number;
	
	Random dice = new Random();
	
	
	for (int a = 1 ; a<=10 ; a++){
		
		number = 1+dice.nextInt(6);
		System.out.println(number);
	}
	}

}
