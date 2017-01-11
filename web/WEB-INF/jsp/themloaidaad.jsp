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
                            minlength: 5
                        },
                        ma: {
                            required: true,
                            minlength: 5
                        },
                        hinhdang: {
                            required: true
                        },
                        kichthuoc: {
                            required: true,
                            number:true
                        },
                        chatluong: {
                            required: true
                        }
                        
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
                        hinhdang: {
                            required: '<span style="color:red;">Vui lòng nhập hình dáng đá.</span>'
                        }
                        ,
                        kichthuoc: {
                            required: '<span style="color:red;">Vui lòng nhập kích thước đá.</span>',
                            number: '<span style="color:red;"> Vui lòng nhập đúng định dạng số</span>'
                        },
                        chatluong: {
                            required: '<span style="color:red;">Vui lòng nhập chất lượng.</span>'
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
                            <li>Danh sách loại đá</li>
                            <li>Thêm mới</li>
                        </ol>
                    </div>
                </div>
                <!-- page start-->               
                <div class="row">
                    <div class="col-lg-12">
                        <section class="panel">
                            <header class="panel-heading"><h2><strong>Loại đá</strong></h2></header>
                            <div class="panel-body">
                                <div class="form">
                                    <form:form action="${action}" modelAttribute="loaida" class="form-group form-validate form-horizontal" id="register-form">
                                        <form:hidden path="id"/>
                                        <div class="form-group">
                                            <label for="ma" class="control-label col-lg-2">Mã loại đá <span class="required">*</span></label>
                                            <div class="col-lg-10">
                                                <form:input path="ma" placeholder="Mã loại đá" class=" form-control" id="ma"/>
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label for="ten" class="control-label col-lg-2">Tên loại đá <span class="required">*</span></label>
                                            <div class="col-lg-10">
                                                <form:input path="ten" placeholder="Tên loại đá" class=" form-control" id="ten"/>
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label for="hinhdang" class="control-label col-lg-2">Hình dáng <span class="required">*</span></label>
                                            <div class="col-lg-10">
                                                <form:input path="hinhdang" placeholder="Hình dáng" class=" form-control" id="hinhdang"/>
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label for="kichthuoc" class="control-label col-lg-2">Kích thước <span class="required">*</span></label>
                                            <div class="col-lg-10">
                                                <form:input path="kichthuoc" placeholder="Kích thước" class=" form-control" id="kichthuoc"/>
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label for="chatluong" class="control-label col-lg-2">Chất lượng <span class="required">*</span></label>
                                            <div class="col-lg-10">
                                                <form:input path="chatluong" placeholder="Chất lượng" class=" form-control" id="chatluong"/>
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
                                                <a href="danhsachloaida.htm" class="btn btn-success" type="button">Quay lại</a>
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
