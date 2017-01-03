

<%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html; charset=utf-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <script type="text/javascript">
            $(document).ready(function() {
    
    $("#savelogin").validate({
        rules: {
            ma: {
                required: true,
                minlength: 6,
                maxlength: 40
            },
            ten: {
                required: true,
                minlength: 6,
                maxlength: 40
            }
        },
        messages: {
            ma: {
                required: "username is required!",
                minlength: "username must be at least 6 characters long"
            },
            ten: {
                required: "Please enter a password",
                minlength: "Password must be at least 6 characters long"
            }
        },
        submitHandler: function (form) {
            // form.submit(); // <-- this is default
            alert('valid form');
        }
   

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
                            <li><i class="fa fa-home"></i><a href="index1.html">Trang chủ</a></li>
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
                                    <form:form id="savelogin" class="form-group form-horizontal" action="${action}" modelAttribute="thuonghieu">
                                        <form:hidden path="id"/>
                                        <div class="form-group">
                                            <label for="ma" class="control-label col-lg-2">Mã thương hiệu <span>*</span></label>
                                            <div class="col-lg-10">
                                                <form:input path="ma" placeholder="Mã thương hiệu" class="form-control required" id="ma" name="ma"  autocomplete="on"/>
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label for="ten" class="control-label col-lg-2">Tên thương hiệu <span>*</span></label>
                                            <div class="col-lg-10">
                                                <form:input path="ten" placeholder="Tên thương hiệu" class="form-control" id="ten" name="userRegistration.password"/>
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
                                                <button class="btn btn-primary" type="submit"  id="submit" onclick="submitForm();">Lưu</button>
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
