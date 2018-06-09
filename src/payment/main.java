package payment;

public class main {

	public static void main(String[] args) {
		creditcard a = new creditcard();
		paypal b = new paypal();
		applepay c = new applepay();
		discover d = new discover();
		visa e = new visa();
		master f = new master();
		americanexpress g = new americanexpress ();
		
	
	  a.dueamount();
      b.totalamount();
      c.minimumamount();
      a.totalamount();
      b.minimumamount();
      c.dueamount();
      e.dueamount();
      f.dueamount();
      g.dueamount();
      d.dueamount();
	}

}
