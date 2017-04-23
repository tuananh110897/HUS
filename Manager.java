
public class Manager extends Employee 
{

	public Manager() {
		super();
	}

	public Manager(String ms, String hvt, String ns, double mlcb) {
		super(ms, hvt, ns, mlcb);
	}
	public double getSalary()
	{
		return (getMlcb()+(getMlcb()/4));
	}
	public String toString() {
		return "Manager [ms=" + getMs() + ", hvt=" + getHvt() + ", ns=" + getNs() + ", mlcb="
				+ getMlcb() + "]";
	}
}
