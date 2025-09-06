<%@ page contentType="text/html;charset=UTF-8" %>
<hr>
<div class="footer">
    <p>&copy; <c:out value="${pageContext.request.getAttribute('year')}" default="2025"/> Murach’s Java JSP Project</p>
</div>
<jsp:include page="/copyright.jsp" />
