<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <script src="<c:url value="/libs/js/jquery-ad.js" />"></script>
        <script type="text/javascript" src="<c:url value="/libs/js/jquery.validate.min.js" />"></script>
        <script type="text/javascript">
            jQuery(document).ready(function ($) {

                $("#register-form").validate({
                    debug: true,
                    rules: {
                        ten: {
                            required: true,
                            minlength: 4
                        },
                        ma: {
                            required: true,
                            minlength: 4
                        },
                        dienthoai: {
                            required: true,
                            number:true
                        },
                        diachi: {
                            required: true
                        }
                        
                    },
                    messages: {
                        ten: {
                            required: '<span style="color:red;">Vui lòng nhập tên.</span>',
                            minlength: '<span style="color:red;">Tên của bạn phải trên 4 ký tự.</span>'
                        },
                        ma: {
                            required: '<span style="color:red;">Vui lòng nhập mã.</span>',
                            minlength: '<span style="color:red;">Mã của bạn phải trên 4 ký tự.</span>'
                        },
                        dienthoai: {
                            required: '<span style="color:red;">Vui lòng nhập điện thoại.</span>',
                            number: '<span style="color:red;"> Vui lòng nhập đúng định dạng số</span>'
                        },
                        diachi: {
                            required: '<span style="color:red;">Vui lòng nhập địa chỉ.</span>'
                        }
                    }
                });
            });

        </script>
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
                            <li><i class="fa fa-home"></i><a href="quantri.htm">Trang chủ</a></li>
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
                                            <label for="hinhdang" class="control-label col-lg-2">Điện thoại <span class="required">*</span></label>
                                            <div class="col-lg-10">
                                                <form:input path="dienthoai" placeholder="Điện thoại" class=" form-control" id="dienthoai"/>
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label for="kichthuoc" class="control-label col-lg-2">Địa chỉ <span class="required">*</span></label>
                                            <div class="col-lg-10">
                                                <form:input path="diachi" placeholder="Địa chỉ" class=" form-control" id="diachi"/>
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label for="chatluong" class="control-label col-lg-2">Thành phố</label>
                                            <div class="col-lg-10">
                                                <form:input path="thanhpho" placeholder="Thành phố" class=" form-control" id="thanhpho"/>
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label for="mota" class="control-label col-lg-2">Quốc gia</label>
                                            <div class="col-lg-10">
                                                <form:input path="quocgia" placeholder="Quốc gia" class=" form-control" id="quocgia"/>
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <div class="col-lg-offset-2 col-lg-10">
                                                <button class="btn btn-primary" type="submit">Lưu</button>
                                                <button type="reset" class="btn btn-default">Làm mới</button>
                                                <a href="danhsachnhacungcap.htm" class="btn btn-success" type="button">Quay lại</a>
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
