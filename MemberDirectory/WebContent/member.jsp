<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 
<title>Add New Member</title>
</head>
<body>
    <form action="MemberController.do" method="post">
        <fieldset>
            <div>
                <label for="firstName">First Name</label> <input type="text"
                    name="firstName" value="<c:out value="${member.firstName}" />"
                     />
            </div> 
            <div>
                <label for="lastName">Last Name</label> <input type="text"
                    name="lastName" value="<c:out value="${member.lastName}" />"
                     />
            </div>
            <div>
                <label for="email">Email</label> <input type="text" 
                name="email" value="<c:out value="${member.email}" />" 
                />
            </div>
             <div>
                <label for="phone">Phone</label> <input type="text"
                    name="phone" value="<c:out value="${member.phone}" />"
                    />
            </div>
            <div>
                <label for="address">Address</label> <input type="text" 
                name="address" value="<c:out value="${member.address}" />" 
                />
            </div>
            
          
            <div>
                <input type="submit" value="Submit" />
            </div>
        </fieldset>
    </form>
</body>
</html>