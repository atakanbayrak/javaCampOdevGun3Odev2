package calisma;

public class StudentManager extends Student{
	
	public void addHomework(Student student) {
		System.out.println("Odev Yüklendi " + student.getAd() +student.getSoyad()+student.getOdev());
	}
	
	public void removeHomework(Student student) {
		System.out.println("Odev Silindi " + student.getAd() + student.getOdev());
	}
	
	
	
	
	

}
