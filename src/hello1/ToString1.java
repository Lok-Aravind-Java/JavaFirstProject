package hello1;

public class ToString1 {
	private int month;
	private int day;
	private int year;
	
	public ToString1(int m,int d,int y){
		month =m;
		day = d;
		year = y;
		System.out.printf("The date you want is %s",this);
		
	}

	  public String toString(){
		  return String.format("%02d/%02d/%02d",month,day,year);
	  }
}
