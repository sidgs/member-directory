package com.sidgs.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.sidgs.model.Member;
import com.sidgs.util.DBUtil;

public class MemberDaoImplementation implements MemberDao  {


	private Connection conn;

	public MemberDaoImplementation() throws IOException, ClassNotFoundException {
		conn = DBUtil.getConnection();
	}

	@Override
	public void addMember(Member member) {
		// TODO Auto-generated method stub
		try {
			String query = "insert into member (firstName, lastName, email, phone, address) values (?,?,?,?,?)";
			PreparedStatement preparedStatement = conn.prepareStatement( query );
			preparedStatement.setString( 1, member.getFirstName() );
			preparedStatement.setString( 2, member.getLastName() );
			preparedStatement.setString( 3, member.getEmail() );
			preparedStatement.setInt( 4, member.getPhone());
			preparedStatement.setString( 5, member.getAddress());

			preparedStatement.executeUpdate();
			preparedStatement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void deleteMember(int phone) {
		try {
			String query = "delete from member where phone=?";
			PreparedStatement preparedStatement = conn.prepareStatement(query);
			preparedStatement.setInt(1, phone);
			preparedStatement.executeUpdate();
			preparedStatement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void updateMember(Member member) {
		try {
			String query = "update member set firstName=?, phone=?, email=?, address=? where lastName=?";
			PreparedStatement preparedStatement = conn.prepareStatement( query );
			preparedStatement.setString( 1, member.getFirstName() );
			preparedStatement.setInt( 2, member.getPhone());
			preparedStatement.setString( 3, member.getEmail() );
			preparedStatement.setString( 4, member.getAddress() );
			preparedStatement.setString(5, member.getLastName());
			preparedStatement.executeUpdate();
			preparedStatement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public List<Member> getAllMembers() {
		List<Member> members = new ArrayList<Member>();
		try {
			Statement statement = conn.createStatement();
			ResultSet resultSet = statement.executeQuery( "select * from member" );
			while( resultSet.next() ) {
				Member member = new Member();
				member.setFirstName( resultSet.getString( "firstName" ) );
				member.setLastName( resultSet.getString( "lastName" ) );
				member.setEmail( resultSet.getString( "email" ) );
				member.setPhone( resultSet.getInt( "phone" ) );
				member.setAddress( resultSet.getString( "address" ) );
				members.add(member);
			}
			resultSet.close();
			statement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return members;

	}

	@Override
	public Member getMemberByLastName(String LastName) {
		Member member = new Member();
		try {
			String query = "select * from member where lastName=?";
			PreparedStatement preparedStatement = conn.prepareStatement( query );
			preparedStatement.setString(1, LastName);
			ResultSet resultSet = preparedStatement.executeQuery();
			while( resultSet.next() ) {
				member.setFirstName( resultSet.getString( "firstName" ) );
				member.setLastName( resultSet.getString( "lastName" ) );
				member.setPhone( resultSet.getInt( "phone" ) );
				member.setEmail( resultSet.getString( "email" ) );
				member.setAddress( resultSet.getString( "address" ) );
			}
			resultSet.close();
			preparedStatement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return member;
	}
}





