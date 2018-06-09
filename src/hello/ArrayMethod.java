package hello;

public class ArrayMethod {

	public static void main(String[] args) {
		
		int[] array= {1,2,3,4,5};
		ARM y =new ARM();
		
		y.change(array);
		
		for(int x : array){
			System.out.println(x);
		}
		
		

	}

}
