class PTB2{
	public static void GPTB2(int a,int b,int c){
		//int delta=(b*b)-(4*a*c);
		if(a==0){
			if(b==0&&c==0)
				System.out.println("Phuong trinh co vo so nghiem");
			if(b!=0&&c==0||b!=0&&c!=0)
				System.out.println("Nghiem la:"+(double)-c/b);
			if(b==0&&c!=0)
				System.out.println("Phuong trinh vo nghiem");
			}
		if(a!=0){
			int delta;
			delta=(b*b)-(4*a*c);
			if(delta>0)
			//{
				System.out.println("Nghiem 1 la:"+(double)(-b+Math.sqrt(delta))/(2*a));
				System.out.println("Nghiem 2 la:"+(double)(-b-Math.sqrt(delta))/(2*a));
			//}
			if(delta==0)
				System.out.println("Nghiem la:"+(double)(-b)/(2*a));
			if(delta<0)
				System.out.println("Phuong trinh vo nghiem");
			
		}

	}
	public static void main(String args[]){
		int a=1,b=-2,c=-1;
		GPTB2(a,b,c);
	}
}
