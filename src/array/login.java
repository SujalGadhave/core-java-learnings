package array;
import java.util.Scanner;
public class login {
	public static void Login() {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Login \n");
		
		System.out.println("Enter Username :");
		String userName = scan.next();
		
		System.out.println("Enter Password");
		String pass = scan.next();
		
		if(userName.equals("sujal")) {
			if(pass.equals("Pass@123")) {
			return;	
			}
		}
		System.out.println("Login Fail... \n");
		System.exit(0);
	}
}
