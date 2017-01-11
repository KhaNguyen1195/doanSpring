<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
            <form:form action="${action}" modelAttribute="khachhang" class="login-form">
                <div class="login-wrap">
                    <h4 class="login-img">Đăng ký</h4>
                    <div class="input-group">
                        <span class="input-group-addon">Họ tên</span>
                        <form:input class=" form-control" id="ten" path="ten" type="text" placeholder="Họ tên"/>
                    </div>

                    <div class="input-group">
                        <span class="input-group-addon">Ngày sinh</span>
                        <form:input class=" form-control" id="ngaysinh" path="ngaysinh" type="date" />
                    </div>
                    <div class="input-group">    
                        <span class="input-group-addon">Giới tính</span>
                            <select class="form-control" id="gioitinh" name="gioitinh">
                                <option value="">--- Chọn giới tính ---</option>
                                <option value="1">Nam</option>
                                <option value="2">Nữ</option>
                            </select>  
                    </div>
                    <div class="input-group">
                        <span class="input-group-addon">Địa chỉ</span>
                        <form:textarea class="form-control" id="diachi" path="diachi" placeholder="Địa chỉ"/>
                    </div>
                    <div class="input-group">
                        <span class="input-group-addon">Số điện thoại</span>
                        <form:input class=" form-control" id="sodienthoai" path="sodienthoai" type="text" placeholder="Số điện thoại"/>
                    </div>
                    <div class="input-group">
                        <span class="input-group-addon">Email</span>
                        <form:input class=" form-control" id="email" path="email" type="email" placeholder="Email"/>
                    </div>
                    <div class="input-group">
                        <span class="input-group-addon">Tên đăng nhập</span>
                        <form:input class="form-control " id="tendangnhap" path="tendangnhap" type="text" placeholder="Tên đăng nhập"/>
                    </div>
                    <div class="input-group">
                        <span class="input-group-addon">Mật khẩu</span>
                        <form:input class="form-control " id="matkhau" path="matkhau" type="password" placeholder="Mật khẩu"/>
                    </div>
                    <button class="btn btn-primary btn-lg btn-block" type="submit">Đăng ký</button>
                </div>
            </form:form>
        </div>

    </body>
</html>

