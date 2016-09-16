package race;


public class Directory{

	public static void main(String[] args) {
		
		
		//creating member
		Adult a = new Adult();
		a.addAdult("Tagore", 313);
		a.addAdult("karthik", 123);
		a.addAdult("Srikanth", 456);
		a.addAdult("Afroz", 789);
		a.addAdult("Nagendra", 456);
		a.addAdult("Venkat", 777);
		a.addAdult("Ajay", 007);
		
		
	
		
		System.out.println(a.member);
	}
}
