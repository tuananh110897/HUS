import java.util.Scanner;
class Matrix2{
	
	private static Scanner scan;
	
	public static void printStars(){
		for (int i = 0; i < 20; i++)
			System.out.print("*");
		System.out.println();
	}
	
	public static void inputArray ( int[][] a ){
		for (int i = 0; i < a.length; i++){
			for (int j = 0; j < a[i].length; j++){
				System.out.print("a[" + i + "][" + j + "]=");
				a[i][j] = scan.nextInt();
			}
		}
	}
	
	public static void outputArray ( int[][] a){
		for (int i = 0; i < a.length; i++){
			for (int j = 0; j < a[i].length; j++)
				System.out.print(a[i][j] + "\t");
		System.out.println();
		}
	}
	
	public static int minOfRow (int[][] a, int i){
		int min = Integer.MAX_VALUE;
		for (int j = 0; j < a[i].length; j++){
			min = ( a[i][j] < min ) ? a[i][j] : min;
		}
		return min;
	}
	
	public static int maxOfColumn (int[][] a, int j){
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++){
			max = (a[i][j] > max) ? a[i][j] : max;
		}
		return max;
	}
	
	public static void main (String args[]){
		scan = new Scanner(System.in);
		System.out.print("Nhap vao so hang: ");
		int row = scan.nextInt();
		System.out.print("Nhap vao so cot: ");
		int col = scan.nextInt();
		int[][] a = new int[row][col];
		System.out.println("Ma tran vua nhap la:");
		inputArray(a);
		outputArray(a);
		printStars();
		System.out.println("Phan tu nho nhat cua cac hang la: ");
		for (int i = 0; i < a.length; i++){
			System.out.print(minOfRow(a,i) + "\t");
		}
		System.out.println();
		System.out.println("Phan tu lon nhat cua cac cot la:");
		for (int j = 0; j < a[0].length; j++){
			System.out.print(maxOfColumn(a,j) + "\t");
		}
		System.out.println();
		printStars();
		
	}
}