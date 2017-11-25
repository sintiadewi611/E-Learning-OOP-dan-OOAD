import java.io.Console;
import java.io.IOException;

public class Login {

	public void datalogin() {
	
		Console console = System.console();
		System.out.println("Selamat Datang  ");
		System.out.println("Harap Masukkan Username: ");
		String input = console.readLine();
		 System.out.println("Username: " + input);
		 System.out.println("Password: ");

		

		 char[] password = console.readPassword();
	
	

	}

}