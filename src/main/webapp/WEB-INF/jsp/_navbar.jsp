<nav class="navbar navbar-expand-lg bg-light">
    <div class="container-fluid">
        <a class="navbar-brand" href="#">Navbar</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="${pageContext.request.contextPath}/home">Home</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="${pageContext.request.contextPath}/registration">Inscription</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="${pageContext.request.contextPath}/signin">Connexion</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="${pageContext.request.contextPath}/contact/all">Liste contacts</a>
                </li>

                <li class="nav-item">
                    <a class="nav-link" href="${pageContext.request.contextPath}/book/populate">Populate</a>
                </li>
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                        Dropdown
                    </a>
                    <ul class="dropdown-menu">
                        <li><a class="dropdown-item" href="#">Action</a></li>
                        <li><a class="dropdown-item" href="#">Another action</a></li>
                        <li><hr class="dropdown-divider"></li>
                        <li><a class="dropdown-item" href="#">Something else here</a></li>
                    </ul>
                    <sec:authorize access="!isAuthenticated()">
                <li class="nav-item d-flex text-center">
                    <form:form action="/login" method="post">

                        <button type="submit" class="btn btn-primary">Login</button>
                    </form:form>
                </li>
                </sec:authorize>
                    <sec:authorize access="isAuthenticated()">
                    <li class="nav-item d-flex text-center">
                <p class="mx-2 my-auto">Welcome <sec:authentication property="principal.username"/></p>
                        <form:form action="/logout" method="post">

                            <button type="submit" class="btn btn-danger">Logout</button>
                        </form:form>
                    </li>
                    </sec:authorize>
            </ul>
            <form action="${pageContext.request.contextPath}/books/all" class="d-flex" role="search" method="get">
                <input class="form-control me-2" type="search" name="search" placeholder="Saisir un mot" aria-label="Search">
                <button class="btn btn-outline-success" type="submit">Search</button>
            </form>
        </div>
    </div>
</nav>