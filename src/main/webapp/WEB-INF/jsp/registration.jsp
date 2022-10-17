<%@include file="_head.jsp"%>
<body>
<%@include file="_navbar.jsp"%>
<form class="form-control" action="${pageContext.request.contextPath}/registration" method="post">
    <div>
        <label for="lastName">Nom : </label>
        <input type="text" id="lastName" name="lastName" class="form-control">
    </div>
    <div>
        <label for="firstName">Prenom : </label>
        <input type="text" id="firstName" name="firstName" class="form-control">
    </div>
    <div>
        <label for="email">Adresse mail : </label>
        <input type="email" id="email" name="email" class="form-control">
    </div>

    <div>
        <label for="password">Mot de passe : </label>
        <input type="text" id="password" name="password" class="form-control">
    </div>
    <div>
        <label for="picture">Photo : </label>
        <input type="url" id="picture" name="picture" class="form-control">
    </div>
    <div>
        <label for="birthDate">Anniversaire : </label>
        <input type="date" id="birthDate" name="birthDate" class="form-control">
    </div>
    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}">

    <button class="btn btn-success mt-2" type="submit">Sign Up</button>
</form>



<%--<form:form class="form-control" action="${pageContext.request.contextPath}/registration" method="post">--%>

<%--    <div>--%>
<%--        <label for="email">Adresse mail : </label>--%>
<%--        <form:input type="email" id="email" path="email" class="form-control" required="true"/>--%>
<%--        <form:errors path="email" cssClass="alert alert-danger"/>--%>
<%--    </div>--%>

<%--    <div>--%>
<%--        <label for="password">Mot de passe : </label>--%>
<%--        <div class="py-2">--%>
<%--&lt;%&ndash;            <form:errors path="password" cssClass="alert alert-danger py-1"/>&ndash;%&gt;--%>
<%--        </div>--%>
<%--        <form:input type="text" id="password" path="password" class="form-control"/>--%>

<%--    </div>--%>

<%--    <form:button class="btn btn-success mt-2" type="submit">Sign Up</form:button>--%>

<%--</form:form>--%>



</body>
</html>