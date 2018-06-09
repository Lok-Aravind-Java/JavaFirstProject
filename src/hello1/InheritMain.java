package hello1;

public class InheritMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Inherit1 rec = new Inherit1();
	Inherit2 tri = new Inherit2();
	
	
	rec.SetValues(5, 5);
	tri.SetValues(3,4);
	
	System.out.println(rec.area());
	System.out.println(tri.area());
	
	
	}

}
