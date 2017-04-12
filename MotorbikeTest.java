package week08;
import java.util.*;
public class MotorbikeTest 
{
	private static Scanner scan = new Scanner(System.in);
	public static void inputMotorbike(ArrayList<Motorbike> motorbikes)
	{
		
		System.out.print("Nhap so luong loai xe ");
		int n = Integer.parseInt(scan.nextLine().trim());
		System.out.flush();
		for (int i=0;i<n;i++)
		{
			Motorbike temp = new Motorbike();
			System.out.println("Nhap thong tin loai "+(i+1));
			System.out.print("Ma so ");
			temp.setMs(scan.nextLine());
			System.out.print("Ten xe ");
			temp.setTenxe(scan.nextLine());
			System.out.print("Hang san xuat ");
			temp.setHsx(scan.nextLine());
			System.out.print("So luong ");
			temp.setSl(Integer.parseInt(scan.nextLine().trim()));
			System.out.print("Gia ");
			temp.setGia(Double.parseDouble(scan.nextLine().trim()));
			System.out.print("Khoi luong ");
			temp.setKl(Double.parseDouble(scan.nextLine().trim()));
			System.out.print("Ngay san xuat ");
			temp.setNsx(scan.nextLine());
			motorbikes.add(temp);
		}
	}
	public static void Print(Motorbike motorbikes)
	{
		System.out.print(motorbikes.getMs()+"\t"+motorbikes.getTenxe()+"\t"+motorbikes.getHsx());
		System.out.println("\t"+motorbikes.getSl()+"\t"+motorbikes.getGia()+"\t"+motorbikes.getKl()+"\t"+motorbikes.getNsx());
	}
	public static ArrayList<Motorbike> search(String manu, ArrayList<Motorbike> motorbikes)
	{
		ArrayList<Motorbike> temp = new ArrayList<>();
		for (int i=0;i<motorbikes.size();i++)
			if (motorbikes.get(i).getHsx().equals(manu)) temp.add(motorbikes.get(i));
		return temp;
	}
	public static void sort(ArrayList<Motorbike> motorbikes)
	{
		ArrayList<Motorbike> motorbikes2 = new ArrayList<>();
		for (int i=0;i<motorbikes.size();i++)
			motorbikes2.add(motorbikes.get(i));
		for (int i=0;i<motorbikes2.size()-1;i++)
			for (int j=i+1;j<motorbikes2.size();j++)
				if (motorbikes2.get(i).getHsx().charAt(0)>motorbikes2.get(j).getHsx().charAt(0))
				{
					Motorbike temp = motorbikes2.get(j);
					motorbikes2.set(j, motorbikes2.get(i));
					motorbikes2.set(i, temp);
				}
		System.out.println("Danh sach sau khi sap xep la ");
		for (int i=0;i<motorbikes2.size();i++)
			Print(motorbikes2.get(i));
	}
	public static ArrayList<Motorbike> maxWeight(ArrayList<Motorbike> motorbikes)
	{
		double max=motorbikes.get(0).getKl(); 
		ArrayList<Motorbike> temp = new ArrayList<>();
		for (int i=0;i<motorbikes.size();i++)
			if (max<motorbikes.get(i).getKl()) max=motorbikes.get(i).getKl();
		for (int i=0;i<motorbikes.size();i++)
			if (max==motorbikes.get(i).getKl()) temp.add(motorbikes.get(i));
		return temp;
	}
	public static ArrayList<Motorbike> max2Quantity(ArrayList<Motorbike> motorbikes)
	{
		if (motorbikes.size()==1) 
			return motorbikes;
		double max=motorbikes.get(0).getSl(),max2=motorbikes.get(0).getSl(); 
		ArrayList<Motorbike> temp = new ArrayList<>();
		for (int i=0;i<motorbikes.size();i++)
			if (max<motorbikes.get(i).getSl()) max=motorbikes.get(i).getSl();
		for (int i=0;i<motorbikes.size();i++)
			if (motorbikes.get(i).getSl()!=max)
				if (max2<motorbikes.get(i).getSl()) max2=motorbikes.get(i).getSl();
		for (int i=0;i<motorbikes.size();i++)
			if (max2==motorbikes.get(i).getSl()) temp.add(motorbikes.get(i));
		return temp;
	}
	public static void main(String args[])
	{
		ArrayList<Motorbike> motorbikes = new ArrayList<>();
		inputMotorbike(motorbikes);
		System.out.println("Danh sách xe");
		for (int i=0;i<motorbikes.size();i++)
			Print(motorbikes.get(i));
		System.out.println("Sắp xếp danh sách xe máy theo hãng sản xuất");
			sort(motorbikes);
		System.out.println("Danh sách xe có hãng sản xuất Honda");
		for (int i=0;i<search("Honda",motorbikes).size();i++)
			Print(search("Honda",motorbikes).get(i));
		System.out.println("Danh sách xe có khối lượng lớn nhất");
		for (int i=0;i<maxWeight(motorbikes).size();i++)
			Print(maxWeight(motorbikes).get(i));
		System.out.println("Danh sách xe có số lượng lớn thứ hai");
		for (int i=0;i<max2Quantity(motorbikes).size();i++)
			Print(max2Quantity(motorbikes).get(i));
	}
}
