import java.util.*;

class DivisorMultiple{
	
	// ham lay ucln
	public static int gcd(int m, int n){
		
		int max = (m > n)? m : n;

		for (int i = max; i > 1; i-- ){
			if (m % i == 0 && n % i ==0){
				return i;			
			}
		}

		return 1;
	}

	// ham lay bcnn	
	public static int lcm(int m, int n, int gcd){
		
		return m * n / gcd;

	}

	public static void main(String args[]){
		Scanner s = new Scanner(System.in);

		// nhap m
		System.out.println("m = ");
		int m = s.nextInt();

		// nhap n 
		System.out.println("n = ");
		int n = s.nextInt();

		// goi bien de cua UCLN BCNN
		int gcd = gcd(m, n);
		int lcm = lcm (m , n, gcd);

		System.out.println("UCLN la: " + gcd );
		System.out.println("BCNN la: " + lcm );
		
	}

}
