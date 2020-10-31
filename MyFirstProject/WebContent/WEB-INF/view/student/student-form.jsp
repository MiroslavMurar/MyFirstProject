<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<DOCTYPE html> 

<html> 

<head>
	<title>Student Registration</title>
	
	<link 	type="text/css"
			rel="stylesheet"
			href="${pageContext.request.contextPath}/resources/css/style.css">
			
	<link   type="text/css"
			rel="stylesheet"
			href="${pageContext.request.contextPath}/resources/css/add-customer-style.css"> 
</head>


<body>
	<div id="wrapper">
		<div id="header">
			<h2>Welcome Student</h2>
		</div>
		
		<form:form action="saveStudent" modelAttribute="student" method="POST">
			
<%-- 			<form:hidden path="id"/> --%>
		
			First Name: <form:input path="firstName"/> 
						<form:errors path="firstName"/> 
						<br><br>
						
			Last Name: 	<form:input path="lastName"/> 
						<form:errors path="lastName"/> 
			<br><br>
			
			Email: 		<form:input path="email"/> 
						<form:errors path="email"/> 
			<br><br>
			
			Favourite Language: 
			Java <form:radiobutton path="favouriteLanguage" value="Java"/> 
			C# <form:radiobutton path="favouriteLanguage" value="C#" /> 
			PHP <form:radiobutton path="favouriteLanguage" value="PHP" /> 
			Python <form:radiobutton path="favouriteLanguage" value="Python" />
			<form:errors path="favouriteLanguage"/> 
			
			<br><br>
			
<!-- 			Operating systems:  -->
<%-- 					<form:checkbox path="operatingSystems" value="Linux" />  --%>
<%-- 					<form:checkbox path="operatingSystems" value="Mac OS" />  --%>
<%-- 					<form:checkbox path="operatingSystems" value="Windows" />  --%>
<%-- 					<form:errors path="operatingSystems"/>  --%>
			
			
			<input type="submit" value="Submit"/> 
		
	
		</form:form>
		
	</div>


</body>

</html>