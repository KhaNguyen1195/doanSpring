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
        <div class="container content">
            <div class="row">
                <c:forEach var="item" items="${lstsanpham}" varStatus="status"> 
                    <div class="col-md-12 product-title">
                        <ul style="display: block;margin: 0;padding: 0;list-style: none;text-align: center;">
                            <li style="display: inline-block;position: relative;"> 
                                    ${item.trangsuc.ten}<i></i>
                            </li>                         
                        </ul>
                    </div>
                    <div class="col-md-3 col-sm-6 info">
                        <div  class="hovereffect">
                            <img src="<c:url value="/libs/img/${item.img}" />" style="width:250px;height:250px"/>
                            <div class="overlay">
                                <h3>${item.ten}</h3>
                                <span>${item.ma}</span></br>
                                <span>${item.giaban} VNĐ</span></br>
                                <span class="state" style="color:red;">CÒN HÀNG</span></br>
                                <a href="chitietsanpham/${item.id}"><input class="btn-chitiet" type="submit" name="submit" value="Xem chi tiết"/></a>
                            </div>
                        </div>
                    </div>
                </div>
            </c:forEach>
        </div>

        <jsp:include page="ThuongHieuMenu.jsp" />
        <jsp:include page="FooterMenu.jsp" />


    </body>
</html>
