package com.sidgs.dao;

import java.util.List;

import com.sidgs.model.Member;

public interface MemberDao {
	    public void addMember(Member member);
	    public void deleteMember(long id);
	    public void updateMember(Member member);
	    public List<Member> getAllMembers();
	    public List<Member> getMemberByLastName(String LastName );
		public Member getMember(long id);
	}

	


