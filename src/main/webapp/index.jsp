<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head><title>Email List</title></head>
<body>
<jsp:include page="includes/header.jsp"/>
<h2>Join our email list</h2>
<form action="emailList" method="post">
    <input type="hidden" name="action" value="add"/>
    First Name: <input type="text" name="firstName"><br>
    Last Name: <input type="text" name="lastName"><br>
    Email: <input type="email" name="email"><br>
    <input type="submit" value="Join Now">
</form>
<jsp:include page="includes/footer.jsp"/>
</body>
</html>
