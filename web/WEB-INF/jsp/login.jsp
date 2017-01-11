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
            <form action="loginAdmin.htm" class="login-form" method="POST">
                <div class="login-wrap">
                    <p class="login-img"><i class="icon_lock_alt"></i></p>
                    <div class="input-group">
                        <span class="input-group-addon"><i class="icon_profile"></i></span>
                        <input type="text" class="form-control" placeholder="Tài khoản" name="tendangnhap" autofocus>
                    </div>
                    <div class="input-group">
                        <span class="input-group-addon"><i class="icon_key_alt"></i></span>
                        <input type="password" class="form-control" placeholder="Mật khẩu" name="matkhau">
                    </div>
                    <div>
                        <label class="checkbox">
                            <input type="checkbox" name="remember" value="Remember Me"> Ghi nhớ mật khẩu
                        </label>
                        <p style="color: #e21a10;">
                            <% //session.getAttribute("user") %>
                            <%
                                String loi = request.getParameter("loi");
                                if (loi != null) {
                                    if (loi.equals("1")) {
                                        out.print("Tài khoản mật khẩu bi sai.Vui lòng đăng nhập lại.");
                                    }

                                }
                                String user;
                                user = (String) session.getAttribute("user");
                                if (user != null) {
                                    response.sendRedirect("quantri.htm");
                                }

                            %> 
                        </p>
                    </div>
                    <button class="btn btn-primary btn-lg btn-block" type="submit">Đăng nhập</button>
                </div>
            </form>
        </div>

    </body>
</html>

