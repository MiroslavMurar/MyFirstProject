<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html> 

<html>


<head> 
	<title>Create Account</title>
	
	<link type="text/css"
                  rel="stylesheet"
                  href="${pageContext.request.contextPath}/resources/css/style.css">

    <link type="text/css"
              rel="stylesheet"
              href="${pageContext.request.contextPath}/resources/css/add-customer-style.css">
</head>


<body>
	 <div id="wrapper">
	                <div id="header">
	                        <h2>CRM - Customer Relationship Manager</h2>
	                </div>
	        </div>
	
	        <div id="container">
	                <h3>Save Customer</h3>
						
						
						<form:form action="saveCustomer" modelAttribute="customer" method="POST">
							
							First name: 	<form:input path="firstName"/> 
											<form:errors path="firstName" cssClass="error"/> 
							<br><br>
							Last name: 		<form:input path="lastName"/> 
											<form:errors path="lastName" cssClass="error"/> 
							<br><br>
							Email: 			<form:input path="email"/> 
											<form:errors path="email" cssClass="error"/> 
							<br><br>		
							Course code: 	<form:input path="courseCode"/> 
											<form:errors path="courseCode" cssClass="errors"/> 
							<br><br>
											<input type="submit" value="Submit"  class="save"/> 
						
						</form:form>
						
						
					<div style="clear; both;"></div>
               
<!--                <p> -->
<%--                        <a href="${pageContext.request.contextPath}/customer/list">Back to List</a> --%>
<!--                </p> -->
       
       </div>
</body>


</html>