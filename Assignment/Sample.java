import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.Scanner;

public class Sample {

	
	public static void main(String args[]){
		
		
		Person p1  = new Person();
		
		
		// Enter the contact details in the manner addressed for each option
		
		//Create: Firstname, Lastname, Unique id
		p1.addPerson("Karthik", "Reddy",24);
		p1.addPerson("Vishal","Reddy",36);
		p1.addPerson("Srikanth", "Mushty", 11);
		p1.addPerson("Dharma", "Teja", 10);
		
		System.out.println("Contents in the People Directory are:"+p1.People);
		
		//Enter the unique id of the contact you want to retrieve: ID
		p1.getMap(36);
		
		//Enter the name of the person you want to search: Firstname, Lastname
		p1.search("Vishall","Reddy");
		
		//Enter the name you want to delete: Firstname, Lastname
		p1.delete("Karthikk", "Reddy");
		//System.out.println(p1.People);
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//System.out.println(P1.getPerson("1"));
		//System.out.println(P1.toString());
	//	System.out.println(P1.getPerson("Karthik"));
		
		/*Scanner sc = new Scanner(System.in);
		String option = null;
		System.out.println("Enter create, read, update or delete");
		option = sc.nextLine();
		ArrayList<Person> People  = new ArrayList<Person>();
		HashMap<String, String> H = new HashMap<String, String>(); 
		
		System.out.println("Enter the details for each person");
		
		
		switch(option){
		case "create":
			for(int i = 0;i<1;i++){
				Person P =  new Person();
				System.out.println("Enter the id");
				P.id = sc.nextLine();
				System.out.println("Enter the name");
				P.Firstname = sc.nextLine();
				People.add(P);		
			}
			break;
		case "read":
			for (int i = 0; i<People.size();i++){
				System.out.println(People.get(i).id+" "+People.get(i).Firstname);
			}
			break;
		case "update":
			System.out.println("Enter the id of the name you want to update");
		case "delete":
			
			
		
		}
		
		
		
		
		// READ
		
		
		// UPDATE
		System.out.println("Enter the details of the person you want to update");
		
		
		
		// DELETE*/
	}

	




}
