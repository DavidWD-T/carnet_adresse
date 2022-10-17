<%@include file="_head.jsp"%>
<body>
<%@include file="_navbar.jsp"%>
<form class="form-control" action="${pageContext.request.contextPath}/contact/add" method="post">


<%--    @Basic--%>
<%--    @Column(name = "picture")--%>
<%--    private String picture;--%>


<%--    @Basic--%>
<%--    @Column(name = "birthdate")--%>
<%--    private LocalDate birthDate;--%>

<%--    @Basic--%>
<%--    @Column(name = "company")--%>
<%--    private String company;--%>

<%--    @Basic--%>
<%--    @Column(name = "job")--%>
<%--    private String job;--%>

<%--    @Basic--%>
<%--    @Column(name = "address")--%>
<%--    private String address;--%>

<%--    @Basic--%>
<%--    @Column(name = "city")--%>
<%--    private String city;--%>

<%--    @Basic--%>
<%--    @Column(name = "country")--%>
<%--    private String country;--%>

<%--    @Basic--%>
<%--    @Column(name = "meeting_date")--%>
<%--    private LocalDate meetingDate;--%>

<%--    @Basic--%>
<%--    @Column(name = "city_date")--%>
<%--    private String cityDate;--%>

<%--    @Basic--%>
<%--    @Column(name = "country_date")--%>
<%--    private String countryDate;--%>

<%--    @Basic--%>
<%--    @Column(name = "context_date")--%>
<%--    private String contextDate;--%>
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
        <label for="phoneNumber">Numero de telephone : </label>
        <input type="tel" id="phoneNumber" name="phoneNumber" class="form-control">
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