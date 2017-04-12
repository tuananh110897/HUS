package myProject;

public class phuongTrinhB2 {
	public static void GPT(int a, int b, int c) {
		int DELTA = b*b - 4*a*c;
		System.out.println(
			(a == 0)? (b == 0)? (c == 0)? "Phuong trinh vo so nghiem": 
										  "Phuong trinh vo nghiem":
										  "Nghiem x = " + ((double)-c/b):
							 (DELTA < 0)? "Phuong trinh vo nghiem":
							 (DELTA == 0)?"Nghiem kep x = " + ((double)-b / (2*a)):
								 		  "Hai nghiem "
								 		+ "\nx1 = " + ((double)(-b + Math.sqrt(DELTA))/(2*a)) +
								 		  "\nx2 = " + ((double)(-b - Math.sqrt(DELTA))/(2*a))
		);
	}
	public static void main(String args[]) {
		int a = 0, b = 4, c = 2;
		GPT(a, b, c);
	}
}
