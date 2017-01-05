<%-- 
    Document   : chinhsuanhacungcapad
    Created on : Dec 28, 2016, 2:59:11 PM
    Author     : Administrator
--%>
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
                            <li><i class="fa fa-home"></i><a href="admin.htm">Trang chủ</a></li>
                            <li><i class="fa fa-list-alt"></i>Quản lý danh mục</li>
                            <li>Danh sách nhà cung cấp</li>
                            <li>Thêm mới</li>
                        </ol>
                    </div>
                </div>
                <!-- page start-->               
                <div class="row">
                    <div class="col-lg-12">
                        <section class="panel">
                            <header class="panel-heading"><h2><strong>Nhà cung cấp</strong></h2></header>
                            <div class="panel-body">
                                <div class="form">
                                    <form:form action="${action}" modelAttribute="nhacungcap" class="form-group form-validate form-horizontal" id="register-form">
                                        <form:hidden path="id"/>
                                        <div class="form-group">
                                            <label for="ma" class="control-label col-lg-2">Mã nhà cung cấp <span class="required">*</span></label>
                                            <div class="col-lg-10">
                                                <form:input path="ma" placeholder="Mã nhà cung cấp" class=" form-control" id="ma"/>
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label for="ten" class="control-label col-lg-2">Tên nhà cung cấp <span class="required">*</span></label>
                                            <div class="col-lg-10">
                                                <form:input path="ten" placeholder="Tên nhà cung cấp" class=" form-control" id="ten"/>
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label for="dienthoai" class="control-label col-lg-2">Điện thoại <span class="required">*</span></label>
                                            <div class="col-lg-10">
                                                <form:input path="dienthoai" placeholder="Điện thoại" class=" form-control" id="dienthoai"/>
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label for="diachi" class="control-label col-lg-2">Địa chỉ <span class="required">*</span></label>
                                            <div class="col-lg-10">
                                                <form:input path="diachi" placeholder="Địa chỉ" class=" form-control" id="diachi"/>
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label for="thanhpho" class="control-label col-lg-2">Thành phố</label>
                                            <div class="col-lg-10">
                                                <form:input path="thanhpho" placeholder="Thành phố" class=" form-control" id="thanhpho"/>
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label for="quocgia" class="control-label col-lg-2">Quốc gia</label>
                                            <div class="col-lg-10">
                                                <form:input path="quocgia" placeholder="Quốc gia" class=" form-control" id="quocgia"/>
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <div class="col-lg-offset-2 col-lg-10">
                                                <button class="btn btn-primary" type="submit">Lưu</button>
                                                <a href="../danhsachnhacungcap.html" class="btn btn-success" type="button">Quay lại</a>
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
