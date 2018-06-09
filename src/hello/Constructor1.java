package hello;

public class Constructor1 {

	int length,breadth,height;
	
public int GetVolume(){
	return (length*breadth*height);
	
}
Constructor1(){
	length = 15;
	breadth = 2;
	height= 10;
}
Constructor1(int l,int b,int h){
	length=l ;
	breadth=b;
	height=h;
	
}
}
