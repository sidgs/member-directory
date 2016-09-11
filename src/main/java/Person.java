package race;

public class Person {
	
	private String name;
	private char sex;
	protected int age;
	String color;
	double height;
	
	public String getName() {
		if(name == null){
			return "Not allowed";
		}
		else{
			return name;	
		}
		
	}
	public void setName(String name) {
		if (name == "Tagore") {
			System.out.println("Not Allowed");
			return;
		}
		else {
			this.name = name;
		}
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	

}

