
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
                            <li><i class="fa fa-home"></i><a href="index.htm">Trang chủ</a></li>
                            <li><i class="fa fa-list-alt"></i>Quản lý danh mục</li>
                            <li>Loại trang sức</li>
                        </ol>
                    </div>
                </div>
                <!-- page start-->               
                <div class="row">
                    <div class="col-lg-12">
                        <section class="panel">
                            <header class="panel-heading">
                                <h2><strong>Danh sách loại trang sức</strong></h2>
                                <div class="button-ds">
                                    <a class="btn btn-primary btn-sm" href="loaitrangsuc.htm">Thêm mới</a>
                                </div>
                            </header>
                            <div class="form">
                                <form class="form-group form-validate" id="register-form" method="get" action="">
                                    <div class="form-group col-lg-6">
                                        <label for="ma" class="control-label col-lg-4">Mã loại trang sức</label>
                                        <div class="col-lg-8">
                                            <input class=" form-control" id="ma" name="ma" type="text" placeholder="Mã loại trang sức"/>
                                        </div>
                                    </div>
                                    <div class="form-group col-lg-6">
                                        <label for="ten" class="control-label col-lg-4">Tên loại trang sức</label>
                                        <div class="col-lg-8">
                                            <input class=" form-control" id="ten" name="ten" type="text" placeholder="Tên loại trang sức"/>
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
                                            <th class="kc">Mã loại trang sức</th>
                                            <th class="kc">Tên loại trang sức</th>
                                            <th class="kc">Mô tả</th>
                                            <th class="kc" style="min-width:50px;">Hành động</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <c:forEach var="item" items="${lstloaitrangsuc}">  
                                            <tr>
                                                <td class="kc">${item.id}</td>
                                                <td class="kc">${item.ma}</td>
                                                <td class="kc">${item.ten}</td>
                                                <td class="kc">${item.mota}</td>
                                                <td>
                                                    <div class="kc">

                                                        <a href="chinhsualoaitrangsuc/${item.id}" class=" btn btn-info btn-sm tooltips" data-placement="top" data-toggle="tooltip" data-original-title="Chỉnh sửa">
                                                            <i class="fa fa-pencil"></i></a>
                                                        <a href="" class=" btn btn-danger btn-sm tooltips" data-placement="top" data-toggle="tooltip" data-original-title="Xóa">
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
