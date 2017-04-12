import java.util.Scanner;

public class Conversion {
	public static String classifyFluid(double x) {

		if (x > 40) {

			return "Extra strong liquor";

		}

		else if (20 < x && x <= 40) {

			return "Strong liquo";

		}

		else if (15 < x && x <= 20) {

			return "Liquor";

		}

		else if (12 < x && x <= 15) {

			return "Strong vine";

		}

		else if (10.5 < x && x <= 12) {

			return "Normal vine";

		}

		else {

			return "Light vine";

		}

	}

	public static void printStars() {

		// System.out.println("********************");

		for (int i = 0; i < 20; i++)

			System.out.print("*");

		System.out.println();

	}

	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);
		int x;
		x = scan.nextInt();

		printStars();

		System.out.println(classifyFluid(x));

		printStars();

	}
}
