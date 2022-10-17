<%@include file="_head.jsp"%>
<body>
<%@include file="_navbar.jsp"%>
<form class="form-control" action="${pageContext.request.contextPath}/signin" method="post">
    <div>
        <label for="email">Adresse mail : </label>
        <input type="email" id="email" name="email" class="form-control">
    </div>

    <div>
        <label for="password">Mot de passe : </label>
        <input type="password" id="password" name="password" class="form-control">
    </div>
    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}">

    <button class="btn btn-success mt-2" type="submit">Sign In</button>
</form>

</body>
</html>