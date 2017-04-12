class ComplexNumber{

// 17/03/2017 20:03: con phep chia va phep luy thua =.=
// 18/03/2017 15:40: check xong den phep nhan; 

	private	double a, b;

	public ComplexNumber(int a, int b){
		this.a = a;
		this.b = b;
	}
	
	public ComplexNumber(){

	}

	void printInfo(){
		System.out.println(a + " + " + b + "i");
	}

	ComplexNumber add(ComplexNumber other){
		
		this.a += other.a;
		this.b += other.b;
		return this;

	}

	String toString(){
		return a + " + " + b + " i";
	}

	ComplexNumber subtract(ComplexNumber other){
		
		this.a -= other.a;
		this.b -= other.b;
		return this;

	}

	ComplexNumber multiply(ComplexNumber other){

		ComplexNumber result = new ComplexNumber();
		result.a = this.a * other.a - this.b * other.b;
		result.b = ( this.a * other.b) + (this.b * other.a );
	//			number[0].a * number[1].b + number[0].b * number[1].a 
		return result;

	}

	ComplexNumber divide(ComplexNumber other){

		other.b *= -1;
		ComplexNumber multiply = new ComplexNumber();
		multiply = multiply(other);
		// b^2 = (-b)^2;
		this.a = multiply.a / ( other.a * other.a + other.b * other.b );		
		this.b = multiply.b / ( other.a * other.a + other.b * other.b );		

		return this;
	}

	ComplexNumber pow(int n){

		ComplexNumber number = new ComplexNumber();
			number.a = 1;
			number.b = 0;
			

		if (n == 0) { 
			return number;
		} //else if (n > 0)
			return multiply( pow(n-1) );
		else{
			n = -n;
			number = divide( multiply( pow(n-1) ) );
			return number;
		} 
	}

}
