package race;

import java.util.ArrayList;

public class Person {

	private String name;
	private char sex;
	protected int age;
	String color = "";
	double height;

	/*
	 * Person p1 = new Person(); Person p2 = new Person();
	 */
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name == "Tagore") {
			System.out.println("Not Allowed");
			return;
		} else {
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

	/*
	 * public boolean equals(Object obj) { if (!(obj instanceof Person)) {
	 * return false; } Person p = (Person) obj; if (p.name.equals(this.name) &&
	 * p.age == this.age && p.color.equals(this.color) && p.height ==
	 * this.height) {
	 * 
	 * return true; }
	 * 
	 * return false;
	 * 
	 * }
	 */

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (Double.doubleToLongBits(height) != Double.doubleToLongBits(other.height))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (sex != other.sex)
			return false;
		return true;
	}

	/*@Override
	public String toString() {
		return "Person [name=" + name + ", sex=" + sex + ", age=" + age + ", color=" + color + ", height=" + height
				+ "]";
	}
	*/

}
