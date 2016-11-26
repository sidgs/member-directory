package com.sidgs.dao.jdbc;

import static org.junit.Assert.*;

import java.sql.ResultSet;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.sidgs.dao.MemberDao;
import com.sidgs.model.Member;

import junit.framework.Assert;

public class MemberDaoImplementationTest {

	  ApplicationContext applicationContext;
	  private MemberDao memberdao;
	    public  MemberDaoImplementationTest( ) {
	               
	    	
	    }

		@Before
	    public void setup(){
	        if (applicationContext== null)
	        applicationContext =
	                new ClassPathXmlApplicationContext("classpath:META-INF/member-directory-service-appContext.xml");

			memberdao =  (MemberDao) applicationContext.getBean("MemberDao");

	    }

	    @Test
	    public void testAppContextInit() {

	        assert (true);
	        JdbcTemplate jdbcTemplate = (JdbcTemplate) applicationContext.getBean("jdbcTemplate");
	        assert (jdbcTemplate!= null );

	        MemberDao memberDao = (MemberDao) applicationContext.getBean("MemberDao");
	        assert (memberDao != null );
	    }
	    
	    @SuppressWarnings("deprecation")
		@Test
		public void testAddMember(){
//	    	setup();
	    	Member m1=new Member();
	    	m1.setAddress("guntur");
	    	m1.setEmail("mail.com");
	    	m1.setFirstName("kalyan");
	    	m1.setLastName("inturi");
	    	m1.setMember_id(1234);
	    	m1.setPhone(203606);
	    	memberdao.addMember(m1);
	    	Assert.assertEquals(m1, memberdao.getMember(1234));
           	    	
	    }
	    @Test
	    public void testUpdateMember(){
//			setup();
			Member m3 = null ;
			try {
				 m3 = memberdao.getMember(5);
			} catch (Exception e) {
				e.printStackTrace();
			}
	        m3.setFirstName("kalyan");
			memberdao.updateMember(m3);
	       Member m1=memberdao.getMember(5);
	       assertEquals("kalyan",m1.getFirstName());
	       }

	    @Test
	    public void testDeleteMember(){
//			setup();
	    	List<Member> members=memberdao.getAllMembers();
	    	int i= members.size();
	    	memberdao.deleteMember(5);
	    	assertEquals(i-1,members.size());
	    }
	  
}
