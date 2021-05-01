package calisma;

public class Student extends User{
	
	private String ders;
	private String tip;
	private String odev;

	public String getDers() {
		return ders;
	}
	
	public void setDers(String ders) {
		this.ders = ders;
	}
	
	public String getTip() {
		return tip;
	}
	
	public void setTip(String tip) {
		this.tip = tip;
	}
	
	public String getOdev() {
		return odev;
	}
	
	public void setOdev(String odev) {
		this.odev = odev;
	}
}
