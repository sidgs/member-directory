package race;

import java.util.ArrayList;
import java.util.HashMap;

public class Adult {

	
	    String name;
	    int phonenumber;
	 
	     
	    ArrayList<Adult> member = new ArrayList<Adult>();
	    HashMap<Integer, Adult> memberMap = new HashMap<Integer, Adult>();
	    
	    
	   public void addAdult(String name, int phonenumber){
	    Adult a1 = new Adult(); 
	    a1.name = name;
	    a1.phonenumber = phonenumber;
	    member.add(a1);
	    
	}
	   
	   
	   public void search(String name, int phonenumber){
		   Adult a1 = new Adult(); 
		    a1.name = name;
		    a1.phonenumber = phonenumber;
		    System.out.println("");
	   }


	@Override
	public String toString() {
		return "Adult [name=" + name + ", phonenumber=" + phonenumber + "]";
	}
	

		
		

	}

