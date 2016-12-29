<%-- 
    Document   : dsnhanvienad
    Created on : Dec 27, 2016, 6:01:44 PM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
                            <li><i class="fa fa-users"></i>Quản lý người dùng</li>
                            <li>Quản lý nhân viên</li>
                        </ol>
                    </div>
                </div>
                <!-- page start-->               
                <div class="row">
                    <div class="col-lg-12">
                        <section class="panel">
                            <header class="panel-heading">
                                <h2><strong>Danh sách nhân viên</strong></h2>
                                <div class="button-ds">
                                    <a class="btn btn-primary btn-sm" href="nhanvien.htm">Thêm mới</a>
                                </div>
                            </header>
                            <div class="table-responsive ">
                                <table class="table table-bordered">
                                    <thead style="font-size:18px;">
                                        <tr>

                                            <th class="kc">STT</th>
                                            <th class="kc">Mã nhân viên</th>
                                            <th class="kc">Tên nhân viên</th>
                                            <th class="kc">Ngày sinh</th>
                                            <th class="kc">Giới tính</th>
                                            <th class="kc">Địa chỉ</th>
                                            <th class="kc">Số điện thoại</th>
                                            <th class="kc" style="min-width:50px;">Hành động</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                    <c:forEach var="item" items="${lstnhanvien}">
                                        <tr>
                                            <td class="kc">${status.index + 1}</td>
                                            <td class="kc">${item.ma}</td>
                                            <td class="kc">${item.ten}</td>
                                            <td class="kc">${item.ngaysinh}</td>
                                            <td class="kc">${item.gioitinh}</td>
                                            <td class="kc">${item.diachi}</td>
                                            <td class="kc">${item.sodienthoai}</td>

                                            <td>
                                                <div class="kc">
                                                    <a href="chinhsuanhanvien/${item.id}" class=" btn btn-info btn-sm tooltips" data-placement="top" data-toggle="tooltip" data-original-title="Chỉnh sửa">
                                                            <i class="fa fa-pencil"></i></a>
                                                        <a href="xoanhanvien.htm?id=${item.id}" class=" btn btn-danger btn-sm tooltips" data-placement="top" data-toggle="tooltip" data-original-title="Xóa">
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