package calisma;

public class UserManager {
	
	public void kayit(Student student) {
		System.out.println("Ogrenci Kaydi Yap�ldi " + student.getAd() + student.getSoyad());
	}
	
	public void kay�tE(Instructor instructor) {
		System.out.println("E�itmen Kaydi Yapildi " + instructor.getAd() + instructor.getSoyad());
	}
	

}
