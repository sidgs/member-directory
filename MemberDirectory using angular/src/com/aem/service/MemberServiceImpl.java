package com.aem.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.w3c.dom.css.Counter;

import com.aem.model.Member;

public class MemberServiceImpl implements MemberService {
	
	private static final AtomicLong counter = new AtomicLong();
	
	private static List<Member> members;
	
static{
		
		members = populateDummyMembers();
		
	}

	@Override
	public List<Member> findAllMembers(){
		return members;
	}
	
	@Override
	public Member findById(long id){
		for(Member member : members){
			if(member.getId() == id){
				return member;
			}
		}
		return null;
	
	}
	
	@Override
	public Member findByName(String name){
		for(Member member : members){
			if(member.getName().equalsIgnoreCase(name)){
				return member;
			}
		}
		return null;
	}

	
	@Override
	public void saveMember(Member member){
		member.setId(counter.incrementAndGet());
		members.add(member);
		
		}
	
	@Override
	public void updateMember(Member member){
		int index = members.indexOf(member);
		members.set(index, member);
	
		}
	
	
	@Override
	public void deleteMember(long id){
		for (Iterator<Member> iterator = members.iterator(); iterator.hasNext(); ) {
		    Member member = iterator.next();
		    if (member.getId() == id) {
		        iterator.remove();
		    }
		}
		
	}
	
	public boolean isMemberExist(Member member) {
		return findByName(member.getName()) !=null;
	}
	
	public void deleteAllMembers(){
		members.clear();
	}
	
	
private static List<Member> populateDummyMembers() {
	List<Member> users = new ArrayList<Member>();
	members.add(new Member(counter.incrementAndGet(), "Tagore","vytla@gmail",9989, "exton"));
	return users;
}

	
	

}
