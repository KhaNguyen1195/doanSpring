
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
                            <li><i class="fa fa-home"></i><a href="admin.htm">Trang chủ</a></li>
                            <li><i class="fa fa-list-alt"></i>Quản lý danh mục</li>
                            <li>Sản phẩm</li>
                        </ol>
                    </div>
                </div>
                <!-- page start-->               
                <div class="row">
                    <div class="col-lg-12">
                        <section class="panel">
                            <header class="panel-heading">
                                <h2><strong>Danh sách sản phẩm</strong></h2>
                                <div class="button-ds">
                                    <a class="btn btn-primary btn-sm" href="sanpham.htm">Thêm mới</a>
                                </div>
                            </header>
                            <div class="table-responsive ">
                                <table class="table table-bordered">
                                    <thead style="font-size:18px;">
                                        <tr>
                                            <th class="kc">#</th>
                                            <th class="kc">Mã sản phẩm</th>
                                            <th class="kc">Tên sản phẩm</th>
                                            <th class="kc">Trang sức</th>
                                            <th class="kc">Thương hiệu</th>
                                            <th class="kc">Chủng loại</th>
                                            <th class="kc"  style="max-width: 50px;">Hình ảnh</th>
                                            <th class="kc" style="min-width:50px;">Hành động</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <c:forEach var="item" items="${lstsanpham}" varStatus="status">
                                        <tr>
                                            <td class="kc">${status.index + 1}</td>
                                            <td class="kc">${item.ma}</td>
                                            <td class="kc">${item.ten}</td>
                                            <td class="kc">${item.trangsuc.ten}</td>
                                            <td class="kc">${item.thuonghieu.ten}</td>
                                            <td class="kc">${item.chungloai.ten}</td>
                                            <td>
                                                <img src="<c:url value="/libs/img/${item.img}" />" 
                                                     alt="" max-width="100" height="100" 
                                                     style="border: 1px solid #eeeeee;"/>
                                            </td>
                                            <td>
                                                <div class="kc">
                                                    <a href="" class=" btn btn-default btn-sm tooltips" data-placement="top" data-toggle="tooltip" data-original-title="Xem chi tiết">
                                                        <i class="fa fa-info"></i></a>
                                                    <a href="chinhsuasanpham/${item.id}" class=" btn btn-info btn-sm tooltips" data-placement="top" data-toggle="tooltip" data-original-title="Chỉnh sửa">
                                                        <i class="fa fa-pencil"></i></a>
                                                        <a href="xoasanpham.htm?id=${item.id}" onclick="return confirm('Bạn chắc chắn muốn xóa?')" class=" btn btn-danger btn-sm tooltips" data-placement="top" data-toggle="tooltip" data-original-title="Xóa">
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
    </body>
</html>
