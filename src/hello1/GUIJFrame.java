package hello1;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class GUIJFrame extends JFrame {

	private JLabel item1;
	
	public GUIJFrame(){
		super("the title is ");
		setLayout(new FlowLayout());
		item1 = new JLabel("This is a sentence");
		
		item1.setToolTipText("This is gona show up when you hover over");
		 add(item1);
		 
	
		
	}
	
}
