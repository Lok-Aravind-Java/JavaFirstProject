package hello1;

public class Final1 {

	private int sum;
	private int NUMBER;
	

	public Final1(int x){
		NUMBER = x;
	}
	
	public void add(){
		sum+=NUMBER;
		
	}
	
	public String toString(){
		return String.format("the sum is = %d ", sum);
		
	}
		
}
