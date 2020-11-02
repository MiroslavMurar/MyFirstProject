<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

<html>

<head>
	<title>Student Confirmation</title>
</head>

<body>

	The Student is confirmed!
	<br><br>
	First Name: ${student.firstName}
	<br><br>
	Last Name: ${student.lastName}
	<br><br>
	Email: ${student.email}
	<br><br>
	Favourite Language: ${student.favouriteLanguage}
	<br><br>
	Operating Systems: 
		
	
	
	<br><br>
	<a href="${pageContext.request.contextPath}">Welcome Page</a>
</body>

</html>









