import java.util.*;

class Factorial{
	// method in *
	public static void printStar(){

		for (int i = 0; i < 20; i++){
		System.out.print("*");
		}
		System.out.println();
	}

	// tinh n! = vong lap
	public static long loopFactorial(int n){
		long n = 1;

		for (int i = 1; i <= n; i++){
			// (n * i) tu int => long
			n =(long) (n * i);
		}
		return n;

	}

	// tinh n! = de quy
	public static long recursiveFactorial(int n){
		// n = n * n-1 * n-2 * ... * 1
		// ep n ve dang long de tra ve
		(long) (n) = recursiveFactorial(n - 1);	
		return n;
	}

	public static void main(String args[]){

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		printStar();
		System.out.println(n + "! = " + loopFactorial(n) );
		System.out.println(n + "! = " + recursiveFactorial(n) );
		printStar();
	}

}
