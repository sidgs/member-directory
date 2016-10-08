<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Members</title>
</head>
<body>
    <table>
        <thead>
            <tr>
                <th>First Name</th>
                <th>Last Name</th>
                <th>Email</th>
                <th>Phone</th>
                <th>Address</th>
                <th colspan="2">Action</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${members}" var="member">
                <tr>
                    <td><c:out value="${member.firstName}"/></td>
                    <td><c:out value="${member.lastName}"/></td>
                    <td><c:out value="${member.email}"/></td>
                    <td><c:out value="${member.phone}"/></td>
                    <td><c:out value="${member.address}"/></td>
                    <td><a
                        href="MemberController.do?action=edit&lastName=<c:out value="${member.lastName }"/>">Update</a></td>
                    <td><a
                        href="MemberController.do?action=delete&phone=<c:out value="${member.phone }"/>">Delete</a></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    <p>
        <a href="MemberController.do?action=insert">Add member</a>
    </p>
</body>
</html>