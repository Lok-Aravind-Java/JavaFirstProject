package hello1;

public class VariableAraguement {

	public static void main(String[] args) {
		
		System.out.println(average(12,1,3,4,54));
	}
	public static float average(float...numbers)
	{
	float sum=0;
	float avg=0;
	System.out.println("Total Numbeers:\t"+numbers.length);
	for(float x:numbers)
	{
	sum+=x;
	avg=sum/numbers.length;

	}
	return avg;	
	}

}
