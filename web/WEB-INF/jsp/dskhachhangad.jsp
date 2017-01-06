<%-- 
    Document   : dskhachhangad
    Created on : Dec 27, 2016, 11:48:56 AM
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
                            <li><i class="fa fa-home"></i><a href="admin.htm">Trang chủ</a></li>
                            <li><i class="fa fa-users"></i>Quản lý người dùng</li>
                            <li>Quản lý khách hàng</li>
                        </ol>
                    </div>
                </div>
                <!-- page start-->               
                <div class="row">
                    <div class="col-lg-12">
                        <section class="panel">
                            <header class="panel-heading">
                                <h2><strong>Danh sách khách hàng</strong></h2>
                            </header>
                            <div class="table-responsive ">
                                <table class="table table-bordered">
                                    <thead style="font-size:18px;">
                                        <tr>

                                            <th class="kc">STT</th>
                                            <th class="kc">Mã khách hàng</th>
                                            <th class="kc">Tên khách hàng</th>
                                            <th class="kc">Email</th>
                                            <th class="kc">Ngày sinh</th>
                                            <th class="kc">Giới tính</th>
                                            <th class="kc">Địa chỉ</th>
                                            <th class="kc">Số điện thoại</th>
                                            <th class="kc" style="min-width:50px;">Hành động</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <c:forEach var="item" items="${lstkhachhang}" varStatus="status">
                                            <tr>
                                                <td class="kc">${status.index + 1}</td>
                                                <td class="kc">${item.ma}</td>
                                                <td class="kc">${item.ten}</td>
                                                <td class="kc">${item.email}</td>
                                                <td class="kc">${item.ngaysinh}</td>
                                                <td class="kc">
                                                    <c:choose>
                                                        <c:when test="${item.gioitinh=='Nu'}">Nữ </c:when>    
                                                        <c:otherwise>Nam </c:otherwise>
                                                    </c:choose>
                                                </td>
                                                <td class="kc">${item.diachi}</td>
                                                <td class="kc">${item.sodienthoai}</td>

                                                <td>
                                                    <div class="kc">
                                                        <a href="chinhsuakhachhang/${item.id}" class=" btn btn-info btn-sm tooltips" data-placement="top" data-toggle="tooltip" data-original-title="Chỉnh sửa">
                                                            <i class="fa fa-pencil"></i></a>
                                                        <a href="xoakhachhang.htm?id=${item.id}" onclick="return confirm('Bạn chắc chắn muốn xóa?')" class=" btn btn-danger btn-sm tooltips" data-placement="top" data-toggle="tooltip" data-original-title="Xóa">
                                                            <i class="fa fa-trash-o"></i></a>
                                                    </div>
                                                </td>
                                            </tr>
                                        </c:forEach>
                                    </tbody>
                                </table>
                                <br>
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
