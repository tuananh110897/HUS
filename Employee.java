
public class Employee 
{
	private String ms,hvt,ns;
	private double mlcb;
	public Employee(){}
	public Employee(String ms, String hvt, String ns, double mlcb) {
		super();
		this.ms = ms;
		this.hvt = hvt;
		this.ns = ns;
		this.mlcb = mlcb;
	}
	public String getMs() {
		return ms;
	}
	public void setMs(String ms) {
		this.ms = ms;
	}
	public String getHvt() {
		return hvt;
	}
	public void setHvt(String hvt) {
		this.hvt = hvt;
	}
	public String getNs() {
		return ns;
	}
	public void setNs(String ns) {
		this.ns = ns;
	}
	public double getMlcb() {
		return mlcb;
	}
	public void setMlcb(double mlcb) {
		this.mlcb = mlcb;
	}
	public double getSalary()
	{
		return mlcb;
	}
	@Override
	public String toString() {
		return "Employee [ms=" + ms + ", hvt=" + hvt + ", ns=" + ns + ", mlcb="
				+ mlcb + "]";
	}
	
}
