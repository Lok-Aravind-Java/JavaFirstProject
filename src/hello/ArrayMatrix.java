package hello;

public class ArrayMatrix {

	public static void main(String[] args) {
		
		int firstarray [][]={{1,2,3},{4,5,6},{7,8,9}};
		int secondarray [][]={{1,2,3},{6},{7,8,9,10}};
		
             System.out.println("the firstarray matrix is below");
      abc(firstarray);       
	
      System.out.println("the secondarray matrix is below");
      abc(secondarray);       
	
	}

	public static void abc(int a[][]){
		for (int row=0;row<a.length;row++){
			for(int column=0;column<a[row].length;column++){
				System.out.print(a[row][column]+"\t");
			}
			System.out.println();
		}
	}
}
