<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

<html>

<head>
	<title>Admin Customer Confirmation</title>
</head>

<body>

The customer is confirmed: ${customer.firstName} ${customer.lastName}
<br><br>
	<a href="${pageContext.request.contextPath}/admin/customers">List Customers</a>
</body>

</html>









