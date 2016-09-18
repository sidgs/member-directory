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
	   
	   public boolean search(String name, int id){
		   ArrayList<Adult> memberSearch = new ArrayList<Adult>();
		   Adult a1 = new Adult(); 
		    a1.name = name;
		    a1.id = id;
		    memberSearch.add(a1);
		   for(int i = 0;i<member.size();i++){
			for (int j=0;j<memberSearch.size();j++){
				if(member.get(i).name==memberSearch.get(j).name 
						&& member.get(i).id==memberSearch.get(j).id){
					System.out.println(member.get(i).toString()+" is present in the list");
					return true;
				}
			}

		}
	
	   System.out.println("The contact doesn't exist");
		return false;
	
	   }
	   
	   public boolean delete(String name, int id){
		   ArrayList<Adult> memberSearch = new ArrayList<Adult>();
		   Adult a1 = new Adult(); 
		    a1.name = name;
		    a1.id = id;
		    memberSearch.add(a1);
		   for (int i =0; i<member.size();i++){
			   for(int j=0;j<memberSearch.size();j++){
				   if(member.get(i).name==memberSearch.get(j).name
						   &&member.get(i).id==memberSearch.get(j).id){
					   System.out.println(member.remove(i));
					   return true;
				   }
			   }
		   }
		   System.out.println("The contact doesn't exist");
		   return false;
	   }


	@Override
	public String toString() {
		return "Adult [name=" + name + ", id=" + id + "]";
	}
	
}
