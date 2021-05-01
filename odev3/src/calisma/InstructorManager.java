package calisma;

public class InstructorManager extends Instructor{
	
	public void addLesson(Instructor instructor) {
		System.out.println("Ders Kaydi Yapildi " + instructor.getDers());
	}
	
	public void removeLesson(Instructor instructor) {
		System.out.println("Ders Silindi " + instructor.getDers());
	}
	
	
	

}
