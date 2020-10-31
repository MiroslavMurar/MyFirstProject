<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html> 

<html>


<head> 
	<title>Confirmed Account</title>
	
	<link type="text/css"
                  rel="stylesheet"
                  href="${pageContext.request.contextPath}/resources/css/style.css">

    <link type="text/css"
              rel="stylesheet"
              href="${pageContext.request.contextPath}/resources/css/add-customer-style.css">
</head>

<body>
		
		First name: ${customer.firstName}
		<br><br>
		Last name: ${customer.lastName}
		<br><br>
		Email: ${customer.email}	
		<br><br>		
		Course code: ${customer.courseCode}
		<br><br>
		<a href="${pageContext.request.contextPath}/">Welcome Page</a>
		<br><br>
</body>


</html>