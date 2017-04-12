import java.util.Scanner;

class ArrayOperators {
	private static Scanner scan;

	public static void printStars() {
		for (int i = 0; i < 20; i++)
			System.out.print("*");
		System.out.println();
	}

	public static void inputArray(double[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print("a[" + i + "]= ");
			a[i] = scan.nextDouble();
		}
	}

	public static void outputArray(double[] a) {
		System.out.println("Mang la: ");
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + "\t");
		System.out.println();
	}

	public static double averageArray(double[] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++)
			sum += a[i];
		return (double) sum / a.length;
	}

	public static void countEvens(double[] a) {
		int countle = 0, countchan = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0)
				countchan++;
			else
				countle++;
		}
		System.out.println("So phan tu chan la: " + countchan);
		System.out.println("So phan tu le la: " + countle);
	}

	public static void decreaseArray(double[] a) {
		double temp;
		System.out.println("Mang sau khi da sap xep theo thu tu giam dan la: ");
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++)
				if (a[i] < a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
		}
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + "\t");
		System.out.println();
	}
	
	public static double maxArray(double[] a){
		double max = Double.MIN_VALUE;
		for (int i = 0; i < a.length; i++)
			max = (a[i] > max) ? a[i] : max;
		return max;
	}
	
	public static double max2Array(double[] a) {
		double max = maxArray(a);
		double max2 = Double.MIN_VALUE;
		for (int i = 0; i < a.length; i++) {
			if (a[i] != max)
				max2 = (a[i] > max2) ? a[i] : max2;
		}
		return max2;
	}
	
	public static double minArray(double[] a){
		double min = Double.MAX_VALUE;
		for (int i = 0; i < a.length; i++)
			min = (a[i] < min) ? a[i] : min;
		return min;
	}

	public static double min2Array(double[] a) {
		double min = minArray(a);
		double min2 = Double.MAX_VALUE;
		for (int i = 0; i < a.length; i++) {
			if (a[i] != min)
				min2 = (a[i] < min2) ? a[i] : min2;
		}
		return min2;
	}

	public static void bigSmallDiff(double[] a) {
		int indexMax = 0, indexMin = 0;
		double bigdiff = Math.abs(a[1] - a[0]);
		double smalldiff = Math.abs(a[1] - a[0]);
		for(int i = 1; i < a.length - 1; i++){
			if(Math.abs(a[i] - a[i+1]) > bigdiff)
				bigdiff = Math.abs(a[i] - a[i+1]);
		}
		for(int i = 1; i < a.length - 1; i++){
			if(Math.abs(a[i] - a[i+1]) < smalldiff)
				smalldiff = Math.abs(a[i] - a[i+1]);
		}
		for(int i = 1; i < a.length - 1; i++){
			if(bigdiff == Math.abs(a[i] - a[i+1]))
				indexMax = i;
			else if(smalldiff == Math.abs(a[i] - a[i+1]))
				indexMin = i;
		}
		System.out.println("Khoang cach lon nhat la: " + bigdiff);
		System.out.println("Khoang cach nho nhat la: " + smalldiff);
		System.out.println("indexMax= " + indexMax);
		System.out.println("indexMin= " + indexMin);
	}
	
	public static void inputNums ( int[] n1, int[] n2 ){
		System.out.println("Nhap so phan tu mang nums1");
		for( int i = 0; i < n1.length; i++){
			System.out.print("n1[" + i + "]= ");
			n1[i] = scan.nextInt();
		}
		System.out.println("Nhap so phan tu mang nums2");
		for( int i = 0; i < n2.length; i++){
			System.out.print("n2[" + i + "]= ");
			n2[i] = scan.nextInt();
		}
	}
	
	public static int matchUp ( int[] n1, int[] n2 ){
		int count = 0;
		for( int i = 0; i < n1.length; i++){
			for( i = 0; i < n2.length; i++){
				if( Math.abs(n1[i] - n2[i]) <= 2 && Math.abs(n1[i] - n2[i]) != 0 )
						count ++;
			}
		}
		return count;
	}
	
	public static void inputNums1 ( int[] nums ){
		System.out.println("Ton tai cac so 3 va 4 trong nums");
		System.out.println("Cac so lien ngay sau so 3 luon khac 3 hoac 4");
		System.out.println("Cac so 3 se luon dung truoc so 4");
		for(int i = 0; i < nums.length; i++){
			System.out.print("nums[" + i + "]= ");
			nums[i] = scan.nextInt();
		}
	}
	
	public static void fix34 ( int[] nums ){
		int temp;
		for(int i = 0; i < nums.length; i++){
			if( nums[i] == 3){
				for(int j = i+1; j < nums.length; j++){
					if( nums[j] == 4 ){
						temp = nums[j];
						nums[j] = nums[i+1];
						nums[i+1] = temp;
					}
				}
			}
		}
		for(int i = 0; i < nums.length; i++)
			System.out.print(nums[i] + "\t");
		System.out.println();
	}

	public static void main(String args[]) {
		scan = new Scanner(System.in);
		System.out.print("Input so phan tu of Array: ");
		int n = scan.nextInt();
		double[] a = new double[n];
		inputArray(a);
		outputArray(a);
		System.out.println("Nhap 1 tinh gia tri trung binh cac phan tu trong mang");
		System.out.println("Nhap 2 dem so phan tu chan (le) trong mang");
		System.out.println("Nhap 3 sap xep lai mang theo thu tu giam dan");
		System.out.println("Nhap 4 tim gia tri lon thu 2 trong mang");
		System.out.println("Nhap 5 tim gia tri nho thu 2 trong mang");
		System.out.println("Nhap 6 tim khoang cach lon nhat va nho nhat giua hai so lien ke trong mang");
		System.out.println("Nhap 7 cho 2 mang nums1 && nums2 tra ve so lan ma su khac nhau giua hai thanh phan tuong ung trong hai mang nums1 va nums2 nho hon hoac bang 2 va khac 0");
		System.out.println("Nhap 8 sap xep lai mang");
		System.out.println("Nhap 9 thoat khoi chuong trinh");
		int m;
		do {
			System.out.print("Input your choice: ");
			m = scan.nextInt();
			switch (m) {
			case 1:
				printStars();
				System.out.println("Gia tri trung binh cac phan tu = " + averageArray(a));
				printStars();
				break;
			case 2:
				printStars();
				countEvens(a);
				printStars();
				break;
			case 3:
				printStars();
				decreaseArray(a);
				printStars();
				break;
			case 4:
				printStars();
				System.out.println("Gia tri lon thu 2 trong mang la: " + max2Array(a));
				printStars();
				break;
			case 5:
				printStars();
				System.out.println("Gia tri nho thu 2 trong mang la: " + min2Array(a));
				printStars();
				break;
			case 6:
				printStars();
				bigSmallDiff(a);
				printStars();
				break;
			case 7:
				printStars();
				System.out.print("Nhap so phan tu cua mang n1 va n2: ");
				int x = scan.nextInt();
				int [] n1 = new int[x];
				int [] n2 = new int[x];
				inputNums(n1,n2);
				System.out.println("So lan khac nhau la: " + matchUp(n1,n2));
				printStars();
				break;
			case 8:
				printStars();
				System.out.print("Nhap so phan tu cua mang nums: ");
				int y = scan.nextInt();
				int[] nums = new int[y];
				inputNums1(nums);
				fix34(nums);
				printStars();
				break;
			default:
				break;
			}
		} while (m != 9);
	}
}