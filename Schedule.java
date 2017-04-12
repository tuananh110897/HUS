import java.util.Scanner;
class Schedule{
	public static void printStars(){
		for( int i=0; i<20; i++ ){
			System.out.print("*");
		}
		System.out.println();
	}
	public static void printSchedule( int n ){
		switch(n){
			case 1: System.out.println("Chu nhat duoc nghi");
				break;
			case 2: System.out.println("Thu Hai, hoc buoi sang");
				break;
			case 3:	System.out.println("Thu Ba, hoc buoi sang");
				break;
			case 4: System.out.println("Thu Tu, hoc buoi chieu");
				break;
			case 5: System.out.println("Thu Nam, hoc buoi sang");
				break;
			case 6: System.out.println("Thu Sau, hoc buoi chieu");
				break;
			case 7: System.out.println("Thu Bay, hoc buoi chieu");
				break;
			default: System.out.println("Thu khong hop le");
				break;
		}
	}
	public static void main(String args[]){		
		Scanner scan = new Scanner (System.in);
		int n;
		System.out.print("n= ");
		n = scan.nextInt();
		printStars();
		printSchedule(n);
		printStars();
	}
}