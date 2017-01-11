<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
                            <li><i class="fa fa-home"></i><a href="quantri.htm">Trang chủ</a></li>
                            <li><i class="fa fa-list-alt"></i>Quản lý danh mục</li>
                            <li>Danh sách kho hàng</li>
                            <li>Nhập kho</li>
                        </ol>
                    </div>
                </div>
                <!-- page start-->               
                <div class="row">
                    <div class="col-lg-12">
                        <section class="panel">
                            <header class="panel-heading"><h2><strong>Kho hàng</strong></h2></header>
                            <div class="panel-body">
                                <div class="form">
                                    <form:form action="${action}" modelAttribute="khohang" class="form-group form-validate form-horizontal" id="khohangform">
                                        <form:hidden path="id"/>
                                        <div class="form-group">
                                            <label class="control-label col-lg-2">Sản phẩm <span class="required">*</span></label>
                                            <div class="col-lg-10">
                                                <form:select path="sanpham.id" class="form-control" id="sanpham" name="sanpham">
                                                    <form:option value="0" label="--- Chọn sản phẩm ---"/>
                                                    <form:options items="${sanphamList}"/>
                                                </form:select>
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label for="gianhap1sp" class="control-label col-lg-2">Giá <span class="required">*</span></label>
                                            <div class="col-lg-10">
                                                <form:input path="gianhap1sp" placeholder="Giá" class=" form-control" id="gianhap1sp"/>
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label for="soluong" class="control-label col-lg-2">Số lượng <span class="required">*</span></label>
                                            <div class="col-lg-10">
                                                <form:input path="soluong" placeholder="Số lượng" class=" form-control" id="soluong"/>
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label for="tongtrigia" class="control-label col-lg-2">Tổng giá trị <span class="required">*</span></label>
                                            <div class="col-lg-10">
                                                <form:input path="tongtrigia" placeholder="Tổng giá trị" class=" form-control" id="tongtrigia"/>
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label for="ngaynhapkho" class="control-label col-lg-2">Ngày nhập kho</label>
                                            <div class="col-lg-10">
                                                <form:input path="ngaynhapkho" placeholder="Ngày nhập kho" class=" form-control" id="ngaynhapkho" type="date"/>
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <div class="col-lg-offset-2 col-lg-10">
                                                <button class="btn btn-primary" type="submit">Lưu</button>
                                                <button type="reset" class="btn btn-default">Làm mới</button>
                                                <a href="danhsachkhohang.htm" class="btn btn-success" type="button">Quay lại</a>
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
    <script src="${pageContext.request.contextPath}/libs/js/jquery-ad.js" ></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/libs/js/jquery.validate.min.js" ></script>
        <script type="text/javascript">
            jQuery(document).ready(function ($) {

                $("#khohangform").validate({
                    debug: true,
                    rules: {
                        gianhap1sp: {
                            required: true,
                            number:true
                        },
                        soluong: {
                            required: true,
                            number: true
                        },
                        tongtrigia: {
                            required: true,
                            number:true
                        }
                        
                    },
                    messages: {
                        gianhap1sp: {
                            required: '<span style="color:red;">Vui lòng nhập giá của sản phẩm.</span>',
                            number: '<span style="color:red;"> Vui lòng nhập đúng định dạng số</span>'
                        },
                        soluong: {
                            required: '<span style="color:red;">Vui lòng nhập số lượng.</span>',
                            number: '<span style="color:red;"> Vui lòng nhập đúng định dạng số</span>'
                        },
                        tongtrigia: {
                            required: '<span style="color:red;">Vui lòng nhập tổng giá trị.</span>',
                            number: '<span style="color:red;"> Vui lòng nhập đúng định dạng số</span>'
                        }
                    }
                });
            });

        </script>
</html>
