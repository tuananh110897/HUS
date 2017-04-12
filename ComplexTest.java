package Bai3;
import java.util.*;
public class ComplexTest 
{
	public static String Compact(String s) 
	{
		int t=0,c=0;
		for (int i=0;i<s.length();i++)
		{
			if (s.charAt(i)=='+') 
				c++;
			if (s.charAt(i)=='-')
				t++;
		}
		if (t+c<2) return s;
		else
			{
				if (t==0) return "+";
				if (t%2==0) return "+"; 
				else return "-";
			}
	}
	public static ComplexNumber toComplexNumber(String s)
	{
		ComplexNumber complex = new ComplexNumber();
		s = s.replaceAll(" ","");
		int count = 0;
		for (int i=0;i<s.length();i++) 
		{
			if (s.charAt(i)!='+' && s.charAt(i)!='-') 
				{
					if (count>1) 
					{
						s = s.replace(s.substring(i-count,i), Compact(s.substring(i-count,i)));
						i = i-count+1;
					}
					count=0;
				}
			if (s.charAt(i)=='+' || s.charAt(i)=='-') count++;
			
		}
		if (s.charAt(s.length()-1)!='i') s += "+0i";
		for (int i=0;i<s.length();i++)
			if (s.charAt(i)=='+' || s.charAt(i)=='-') count++;
		if (count==0) s = "0+" + s;
		if (s.charAt(0)=='+' || s.charAt(0)=='-')
			if (count==1) s = "0" + s; 
		if (s.charAt(s.length()-2)=='+' || s.charAt(s.length()-2)=='-') 
			s = s.substring(0,s.length()-1) + "1i";
		for (int i=0;i<s.length();i++)
			if (s.charAt(i)=='+' || s.charAt(i)=='-')
			{
				if (i==0) continue;
				complex.setRealPart(Double.parseDouble(s.substring(0,i)));
				complex.setImaginaryPart(Double.parseDouble(s.substring(i,s.length()-1)));
				break;
			}
		return complex;
	}
	public static void menu()
	{
		System.out.println("1. Tính tổng ");
		System.out.println("2. Tính hiệu ");
		System.out.println("3. Tính tích ");
		System.out.println("4. Tính thương ");
		System.out.println("5. Tính lũy thừa ");
		System.out.println("6. Kết thúc ");
	}
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Nhập số phức 1 ");
		String s1 = scan.nextLine();
		System.out.print("Nhập số phức 2 ");
		String s2 = scan.nextLine();
		ComplexNumber complex1 = toComplexNumber(s1);
		ComplexNumber complex2 = toComplexNumber(s2); 
		int n,k,j;
		menu();
		do
		{
			System.out.print("Nhập yêu cầu : ");
			n = scan.nextInt();
			switch (n)
			{
				case 1 : 
				{
					System.out.println("Tổng của 2 số phức là : " + complex1.add(complex2).toString());
					break;
				}
				case 2 :
				{
					System.out.println("1. Tính hiệu của số phức 1 với số phức 2 ");
					System.out.println("2. Tính hiệu của số phức 2 với số phức 1 ");
					System.out.println("3. Kết thúc ");
					do
					{
						System.out.print("Chọn : ");
						k = scan.nextInt();
						switch (k)
						{
							case 1 :
							{
								System.out.println("Hiệu của số phức 1 với số phức 2 là :" + complex1.subtract(complex2).toString());
								break;
							}
							case 2 :
							{	
								System.out.println("Hiệu của số phức 2 với số phức 1 là :" + complex2.subtract(complex1).toString());
								break;
							}
							default : break;
						}
					}
					while (k!=3);
					break;
				}
				case 3 : 
				{
					System.out.println("Tích của 2 số phức là : " + complex1.multiply(complex2).toString());
					break;
				}
				case 4 :
				{
					System.out.println("1. Tính thương của số phức 1 với số phức 2 ");
					System.out.println("2. Tính thương của số phức 2 với số phức 1 ");
					System.out.println("3. Kết thúc ");
					do
					{
						System.out.print("Chọn : ");
						k = scan.nextInt();
						switch (k)
						{
							case 1 :
							{
								System.out.println("Thương của số phức 1 với số phức 2 là : " + complex1.divide(complex2).toString());
								break;
							}
							case 2 :
							{	
								System.out.println("Thương của số phức 2 với số phức 1 là : " + complex2.divide(complex1).toString());
								break;
							}
							default : break;
						}
					}
					while (k!=3);
					break;
				}
				case 5 :
				{
					System.out.println("1. Tính lũy thừa của số phức 1 với k");
					System.out.println("2. Tính lũy thừa của số phức 2 với k");
					System.out.println("3. Kết thúc ");
					do
					{
						System.out.print("Chọn : ");
						j = scan.nextInt();
						if (j==3) break;
						System.out.print("k = ");
						k = scan.nextInt();
						switch (j)
						{
							case 1 :
							{
								System.out.println("Lũy thừa của số phức 1 với " + k + " là : " + complex1.pow(k).toString());
								break;
							}
							case 2 :
							{	
								System.out.println("Lũy thừa của số phức 2 với " + k + " là : " + complex2.pow(k).toString());
								break;
							}
							default : break;
						}
					}
					while (j!=3);
					break;
				}
				default : break;
			}
		}
		while (n!=6);
		
	}
}
