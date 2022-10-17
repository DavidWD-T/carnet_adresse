<%@include file="_head.jsp"%>
<body>

<header>
    <%@include file="_navbar.jsp"%>
</header>
<h1 class="fs-3 text-center my-4"><c:out value="Ma liste de livre"></c:out></h1>
<div class="container">


<div class="row d-inline-flex justify-content-center">

<c:forEach items="${books}" var="book">

    <div class="card col-3 m-2 p-0">
        <img class="card-img-top" src="${book.bookCover}" alt="Card image cap" style="max-height: 300px">
        <div class="card-body">
            <h5 class="card-title text-uppercase">${book.name}</h5>
            <p class="card-text">${book.publishingDate}</p>
        </div>
            <a class="m-1 text-end" href="${pageContext.request.contextPath}/books/details?id=${book.id}" type="button"><button class="btn btn-success text-end">View details</button></a>
    </div>

</c:forEach>
</div>
</div>

</body>
</html>