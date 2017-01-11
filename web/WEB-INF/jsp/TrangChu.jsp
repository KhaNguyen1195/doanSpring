<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <jsp:include page="MenuTC.jsp" />
    </head>
    <body id="page-top" class="index">

        <!-- Loại trang sức -->
        <section id="loaitrangsuc">
            <div class="container">
                <div class="row">
                    <div class="col-lg-12 text-center">
                        <h2>Loại trang sức</h2>
                        <hr class="star-primary">
                    </div>
                </div>
                <div class="row">
                    <c:forEach var="item" items="${lstloaitrangsuc}" varStatus="status"> 
                    <div class="col-sm-4 loaitrangsuc-item" >
                        <h3 style="text-align:center; font-size:20px;"><span>${item.ten}</span></h3>
                        <a href="sanphamloaitrangsuc.htm" class="loaitrangsuc-link">
                            <div class="caption">
                                <div class="caption-content">
                                    <i class="fa fa-search-plus fa-3x"></i>
                                </div>
                            </div>
                            <img src="${pageContext.request.contextPath}/libs/img/trangsuckimcuong.jpg" class="img-responsive loaitrangsuc" alt="">
                        </a>
                    </div>
                    </c:forEach> 
                </div>
            </div>
        </section>
        <jsp:include page="ThuongHieuMenu.jsp" />
        <jsp:include page="FooterMenu.jsp" />

        


</body>
</html>
