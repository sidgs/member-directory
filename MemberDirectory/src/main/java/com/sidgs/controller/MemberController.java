package com.sidgs.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sidgs.dao.MemberDao;
import com.sidgs.dao.MemberDaoImplementation;
import com.sidgs.model.Member;

/**
 * Servlet implementation class MemberController
 */
@WebServlet("/MemberController")
public class MemberController extends HttpServlet {
       
    /**
     * @see HttpServlet#HttpServlet()
     */

    private MemberDao dao;
    private static final long serialVersionUID = 1L;
    public static final String lIST_MEMBER = "/listMember.jsp";
    public static final String INSERT_OR_EDIT = "/member.jsp";
 
    public MemberController() throws IOException, ClassNotFoundException {
        dao = new MemberDaoImplementation();
    }
 
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String forward = "";
        String action = request.getParameter( "action" );
        
        if( action.equalsIgnoreCase( "delete" ) ) {
            forward = lIST_MEMBER;
            int phone = Integer.parseInt(request.getParameter("phone"));
            dao.deleteMember(phone);
            request.setAttribute("members", dao.getAllMembers());
        }
        if( action.equalsIgnoreCase( "edit" ) ) {
            forward = INSERT_OR_EDIT;
            String lastName = request.getParameter("lastName");
            Member member = dao.getMemberByLastName(lastName);
            request.setAttribute("member", member);
        }
        else if( action.equalsIgnoreCase( "insert" ) ) {
            forward = INSERT_OR_EDIT;
        }
        else {
            forward = lIST_MEMBER;
            request.setAttribute("members", dao.getAllMembers() );
        }
        RequestDispatcher view = request.getRequestDispatcher( forward );
        view.forward(request, response);
    }
 
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Member member = new Member();
        member.setFirstName( request.getParameter( "firstName" ) );
        member.setLastName( request.getParameter( "lastName" ) );
        member.setEmail( request.getParameter( "email" ) );
        member.setPhone(Integer.parseInt(request.getParameter( "phone" )));
        member.setAddress( request.getParameter( "address" ) );
        
        String lastName = request.getParameter("lastName");
 
        if( lastName!= null)
            dao.addMember(member);
        else {
            member.setLastName(lastName);
            dao.updateMember(member);
        }
        //dao.addMember(member);
        RequestDispatcher view = request.getRequestDispatcher( lIST_MEMBER );
        request.setAttribute("members", dao.getAllMembers());
        view.forward(request, response);
    }

}
