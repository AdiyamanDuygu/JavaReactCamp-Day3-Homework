package kodlama;

public class User {
	private int userId;
	private String fullName;
	private String ePosta;
	private String password;
	
	public User() {
		
	}
	
	public User(int userId, String fullName, String ePosta, String password) {
		super();
		this.userId = userId;
		this.fullName = fullName;
		this.ePosta = ePosta;
		this.password = password;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getePosta() {
		return ePosta;
	}

	public void setePosta(String ePosta) {
		this.ePosta = ePosta;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
