package com.aem.service;

import java.util.List;

import com.aem.model.Member;

public interface MemberService {

	List<Member> findAllMembers();

	Member findById(long id);

	Member findByName(String name);

	void saveMember(Member member);

	void updateMember(Member member);

	void deleteMember(long id);
	
	void deleteAllMembers();
	
	public boolean isMemberExist(Member member);

}