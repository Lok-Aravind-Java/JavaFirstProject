package hello1;

public class Time1 {
  private int hour;
  private int minute;
  private int second;

   public Time1(){
	   this(0,0,0);
   }
   
   public Time1(int h){
	   this(h,0,0);
   }
   
   public Time1(int h, int m){
	   this(h,m,0);
   }
   
   
   public Time1(int h, int m,int s){
	   sethour(h);
	   setminute(m);
	   setsecond(s);
   }
   
   
   public void sethour(int h){
	   hour = ((h>=0&&h<=24)? h:0);
   }
   public void setminute(int m){
	   minute = ((m>=0 && m<=60)? m:0);
   }
   public void setsecond(int s){
	   second = ((s>=0 && s<=60)? s:0);
   }
   
   public int gethour(){
	   return hour;
   }
   public int getminute(){
	   return minute;
   }
   public int getsecond(){
	   return second;
   }
   
   public String toMilitary(){
	   return String.format("%02d:%02d:%02d", gethour(),getminute(),getsecond());
   }
}
