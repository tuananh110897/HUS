package week08;

public class Motorbike 
{
	private String ms,tenxe,hsx;
	private int sl;
	private double gia,kl;
	private String nsx;
	public Motorbike(){}
	public Motorbike(String ms, String tenxe, String hsx, int sl, double gia,
			double kl, String nsx) {
		super();
		this.ms = ms;
		this.tenxe = tenxe;
		this.hsx = hsx;
		this.sl = sl;
		this.gia = gia;
		this.kl = kl;
		this.nsx = nsx;
	}
	public String getMs() {
		return ms;
	}	
	public void setMs(String ms) {
		this.ms = ms;
	}
	public String getTenxe() {
		return tenxe;
	}
	public void setTenxe(String tenxe) {
		this.tenxe = tenxe;
	}
	public String getHsx() {
		return hsx;
	}
	public void setHsx(String hsx) {
		this.hsx = hsx;
	}
	public int getSl() {
		return sl;
	}
	public void setSl(int sl) {
		this.sl = sl;
	}
	public double getGia() {
		return gia;
	}
	public void setGia(double gia) {
		this.gia = gia;
	}
	public double getKl() {
		return kl;
	}
	public void setKl(double kl) {
		this.kl = kl;
	}
	public String getNsx() {
		return nsx;
	}
	public void setNsx(String nsx) {
		this.nsx = nsx;
	}
	
}
