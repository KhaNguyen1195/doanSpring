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
        <section id="main-content">
            <section class="wrapper">
                <div class="row">
                    <div class="col-lg-12">
                        <ol class="breadcrumb">
                            <li><i class="fa fa-home"></i><a href="quantri.htm">Trang chủ</a></li>
                            <li><i class="fa fa-list-alt"></i>Quản lý danh mục</li>
                            <li>Danh sách chất liệu</li>
                            <li>Thêm mới</li>
                        </ol>
                    </div>
                </div>
                <!-- page start-->               
                <div class="row">
                    <div class="col-lg-12">
                        <section class="panel">
                            <header class="panel-heading"><h2><strong>Chất liệu</strong></h2></header>
                            <div class="panel-body">
                                <div class="form">
                                    <form:form action="${action}" modelAttribute="chatlieu" class="form-group form-validate form-horizontal" id="register-form">
                                        <div class="form-group">
                                            <label for="ma" class="control-label col-lg-2">Mã chất liệu <span class="required">*</span></label>
                                            <div class="col-lg-10">
                                                <%--<input type="text" name="year" value="${chatlieu.ma}"/>--%>
                                                <form:input path="ma" placeholder="Mã chất liệu" class=" form-control" id="ma"/>
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label for="ten" class="control-label col-lg-2">Tên chất liệu <span class="required">*</span></label>
                                            <div class="col-lg-10">
                                                <%--<input type="text" name="year" value="${chatlieu.ten}"/>--%>
                                                <form:input path="ten" placeholder="Tên chất liệu" class=" form-control" id="ten"/>
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label for="mauchatlieu" class="control-label col-lg-2">Màu chất liệu <span class="required">*</span></label>
                                            <div class="col-lg-10">
                                                <%--<input type="text" name="year" value="${chatlieu.mauchatlieu}"/>--%>
                                                <form:input path="mauchatlieu" placeholder="Màu chất liệu" class=" form-control" id="mauchatlieu"/>
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label for="mota" class="control-label col-lg-2">Mô tả</label>
                                            <div class="col-lg-10">
                                                <%--<input type="text" name="year" value="${chatlieu.mota}"/>--%>
                                               <form:input path="mota" placeholder="Mô tả" class=" form-control" id="mota"/>
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <div class="col-lg-offset-2 col-lg-10">
                                                <button class="btn btn-primary" type="submit">Lưu</button>
                                                <a href="../danhsachchatlieu.htm" class="btn btn-success" type="button">Quay lại</a>
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
