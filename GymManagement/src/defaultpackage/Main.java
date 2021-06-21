package defaultpackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.gym.manage.GymDao;
import com.gym.manage.gym;

public class Main {

	public static void main(String[] args)throws IOException {
		System.out.println("Welcome to Fitness GYM");
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			System.out.println("Kindly choose your action: ");
			System.out.println("1. Add a new member");
			System.out.println("2. Remove a member");
			System.out.println("3. See details of particular member");
			System.out.println("4. See details of all members");
			System.out.println("5. Exit");
			int i = Integer.parseInt(br.readLine());
			if(i==1) {
				System.out.println("Kindly fill all the details: ");
				System.out.println("Name: ");
			    String name= br.readLine();
			    
			    System.out.println("Age: ");
			    int age= Integer.parseInt(br.readLine());
			    
			    System.out.println("Gender: ");
			    String gender=br.readLine();
			    
			    System.out.println("Phone no.: ");
			    String phone= br.readLine();
			    
			    System.out.println("Address: ");
			    String address=br.readLine();
			    
			    System.out.println("Choose the package: ");
			    System.out.println("1 month= Rs.1200, 3 months= Rs.3000, 6 months= Rs.5000, 1 year= Rs.8000");
			    String pack=br.readLine();
			    
			    //create gym object to store member
			    gym gy = new gym(name,age, gender,phone,address,pack);
			    boolean answer= GymDao.insertMemberToDB(gy);
			    if(answer) {
					System.out.println("New member is added successfully !");
				}else {
					System.out.println("Something went wrong try again !");
				}
			    System.out.println(gy);
			    
			}
			else if(i==2) {
				System.out.println("Enter member id to remove: ");
				int userId= Integer.parseInt(br.readLine());
				boolean answer= GymDao.deleteMember(userId);
				if(answer) {
					System.out.println("Member removed !");
				}
				else {
					System.out.println("Something went wrong try again !");
				}
			}
			else if(i==3) {
				System.out.println("Enter member id to see details: ");
				int id= Integer.parseInt(br.readLine());
				GymDao.memberdetail(id);
			}
			else if(i==4) {
				//display
				GymDao.showAll();
				
			}
			else if(i==5) {
				//exit
				break;
			}
		}
		System.out.println("Thank you !1");

	}

}
