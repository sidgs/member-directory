package race;

public class Adult extends Male{

	/*public int getAge() {
		return age;
	}*/
	public void setAge(int age) {
		if (age < 21){
			System.out.println("Not Allowed");
			
		}
		else{
		super.setAge(age);
		}
	}
	
}
