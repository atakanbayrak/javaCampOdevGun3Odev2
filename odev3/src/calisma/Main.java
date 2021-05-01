package calisma;

public class Main {
	public static void main(String[] args) {
		
		StudentManager studentManager = new StudentManager();
		Student ogrenci1 = new Student();
		ogrenci1.setId(5);
		ogrenci1.setAd("Atakan");
		ogrenci1.setSoyad("Bayrak");
		ogrenci1.setTip("Universite Ogrencisi");
		ogrenci1.setDers("Java/React Kursu");
		ogrenci1.setOdev("Odev3");
		studentManager.addHomework(ogrenci1);
		
		
		InstructorManager instructorManager = new InstructorManager();
		Instructor instructor1 = new Instructor();		
		instructor1.setId(10);
		instructor1.setAd("Engin");
		instructor1.setSoyad("Demiroð");
		instructor1.setAlan("Programlama Ve Bilgisayar Bilimleri");
		instructor1.setDers("Java/React Kursu");
		instructor1.setEgitimYýlý(5);		
		instructorManager.addLesson(instructor1);
		
		
		UserManager userManager = new UserManager();
		userManager.kayit(ogrenci1);
		userManager.kayýtE(instructor1);
	
	
		
		
	}
	
	
}
