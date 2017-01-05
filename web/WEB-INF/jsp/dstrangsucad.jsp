
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
                            <li>Trang sức</li>
                        </ol>
                    </div>
                </div>
                <!-- page start-->               
                <div class="row">
                    <div class="col-lg-12">
                        <section class="panel">
                            <header class="panel-heading">
                                <h2><strong>Danh sách trang sức</strong></h2>
                                <div class="button-ds">
                                    <a class="btn btn-primary btn-sm" href="trangsuc.htm">Thêm mới</a>
                                </div>
                            </header>
                            <div class="form">
                                <form class="form-group form-validate" id="register-form" method="get" action="">
                                    <div class="form-group col-lg-6">
                                        <label for="ma" class="control-label col-lg-4">Mã trang sức</label>
                                        <div class="col-lg-8">
                                            <input class=" form-control" id="ma" name="ma" type="text" placeholder="Mã trang sức"/>
                                        </div>
                                    </div>
                                    <div class="form-group col-lg-6">
                                        <label for="ten" class="control-label col-lg-4">Tên trang sức</label>
                                        <div class="col-lg-8">
                                            <input class=" form-control" id="ten" name="ten" type="text" placeholder="Tên trang sức"/>
                                        </div>
                                    </div>
                                    <div class="form-group col-lg-6">
                                            <label class="control-label col-lg-4">Loại trang sức</label>
                                            <div class="col-lg-8">                               
                                                <select class="form-control" id="loaitrangsuc" name="loaitrangsuc">
                                                  <option value="">--- Chọn loại trang sức ---</option>
                                                  <option value="1">Trang sức đá quý</option>
                                                  <option value="2">Trang sức ngọc trai</option>
                                                  <option value="3">Media</option>
                                                  <option value="4">Funny</option>
                                                </select>  
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
                                            <th class="kc">STT</th>
                                            <th class="kc">Mã trang sức</th>
                                            <th class="kc">Tên trang sức</th>
                                            <th class="kc">Loại trang sức</th>
                                            <th class="kc">Mô tả</th>
                                            <th class="kc" style="min-width:50px;">Hành động</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <c:forEach var="item" items="${lsttrangsuc}" varStatus="status">  
                                        <tr>
                                            <td class="kc">${status.index + 1}</td>
                                            <td class="kc">${item.ma}</td>
                                            <td class="kc">${item.ten}</td>
                                            <td class="kc">${item.loaitrangsuc.ten}</td>
                                            <td class="kc">${item.mota}</td>
                                            <td>
                                                <div class="kc">
                                                    <a href="chinhsuatrangsuc/${item.id}" class=" btn btn-info btn-sm tooltips" data-placement="top" data-toggle="tooltip" data-original-title="Chỉnh sửa">
                                                        <i class="fa fa-pencil"></i></a>
                                                    <a href="xoatrangsuc.htm?id=${item.id}" onclick="return confirm('Bạn chắc chắn muốn xóa?')" class=" btn btn-danger btn-sm tooltips" data-placement="top" data-toggle="tooltip" data-original-title="Xóa">
                                                        <i class="fa fa-trash-o"></i></a>
                                                    
                                                </div>
                                            </td>
                                        </tr>
                                        </c:forEach>
                                    </tbody>
                                </table>
                            </div>
                            <br>
                        </section>
                    </div>
                </div>
                <!-- page end-->
            </section>
        </section>
    </body>
</html>
