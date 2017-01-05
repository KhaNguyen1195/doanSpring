<%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html; charset=utf-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
        <jsp:include page="menuad.jsp" />
    </head>
    <body>
        <section id="main-content">
            <section class="wrapper">
                <div class="row">
                    <div class="col-lg-12">
                        <ol class="breadcrumb">
                            <li><i class="fa fa-home"></i><a href="admin.htm">Trang chủ</a></li>
                            <li><i class="fa fa-list-alt"></i>Quản lý danh mục</li>
                            <li>Danh sách sản phẩm</li>
                            <li>Thêm mới</li>
                        </ol>
                    </div>
                </div>
                <!-- page start-->               
                <div class="row">
                    <div class="col-lg-12">
                        <section class="panel">
                            <header class="panel-heading"><h2><strong>Sản phẩm</strong></h2></header>
                            <div class="panel-body">
                                <div class="form">
                                    <form:form action="${action}" modelAttribute="sanpham" id="register-form" 
                                               class="form-group form-validate" enctype="multipart/form-data">
                                        <form:hidden path="id"/>
                                        <div class="form-group col-lg-6">
                                            <label for="ma" class="control-label col-lg-4">Mã sản phẩm <span class="required">*</span></label>
                                            <div class="col-lg-8">
                                                <form:input path="ma" placeholder="Mã sản phẩm" class=" form-control" id="ma"/>
                                            </div>
                                        </div>
                                        <div class="form-group col-lg-6">
                                            <label for="ten" class="control-label col-lg-4">Tên sản phẩm <span class="required">*</span></label>
                                            <div class="col-lg-8">
                                                <form:input path="ten" placeholder="Tên sản phẩm" class=" form-control" id="ten"/>
                                            </div>
                                        </div>
                                        <div class="form-group col-lg-6">
                                            <label class="control-label col-lg-4">Trang sức <span class="required">*</span></label>
                                            <div class="col-lg-8">                               
                                                <form:select path="trangsuc.id" class="form-control" id="trangsuc">
                                                    <form:option value="0" label="--- Chọn trang sức ---"/>
                                                    <form:options items="${trangsucList}"/>
                                                </form:select> 
                                            </div>
                                        </div>  
                                        <div class="form-group col-lg-6">
                                            <label class="control-label col-lg-4">Thương hiệu <span class="required">*</span></label>
                                            <div class="col-lg-8">                               
                                                <form:select path="thuonghieu.id" class="form-control" id="thuonghieu" name="thuonghieu">
                                                    <form:option value="0" label="--- Chọn thương hiệu ---"/>
                                                    <form:options items="${thuonghieuList}"/>
                                                </form:select> 
                                            </div>
                                        </div>
                                        <div class="form-group col-lg-6">
                                            <label class="control-label col-lg-4">Chủng loại <span class="required">*</span></label>
                                            <div class="col-lg-8">                               
                                                <form:select path="chungloai.id" class="form-control" id="chungloai" name="chungloai">
                                                    <form:option value="0" label="--- Chọn chủng loại ---"/>
                                                    <form:options items="${chungloaiList}"/>
                                                </form:select> 
                                            </div>
                                        </div>
                                        <div class="form-group col-lg-6">
                                            <label class="control-label col-lg-4">Loại vàng <span class="required">*</span></label>
                                            <div class="col-lg-8">                               
                                                <form:select path="loaivang.id" class="form-control" id="loaivang" name="loaivang">
                                                    <form:option value="0" label="--- Chọn loại vàng ---"/>
                                                    <form:options items="${loaivangList}"/>
                                                </form:select>  
                                            </div>
                                        </div>
                                        <div class="form-group col-lg-6">
                                            <label class="control-label col-lg-4">Chất liệu <span class="required">*</span></label>
                                            <div class="col-lg-8">                               
                                                <form:select path="chatlieu.id" class="form-control" id="chatlieu" name="chatlieu">
                                                    <form:option value="0" label="--- Chọn chất liệu ---"/>
                                                    <form:options items="${chatlieuList}"/>
                                                </form:select> 
                                            </div>
                                        </div>
                                        <div class="form-group col-lg-6">
                                            <label class="control-label col-lg-4">Loại đá <span class="required">*</span></label>
                                            <div class="col-lg-8">                               
                                                <form:select path="loaida.id" class="form-control" id="loaida" name="loaida">
                                                    <form:option value="0" label="--- Chọn loại đá ---"/>
                                                    <form:options items="${loaidaList}"/>
                                                </form:select> 
                                            </div>
                                        </div>
                                        <div class="form-group col-lg-6">
                                            <label class="control-label col-lg-4">Màu đá <span class="required">*</span></label>
                                            <div class="col-lg-8">                               
                                                <form:select path="mauda.id" class="form-control" id="mauda" name="mauda">
                                                    <form:option value="0" label="--- Chọn màu đá ---"/>
                                                    <form:options items="${maudaList}"/>
                                                </form:select>
                                            </div>
                                        </div>
                                        <div class="form-group col-lg-6">
                                            <label for="giaban" class="control-label col-lg-4">Giá bán <span class="required">*</span></label>
                                            <div class="col-lg-8">
                                                <form:input path="giaban" placeholder="Giá bán" class=" form-control" id="giaban"/>
                                            </div>
                                        </div>
                                        <div class="form-group col-lg-6">
                                            <label for="mota" class="control-label col-lg-4">Mô tả</label>
                                            <div class="col-lg-8">
                                                <form:textarea path="mota" placeholder="Mô tả" class=" form-control" id="mota"/>
                                            </div>
                                        </div>
                                        <div class="form-group col-lg-6">
                                            <label for="exampleInputFile" class="control-label col-lg-4">Hình ảnh</label>
                                            <div class="col-lg-8">
                                                <form:input type="file" name="img" path="img" id="exampleInputFile"/>
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <div class="col-lg-offset-2 col-lg-8">
                                                <button class="btn btn-primary" type="submit">Lưu</button>
                                                <button type="reset" class="btn btn-default">Làm mới</button>
                                                <a href="danhsachsanpham.htm" class="btn btn-success" type="button">Quay lại</a>
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
