import static org.junit.Assert.*;

import org.junit.Test;

import com.sidgs.model.Member;

import junit.framework.Assert;

public class MemberTest {

	
	@Test
	public void getFirstName() throws Exception {

		
	    Member member = new Member();
	    String expResult = "tagore";
	    member.setFirstName("tag");
	    String result = member.getFirstName();
	    assertEquals(expResult, result);
}
	
	@Test
	public void setFirstName() throws Exception {
		
		Member member = new Member();
		member.setFirstName("Tagore");
		Assert.assertEquals(member.getFirstName(), "Tagore");
	}
	
	@Test
	public void setId() throws Exception {
		Member member = new Member();
		member.setMember_id(10);
		Assert.assertEquals(member.getMember_id(), "10");
	}
	
	@Test
	public void getId() throws Exception {
		
	    Member member = new Member();
	    int expResult = 1000;
	    member.setMember_id(1000);
	    int result = (int) member.getMember_id();
	    assertEquals(expResult, result);
	}
	
	@Test
	public void getLastName() throws Exception {

		Member member = new Member();
	    String expResult = "tagore";
	    member.setLastName("tagore");
	    String result = member.getLastName();
	    assertEquals(expResult, result);
	}
	

	@Test
	public void setLastName() throws Exception {
		
		Member member = new Member();
		member.setLastName("Vytla");
		Assert.assertEquals(member.getLastName(), "Vytla");
	}
	
	@Test
	public void getEmail() throws Exception{
		
		Member member = new Member();
		String expResult = "tvytl@gmail.com";
		member.setEmail("tvytl@gmail.com");
		String result = member.getEmail();
		assertEquals(expResult,result);
		
	}
	
	@Test
	public void setEmail() throws Exception{
		
		Member member = new Member();
		member.setEmail("tvytl@gmail.com");
		Assert.assertEquals(member.getEmail(), "tvytl@gmail.com");
	}
	
	@Test
	public void getPhone() throws Exception{
		
		Member member = new Member();
		int expResult = 9989;
		member.setPhone(9989);
		int result = member.getPhone();
		assertEquals(expResult,result);
			
		}
	
	@Test
	public void setPhone() throws Exception{
		
		Member member = new Member();
		member.setPhone(9989);
		Assert.assertEquals(member.getPhone(), 9989);
		}
	
	@Test
	public void getAddress() throws Exception{
		
		Member member = new Member();
		String expResult = "athertondrive";
		member.setAddress("athertondrive");
		String result = member.getAddress();
		assertEquals(expResult,result);
			
		}
	
	@Test
	public void setAddress() throws Exception{
		
		Member member = new Member();
		member.setAddress("newark");
		Assert.assertEquals(member.getAddress(), "newark");
	}
}
