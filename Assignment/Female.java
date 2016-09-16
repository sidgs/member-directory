package race;

public class Female extends Person {

	private char sex;

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		if (sex == 'M') {
			System.out.println("Not allowed");
			return;
		} else {
			this.sex = sex;
		}
		
		

	}

	/*@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + sex;
		return result;
	}*/

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Female other = (Female) obj;
		if (sex != other.sex)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Female [age=" + age + ", color=" + color + ", height=" + height + "]";
	}
	
	

}
