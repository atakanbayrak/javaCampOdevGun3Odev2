package calisma;

public class Instructor extends User{
	
	private String alan;
	private int egitimYılı;
	private String ders;
	
	public String getAlan() {
		return alan;
	}

	public void setAlan(String alan) {
		this.alan = alan;
	}	
	
	public int getEgitimYılı() {
		return egitimYılı;
	}
	
	public void setEgitimYılı(int id) {
		this.egitimYılı = egitimYılı;
	}
	
	public String getDers() {
		return ders;
	}
	
	public void setDers(String ders) {
		this.ders=ders;
	}

}
