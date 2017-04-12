import java.util.Scanner;
import java.lang.Math;
class NumberProperty
{
	public static void printstar()
	{
		System.out.println("*******************************************************************");
	}
	public static void armstrong()
	{	
		byte A,B,C,D,E,F,G,H,I,K;
		long n;
		Scanner scan = new Scanner(System.in);
		System.out.print("nhap so N3 de kiem tra xem so do co phai so armstrong hay khong:");
		n=scan.nextInt();
		printstar();
			A=(byte) (n/1000000000);
			B=(byte) (n/100000000-A*10);
			C=(byte) (n/10000000-A*100-B*10);
			D=(byte) (n/1000000-A*1000-B*100-C*10);
			E=(byte) (n/100000-A*10000-B*1000-C*100-D*10);
			F=(byte) (n/10000-A*100000-B*10000-C*1000-D*100-E*10);
			G=(byte) (n/1000-A*1000000-B*100000-C*10000-D*1000-E*100-F*10);
			H=(byte) (n/100-A*10000000-B*1000000-C*100000-D*10000-E*1000-F*100-G*10);
			I=(byte) (n/10-A*100000000-B*10000000-C*1000000-D*100000-E*10000-F*1000-G*100-H*10);
			K=(byte) (n/1-A*1000000000-B*100000000-C*10000000-D*1000000-E*100000-F*10000-G*1000-H*100-I*10);
			if 
			(
			   (A==0&B==0&C==0&D==0&E==0&F==0&G==0&H==0&I==0&K!=0&K==n)
			|| (A==0&B==0&C==0&D==0&E==0&F==0&G==0&H==0&I!=0&(Math.pow(K,2)+Math.pow(I,2))==n)
			|| (A==0&B==0&C==0&D==0&E==0&F==0&G==0&H!=0&(Math.pow(K,3)+Math.pow(I,3)+Math.pow(H,3))==n)
			|| (A==0&B==0&C==0&D==0&E==0&F==0&G!=0&(Math.pow(K,4)+Math.pow(I,4)+Math.pow(H,4)+Math.pow(G,4))==n)
			|| (A==0&B==0&C==0&D==0&E==0&F!=0&(Math.pow(K,5)+Math.pow(I,5)+Math.pow(H,5)+Math.pow(G,5)+Math.pow(F,5))==n)
			|| (A==0&B==0&C==0&D==0&E!=0&(Math.pow(K,6)+Math.pow(I,6)+Math.pow(H,6)+Math.pow(G,6)+Math.pow(F,6)+Math.pow(E,6))==n)
			|| (A==0&B==0&C==0&D!=0&(Math.pow(K,7)+Math.pow(I,7)+Math.pow(H,7)+Math.pow(G,7)+Math.pow(F,7)+Math.pow(E,7)+Math.pow(D,7))==n)
			|| (A==0&B==0&C!=0&(Math.pow(K,8)+Math.pow(I,8)+Math.pow(H,8)+Math.pow(G,8)+Math.pow(F,8)+Math.pow(E,8)+Math.pow(D,8)+Math.pow(C,8))==n)
			|| (A==0&B!=0&(Math.pow(K,9)+Math.pow(I,9)+Math.pow(H,9)+Math.pow(G,9)+Math.pow(F,9)+Math.pow(E,9)+Math.pow(D,9)+Math.pow(C,9)+Math.pow(B,9))==n)
			|| (A!=0&(Math.pow(K,10)+Math.pow(I,10)+Math.pow(H,10)+Math.pow(G,10)+Math.pow(F,10)+Math.pow(E,10)+Math.pow(D,10)+Math.pow(C,10)+Math.pow(B,10)+Math.pow(A,10))==n)
			)
			{
				System.out.println(n+":la so armstrong");
			}
				else
				{
					System.out.println(n+":khong phai so armstrong");
				}
	}
	
	public static void prime()
	{
		int n,a,i;
		System.out.print("nhap so N1 de kiem tra xem so do co phai so prime hay khong:");
		Scanner scan=new Scanner(System.in);
		n=scan.nextInt();
		printstar();
		{
			for (i=2,a=0;(i<n)&(a!=1);i++)
			{
				if (n%i==0)
				{
					
					a++;
				}
			}
			if (a==0)
			{                   
				System.out.println(n+":la so prime");
			}	
				else
				{
					System.out.println(n+":khong phai so prime");
				}
		}
	}
	public static void palindrome()
	{	int n;
		byte A,B,C,D,E;
		Scanner scan=new Scanner(System.in);
		System.out.print("nhap so N2 de kiem tra xem so do co phai so palindrome hay khong:");
		n=scan.nextInt();
		printstar();
		{
			A=(byte) (n/10000);
			B=(byte) (n/1000-A*10);
			C=(byte) (n/100-A*100-B*10);
			D=(byte) (n/10-A*1000-B*100-C*10);
			E=(byte) (n-A*10000-B*1000-C*100-D*10);
			if 
			(
			  (A==0&B==0&C==0&D==0&E!=0)
			||(A==0&B==0&C==0&D==E&D!=0)
			||(A==0&B==0&&C==E&C!=0)
			||(A==0&B==E&C==D&B!=0)
			||(A==E&B==D&A!=0)
			)
			{
				System.out.println(n+":la so palindrome");
			}
				else
				{
					System.out.println(n+"khong phai la so palindrome");
				}
		}					
	}
	public static void main (String [] args)
	{	
		printstar();
		prime();
		printstar();
		palindrome();
		printstar();
		armstrong();
		printstar();
	}
}