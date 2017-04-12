import java.util.Scanner;
public class Numbers{
	public static void printStars(){
		for( int i=0; i<20; i++)
				System.out.print("*");
				System.out.println();
	}
	public static void countAndSum(){
		int sum=0, le=0;
		Scanner scan = new Scanner(System.in);
		int n;
		System.out.print("Nhap: ");
		n = scan.nextInt();
		for( int i=0; i<n; i++){
			int a;
			System.out.print("Nhap so thu " + i + ": ");
			a = scan.nextInt();
			sum+=a;   //sum=sum+a
			if( a%2==1 ){
				le++;   //le=le+1
			} 
			System.out.println("Tong cac so la: "+sum+", "+"co "+le+" so le");
		}
	}
	public static void main(String args[]){
		printStars();
		countAndSum();
		printStars();
	}
}		
		