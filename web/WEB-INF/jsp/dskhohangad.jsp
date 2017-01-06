<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html; charset=utf-8" pageEncoding="UTF-8" %>
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
                            <li><i class="fa fa-list-alt"></i>Quản lý danh mục</li>
                            <li>Kho hàng</li>
                        </ol>
                    </div>
                </div>
                <!-- page start-->               
                <div class="row">
                    <div class="col-lg-12">
                        <section class="panel">
                            <header class="panel-heading">
                                <h2><strong>Danh sách hàng trong kho</strong></h2>
                                <div class="button-ds">
                                    <a class="btn btn-primary btn-sm" href="khohang.htm">Nhập kho</a>
                                </div>
                            </header>
                            <div class="table-responsive ">
                                <table class="table table-bordered">
                                    <thead style="font-size:18px;">
                                        <tr>
                                            <th class="kc">STT</th>
                                            <th class="kc">Sản phẩm</th>
                                            <th class="kc">Giá</th>
                                            <th class="kc">Số lượng</th>                                            
                                            <th class="kc">Tổng giá</th>
                                            <th class="kc">Ngày nhập kho</th>
                                            <th class="kc" style="min-width:50px;">Hành động</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <c:forEach var="item" items="${lstkhohang}" varStatus="status"> 
                                            <tr>
                                                <td class="kc">${status.index + 1}</td>
                                                <td class="kc">${item.sanpham.ten}</td>
                                                <td class="kc">${item.gianhap1sp}</td>
                                                <td class="kc">${item.soluong}</td>
                                                <td class="kc">${item.tongtrigia}</td>
                                                <td class="kc">${item.ngaynhapkho}</td>
                                                <td>
                                                    <div class="kc">
                                                        <a href="chinhsuakhohang/${item.id}" class=" btn btn-info btn-sm tooltips" data-placement="top" data-toggle="tooltip" data-original-title="Chỉnh sửa">
                                                            <i class="fa fa-pencil"></i></a>
                                                        <a href="xoakhohang.htm?id=${item.id}" onclick="return confirm('Bạn chắc chắn muốn xóa?')" class=" btn btn-danger btn-sm tooltips" data-placement="top" data-toggle="tooltip" data-original-title="Xóa">
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
