package com.aem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.aem.model.Member;
import com.aem.service.MemberService;

@RestController
public class MemberRestController {
	
	@Autowired
	
	MemberService memberService;
	
	
					//----- GET ALL MEMBERS----//
	 @RequestMapping(value = "/member", method = RequestMethod.GET)
	    public ResponseEntity<List<Member>> listAllMembers() {
	        List<Member> members = memberService.findAllMembers();
	        if(members.isEmpty()){
	            return new ResponseEntity<List<Member>>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
	        }
	        return new ResponseEntity<List<Member>>(members, HttpStatus.OK);
	    }
	 
	 				//------GET A MEMBER-----//
	 @RequestMapping(value = "/member/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	    public ResponseEntity<Member> getUser(@PathVariable("id") long id) {
	        System.out.println("Fetching User with id " + id);
	        Member member = memberService.findById(id);
	        if (member == null) {
	            System.out.println("Member with id " + id + " not found");
	            return new ResponseEntity<Member>(HttpStatus.NOT_FOUND);
	        }
	        return new ResponseEntity<Member>(member, HttpStatus.OK);
	    }
	 
	 		//-------------- CREATE MEMBER-----------------//
	 @RequestMapping(value = "/member", method = RequestMethod.POST)
	    public ResponseEntity<Void> createMember(@RequestBody Member member,UriComponentsBuilder ucBuilder) {
	        System.out.println("Creating Member " + member.getName());
	 
	        if (memberService.isMemberExist(member)) {
	            System.out.println("A Member with name " + member.getName() + " already exist");
	            return new ResponseEntity<Void>(HttpStatus.CONFLICT);
	        }
	 
	        memberService.saveMember(member);
	 
	        HttpHeaders headers = new HttpHeaders();
	        headers.setLocation(ucBuilder.path("/user/{id}").buildAndExpand(member.getId()).toUri());
	        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	    }
	 
	 			//-------------- UPDATE MEMBER---------------//
	 
	 @RequestMapping(value = "/user/{id}", method = RequestMethod.PUT)
	    public ResponseEntity<Member> updateMember(@PathVariable("id") long id, @RequestBody Member member) {
	        System.out.println("Updating member " + id);
	         
	        Member currentMember = memberService.findById(id);
	         
	        if (currentMember==null) {
	            System.out.println("Member with id " + id + " not found");
	            return new ResponseEntity<Member>(HttpStatus.NOT_FOUND);
	        }
	 
	        currentMember.setName(member.getName());
	        currentMember.setAddress(member.getAddress());
	        currentMember.setPhone(member.getPhone());
	        currentMember.setEmail(member.getEmail());
	         
	        memberService.updateMember(currentMember);
	        return new ResponseEntity<Member>(currentMember, HttpStatus.OK);
	    }
	 
	 				//------------DELETE A MEMBER-----------//
	    @RequestMapping(value = "/member/{id}", method = RequestMethod.DELETE)
	    public ResponseEntity<Member> deleteUser(@PathVariable("id") long id) {
	        System.out.println("Fetching & Deleting Member with id " + id);
	 
	     Member member = memberService.findById(id);
	        if (member == null) {
	            System.out.println("Unable to delete. Member with id " + id + " not found");
	            return new ResponseEntity<Member>(HttpStatus.NOT_FOUND);
	        }
	 
	        memberService.deleteMember(id);
	        return new ResponseEntity<Member>(HttpStatus.NO_CONTENT);
	    }
	    
	    //----------------DELETE ALL MEMBERS------------------//
	    
	    @RequestMapping(value = "/member", method = RequestMethod.DELETE)
	    public ResponseEntity<Member> deleteAllMembers() {
	        System.out.println("Deleting All Members");
	 
	        memberService.deleteAllMembers();
	        return new ResponseEntity<Member>(HttpStatus.NO_CONTENT);
	    }
	 

}
