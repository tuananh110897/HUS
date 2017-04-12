import java.util.Scanner;
public class matrix_demo {
	public static void main (String arg[]){
	Scanner scan = new Scanner(System.in);
	int n;
	int m;
	System.out.print("nhap so hang=");
	m=scan.nextInt();
	System.out.print("nhap so cot=");
	n=scan.nextInt();
	int [][] matran = new int [m][n];
	for (int i = 0;i<matran.length;i++){
		for (int j = 0; j < matran[i].length; j++){
			matran[i][j] = scan.nextInt();
		}
	}
	for (int i = 0; i < matran.length; i++){
		for (int j = 0;j<matran[i].length;j++){
				System.out.print(matran[i][j] + "\t");
		}
		System.out.println();
	}
	}
}