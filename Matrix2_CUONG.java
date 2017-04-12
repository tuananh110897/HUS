import java.util.*;

public class  Matrix2{

	private static Scanner s;

	public static void printStars(){
		System.out.println("********************");
	}

	public static void inputMatrix(int[][] a){

		for (int row = 0; row < a.length; row++)
			for (int col = 0; col < a[0].length; col ++)

				a[row][col] = s.nextInt();
		
	}

	public static void outputMatrix(int[][] a){

		for (int row = 0; row < a.length; row++){
			for (int col = 0; col < a[0].length; col ++)

				System.out.print(a[row][col] + "\t");

			System.out.println();		
		}
	}
	

	public static int minOfRow(int[][] a, int row){

		int min = Integer.MAX_VALUE;
		for(int col = 0; col < a[row].length; col++ )

			min = (a[row][col] < min)? a[row][col]:min;

		return min;
	}

	public static int maxOfColumn(int[][] a, int col){

		int max = Integer.MIN_VALUE;
		for(int row = 0; row < a.length; row++ )

			max = (a[row][col] > max )? a[row][col]:max;

		return max;
	}

	public static void saddlePointOfMatrix(int[][] a){

		String result = "";
		for (int row = 0; row < a.length; row ++){
			int min = minOfRow(a, row);
			for(int col = 0; col < a[row].length; col++ ){

				if ( a[row][col] == min && a[row][col] == maxOfColumn(a, col) )
					result += "Phan tu yen ngua la: " + a[row][col] + " o hang " + row + " cot " + col +"\n";		
			}
		}
	
		if (result != "")
			System.out.println(result);
		else 
			System.out.println("Khong co gia tri yen ngua");
	


	}

	public static void main(String args[]){

		s = new Scanner(System.in);

		int m = s.nextInt();				
		int n = s.nextInt();
		int[][] matrix = new int[m][n];

		inputMatrix( matrix );

		printStars();

		outputMatrix(matrix);

		System.out.print("Nhan tu nho nhat cua cac hang lan luot la: ");
		for (int row = 0; row < matrix.length; row++)
			System.out.print(minOfRow(matrix, row) + "\t" );
		System.out.println();

		System.out.print("Nhan tu lon nhat cua cac cot lan luot la: ");
		for (int col = 0; col < matrix[0].length; col++)
			System.out.print(maxOfColumn(matrix, col) + "\t" );
		System.out.println();

		saddlePointOfMatrix(matrix);

		printStars();

	}

}
