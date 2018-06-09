package hello1;

public class Staticst {

	public static void main(String[] args) {
		Static1 st = new Static1("Sachin","Tendulkar");
		Static1 st1 = new Static1("Trump","Donald");
		Static1 st2 = new Static1("Narendar","Modi");
		
		System.out.println("-------------------------------");
		
		System.out.println(st.GetFirst());
		System.out.println(st.GetLast());
		System.out.println(Static1.GetMembers());
		
		System.out.println(st1.GetFirst());
		System.out.println(st1.GetLast());
		System.out.println(Static1.GetMembers());
		
		System.out.println(st2.GetFirst());
		System.out.println(st2.GetLast());
		System.out.println(Static1.GetMembers());
		
		System.out.println(Static1.GetMembers());
		
	}
}
		
	