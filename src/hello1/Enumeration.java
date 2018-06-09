package hello1;

public enum Enumeration {
	 ALLUARJUN("stylish","30"),
	 RAM("descent","31"),
	  NTR("bold","32"),
	 RANA("tall","33"),
	 PRABHAS("good","37"),
	 MAHESH("Handsome","45");
	
	 
	private final String desc;
	private final String year;
	
	Enumeration (String description,String yr){
		desc = description ;
		year = yr ;
		
	}
	
	public String getdesc(){
		return desc;
	}
     
	public String getyr(){
		return year;
	}
}
