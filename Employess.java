
import java.util.*;
class Employees{

	public static void printlnStats(){

		System.out.println("********************");
	}
	

	// return each name with each input number
	public static String createContract(int n){

		switch (n){
			case 1: 
				return (n + " Nguyen Van An \n"  );	
			case 2: 
				return (n + " Tran Van Chinh \n" );	
			case 3: 
				return (n + " Nguyen Thi Van \n");
			case 4: 
				return (n + " Cao Thuy Anh \n");
			case 5: 
				return (n + " Bui Cong Vuong \n" );
			case 6: 
				return (n + " Vu Thi Anh Ngoc \n" );
			case 7: 
				return (n + " Ha Lan Huong \n" );
			case 8: 
				return (n + " Nguyen Thi Ngoc \n" );
			case 9: 
				return (n + " Nguyen Thi Hai Yen \n");
			case 10: 
				return (n + " Vu Thi Le \n" );
			}return "";
	}
	

	// return each salary with each input number
	public static int createSalary(int n){

		switch (n){
			case 1: return  50000;	
			case 2: return  45000;
			case 3: return 100000;

			case 4: return  85000;

			case 5: return 100000;

			case 6: return  110000;

			case 7: return  90000;

			case 8: return 80000;

			case 9: return  60000;

			case 10: return 100000;

			}return 0;
	}



	public static void solve(){

		Scanner s = new Scanner (System.in);
		int count = 0;		
		int sumSalary = 0;		
		String Contract = "";		
		int x;		

		
		do {
			x = s.nextInt();

			// count used employees
			count ++ ;

			// add employee's name to list with each input
			Contract += createContract(x);

			// add employee's salary to sum with each input
			sumSalary += createSalary(x);
		}	
		while (x != 0);


		printlnStats();	
		System.out.println("Cong ty chon " + count + " nhan vien");
		System.out.println(Contract);
		System.out.println("Tong so tien la: " + sumSalary);
		printlnStats();	
			
	}


	public static void main(String args[]){

		solve();

			
	}

}

