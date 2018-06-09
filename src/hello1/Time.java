package hello1;

public class Time {

	public static void main(String[] args) {
		
		Time1 time = new Time1 ();
		Time1 time1 = new Time1 (11);
		Time1 time2 = new Time1 (4,15);
		Time1 time3 = new Time1 (15,24,36);
		
		
		System.out.printf("%s\n",time.toMilitary());
		System.out.printf("%s\n",time1.toMilitary());
		System.out.printf("%s\n",time2.toMilitary());
		System.out.printf("%s\n",time3.toMilitary());

		

	}

}
