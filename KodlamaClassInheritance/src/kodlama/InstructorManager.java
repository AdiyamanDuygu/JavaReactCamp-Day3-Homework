package kodlama;

public class InstructorManager extends UserManager {
	
	@Override
	public void add(User user) {
		System.out.println("Say�n \"" + user.getFullName() + "\" e�itmenimiz sisteme kayd�n�z yap�ld�");
	}
}
