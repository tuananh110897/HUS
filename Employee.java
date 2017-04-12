package Bai2;

public class Employee 
{
	private String ms,hvt;
	private int ns,mlcb;
	public Employee()
	{
		this("","",0,0);
	}
	public Employee(String ms,String hvt,int ns,int mlcb)
	{
		this.ms=ms;
		this.hvt=hvt;
		this.ns=ns;
		this.mlcb=mlcb;
	}
	public void setMs(String ms)
	{
		this.ms=ms;
	}
	public String getMs()
	{
		return ms;
	}
	public void setHvt(String hvt)
	{
		this.hvt=hvt;
	}
	public String getHvt()
	{
		return hvt;
	}
	public void setNs(int ns)
	{
		this.ns=ns;
	}
	public int getNs()
	{
		return ns;
	}
	public void setMlcb(int mlcb)
	{
		this.mlcb=mlcb;
	}
	public int getMlcb()
	{
		return mlcb;
	}
	
}
