import java.util.Scanner;
class Score{
	private static Scanner scan;
	
	public static void printStars(){
		for(int i = 0; i < 20; i++)
			System.out.print("*");
		System.out.println();
	}
	
	public static void inputStudents(String [] names, double [] scores){
		for (int i = 0; i < names.length; i++){
			System.out.print("names["+i+"]= ");
			scan.nextLine();
			names[i] = scan.nextLine();
			System.out.print( "scores[" + i + "]= " );
			scores[i] = scan.nextDouble();
			System.out.println();
		}
	}
	
	public static void outputStudents(String [] names, double [] scores){
		for (int i = 0; i < names.length; i++)
			System.out.println(names[i]);
		for (int i = 0; i < scores.length; i++)
			System.out.println(scores[i]);
	}
	
	public static double meanScore(double[]scores){
		double sum = 0;
		double AVRAGE;
		for (int i = 0; i < scores.length; i++){
			sum += scores[i];				
		}
		return (AVRAGE = sum / scores.length);
	}
	
	public static double bestScore(double[] scores){
		double max = Double.MIN_VALUE;
		for (int i = 0; i < scores.length; i++){
			max = (max > scores[i]) ? max : scores[i];
		}
		return max;
	}
	
	public static double lowestScore(double[]scores){
		double min = Double.MAX_VALUE;
		for (int i = 0; i < scores.length; i++){
			min = (min < scores[i]) ? min : scores[i];
		}
		return min;
	}
	
	public static double secondBestScore(double[]scores){
		double max2 = Double.MIN_VALUE;
		double max = bestScore(scores);
		for (int i = 0; i < scores.length; i++){
			if(scores[i] != max)
				max2 = (max2 > scores[i]) ? max2 : scores[i];
		}
		return max2;
	}
	
	public static void main(String [] args){
		scan = new Scanner(System.in);
		int n;
		System.out.print("Nhap so sinh vien: ");
		n = scan.nextInt();
		String []names = new String[n];
		double []scores = new double[n];
		
		inputStudents(names,scores);
		outputStudents(names,scores);
		
		printStars();
		
		System.out.println("Diem so trung binh la: "+meanScore(scores));
		
		for (int i = 0; i < scores.length; i++)
			if(scores[i] == bestScore(scores))
				System.out.println("Sinh vien "+names[i]+" co diem so cao nhat la: "+bestScore(scores));
		
		for (int i = 0; i < scores.length; i++)
			if(scores[i] == lowestScore(scores))
				System.out.println("Sinh vien "+names[i]+" co diem so thap nhat la: "+lowestScore(scores));
		
		for (int i = 0; i < scores.length; i++)
			if(scores[i] == secondBestScore(scores))
				System.out.println("Sinh vien "+names[i]+" co diem so cao thu hai la: "+secondBestScore(scores));
		
		printStars();
	}
}