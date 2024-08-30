package day3;

public class MultiDimensional {
	public static void main(String[] args) {
		
	
	String str1[][]= {
			{"Nate","Java","C","C++"}
			,{"Serena","Java","Unix"}
			,{"Chuck","Linux","Oracle"}
			,{"Dan","RDBMS","c","Oracle"}
			};
	for(int i=0;i<str1.length;i++) {
		if(str1[i][0].equals("Nate")) {
			System.out.print(" Details of Nate \n");
			for(int j=1;j<str1[i].length;j++) {
				System.out.println(str1[i][j]);
			}
			System.out.println();
			break;
		}
	}
	}
}
