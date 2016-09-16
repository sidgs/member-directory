package race;

import java.util.ArrayList;

public class Male extends Person {

	private char sex;
	
	

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		if (sex == 'F') {
			System.out.println("Not Allowed");
			return;

		} else {
			this.sex = sex;
		}

	}

	/*
	 * @Override public int hashCode() { final int prime = 31; int result = 1;
	 * result = prime * result + sex; return result; }
	 */

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Male other = (Male) obj;
		if (sex != other.sex)
			return false;
		return true;
	}

	/*@Override
	public String toString() {
		return "Male [age=" + age + ", color=" + color + ", height=" + height + "]";
	}*/

	
}
