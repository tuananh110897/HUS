import java.util.*;

public class EmployeeTest{

	private static Scanner s;

	public static int sumSalary(Employee[] a){

		int sum = 0;
		for (int i = 0; i < a.length; i++ )
			sum += a[i].salary;
		return sum;
	}
	
	public static int getMaxSalary(Employee[] a){

		int max = Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++)
			max = (max > a[i].salary)? max:a[i].salary;
		return max;
	}

	public static int getMinSalary(Employee[] a){

		int min = Integer.MAX_VALUE;
		for (int i = 0; i < a.length; i++)
			min = (min < a[i].salary)? min:a[i].salary;
		return min;	
	}

	public static void input(Employee[] a){
	
		System.out.println("nhap ID - ten - nam sinh - luong");
		
		for (Employee element: a)
			element = new Employee(s.nextLine(), s.nextLine(),Integer.parseInt(s.nextLine()), Integer.parseInt( s.nextLine() ) );
		
	}

	public static void soft(Employee[] a){

		for(int i = 0; i < a.length; i++)
			for (int j = i; j < a.length; j++){
				if (a[i].salary > a[j].salary){
					Employee temp = new Employee();
					a[i] = temp;
					a[i] = a[j];
					a[j] = temp;	
				}
			}
	}

	public static void solve(){

		System.out.println("So nhan vien:");

		Employee[] a = new Employee[Integer.parseInt( s.nextLine() ) ];
		input(a);
		int n; 

		do {	
			System.out.println("Nhap lua chon");
			n = s.nextInt();

			switch (n){
				case 1:System.out.println("Tong so luong phai tra la: " + sumSalary(a));
						break;
				case 2:System.out.println("cong nhan luong cao nhat la:");
					for(Employee element: a)
						if (element.salary == getMaxSalary(a))		
							element.printInfo();
						break;					
				case 3:
					System.out.println("cong nhan luong thap nhat la:");
					for(Employee element: a)
						if (element.salary == getMinSalary(a))
							element.printInfo();	
					break;
				case 4:			
					soft(a);
					break;
			}			

		} while (n != 0); 
		
	}

	public static void main(String[] args){
		
		s = new Scanner(System.in);
		solve();
	}

}
