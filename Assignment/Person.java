import java.util.ArrayList;
import java.util.HashMap;

public class Person{

	String Firstname;
	String Lastname;

	ArrayList<Person> People = new ArrayList<Person>();
	HashMap<Integer, Person> PeopleMap = new HashMap<Integer, Person>();

	//Adding person to the ArrayList and Hashmap
	public void addPerson(String Firstname, String Lastname, Integer id){
		Person P = new Person();
		P.Firstname = Firstname;
		P.Lastname = Lastname;
		People.add(P);
		PeopleMap.put(id,P);	
		
	}


	//Retrieval from Hashmap
	public void getMap(Integer id){
		System.out.println("The Key mapped to the following contact:"+PeopleMap.get(id));
	}


	//Searching the ArrayList
	public boolean search(String Firstname, String Lastname){
		ArrayList<Person> PeopleSearch = new ArrayList<Person>();
		Person P = new Person();
		P.Firstname = Firstname;
		P.Lastname = Lastname;
		PeopleSearch.add(P);
		for(int i = 0;i<People.size();i++){
			for (int j=0;j<PeopleSearch.size();j++){
				if(People.get(i).Firstname==PeopleSearch.get(j).Firstname 
						&& People.get(i).Lastname==PeopleSearch.get(j).Lastname){
					System.out.println(People.get(i).toString()+" is present in the list");
					return true;
				}
			}

		}
		System.out.println("The contact you are looking for doesn't exist");
		return false;
	}

	// Deleting from the ArrayList
	public boolean delete(String Firstname, String Lastname){
		ArrayList<Person> PeopleSearch = new ArrayList<Person>();
		Person P = new Person();
		P.Firstname = Firstname;
		P.Lastname = Lastname;
		PeopleSearch.add(P);
		for(int i = 0;i<People.size();i++){
			for (int j=0;j<PeopleSearch.size();j++){
				if(People.get(i).Firstname==PeopleSearch.get(j).Firstname 
						&& People.get(i).Lastname==PeopleSearch.get(j).Lastname){
					System.out.println("Deleted: "+People.remove(i));
					System.out.println("The remaining people in the list are: "+People);
					return true;
				}
			}

		}
		System.out.println("The contact you wanted to delete doesn't exist");
		return false;
	}






	@Override
	public String toString() {
		return  Firstname +" "+ Lastname;
	}



}