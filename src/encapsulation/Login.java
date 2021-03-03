package encapsulation;

public class Login {
	private String username = "admin";
	private String pass = "1234567";

	public String getUsername() {
		return username;
	}

	public String getPass() {
		return pass;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPass(String pass) {
		this.pass = pass;
		
	}
}
