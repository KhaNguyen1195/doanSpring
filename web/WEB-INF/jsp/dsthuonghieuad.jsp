
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html; charset=utf-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
        <!--insert menu  -->
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
                            <li>Thương hiệu</li>
                        </ol>
                    </div>
                </div>
                <!-- page start-->               
                <div class="row">
                    <div class="col-lg-12">
                        <section class="panel">
                            <header class="panel-heading">
                                <h2><strong>Danh sách thương hiệu</strong></h2>
                                <div class="button-ds">
                                    <a class="btn btn-primary btn-sm" href="thuonghieu.htm">Thêm mới</a>
                                </div>
                            </header>
                            <div class="form">
                                <form class="form-group form-validate" id="register-form" method="get" action="">
                                    <div class="form-group col-lg-6">
                                        <label for="ma" class="control-label col-lg-4">Mã thương hiệu</label>
                                        <div class="col-lg-8">
                                            <input class=" form-control" id="ma" name="ma" type="text" placeholder="Mã thương hiệu"/>
                                        </div>
                                    </div>
                                    <div class="form-group col-lg-6">
                                        <label for="ten" class="control-label col-lg-4">Tên thương hiệu</label>
                                        <div class="col-lg-8">
                                            <input class=" form-control" id="ten" name="ten" type="text" placeholder="Tên thương hiệu"/>
                                        </div>
                                    </div>
                                    <div class="form-group col-lg-offset-6 col-lg-6">
                                        <button class="btn btn-warning" type="submit">Tìm kiếm</button>
                                    </div>
                                </form>
                            </div>
                            <br>
                            <div class="table-responsive ">
                                <table class="table table-bordered">
                                    <thead style="font-size:18px;">
                                        <tr>
                                            <th class="kc">#</th>
                                            <th class="kc">Mã thương hiệu</th>
                                            <th class="kc">Tên thương hiệu</th>
                                            <th class="kc">Mô tả</th>
                                            <th class="kc" style="min-width:50px;">Hành động</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <c:forEach var="item" items="${lstthuonghieu}" varStatus="status">
                                            <tr>
                                                <td class="kc">${status.index + 1}</td>
                                                <td class="kc">${item.ma}</td>
                                                <td class="kc">${item.ten}</td>
                                                <td class="kc">${item.mota}</td>
                                                <td>
                                                    <div class="kc">
                                                        <a href="chinhsuathuonghieu/${item.id}" class=" btn btn-info btn-sm tooltips" data-placement="top" data-toggle="tooltip" data-original-title="Chỉnh sửa">
                                                            <i class="fa fa-pencil"></i></a>
                                                        <a href="xoathuonghieu.htm?id=${item.id}" onclick="return confirm('Bạn chắc chắn muốn xóa?')" class=" btn btn-danger btn-sm tooltips" data-placement="top" data-toggle="tooltip" data-original-title="Xóa">
                                                            <i class="fa fa-trash-o"></i></a>
                                                    </div>
                                                </td>
                                            </tr>
                                        </tbody>
                                    </c:forEach>
                                </table>
                                <br>
                            </div>
                        </section>
                    </div>
                </div>
                <!-- page end-->
            </section>
        </section>
    </body>
</html>
