package array;
import java.util.ArrayList;
import java.util.Scanner;
public class ProdManagment {
	public static void ProdMan() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\t Welcome to Product Management");
		
		ArrayList<product> productList = new ArrayList();
	
		while(true)
		{
			System.out.println("What would you like to do today");
			System.out.println("1. Add Product");
			System.out.println("2. Update Product");
			System.out.println("3. Search Product");
			System.out.println("4. Delete Product");
			System.out.println("5. Print Product");
			System.out.println("9.Quit");
			
			int option = scan.nextInt();
			
			if (option==1) {
				
				product product = new product();
				
				System.out.println("Add Product :");
				System.out.println("\t Enter Product Name :");
				product.productname = scan.next();
				
				System.out.println("\t Enter Product Price :");
				product.productprice = scan.next();
				
				System.out.println("\t Enter Product Quantity :");
				product.productquantity = scan.next();
				
				productList.add(product);
				
			}else if (option==2) {
				System.out.println("To be Implemented...");
			}else if (option==3) {
				System.out.println("To be Implemented...");
			}else if (option==4) {
				System.out.println("To be Implemented...");
			}else if (option==5) {
				for(product data:productList) {
					System.out.println(data.productname);
					System.out.println(data.productprice);
					System.out.println(data.productquantity);
				}
			}else if (option==9) {
				System.out.println("Exiting the application...");
				return;
			}else {
				System.out.println("Invalid Option Selected...");
			}
		}
	}
	
}
