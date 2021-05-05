package kodlama;

public class Main {

	public static void main(String[] args) {
		
		Instructor instructor1 = new Instructor();
		instructor1.setInstructorId(1);
		instructor1.setUserId(1);
		instructor1.setFullName("Engin Demiroð");
		instructor1.setePosta("engindemirog@x.com");
		instructor1.setPassword("123abc456");
		
		Student student1 = new Student();
		student1.setStudentId(1);
		student1.setUserId(2);
		student1.setFullName("Duygu Adýyaman");
		student1.setePosta("duyguadiyaman@x.com");
		student1.setPassword("654cba321");
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor1);

		StudentManager studentManager = new StudentManager();
		studentManager.add(student1);
	}

}
