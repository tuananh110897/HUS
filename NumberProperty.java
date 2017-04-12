import java.util.Scanner;

public class NumberProperty {
	public static void printStars() {
		for (int i = 0; i <= 30; i++)
			System.out.print("*");
		System.out.println();
	}

	public static boolean prime(int i) {
		if (i <= 1)
			return false;
		for (int n = 2; n <= Math.sqrt(i); n++) {
			if (i % n == 0)
				return false;
		}
		return true;
	}

	public static boolean palindrome(int i) {
		int newnumber = 0, oldnumber = i;
		while (i != 0) {
			newnumber = newnumber * 10 + i % 10;
			i /= 10;
		}
		if (newnumber == oldnumber)
			return true;
		else
			return false;
	}

	public static boolean armstrong(int i) {
		int number = i;
		int count = 0;
		while (number > 0) {
			count++;
			number = number / 10;
		}
		number = i;
		double sum = 0;
		while (number > 0) {
			sum = sum + Math.pow(number % 10, count);
			number = number / 10;
		}
		if (i == sum)
			return true;
		return false;
	}

	public static void main(String args[]) {
		int n = 0;
		int i = 0;
		System.out.println("30 so palindrome dau tien la: ");
		while (n <= 29) {
			if (palindrome(i)) {
				System.out.print(i + "\n");
				n++;
			}
			i++;
		}
		printStars();
		i = 0;
		n = 0;
		System.out.println("30 so nguyen to dau tien la: ");
		while (n <= 29) {
			if (prime(i)) {
				System.out.println(i);
				n++;
			}
			i++;
		}
		printStars();
		n = 0;
		i = 0;
		System.out.println("30 so palindrome dau tien la so nguyen to la: ");
		while (n <= 29) {
			if (palindrome(i) && prime(i)) {
				System.out.println(i);
				n++;
			}
			i++;
		}
		printStars();
		System.out.println("So palindrome lon nhat la tich cua 2 so co 3 chu so la: ");
		i = 0;
		int y = 0;
		for (int i1 = 999; i1 > 99; i1--) {
			if (i1 < y)
				break;
			for (int i2 = i1; i2 > 99; i2--) {
				if (palindrome(i1 * i2)) {
					if (i < i1 * i2)
						i = i1 * i2;
					y = i2;
					break;
				}
			}
		}
		System.out.println(i);
		printStars();
		i = 1;
		n = 0;
		System.out.println("30 so armstrong dau tien la:");
		while (n <= 29) {
			if (armstrong(i)) {
				System.out.print(i + "\n");
				n++;
			}
			i++;
		}
		printStars();
	}
}
