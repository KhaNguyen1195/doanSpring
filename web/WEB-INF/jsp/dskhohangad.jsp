<%-- 
    Document   : dskhohangad
    Created on : Dec 28, 2016, 3:33:15 PM
    Author     : Administrator
--%>
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
                                    <a class="btn btn-primary btn-sm" href="khohang.htm">Thêm mới</a>
                                </div>
                            </header>
                            <div class="table-responsive ">
                                <table class="table table-bordered">
                                    <thead style="font-size:18px;">
                                        <tr>
                                            <th class="kc">STT</th>
                                            <th class="kc">Giá</th>
                                            <th class="kc">Số lượng</th>                                            
                                            <th class="kc">Tổng giá</th>
                                            <th class="kc">Ngày nhập kho</th>
                                            <th class="kc" style="min-width:50px;">Hành động</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <tr>
                                            <td class="kc">${item.id}</td>
                                            <td class="kc">${item.gianhap1sp}</td>
                                            <td class="kc">${item.soluong}</td>
                                            <td class="kc">${item.tongtrigia}</td>
                                            <td class="kc">${item.ngaynhapkho}</td>
                                            <td>
                                                <div class="kc">
                                                    <a href="" class=" btn btn-info btn-sm tooltips" data-placement="top" data-toggle="tooltip" data-original-title="Chỉnh sửa">
                                                        <i class="fa fa-pencil"></i></a>
                                                    <a href="" onclick="return confirm('Bạn chắc chắn muốn xóa?')" class=" btn btn-danger btn-sm tooltips" data-placement="top" data-toggle="tooltip" data-original-title="Xóa">
                                                        <i class="fa fa-info"></i></a>
                                                </div>
                                            </td>
                                        </tr>
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
