<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head><title>Thanks</title></head>
<body>
<jsp:include page="includes/header.jsp"/>
<h2>Thanks for joining our email list</h2>
<p>Here is the information that you entered:</p>
<ul>
    <li>First Name: ${user.firstName}</li>
    <li>Last Name: ${user.lastName}</li>
    <li>Email: ${user.email}</li>
</ul>
<jsp:include page="includes/footer.jsp"/>
</body>
</html>
