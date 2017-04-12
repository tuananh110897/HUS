import java.util.Scanner;
class Matrix{
	
	private static Scanner scan;
	
	public static void printStars(){
		for (int i = 0; i < 20; i++)
			System.out.print("*");
		System.out.println();
	}
	
	public static void inputMatrix (int[][] a){
		for (int i = 0; i < a.length; i++){
			for (int j = 0; j < a[i].length; j++){
				System.out.print("a[" + i + "][" + j + "]= ");
				a[i][j] = scan.nextInt();
			}
		}
	}
	
	public static void outputMatrix (int[][] a){
		System.out.println("Ma tran duoc nhap la:");
		for (int i = 0; i < a.length; i++){
			for (int j = 0; j < a[i].length; j++){
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	public static boolean isDiagonalMatrix (int[][] a){
		for (int i = 0; i < a.length; i++){
			for (int j = 0; j < a[i].length; j++){
				if ( i != j && a[i][j] != 0 )
					return false;
			}
		}
		return true; 
	}
	
	public static boolean isIdentityMatrix (int[][] a){
		for (int i = 0; i < a.length; i++){
			for (int j = 0; j < a[i].length; j++){
				if ( i == j && a[i][j] == 1  ){
					if ( i != j && a[i][j] !=0 )
						return false;
				}
			}
		}
		return true;
	}
	
	public static boolean isSymmetricMatrix (int[][] a){
		for (int i = 0; i < a.length; i++){
			for (int j = 0; j < a[i].length; j++){
				if (a[i][j] != a[j][i])
					return false;
			}
		}
		return true; 
	}
	
	public static void sumOfRow (int[][] a){
		System.out.print("Tong cac hang lan luot la: ");
		for (int i = 0; i < a.length; i++){
			int sum = 0;
			for (int j = 0; j < a[i].length; j++){
				sum += a[i][j];
			}
			System.out.print(sum + "\t" + "\n");
		}
	}
	
	public static void main (String args[]){
		scan = new Scanner(System.in);
		int row, col;
		System.out.print("Nhap vao so hang cua ma tran: ");
		row = scan.nextInt();
		System.out.print("Nhap vao so cot cua ma tran: ");
		col = scan.nextInt();
		int[][] a = new int[row][col];
		inputMatrix(a);
		outputMatrix(a);
		printStars();
		if ( row != col )
			System.out.println("Ma tran vua nhap khong phai la ma tran cheo, don vi, doi xung");
		if ( row == col ){
			if (isSymmetricMatrix(a))
				System.out.println("Ma tran vua nhap la ma tran doi xung");
			else 
				System.out.println("Ma tran vua nhap khong phai la ma tran doi xung");
			if (isDiagonalMatrix(a))
				System.out.println("Ma tran vua nhap la ma tran cheo");
			else
				System.out.println("Ma tran vua nhap khong phai la ma tran cheo");
			if (isIdentityMatrix(a))
				System.out.println("Ma tran vua nhap la ma tran don vi");
			else
				System.out.println("Ma tran vua nhap khong la ma tran don vi");			
			}
			sumOfRow(a);
		printStars();
	}
}