import java.util.*;

class test {
	

	public static double tinhtong(int[] a, int n, double x){
		double sum = 0;
		if (n <= 0) 
			return 0;
		else if (n == 1) 
			return a[0];
		else{
			for (int i = 0; i < n; i++){
				sum += a[i]*Math.pow(x, n-(i+1));
			}
		}
		return sum;
	}
	
	public static void main (String [] args){
		
		int n = 3;
		int[] arr = {1,2,3};
		
		double x = 1.5;
		System.out.println("tong = " + tinhtong(arr,n,x));
	}
}