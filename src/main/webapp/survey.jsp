<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head><title>Survey Result</title></head>
<body>
<jsp:include page="includes/header.jsp"/>
<h2>Thanks for taking our survey!</h2>
<p>Here is the information that you entered:</p>
<ul>
    <li>Email: ${user.email}</li>
    <li>First Name: ${user.firstName}</li>
    <li>Last Name: ${user.lastName}</li>
    <li>Heard From: ${user.heardFrom}</li>
    <li>Updates: ${user.updates}</li>
    <c:if test="${user.updates == 'Yes'}">
        <li>Contact Via: ${user.contactVia}</li>
    </c:if>
</ul>
<jsp:include page="includes/footer.jsp"/>
</body>
</html>
