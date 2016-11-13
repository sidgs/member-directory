package com.sidgs.Client;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

import com.sidgs.model.Member;

public class MemberClient {
         
	private Client client;
		public MemberClient(){
			client=ClientBuilder.newClient();
			}
		public Member get(String id){
			WebTarget target= client.target("http://localhost:8080/member/");			
	          Member response = (Member) target.path(id).request().get(Member.class);
	          return response;
		}
}
