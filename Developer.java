
public class Developer extends Employee 
{
	private int sda;
	public Developer() {
		super();
	}

	public Developer(String ms, String hvt, String ns, double mlcb, int sda) {
		super(ms, hvt, ns, mlcb);
		this.sda = sda;
	}
	
	public int getSda() {
		return sda;
	}

	public void setSda(int sda) {
		this.sda = sda;
	}

	public double getSalary()
	{
		return (getMlcb()+(sda*100));
	}

	@Override
	public String toString() {
		return "Developer [ms=" + getMs() + ", hvt=" + getHvt() + ", ns=" + getNs() + ", mlcb="
				+ getMlcb() + "]" + "[sda=" + sda + "]";
	}
	
}
