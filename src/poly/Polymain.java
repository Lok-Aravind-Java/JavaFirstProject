package poly;

public class Polymain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Poly1 p = new Poly3();
		p.eat();
	
		Poly1 g[] = new Poly1[2];
		g[0]= new Poly2();
		g[1]= new Poly3();
		
		for(int x = 0 ; x<2 ; ++x){
		g[x].eat();
		}	
		System.out.println("----------------------------");
		Poly4 abc = new Poly4();
		Poly1 bcd = new Poly1();
		Poly1 cde = new Poly2();
		Poly1 def = new Poly3();
		
		
	
		abc.digest(bcd);
		abc.digest(cde);
		abc.digest(def);
	
		
		
		
		
	}

}
