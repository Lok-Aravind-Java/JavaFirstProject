package hello1;

public class Static1 {
	
	private String first;
	private String last;
	private static int members = 0;
	 
	
	public Static1(String fn,String ln){
		
		first = fn;
		last = ln;
		members++;
	System.out.printf("the first name is %s,the last name is %s, members of the club is %d  \n" ,first,last,members);
	}
	
	
	public String GetFirst(){
		return first;
	}
	public String GetLast(){
		return last;
	}
	public static int GetMembers(){
		return members;
	}
	
	
}
