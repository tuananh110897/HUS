import java.util.*;


public class EmployeeTest 
{ 
	public static double sumSalary(ArrayList<Employee> employee)
	{
		double sum = 0;
		for (int i=0 ; i < employee.size();i++)
			sum += employee.get(i).getSalary();
		return sum;
	}
	public static ArrayList<Employee> sort(ArrayList<Employee> employee)
	{
		ArrayList<Employee> temp = new ArrayList<>();
		for (int i=0;i<employee.size();i++)
			temp.add(employee.get(i));
		for (int i=0;i<temp.size()-1;i++)
			for (int j=i+1;j<temp.size();j++)
				if (temp.get(i).getSalary()>temp.get(j).getSalary())
				{
					Employee temp2 = temp.get(i);
					temp.set(i, temp.get(j));
					temp.set(j, temp2);
				}
		return temp;
	}
	public static void maxminSalary(ArrayList<Employee> employee)
	{
		System.out.println("Nhan vien nhan it luong nhat : " + sort(employee).get(0));
		System.out.println("Nhan vien nhan nhieu luong nhat : " + sort(employee).get(employee.size()-1));
	}
	public static void maxProject(ArrayList<Employee> employee)
	{
		ArrayList<Developer> developer = new ArrayList<>();
		for (int i=0; i<employee.size();i++)
			if ("Developer".equals(employee.get(i).getClass().getSimpleName()))
					developer.add((Developer) employee.get(i));
		int max = 0,dd=0;;
		for (int i=0;i<developer.size();i++)
			if (max<developer.get(i).getSda()) 
			{
				max = developer.get(i).getSda();
				dd = i;
			}
		System.out.println("Nhan vien thuc hien nhieu du an nhat : " + developer.get(dd).toString());
	}
	public static void input(ArrayList<Employee> employee)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Nhap so luong nhan vien : ");
		int n = Integer.parseInt(scan.nextLine().trim());
		System.out.println("0 : Nhan Vien ");
		System.out.println("1 : Quan Li ");
		System.out.println("2 : Lap Trinh Vien ");
		for (int i=0;i<n;i++)
		{
			System.out.print("Nhap loai nhan vien : ");
			int k = Integer.parseInt(scan.nextLine().trim());
			Employee temp = new Employee(); 
			System.out.print("Nhap ma so : ");
			temp.setMs(scan.nextLine().trim());
			System.out.print("Nhap ho va ten : ");
			temp.setHvt(scan.nextLine().trim());
			System.out.print("Nhap nam sinh : ");
			temp.setNs(scan.nextLine().trim());
			System.out.print("Nhap muc luong co ban : ");
			temp.setMlcb(Double.parseDouble(scan.nextLine().trim()));
			if (k == 0) employee.add(temp);
			if (k == 1) 
			{
				Manager manager = new Manager(temp.getMs(),temp.getHvt(),temp.getNs(),temp.getMlcb());
				employee.add(manager);
			}
			if (k == 2) 
			{
				System.out.print("Nhap so du an : ");
				Developer developer = new Developer(temp.getMs(),temp.getHvt(),temp.getNs(),temp.getMlcb(),Integer.parseInt(scan.nextLine().trim()));
				employee.add(developer);
			}
		}
	}
	public static void main(String args[])
	{
		ArrayList<Employee> employee = new ArrayList<>();
		input(employee);
		maxProject(employee);
	}
}
