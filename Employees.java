
import java.util.Scanner;

public class Employees {
	public static void printStars() {
		for (int i = 0; i < 20; i++) {
			System.out.print("*");
		}
		System.out.println();
	}

	public static String createContract(int m) {
		String n = "";
		switch (m) {
		case 1:
			return (n = n + "\n1 Nguyen Van An");
		case 2:
			return (n = n + "\n2 Tran Van Chinh");
		case 3:
			return (n = n + "\n3 Nguyen Thi Van");
		case 4:
			return (n = n + "\n4 Cao Thuy Anh");
		case 5:
			return (n = n + "\n5 Bui Cong Vuong");
		case 6:
			return (n = n + "\n6 Vu Thi Anh Ngoc");
		case 7:
			return (n = n + "\n7 Ha Lan Huong");
		case 8:
			return (n = n + "\n8 Nguyen Thi Ngoc");
		case 9:
			return (n = n + "\n9 Nguyen Thi Hai Yen");
		case 10:
			return (n = n + "\n10 Vu Thi Le");
		default:
			return ("");
		}
	}

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int m, sum = 0, count = 0;
		String n = "";
		do {
			System.out.println();
			m = scan.nextInt();
			if (m >= 1 && m <= 10 || m == 0) {
				switch (m) {
				case 1:
					n = n + (createContract(m));
					sum = sum + 50000;
					count += 1;
					break;
				case 2:
					n = n + (createContract(m));
					sum = sum + 45000;
					count += 1;
					break;
				case 3:
					n = n + (createContract(m));
					sum = sum + 100000;
					count += 1;
					break;
				case 4:
					n = n + (createContract(m));
					sum = sum + 85000;
					count += 1;
					break;
				case 5:
					n = n + (createContract(m));
					sum = sum + 100000;
					count += 1;
					break;
				case 6:
					n = n + (createContract(m));
					sum = sum + 110000;
					count += 1;
					break;
				case 7:
					n = n + (createContract(m));
					sum = sum + 90000;
					count += 1;
					break;
				case 8:
					n = n + (createContract(m));
					sum = sum + 80000;
					count += 1;
					break;
				case 9:
					n = n + (createContract(m));
					sum = sum + 60000;
					count += 1;
					break;
				case 10:
					n = n + (createContract(m));
					sum = sum + 100000;
					count += 1;
					break;
				default:
					n = n + (createContract(m));
					count += 0;
					sum = sum + 0;
					break;
				}
			} else {
				System.out.println("Ma khong hop le yeu cau nhap lai: ");
			}
		} while (m != 0);
		printStars();
		System.out.println("Cong ty lua chon " + count + " nhan vien la:" + n);
		System.out.println("Tong so tien phai tra: " + sum);
		printStars();
	}
}
