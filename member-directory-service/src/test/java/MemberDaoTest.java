import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.sidgs.dao.MemberDao;
import com.sidgs.dao.jdbc.MemberDaoImplementation;
import com.sidgs.model.Member;

public class MemberDaoTest {

	ApplicationContext applicationContext;
	MemberDao memberDao;
	MemberDaoImplementation memberDaoImplementation;
	@Before
	public void databasetest() {
		setup() ;
        assert (true);
        JdbcTemplate jdbcTemplate = (JdbcTemplate) applicationContext.getBean("jdbcTemplate");
        assert (jdbcTemplate!= null );

        MemberDao memberDao = (MemberDao) applicationContext.getBean("MemberDao");
        assert (memberDao != null );

	}
	
	  public void setup(){
	        if (applicationContext == null)
	        applicationContext =
	                new ClassPathXmlApplicationContext("classpath:META-INF/member-directory-service-appContext.xml");

	    }
	
	@Test
	public void addMember() {
		
		MemberDaoImplementation memberDaoImplementation = new MemberDaoImplementation();
		Member member = new Member();
		member.setId(10);
		member.setFirstName("Tagore");
		member.setLastName("Vytla");
		member.setEmail("Vytla@gmail.com");
		member.setPhone(9989);
		memberDaoImplementation.addMember(member);
		
		 List<Member> members = memberDaoImplementation.getAllMembers();
		 Assert.assertEquals(1, members.size());
		 
		 	}

	@Test
	public void deleteMember() {

	}

	@Test
	public void updateMember(){

	}

	@Test
	public List<Member> getAllMembers(){
		return null;

	}

	@Test
	public Member getMember(){

		Member member = new Member();
		member.setEmail("vytlasai@gmail.com");
		member.setId(10);
		member.setFirstName("Tagore");
		member.setLastName("Vytla");
		member.setPhone(9989);
		memberDao.addMember(member);
		
		

		List<Member> members = memberDao.getAllMembers();
		Assert.assertEquals(1, members.size());
		Member newMember = members.get(0);

		Assert.assertEquals("Tagore", newMember.getFirstName());
		Assert.assertEquals("vytlasai@gmail.com", newMember.getEmail());
		Assert.assertEquals("Vytla", newMember.getLastName());
		Assert.assertEquals(10, newMember.getId());
		Assert.assertEquals(9989, newMember.getPhone());
		return member;
		

	}
}
