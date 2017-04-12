
import java.util.*;

class vampire{

/*

 number is input number
	find 2 number: num1 * num2 = number
	check 2 number (num1, num2): were they created by number's digits?
	
*/	

	
	public static boolean checkDigits(int num1, int num2, int number){
	//cover to digits
		int a, b, c, d, e, a1, b1, c1, d1;
		int temp;		
		//num1 = a.b, num2 =c.d, number = a1.b1.c1.d1; 
		a = num1 / 10;	c = num2 / 10;
		b = num1 % 10;	d = num2 % 10;
		
		d1 = number % 10;	number = number / 10;
		c1 = number % 10;	number = number / 10;
		b1 = number % 10;	number = number / 10;
		a1 = number % 10;
	
	
		//sap xep chu so cua num1 va num2 tang dan
		for(int i = 0; i < 5; i++){	
			if (a > b) {
				temp = a;
				a = b;
				b = temp;			
			}
			if (b > c) {
				temp = b;
				b = c;
				c = temp;			
			}
			if (c > d) {
				temp = c;
				c = d;
				d = temp;
			}
					
		}

		//sap xep chu so cua so number tang dan
		for(int i = 0; i < 5; i++){	
			if (a1 > b1) {
				temp = a1;
				a1 = b1;
				b1 = temp;			
			}
			if (b1 > c1) {
				temp = b1;
				b1 = c1;
				c1 = temp;			
			}
			if (c1 > d1) {
				temp = c1;
				c1 = d1;
				d1 = temp;
			}
					
		}		
		
		// so sanh cac chu so cua 2 ben 
		if (a == a1 && b == b1 && c == c1 && d == d1) return true;
		return false;
		
	}

	public static boolean checkVampire(int number) {
	// lay num1 va num2 sao cho num1 * num2 = number
		int num1, num2;
		for (int i = 10; i < 100; i++){
			for (int j = 10; j < 100; j++){
				if ((i * j) == number){
					num1 = i;
					num2 = j;
					if(checkDigits(num1, num2, number)) 
					// kiem tra 2 so do co cau thanh tu cac chu so trong so ban dau k 
					return true;		
				}
		
			}
		}
		return false;	
	}


	public static void main(String args[]){
	Scanner s = new Scanner(System.in);
	int number;

	//nhap so chi co 4 chu so

	do { 
		System.out.println("Enter a 4 digit number: ");
		number = s.nextInt();
		} while (number >= 10000 || number < 1000);
	

	// kiem tra va in ra ket qua 	

	if (checkVampire(number))	
		System.out.println(number + " is vampire number");
	else System.out.println(number + " isn't vampire number");

	}	
}
