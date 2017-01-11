
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="Creative - Bootstrap 3 Responsive Admin Template">
        <meta name="author" content="GeeksLabs">
        <meta name="keyword" content="Creative, Dashboard, Admin, Template, Theme, Bootstrap, Responsive, Retina, Minimal">
        <link href="${pageContext.request.contextPath}/libs/img/Diamond-icon.png" rel="shortcut icon" >
        <title>Quản trị hệ thống</title>

        <!-- Bootstrap CSS -->
        <link type="text/css" href="${pageContext.request.contextPath}/libs/css/bootstrap-ad.min.css" rel="stylesheet" >
        <!-- bootstrap theme -->
        <link type="text/css" href="${pageContext.request.contextPath}/libs/css/bootstrap-theme-ad.css" rel="stylesheet" >
        <!--external css-->
        <!-- font icon -->
        <link type="text/css" href="${pageContext.request.contextPath}/libs/css/elegant-icons-style-ad.css" rel="stylesheet" >
        <link type="text/css" href="${pageContext.request.contextPath}/libs/css/font-awesome-ad.min.css" rel="stylesheet" >
        <link type="text/css" href="${pageContext.request.contextPath}/libs/css/line-icons-ad.css" rel="stylesheet" >
        <!-- Custom styles -->
        <link type="text/css" href="${pageContext.request.contextPath}/libs/css/style-ad.css" rel="stylesheet" >
        <link type="text/css" href="${pageContext.request.contextPath}/libs/css/style-responsive-ad.css" rel="stylesheet" >
    </head>
    <body class="login-img3-body">
        <div class="container">
            <form action="updatematkhau.htm" class="login-form" >
                <div class="login-wrap">
                    <p class="login-img">Đổi mật khẩu</p>

                    <div class="input-group">
                        <span class="input-group-addon"><i class="icon_key_alt"></i></span>
                        <input class="form-control" placeholder="Mật khẩu cũ" name="matkhaucu" type="password">
                    </div>
                    <div class="input-group">
                        <span class="input-group-addon"><i class="icon_key_alt"></i></span>
                        <input class="form-control" placeholder="Mật khẩu mới" name="matkhau" type="password">
                    </div>
                    <div class="input-group">
                        <span class="input-group-addon"><i class="icon_key_alt"></i></span>
                        <input class="form-control" placeholder="Mật khẩu nhập lại" name="nhaplaimatkhau" type="password" value="">
                    </div>
                    <button class="btn btn-info btn-lg btn-block" type="submit">Đổi Mật Khẩu</button>
                    <a href="quantri.htm" class="btn btn-success btn-lg btn-block" type="button">Quay lại</a>
                </div>
            </form> 
        </div>

    </body>
</html>

