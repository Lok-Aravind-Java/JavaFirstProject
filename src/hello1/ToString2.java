package hello1;

public class ToString2 {
	
	private String name;
	private ToString1 birthday;
	
	public ToString2(String thename,ToString1 theday){
		name = thename;
		birthday = theday;
		
	}
	
	
	public String toString(){
		return String.format("the name is %s,\n the date is %s ",name,birthday );
	}

}
