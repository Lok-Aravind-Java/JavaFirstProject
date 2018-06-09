package hello;

public class IfStatement {

	public static void main(String[] args) {
		int money = 18;
		
		if (money <= 15){
			System.out.println("you have got very less money");
			
		}else if (money <=25 ){
			System.out.println("you have got a bit less money");
			if (money <20){
		   System.out.println("you have got a bit more less money");
			}
			else if (money <=45){
				System.out.println("you have got pretty good money");
				if (money <=38){
					System.out.println("you have got not too pretty money ");
				}else {
					System.out.println("you have got money btw 38 & 45");
				}
			}
		}else {
			System.out.println("you have got good money");
		}
	}

}
