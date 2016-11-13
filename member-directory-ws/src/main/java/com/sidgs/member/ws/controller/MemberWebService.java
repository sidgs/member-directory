package com.sidgs.member.ws.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sidgs.dao.MemberDao;
import com.sidgs.model.Member;

@RestController
@RequestMapping("/member")
public class MemberWebService implements MemberDao {

    @Autowired
    @Qualifier("MemberDao")
    MemberDao dao;

    @RequestMapping(method = RequestMethod.POST)
    public void addMember(Member member) {
        dao.addMember(member);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public void deleteMember(@PathVariable("id") long id) {
        dao.deleteMember(id);
    }

    @RequestMapping(method = RequestMethod.PUT )
    public void updateMember(Member member) {
        dao.updateMember(member);
    }

    @RequestMapping (method = RequestMethod.GET)
    public List<Member> getAllMembers() {
        return dao.getAllMembers();
    }

    @RequestMapping (method = RequestMethod.GET, value = "/find-by-lastname/{last-name}")
    public List<Member> getMemberByLastName(@PathVariable("last-name")String LastName) {
        return dao.getMemberByLastName(LastName);
    }

    @RequestMapping (method = RequestMethod.GET, value = "/{id}")
    public Member getMember(@PathVariable("id")long id) {
        return dao.getMember(id);
    }
}
