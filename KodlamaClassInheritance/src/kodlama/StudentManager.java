package kodlama;

public class StudentManager extends UserManager {

	@Override
	public void add(User user) {
		System.out.println("Sevgili \"" + user.getFullName() + "\" ��rencimiz sisteme kayd�n�z yap�ld�");
	}
}
