package hello;

public class MM1 {
	private String fathername;
	
	public void setname(String name){
		fathername = name;
		
	}
public String getname(){
	return fathername;
}
public void saying(){
	System.out.printf("Your father name is : %s",getname());
}
}
