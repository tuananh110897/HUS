package Bai2;
import java.util.*;
public class EmployeeTest 
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		int select;
		Quantity quantity = new Quantity();
		System.out.print("Nhập số lượng nhân viên : ");
		quantity.setQuantity(Integer.parseInt(scan.nextLine().trim()));
		
		Employee[] employee = new Employee[quantity.getQuantity()];
		for (int i=0;i<employee.length;i++)
		{
			employee[i] = new Employee();
			System.out.println("Nhập dữ liệu của sinh viên thứ : " + (i+1));
			System.out.print("Mã số : ");
			employee[i].setMs(scan.nextLine());
			System.out.print("Họ và tên : ");
			employee[i].setHvt(scan.nextLine());
			System.out.print("Năm sinh : ");
			employee[i].setNs(Integer.parseInt(scan.nextLine().trim()));
			System.out.print("Mức lương cơ bản : ");
			employee[i].setMlcb(Integer.parseInt(scan.nextLine().trim()));
		}
		Processing.printMenu();
		do
		{
			System.out.print("Nhập yêu cầu : ");
			select = scan.nextInt();
			switch (select)
			{
				case 1 : 
				{
					System.out.println("Danh sách nhân viên");
					Processing.printList(employee);
					break;
				}
				case 2 :
				{
					System.out.println("Tổng số tiền công ty phải trả trong 1 tháng là : "+ Processing.sumMlcb(employee));
					break;
				}
				case 3 :
				{
					Processing.maxMlcb(employee);
					break;
				}
				case 4 :
				{
					Processing.minMlcb(employee);
					break;
				}
				case 5 :
				{
					Processing.sortEmployee(employee);
					break;
				}
				case 6 : break;
				default : 
				{
					System.out.println("Xin nhập số từ 1 đến 6");
					break;			
				}
			}
		}
		while (select!=6);
	}
}
