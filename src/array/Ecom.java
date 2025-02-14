package array;
import java.util.Scanner;
public class Ecom {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("**** Welcome to E-Commmerce ****");
		
		login.Login();
		
		while(true)
		{
			System.out.println("What would you like to do today ?");
			System.out.println("1. Product Managment");
			System.out.println("2. User Managment");
			System.out.println("3.Quit");
			
			int option = scan.nextInt();
			
			if(option==1) {
				ProdManagment.ProdMan();
			}else if (option==2) {
				UserManagment.UserMan();
			}else {
				return;
			}
		}
	}
}