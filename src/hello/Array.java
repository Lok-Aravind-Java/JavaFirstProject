package hello;
import java.util.Scanner;
public class Array {

	public static void main(String[] args) {
	int total=0;
         Scanner a = new Scanner(System.in);
         System.out.println("Enter the length of the array");
	       int number = a.nextInt();
	       
	       int[]  array = new int[number];
	       
	       Scanner b = new Scanner(System.in);
	       System.out.println("Enter the list of numbers in the array");
	       
	       for(int counter=0;counter<array.length;counter++){
	    	  
	    	   int num = b.nextInt();
	    	
	    	   array[counter]= num;
	       }
	       
	  for(int element : array){
		  System.out.println(element);
	  }
	  for (int counter=0; counter<array.length;counter++){
		  total = total+array[counter]; 
	  }
	  System.out.println("total is " + total);
	}

}
