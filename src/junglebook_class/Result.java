package junglebook_class;

public class Result {
	public static void main(String[] args) {
		DOG d1 = new DOG();
		DOG d2 = new DOG();
		
		d1.Name = "Rocky";
		d1.Bread = "German Shepard";
		d1.Age = 5;
		d1.Color = "Black";
		d1.Origin = "Germany"; 
		
		d2.Name = "Husky";
		d2.Bread = "BullDog";
		d2.Age = 2;
		d2.Color = "White";
		d2.Origin = "England";
		
		System.out.println("Name of a Dog is "+d1.Name);
		System.out.println("Bread of a Dog is "+d1.Bread);
		System.out.println("Age of a Dog is "+d1.Age);
		System.out.println("Color of a Dog is "+d1.Color);
		System.out.println("Origin of a Dog is "+d1.Origin);
		System.out.println(                               );
		System.out.println("Name of a Dog is "+d2.Name);
		System.out.println("Bread of a Dog is "+d2.Bread);
		System.out.println("Age of a Dog is "+d2.Age);
		System.out.println("Color of a Dog is "+d2.Color);
		System.out.println("Origin of a Dog is "+d2.Origin);
		
		System.out.println("-------------------------------------");
	
		ACCOUNT a1 = new ACCOUNT();
		ACCOUNT a2 = new ACCOUNT();
		
		a1.bankname = "Bank of Maharashtra";
		a1.name = "Sujal Shashikant Gadhave"; 
		a1.accno = "02045460464165";
		a1.mob = "8459102167";
		a1.branch = "Pargaon";
		
		a2.bankname = "Sharad Sahakari Bank LTD";
		a2.name = "Shashikant Balu Gadhave"; 
		a2.accno = "84564618164964";
		a2.mob = "9850236179";
		a2.branch = "Shingave";
		
		System.out.println("Name of Bank "+a1.bankname);
		System.out.println("Name of Account Hoolder "+a1.name);
		System.out.println("Account Number of Holder "+a1.accno);
		System.out.println("Acc. Holder Mob.No "+a1.mob);
		System.out.println("Branch "+a1.branch);
		System.out.println(                                    );
		
		System.out.println("Name of Bank "+a2.bankname);
		System.out.println("Name of Account Hoolder "+a2.name);
		System.out.println("Account Number of Holder "+a2.accno);
		System.out.println("Acc. Holder Mob.No "+a2.mob);
		System.out.println("Branch "+a2.branch);
		
		System.out.println("-------------------------------------");
		
		CAR car1 = new CAR();
		CAR car2 = new CAR();
		
		car1.name = "Nissan GTR";
		car1.color = "Red";
		car1.type = "Sports Car";
		car1.manfyear = "1970";
		
		car2.name = "Ford Mustang";
		car2.color = "White";
		car2.type = "Muscle Car";
		car2.manfyear = "1969";
		
		System.out.println("Name of Car "+car1.name);
		System.out.println("Color of Nissan GTR is "+car1.color);
		System.out.println("Type of Nissan GTR is "+car1.type);
		System.out.println("Manufacturing year is "+car1.manfyear);
		System.out.println(                                        );
		System.out.println("Name of Car "+car2.name);
		System.out.println("Color of Nissan GTR is "+car2.color);
		System.out.println("Type of Nissan GTR is "+car1.type);
		System.out.println("Manufacturing year is "+car1.manfyear);
		
		System.out.println("-------------------------------------");
		
		Cat cat1 = new Cat();
		Cat cat2 = new Cat();
		
		cat1.name = "Kitty";
		cat1.breed = "Bombay Cat";
		cat1.color = "Black";
		cat1.age = "3 Year";
		cat1.origin = "America";
		
		cat2.name = "Mani";
		cat2.breed = "Persian Cat";
		cat2.color = "Snow White";
		cat2.age = "4 Year";
		cat2.origin = "Iran";
		
		System.out.println("Name of Cat is "+cat1.name);
		System.out.println("Breed of Cat is "+cat1.breed);
		System.out.println("Color of Cat is "+cat1.color);
		System.out.println("Age of Cat is "+cat1.age);
		System.out.println("Origin of cat is "+cat1.origin);
		System.out.println("                                      ");
		System.out.println("Name of Cat is "+cat2.name);
		System.out.println("Breed of Cat is "+cat2.breed);
		System.out.println("Color of Cat is "+cat2.color);
		System.out.println("Age of Cat is "+cat2.age);
		System.out.println("Origin of cat is "+cat2.origin);
		
		System.out.println("---------------------------------------");
		
		ClassRoom room1 = new ClassRoom();
		ClassRoom room2 = new ClassRoom();
		
		room1.no_of_students = 65;
		room1.no_of_teachers = 5;
		room1.no_of_projector = 1;
		room1.no_of_computers = 10;
		
		room2.no_of_students = 60;
		room2.no_of_teachers = 6;
		room2.no_of_projector = 1;
		room2.no_of_computers = 15;
		
		System.out.println("Number of Students in ClassRoom "+room1.no_of_students);
		System.out.println("Number of Teachers in ClassRoom "+room1.no_of_teachers);
		System.out.println("Number of Projector in ClassRoom "+room1.no_of_projector);
		System.out.println("Number of Computers in ClassRoom "+room1.no_of_computers);
		System.out.println(                                      );
		System.out.println("Number of Students in ClassRoom "+room2.no_of_students);
		System.out.println("Number of Teachers in ClassRoom "+room2.no_of_teachers);
		System.out.println("Number of Projector in ClassRoom "+room2.no_of_projector);
		System.out.println("Number of Computers in ClassRoom "+room2.no_of_computers);
		
		System.out.println("---------------------------------------");
		
		Product p1 = new Product();
		Product p2 = new Product();
		
		p1.Company = "HP";
		p1.Name = "Victus";
		p1.Price = "55000";
		p1.Date = "24 Feb 2024";
		
		p1.Company = "Parle";
		p1.Name = "Lays";
		p1.Price = "5";
		p1.Date = "15/04/2024";
		
		System.out.println("Name of Company "+p1.Company);
		System.out.println("Name of Product "+p1.Name);
		System.out.println("Price of Product "+p1.Price);
		System.out.println("Manufacturing Date "+p1.Date);
		System.out.println(                                                    );
		System.out.println("Name of Company "+p2.Company);
		System.out.println("Name of Product "+p2.Name);
		System.out.println("Price of Product "+p2.Price);
		System.out.println("Manufacturing Date "+p2.Date);
		
		System.out.println("----------------------------------");
		
		Student std1 = new Student();
		Student std2 = new Student();
		
		std1.Name = "Gadhave Sujal Shashikant";
		std1.DOB = "12/04/2005";
		std1.Number = "12";
		std1.Year = "2nd Year";
		std1.Stream = "AI & DS";
		std1.Email = "sujalgadhave009@gmail.com";
		
		std2.Name = "Biradar Shreeyesh Pandit";
		std2.DOB = "13/08/2005";
		std2.Number = "07";
		std2.Year = "2nd Year";
		std2.Stream = "CS";
		std2.Email = "biradarshreeyesh@gmail.com";

		System.out.println("Name = "+std1.Name);
		System.out.println("DOB = "+std1.DOB);
		System.out.println("Roll Number = "+std1.Number);
		System.out.println("Studing in = "+std1.Year);
		System.out.println("Stream = "+std1.Stream);
		System.out.println("Email = "+std1.Email);
		System.out.println(                                      );
		System.out.println("Name = "+std2.Name);
		System.out.println("DOB = "+std2.DOB);
		System.out.println("Roll Number = "+std2.Number);
		System.out.println("Studing in = "+std2.Year);
		System.out.println("Stream = "+std2.Stream);
		System.out.println("Email = "+std2.Email);
		
		System.out.println("----------------------------------");
	}
}
