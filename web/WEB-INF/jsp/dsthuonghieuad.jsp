
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
                            <li><i class="fa fa-home"></i><a href="index1.html">Trang chủ</a></li>
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
                                    <a class="btn btn-primary btn-sm" href="thuonghieu.html">Thêm mới</a>
                                    <a class="btn btn-danger btn-sm" href="">Xóa</a>
                                </div>
                            </header>
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
                                        <c:forEach var="item" items="${lstthuonghieu}">
                                            <tr>
                                                <td class="kc">${item.id}</td>
                                                <td class="kc">${item.ma}</td>
                                                <td class="kc">${item.ten}</td>
                                                <td class="kc">${item.mota}</td>
                                                <td>
                                                    <div class="kc">
                                                        <a href="chinhsuathuonghieu/${item.id}" class=" btn btn-info btn-sm tooltips" data-placement="top" data-toggle="tooltip" data-original-title="Chỉnh sửa">
                                                            <i class="fa fa-pencil"></i></a>
                                                        <a href="" class=" btn btn-default btn-sm tooltips" data-placement="top" data-toggle="tooltip" data-original-title="Xem chi tiết">
                                                            <i class="fa fa-info"></i></a>
                                                    </div>
                                                </td>
                                            </tr>
                                        </tbody>
                                        </c:forEach>
                                    </table>
                                </div>

                            </section>
                        </div>
                    </div>
                    <!-- page end-->
                </section>
            </section>
        </body>
    </html>
