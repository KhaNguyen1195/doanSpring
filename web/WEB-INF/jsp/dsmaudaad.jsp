<%-- 
    Document   : dsmaudaad
    Created on : Dec 27, 2016, 7:21:34 PM
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
                            <li>Màu đá</li>
                        </ol>
                    </div>
                </div>
                <!-- page start-->               
                <div class="row">
                    <div class="col-lg-12">
                        <section class="panel">
                            <header class="panel-heading">
                                <h2><strong>Danh sách màu đá</strong></h2>
                                <div class="button-ds">
                                    <a class="btn btn-primary btn-sm" href="mauda.htm">Thêm mới</a>
                                </div>
                            </header>
                            <div class="table-responsive ">
                                <table class="table table-bordered">
                                    <thead style="font-size:18px;">
                                        <tr>
                                            <th class="kc">#</th>
                                            <th class="kc">Mã màu đá</th>
                                            <th class="kc">Tên màu đá</th>
                                            <th class="kc">Mô tả</th>
                                            <th class="kc" style="min-width:50px;">Hành động</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <c:forEach var="item" items="${lstmauda}">
                                        <tr> 
                                            <td class="kc">${item.id}</td>
                                            <td class="kc">${item.ma}</td>
                                            <td class="kc">${item.ten}</td>
                                            <td class="kc">${item.mota}</td>
                                            <td>
                                                <div class="kc">
                                                    <a href="" class=" btn btn-info btn-sm tooltips" data-placement="top" data-toggle="tooltip" data-original-title="Chỉnh sửa">
                                                        <i class="fa fa-pencil"></i></a>
                                                    <a href="" class=" btn btn-danger btn-sm tooltips" data-placement="top" data-toggle="tooltip" data-original-title="Xóa">
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
</html>