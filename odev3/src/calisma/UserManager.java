package calisma;

public class UserManager {
	
	public void kayit(Student student) {
		System.out.println("Ogrenci Kaydi Yapýldi " + student.getAd() + student.getSoyad());
	}
	
	public void kayýtE(Instructor instructor) {
		System.out.println("Eðitmen Kaydi Yapildi " + instructor.getAd() + instructor.getSoyad());
	}
	

}
