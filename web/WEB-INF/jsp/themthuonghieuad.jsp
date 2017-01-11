
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html; charset=utf-8" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <script src="<c:url value="/libs/js/jquery-ad.js" />"></script>
        <script type="text/javascript" src="<c:url value="/libs/js/jquery.validate.min.js" />"></script>
        <script type="text/javascript">
            jQuery(document).ready(function ($) {

                $("#register-form").validate({
                    rules: {
                        ten: {
                            required: true,
                            minlength: 5
                        },
                        ma: {
                            required: true,
                            minlength: 5
                        },
                        tendangnhap: {
                            required: true,
                            minlength: 5
                        },
                        matkhau: {
                            required: true,
                            minlength: 5
                        },
                        sodienthoai: {
                            required: true,
                            minlength: 5
                        },
                        diachi: {
                            required: true
                        },
                        confirm_password: {
                            required: true,
                            minlength: 5,
                            equalTo: "#password"
                        },
                        ngaysinh: {
                            required: true,
                            email: true
                        },
                        email: {
                            required: true,
                            email: true
                        },
                        topic: {
                            required: "#newsletter:checked",
                            minlength: 2
                        },
                        trangthai: "required"
                    },
                    messages: {
                        ten: {
                            required: '<span style="color:red;">Vui lòng nhập tên.</span>',
                            minlength: '<span style="color:red;">Tên của bạn phải trên 5 ký tự.</span>'
                        },
                        ma: {
                            required: '<span style="color:red;">Vui lòng nhập mã.</span>',
                            minlength: '<span style="color:red;">Mã của bạn phải trên 5 ký tự.</span>'
                        },
                        tendangnhap: {
                            required: "Vui lòng nhập tên đăng nhập.",
                            minlength: "Tên đăng nhập của bạn phải trên 5 ký tự."
                        },
                        matkhau: {
                            required: "Vui lòng nhập mật khẩu.",
                            minlength: "Mật khẩu của bạn phải trên 5 ký tự."
                        },
                        confirm_password: {
                            required: "Vui lòng nhập lại mật khẩu.",
                            minlength: "Mật khẩu của bạn phải trên 5 ký tự.",
                            equalTo: "Nhập đúng mật khẩu bạn vừa nhập."
                        },
                        sodienthoai: {
                            required: "Vui lòng nhập số điện thoại.",
                            minlength: "số điện thoại của bạn phải trên 5 ký tự."
                        },
                        diachi: {
                            required: "Vui lòng nhập điạ chỉ."
                        },
                        email: "Vui lòng nhập đúng định dạng email.",
                        ngaysinh: "Vui lòng nhập đúng định dạng ngày sinh.",
                        trangthai: "Vui lòng chọn trạng thái."
                    }
                });

            });
        </script>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
        <jsp:include page="menuad.jsp" />
    </head>
    <body>
        <section id="main-content">
            <section class="wrapper">
                <div class="row">
                    <div class="col-lg-12">
                        <ol class="breadcrumb">
                            <li><i class="fa fa-home"></i><a href="quantri.htm">Trang chủ</a></li>
                            <li><i class="fa fa-list-alt"></i>Quản lý danh mục</li>
                            <li>Danh sách thương hiệu</li>
                            <li>Thêm mới</li>
                        </ol>
                    </div>
                </div>
                <!-- page start-->               
                <div class="row">
                    <div class="col-lg-12">
                        <section class="panel">
                            <header class="panel-heading"><h2><strong>Thương hiệu</strong></h2></header>
                            <div class="panel-body">
                                <div class="form">
                                    <form:form action="${action}" modelAttribute="thuonghieu" class="form-group form-validate form-horizontal" id="register-form">
                                        <form:hidden path="id"/>
                                        <div class="form-group">
                                            <label for="ma" class="control-label col-lg-2">Mã thương hiệu <span class="required">*</span></label>
                                            <div class="col-lg-10">
                                                <form:input path="ma" placeholder="Mã thương hiệu" class=" form-control" id="ma"/>
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label for="ten" class="control-label col-lg-2">Tên thương hiệu <span class="required">*</span></label>
                                            <div class="col-lg-10">
                                                <form:input path="ten" placeholder="Tên thương hiệu" class=" form-control" id="ten"/>
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label for="mota" class="control-label col-lg-2">Mô tả</label>
                                            <div class="col-lg-10">
                                                <form:input path="mota" placeholder="Mô tả" class=" form-control" id="mota"/>
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <div class="col-lg-offset-2 col-lg-10">
                                                <button class="btn btn-primary" type="submit">Lưu</button>
                                                <button type="reset" class="btn btn-default">Làm mới</button>
                                                <a href="danhsachthuonghieu.htm" class="btn btn-success" type="button">Quay lại</a>
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
    </body>
</html>
