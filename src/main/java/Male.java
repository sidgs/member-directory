package race;

public class Male extends Person {
		
	
	private char sex;
	
	
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		if(sex == 'F'){
			System.out.println("Not Allowed");
			return;
			
		}
		else {
		this.sex = sex;
		}
	}
	

}
