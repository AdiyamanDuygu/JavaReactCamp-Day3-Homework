package kodlama;

public class InstructorManager extends UserManager {
	
	@Override
	public void add(User user) {
		System.out.println("Sayýn \"" + user.getFullName() + "\" eðitmenimiz sisteme kaydýnýz yapýldý");
	}
}
