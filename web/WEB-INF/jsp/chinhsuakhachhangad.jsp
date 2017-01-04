<%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <jsp:include page="menuad.jsp" />
    </head>
    <body>
        <!--main content start-->
        <section id="main-content">
            <section class="wrapper">
                <div class="row">
                    <div class="col-lg-12">
                        <ol class="breadcrumb">
                            <li><i class="fa fa-home"></i><a href="index.htm">Trang chủ</a></li>
                            <li><i class="fa fa-users"></i>Quản lý người dùng</li>
                            <li>Quản lý khách hàng</li>
                            <li>Chỉnh sửa</li>
                        </ol>
                    </div>
                </div>
                <!-- page start-->               
                <div class="row">
                    <div class="col-lg-12">
                        <section class="panel">
                            <header class="panel-heading"><h2><strong>Khách hàng</strong></h2></header>
                            <div class="panel-body">
                                <div class="form">
                                    <form:form action="${action}" modelAttribute="khachhang" class="form-group form-validate form-horizontal" id="register-form">
                                        <form:hidden path="id"/>
                                        <div class="form-group col-lg-6">
                                            <label for="ma" class="control-label col-lg-4">Mã khách hàng <span class="required">*</span></label>
                                            <div class="col-lg-8">
                                                <form:input path="ma" placeholder="Mã khách hàng" class=" form-control" id="ma"/>
                                            </div>
                                        </div>
                                        <div class="form-group col-lg-6">
                                            <label for="ten" class="control-label col-lg-4">Họ và tên <span class="required">*</span></label>
                                            <div class="col-lg-8">
                                                <form:input path="ten" placeholder="Họ và tên" class=" form-control" id="ten"/>
                                            </div>
                                        </div>
                                        <div class="form-group col-lg-6">
                                            <label for="ngaysinh" class="control-label col-lg-4">Ngày sinh <span class="required">*</span></label>
                                            <div class="col-lg-8">
                                                <form:input path="ngaysinh" placeholder="Ngày sinh" class=" form-control" id="ngaysinh"/>
                                            </div>
                                        </div>
                                        <div class="form-group col-lg-6">
                                            <label class="control-label col-lg-4">Giới tính <span class="required">*</span></label>
                                            <div class="col-lg-8">                               
                                                <select class="form-control" id="gioitinh" name="gioitinh">
                                                    <option value="">--- Chọn giới tính ---</option>
                                                    <option value="1">Nam</option>
                                                    <option value="2">Nữ</option>
                                                </select>  
                                            </div>
                                        </div>
                                        <div class="form-group col-lg-6">
                                            <label for="email" class="control-label col-lg-4">Email <span class="required">*</span></label>
                                            <div class="col-lg-8">
                                                <form:input path="email" placeholder="Email" class=" form-control" id="email"/>
                                            </div>
                                        </div>
                                        <div class="form-group col-lg-6">
                                            <label for="tendangnhap" class="control-label col-lg-4">Tên đăng nhập <span class="required">*</span></label>
                                            <div class="col-lg-8">
                                                <form:input path="tendangnhap" placeholder="Tên đăng nhập" class=" form-control" id="tendangnhap"/>
                                            </div>
                                        </div>
                                        <div class="form-group col-lg-6">
                                            <label for="matkhau" class="control-label col-lg-4">Mật khẩu <span class="required">*</span></label>
                                            <div class="col-lg-8">
                                                <form:input path="matkhau" placeholder="Mật khẩu" class=" form-control" id="matkhau"/>
                                            </div>
                                        </div>


                                        <div class="form-group col-lg-6">
                                            <label for="sodienthoai" class="control-label col-lg-4">Số điện thoại <span class="required">*</span></label>
                                            <div class="col-lg-8">
                                                <form:input path="sodienthoai" placeholder="Số điện thoại" class=" form-control" id="sodienthoai"/>
                                            </div>
                                        </div>
                                        <div class="form-group col-lg-6">
                                            <label for="diachi" class="control-label col-lg-4">Địa chỉ <span class="required">*</span></label>
                                            <div class="col-lg-8">
                                                <form:input path="diachi" placeholder="Địa chỉ" class=" form-control" id="diachi"/>
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <div class="col-lg-offset-2 col-lg-10">
                                                <button class="btn btn-primary" type="submit">Lưu</button>
                                                <a href="../danhsachkhachhang.html" class="btn btn-success" type="button">Quay lại</a>
                                            </div>
                                        </div>
                                    </form:form>
                                </div>
                            </div>
                        </section>
                    </div>
                </div>
                <!-- page end-->
            </section>
        </section>
        <!--main content end-->
    </body>
</html>
