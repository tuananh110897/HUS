import java.util.*;

class ArrayOperators{
	private static Scanner s;
		
	public static void inputArray(int[] a){
		for(int i = 0; i < a.length; i++){
			a[i] = s.nextInt();
		}
	}
	
	public static void menu(int[] nums1, int n){
		if(n != 9){
			switch(n){ 
				case 1:
					System.out.println("Average of array:\t" + averageArray(nums1) );
					break;
				case 2:
					System.out.println("Have " + countEvens(nums1) + " even-number(s)");
					break;
				case 3:
					nums1 = decreaseArray(nums1);
					for (int element: nums1 ){
					System.out.print(element + "\t");
					}
					System.out.println();
					break;
				case 4:
					System.out.println("Max2 is: " + max2Array(nums1));
					break;
				case 5:
					System.out.println("Min2 is: " + min2Array(nums1));
					break;
				case 6:
					int[] result = new int[4];
					result = bigSmallDiff(nums1);
					System.out.println("Biggest range: " + result[0] );
					System.out.println("First location: " + result[1] );
					System.out.println("Smallest range: " + result[2] );
					System.out.println("First location: " + result[3] );
					break;
				case 7:
					System.out.println("Nums2_length:");
					int array2Length = s.nextInt();
					int[] nums2 = new int[array2Length];
					inputArray(nums2);
					System.out.println("Have " + matchup(nums1, nums2) + " couple(s)");
					if (nums1.length - nums2.length != 0)
						System.out.println("Only run to " + (Math.min(nums1.length, nums2.length) -1 ) + "because 2 array length isn't equal" );
					
					break;
				case 8:
					nums1 = fix34(nums1);
					for (int element : nums1){
						System.out.print(element + "\t");
					}
					break;
				default: 
				break;
			}
		}
		
	}
	
	public static int averageArray(int[] a){
		if (a.length == 0) return 0;
		int sum = 0;
		// sum of array;
		for(int element: a){
			sum += element;
		}
		// return average of array;
		return sum/a.length;
	}
	
	public static int countEvens(int[] a){
		int count = 0;
		for (int element: a){
			if (element % 2 == 0) 
				count++;
			
		}
		return count;
	}
	
	public static int[] decreaseArray(int[] a){
		
		for (int i = 0; i < a.length; i++){
			
			for (int j = 0 ; i < a.length; j++){
				if (a[i] >= a[j]){
					int temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}	
			}
		}
		return a;
	}
	
	public static int max2Array(int[] a){
		
		int max = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
		// find max;
		for (int element: a){
			max = (max > element)? max:element;
		}
		// find max of (elements != max);
		for (int element: a){
			if (element != max)
				max2 = (max2 > element)? max2:element;
		}
		return max2;
	}
	
	public static int min2Array(int[] a){
		
		int min = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
		// find min;
		for (int element: a){
			min = (min < element)? min:element;
		}
		// find min of (elements != min)
		for (int element: a){
			if (element != min)
				min2 = (min2 < element)? min2:element;
		}
		return min2;
	}
	

	public static int[] bigSmallDiff(int[] a){
		// result[0] - max range;
		// result[1] - max range - first location;
		// result[2] - min range;
		// result[3] - min range - first location;
		int[] result = new int[4];
		result[0] = Math.abs(a[0] - a[1]);
		result[2] = Math.abs(a[0] - a[1]);
		
		//get max and min range;
		for (int i = 0; i < a.length - 1; i++ ){
			result[0] = Math.max(result[0], Math.abs(a[i] - a[i + 1]) );
			result[2] = Math.max(result[1], Math.abs(a[i] - a[i + 1]) );
		}
		
		// get location;
		for(int i = 0; i < a.length; i++){
			if (Math.abs(a[i] - a[i + 1] )== result[0])	
				result[1] = i;
			else if (Math.abs(a[i] - a[i + 1]) == result[2])
				result[3] = i;
			
		}
		return result;
	}

	//method only run to min of 2 input array;
	public static int matchup(int[] nums1, int[] nums2){
			
			int count = 0;
			
			for (int i = 0; i < (int) (Math.min(nums1.length, nums2.length) ); i++ ){
				if ( Math.abs(nums1[i] - nums2[i]) < 2 && Math.abs(nums1[i] - nums2[i] ) != 0 )
					count++;	
			}
			return count;
			
	}

	public static int[] fix34(int[] a){
		int location3 = 0;
		int location4 = 0;
		// get location of 3 and 4
		for (int i = a.length - 1; i >= 0; i--){
			if (a[i] == 3 ) 
				location3 = location3 * 10 + i;
			else if (a[i] == 4 )
				location4 = location4 * 10 + i;
		}

		// swap number before 3 with number 4;		
		for (int i = 0; i < a.length; i++){
			if (a[0] == 3){
				a[location4 % 10] =  a[1];
				a[1] = 4;
			}
			else if (i == location3 %10){
				//check a[0] = 4;			
				a[location4 % 10] = (a[0] == 4)? a[0]:a[++i];
				// now i = i + 1;
				a[i] = 4; // eg: a[4] = 3 => a[5] = 4 
				//continue with i = 5;
				location3 /= 10;
				location4 /= 10;
				if (location3 == 0) break;
			}else
				continue;
		}
		return a;		
	}

	
	public static void main(String args[]){
		
		s = new Scanner(System.in);
		System.out.println("Nums1_length:");
		int arrayLength = s.nextInt();
		int[] nums1 = new int[arrayLength];
		inputArray(nums1);
		

		System.out.println("Your option:");
		int n;
		do {
			n = s.nextInt();
			menu(nums1, n);
		} while (n != 9);
		
		
	}
}
