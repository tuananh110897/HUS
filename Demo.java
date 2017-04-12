class Demo{
	public static void main (String args[]){
		/*double x = 5, y = 2;
		System.out.println(5/2+5%2);
		int m = (int)(x+y+x/y-x*y-x/(10*y));
		System.out.println(m);
		int a = 6, b = 1, c = 3;
		a += b + c;
		b -= a + c;
		System.out.println(a + "; " + b);
		int a = 0, b = 0;
		while (a < 3){
			switch (a + b){
				case 0: a++; break;
				case 1: b++; break;
				case 2: b++; break;
				case 3: a++; break;
				default: b = 0; break;
			}
			System.out.print(b);
		}
	}
		int a = 100, b = 200, c = 300;
		if (a >= 500)
			b = 300;
		c = 400;
		System.out.print(a + "; " + b + "; " + c);
		int x = 2;
		int y = !(12 < 5 || 3 <= 5 && 3 > x) ? 7 : 9;
		System.out.print(y);
		int num = 0;
		for (num = 1; num <= 100; num++);
		System.out.print(num);
		System.out.print(2*4+3);
		int a = 3, b = 6, c = 5;
		int y = (a < b || b < a && c > b) ? 10 : 15;
		System.out.print(y);
		int count1 = 0, count2 = 0, inc = 1;
		for (int i = 0; i < 11; i++){
			count1 += inc;
			inc =- inc;
			count2 += inc;
		}
		System.out.print(count1 - count2);
		int alpha = 10;
		int num = 4;
		switch (num) {
			case 3: alpha++; break;
			case 4:
			case 6: alpha += 3;
			case 8: alpha += 4; break;
			default: alpha += 5;
		}
		System.out.print(alpha);*/
		int[] v = {3, 4, 5};
		v[0] = fun(v);
	}
	public static int fun( int[] v ){
		v[0] --;
		return v[0] + 2;
	}
}