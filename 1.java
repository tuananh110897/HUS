/* in ra so nguyen to */
import java.util.Scanner;
public class songuyento {
	public static boolean prime(int n){
		if (n<2) return false;
		for (int i=2 ; i< n; i++ )
			if(n%i==0) return false;
		return true;
		
	}
	public static void display(){
		int num;
		Scanner s = new Scanner(System.in);
		System.out.println("nhap so luong cac so nguyen to");
		num= s.nextInt();
		int i=2;
		int count=0;
		while(count<=num){
			if( prime(i)){
				System.out.print("  " + i);
				count++;
			}
			i++;
		} 
	}
	public static void main (String args[]){
		display();
	}
}



/* in ra so palindrome */
public static boolean palindrome (int n){
		int m =0;
		int a;
		int b;
		b=n;
		while(n!=0){
			a=n%10;
			m=m*10+a;
			n=n/10;
		}
		if(b==m) return true;
		return false;
		
		
	}
	public static void display(){
		Scanner s = new Scanner(System.in);
		System.out.println(" nhap so luong cac so palindrome");
		int a=s.nextInt();
		int count=0;
		int i=0;
		while (count<a){
			if ( palindrome(i)){
				System.out.print("  "+i);
				count++;
			}
			i++;
		}
	}
	public static void main(String args[]){
		display();
	} 
}




/* in ra so primepalindrome */
import java.util.Scanner;

public class primepalindrome {
	public static boolean prime(int n){
		if (n<2) return false;
		for (int i=2 ; i< n; i++ )
			if(n%i==0) return false;
		return true;
	}
	public static boolean palindrome (int n){
		int m =0;
		int a;
		int b;
		b=n;
		while(n!=0){
			a=n%10;
			m=m*10+a;
			n=n/10;
		}
		if(b==m) return true;
		return false;
	}
	public static void display(){
		Scanner s = new Scanner(System.in);
		System.out.println(" nhap so luong cac so prime va palindrome");
		int a=s.nextInt();
		int count=0;
		int i=2;
		while (count<a){
			if ( palindrome(i)&&prime(i)){
				System.out.print("  "+i);
				count++;
			}
			i++ ;
			}
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		display();
	}

}
