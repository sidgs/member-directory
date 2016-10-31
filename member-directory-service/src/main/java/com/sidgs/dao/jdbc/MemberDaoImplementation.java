package com.sidgs.dao.jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.sidgs.dao.MemberDao;
import com.sidgs.model.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

@Service ("MemberDao")
public class MemberDaoImplementation implements MemberDao {


	private Connection conn;

	@Autowired
	@Qualifier("jdbcTemplate")
	JdbcTemplate jdbcTemplate ;

	public MemberDaoImplementation() {}


	public void addMember(Member member) {
		// TODO Auto-generated method stub

			String query = "insert into member (firstName, lastName, email, phone, address) " +
					"values (?,?,?,?,?)";
			int i = jdbcTemplate.update(query,
					member.getFirstName(),member.getLastName(),member.getEmail(),
					member.getPhone(), member.getAddress() );
	}

	public void deleteMember(int phone) {
			String query = "delete from member where phone=?";
			int i = jdbcTemplate.update(query, phone);
	}

	public void updateMember(Member member) {
			String query = "update member set firstName=?, phone=?, email=?, address=? where lastName=?";

			int i = jdbcTemplate.update(query,
					member.getFirstName(),member.getPhone(),
					member.getEmail(), member.getAddress(), member.getLastName());


	}

	public List<Member> getAllMembers() {
		List<Member> members = jdbcTemplate.query(
				"Select * from member",
				new RowMapper<Member>() {
					public Member mapRow(ResultSet resultSet, int i) throws SQLException {
						Member member = new Member();
						member.setFirstName( resultSet.getString( "firstName" ) );
						member.setLastName( resultSet.getString( "lastName" ) );
						member.setEmail( resultSet.getString( "email" ) );
						member.setPhone( resultSet.getInt( "phone" ) );
						member.setAddress( resultSet.getString( "address" ) );
						return null;
					}
				}

		) ;

		return members;
	}

	public List<Member> getMemberByLastName(String LastName) {

		List<Member> members = jdbcTemplate.query(
				"Select * from member where lastname='" + LastName + "'",
				new RowMapper<Member>() {
					public Member mapRow(ResultSet resultSet, int i) throws SQLException {
						Member member = new Member();
						member.setFirstName(resultSet.getString("firstName"));
						member.setLastName(resultSet.getString("lastName"));
						member.setEmail(resultSet.getString("email"));
						member.setPhone(resultSet.getInt("phone"));
						member.setAddress(resultSet.getString("address"));
						return null;
					}
				}

		);

		return members;
	}
}





