package encapsulation;

public class LoginEncapsul {

	public static void main(String[] args) {
		Login login=new Login();

		System.out.println("Login username: "+login.getUsername() +"\nlogin pass    : "+login.getPass());
	}

}
