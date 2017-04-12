import java.util.*;

class ComplexNumberTest{

	private static Scanner s;
	
	public static void main(String[] args ){
		s = new Scanner(System.in);
		ComplexNumber[] number = new ComplexNumber[7];
		int a = s.nextInt(), b = s.nextInt();
		number[0] = new ComplexNumber( a, b); 
		do{
		number[1] = new ComplexNumber( s.nextInt(), s.nextInt() );
		} while (number[1].a == 0 && number[1].b == 0);
		for (int i = 2; i < 7; i++){
			number[i] = new ComplexNumber(a,b);
			switch (i){
				case 2: 
					number[i] = number[i].add(number[1]);
					number[i].printInfo();
					break;
				case 3: 
					number[i] = number[i].subtract(number[1]);
					number[i].printInfo();
					break;
				case 4: 
					number[i] = number[i].multiply(number[1]);
					number[i].printInfo();
					break;
				case 5: 
					number[i] = number[i].divide(number[1]);
					number[i].printInfo();
					break;
				case 6: 
					number[i] = number[i].pow(s.nextInt());
					number[i].printInfo();
					break;
			}

		}

	}

}
