import java.util.*;

class Array{

 	private static Scanner s;

	public static void menu(){
		System.out.println("Array_length: ");
		int n = s.nextInt();
		int[] a = new int[n];

		inputArray(a);
		int[] newArray = a;

		do{
			System.out.println("Your option: ");
			n = s.nextInt();

			switch (n){
				case 1: 
					int x = 0;
					printIndexOfx(a,x);
					break;
				case 2: 
					String perfectNumber = "";
					int count = 0;
					for (int element: a){
						if (isPerfectNumber(element)){
							perfectNumber += element + "\t";
							count ++;
						}
					}
					printStars();
					if (count == 0)
						System.out.println("Mang khong co so hoan hao");
					else System.out.println("Cac so hoan hao la: " + perfectNumber);
					printStars();
					break;
				case 3: 
					printStars();
					if (isAlternative(a))
					System.out.println("Mang vua nhap la mang dan dau");
					else 
					System.out.println("Mang vua nhap khong la mang dan dau");
					printStars();
					break;
				case 4:

					printStars();
					System.out.println("Mang sau khi xoa cac phan tu trung nhau la: ");
					for (int element : deleteRepeatedValues1(a) ){
						System.out.print(element + "\t");
					}
					System.out.println("");
					printStars();
						
					break;
					
				case 5: 
					sort(newArray);
					break;
				default: break;
			}
		}while(n != 6);

	}


	public static void printStars(){
		System.out.println("********************");
	}


	public static void inputArray(int[] a){
		for (int i = 0; i < a.length; i++){
			a[i] = s.nextInt();
		}
	}	



	public static void printIndexOfx(int[] array, int x){
		System.out.print("x = ");
		x = s.nextInt();
		String location = "";
		int count = 0;

		// get location and check x in array
		for (int i = 0; i < array.length; i++){
			if (x == array[i]){
				location += ++i + "\t";
				count ++;
			}	
			else continue;
		}		

		// output result
		printStars();
		if (location == "") 
			System.out.println("Khong xuat hien trong mang ");
		else 
			System.out.println("Xuat hien " + count + " lan tai vi tri la: " + location);
		printStars();
	}


	
	public static boolean isPerfectNumber(int k){
		// sum of divisor;	
		int sum = 0;

		for (int i = 1; i < k; i++){
			if (k % i == 0)
				sum += i;
		}

		if (sum == k ) return true;
		return false;
	}


	//check integrated of a[i -1] and a[i]; mang dan dau
	public static boolean isAlternative(int[] a){
	
		for (int i = 1; i < a.length; i++){
			if (a[i-1] * a[i] >= 0) return false;
		}
		return true;
	}


	public static int[] deleteRepeatedValues1(int [] a){


		// count number and don't count repeated number ;
		int count = 1;
		
		for (int i = 1; i < a.length; i++){
			//count the number of occurrence of a[i] the previous;
			int count1 = 0 ; 
			for (int j = 0; j < i; j++){
				if (a[i] == a[j] ) count1 ++;
			}
			// if a[i] didn't appear count++;	
			if (count1 == 0) count ++;
		
		}


		//make a new array which don't have repeated values;
		int index = 0;		
		int[] deletedRepeated = new int[count];

		// give values to new array;
		do {
			for (int i = 0; i < a.length; i++){ 
				// count the number of occurrence of a[i] the previous;
				int count1 =0;
				
				for (int j = 0; j < i; j++){
					if (a[i] == a[j] ) count1 ++;
				}
				// if a[i] didn't appear: deletedRepeated[index] = a[i]
				if (count1 == 0) {
				deletedRepeated[index] = a[i];
				index++;
				} else //if appeared, coutinue for;
					continue;
			}
		} while (index < deletedRepeated.length);		
		return deletedRepeated;		
	}


	// compare a[i] with each values in array;
	public static void sort(int[] a){

		for (int i = 0; i < a.length; i++){
			for (int j = i; j < a.length; j++){
				if ( a[i] > a[j] ){
					int temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}
		}
		printStars();
		for (int element: a ){
			System.out.print(element + "\t" );
		}
		System.out.println();
		printStars();
	}



	public static void main(String args[]){
		s = new Scanner(System.in);
		menu();
	}
}

