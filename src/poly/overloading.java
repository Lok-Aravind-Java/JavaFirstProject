package poly;

public class overloading {
public void add(){
	System.out.println("the sum is zero");
}
public void add(int a,int b){
	System.out.println(a+b);
}
public void add(int a,int b,int c){
	System.out.println(a+b+c);
}
public static void main(String args[]){
	overloading a = new overloading ();
	a.add();
		a.add(10,20);
			a.add(10,20,30);
}
}
