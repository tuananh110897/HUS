class MinMax{
	public static void MinMax (int a, int b){
		int Min, Max;
		System.out.println( (Min=(a<b)?a:b) + ": la so be nhat" );
		System.out.println( (Max=(a>b)?a:b) + ": la so lon nhat" );
	}
	public static void main(String args[]){
		int a=45, b=99;
		MinMax(a,b);
	}
}