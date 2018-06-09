package hello1;

import java.util.EnumSet;
public class Enum {
	
	public static void main(String[] args){
     for(Enumeration aa : Enumeration.values()){
    	 System.out.printf("%s\t%s\t%s\n",aa,aa.getdesc(),aa.getyr());
     }
    	 System.out.println("\n\n");
    	 
    	Enumeration ee = Enumeration.ALLUARJUN;
    	System.out.println(ee);
    	 
    	System.out.println("\n\n");
    	
    	for (Enumeration bb : EnumSet.range(Enumeration.RAM,Enumeration.PRABHAS)){
    		System.out.printf("%s\t%s\t%s\n",bb,bb.getdesc(),bb.getyr());
    	}
	
	
	}
}
