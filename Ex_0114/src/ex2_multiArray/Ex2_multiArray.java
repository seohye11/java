package ex2_multiArray;

public class Ex2_multiArray {
	public static void main(String[] args) {
		
		String[][] student = { {"철수", "90"},
		                       {"민수", "89", "67"},
		                       {"영희", "90", "70", "88"} };
		
		for(int i = 0; i < student.length; i++) {
			
			for(int j = 0; j < student[i].length; j++) {
				
				System.out.print(student[i][j]+" ");
				
			}//inner
			
			System.out.println();
			
		}//outer
		
	}//main


}
