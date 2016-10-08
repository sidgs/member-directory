package com.sidgs.dao;

import java.util.List;

import com.sidgs.model.Member;

public interface MemberDao {
	    public void addMember(Member member);
	    public void deleteMember(int phone);
	    public void updateMember(Member member);
	    public List<Member> getAllMembers();
	    public Member getMemberByLastName(String LastName );
	}

	


