package Bai2;

public class Processing 
{
	public static int sumMlcb(Employee[] employee)
	{
		int sum=0;
		for (int i=0;i<employee.length;i++)
			sum += employee[i].getMlcb();
		return sum;
	}
	public static void printInfo(Employee employee)
	{
		System.out.println(employee.getMs()+" "+employee.getHvt()+" "+employee.getNs()+" "+employee.getMlcb());
	}
	public static void maxMlcb(Employee[] employee)
	{
		int max=employee[0].getMlcb();
		int j=0;
		for (int i=0;i<employee.length;i++)
			if (max<employee[i].getMlcb()) 
				{
					max=employee[i].getMlcb();
					j=i;
				}
		System.out.print("Nhân viên nhận được nhiều lương nhất là : ");
		printInfo(employee[j]);
	}
	public static void minMlcb(Employee[] employee)
	{
		int min=employee[0].getMlcb();
		int j=0;
		for (int i=0;i<employee.length;i++)
			if (min>employee[i].getMlcb()) 
				{
					min=employee[i].getMlcb();
					j=i;
				}
		System.out.print("Nhân viên nhận được ít lương nhất là : ");
		printInfo(employee[j]);
	}
	public static void printList(Employee[] employee)
	{
		for (int i=0;i<employee.length;i++)
		{
			printInfo(employee[i]);
		}
	}
	public static void sortEmployee(Employee[] employee)
	{
		Employee[] employee2 = new Employee[employee.length];
		for (int i=0;i<employee.length;i++)
			employee2[i] = employee[i];
		for (int i=0;i<employee2.length-1;i++)
			for (int j=i+1;j<employee2.length;j++)
				if (employee2[i].getMlcb()>employee2[j].getMlcb())
				{
					Employee temp = employee2[i];
					employee2[i] = employee2[j];
					employee2[j] = temp;
				}
		System.out.println("Danh sách nhân viên sau khi sắp xếp là :");
		printList(employee2);
	}
	public static void printMenu()
	{
		System.out.println("1. In danh sách nhân viên");
		System.out.println("2. Tổng số tiền công ty phải trả trong 1 tháng");
		System.out.println("3. Thông tin nhân viên được trả nhiều lương nhất");
		System.out.println("4. Thông tin nhân viên được trả ít lương nhất");
		System.out.println("5. Sắp xếp danh sách nhân viên theo tiền lương tăng dần");
		System.out.println("6. Kết thúc");
	}
	
}
