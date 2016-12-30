<%-- 
    Document   : dsnhacungcapad
    Created on : Dec 27, 2016, 7:28:38 PM
    Author     : Administrator
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
                            <li><i class="fa fa-home"></i><a href="index.htm">Trang chủ</a></li>
                            <li><i class="fa fa-list-alt"></i>Quản lý danh mục</li>
                            <li>Nhà cung cấp</li>
                        </ol>
                    </div>
                </div>
                <!-- page start-->               
                <div class="row">
                    <div class="col-lg-12">
                        <section class="panel">
                            <header class="panel-heading">
                                <h2><strong>Danh sách nhà cung cấp</strong></h2>
                                <div class="button-ds">
                                    <a class="btn btn-primary btn-sm" href="nhacungcap.html">Thêm mới</a>
                                </div>
                            </header>
                            <div class="table-responsive ">
                                <table class="table table-bordered">
                                    <thead style="font-size:18px;">
                                        <tr>
                                            <th class="kc">STT</th>
                                            <th class="kc">Mã nhà cung cấp</th>
                                            <th class="kc">Tên nhà cung cấp</th>
                                            <th class="kc">Điện thoại</th>
                                            <th class="kc">Địa chỉ</th>
                                            <th class="kc">Thành phố</th>
                                            <th class="kc">Quốc gia</th>
                                            <th class="kc" style="min-width:50px;">Hành động</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <c:forEach var="item" items="${lstnhacungcap}">
                                        <tr>
                                            <td class="kc">${item.id}</td>
                                            <td class="kc">${item.ma}</td>
                                            <td class="kc">${item.ten}</td>
                                            <td class="kc">${item.dienthoai}</td>
                                            <td class="kc">${item.diachi}</td>
                                            <td class="kc">${item.thanhpho}</td>
                                            <td class="kc">${item.quocgia}</td>
                                            <td>
                                                <div class="kc">
                                                    <a href="chinhsuanhacungcap/${item.id}" class=" btn btn-info btn-sm tooltips" data-placement="top" data-toggle="tooltip" data-original-title="Chỉnh sửa">
                                                        <i class="fa fa-pencil"></i></a>
                                                    <a href="xoanhacungcap.htm?id=${item.id}" onclick="return confirm('Bạn chắc chắn muốn xóa?')" class=" btn btn-danger btn-sm tooltips" data-placement="top" data-toggle="tooltip" data-original-title="Xóa">
                                                            <i class="fa fa-trash-o"></i></a>
                                                </div>
                                            </td>
                                        </tr>
                                        </c:forEach>
                                    </tbody>
                                </table>
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
