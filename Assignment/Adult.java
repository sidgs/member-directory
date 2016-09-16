package race;

import java.util.ArrayList;
import java.util.HashMap;

public class Adult {

	
	    String name;
	    int id;
	 
	     
	    ArrayList<Adult> member = new ArrayList<Adult>();
	    HashMap<Integer, Adult> memberMap = new HashMap<Integer, Adult>();
	    
	    
	   public void addAdult(String name, int id){
	    Adult a1 = new Adult(); 
	    a1.name = name;
	    a1.id = id;
	    member.add(a1);
	    memberMap.put(id, a1);
	    }
	   
	   public void getMap(Integer id){
			System.out.println(memberMap.get(id));
		}
	   
	   
	   public void search(String name, int id){
		   Adult a1 = new Adult(); 
		    a1.name = name;
		    a1.id = id;
	   }
		    /*for(int i = 0;i<member.size();i++){
				System.out.println(a1.equals(member.get(007)));
				}
	 */ 
	   
	   public void delete(String Firstname, int id){
			Adult a1 = new Adult();
			a1.name = name;
			a1.id = id;
			member.remove(a1);
			
		}
	   


	@Override
	public String toString() {
		return "Adult [name=" + name + ", id=" + id + "]";
	}
	
}
