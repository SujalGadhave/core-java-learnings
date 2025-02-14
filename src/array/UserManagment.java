package array;
import java.util.Scanner;
import java.util.ArrayList;
public class UserManagment {
	public static void UserMan() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\t Welcome to User Managment");
		
		ArrayList<user> userList = new ArrayList();
		
		while(true)
		{
			System.out.println("What wuould you like to do today ");
			System.out.println("1. Add User");
			System.out.println("2.Update User");
			System.out.println("3. Search User");
			System.out.println("4. Delete User");
			System.out.println("5. Print User List");
			System.out.println("9.Quite");
			
			int option = scan.nextInt();
			
			if (option==1) {
				
				user user = new user();
				
				System.out.println("Enter User Name :");
				user.name = scan.next();
				
				System.out.println("Enter Email:");
				user.email = scan.next();
				
				System.out.println("Enter Password:");
				user.pass = scan.next();
				
				userList.add(user);
			}else if (option==2) {
				System.out.println("To be Implemented...");
			}else if (option==3) {
				System.out.println("To be Implemented...");
			}else if (option==4) {
				System.out.println("To be Implemented...");
			}else if (option==5) {
				
				for(user data:userList) {
					System.out.println(data.name);
					System.out.println(data.email);
					System.out.println(data.pass);
				}
			}else if (option==9) {
				System.out.println("Exiting...");
				return;
			}else {
				System.out.println("Invalid option selected...");
			}
		}
	}
}
