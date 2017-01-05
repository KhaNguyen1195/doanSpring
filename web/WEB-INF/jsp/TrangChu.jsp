
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <jsp:include page="MenuTC.jsp" />
    </head>
    <body id="page-top" class="index">

        <!-- Loại trang sức -->
        <section id="loaitrangsuc">
            <div class="container">
                <div class="row">
                    <div class="col-lg-12 text-center">
                        <h2>Loại trang sức</h2>
                        <hr class="star-primary">
                    </div>
                </div>
                <div class="row">
                    <div class="col-sm-4 loaitrangsuc-item" >
                        <h3 style="text-align:center; font-size:20px;"><span>Trang sức đá quý</span></h3>
                        <a href="sanphamloaitrangsuc.htm" class="loaitrangsuc-link">
                            <div class="caption">
                                <div class="caption-content">
                                    <i class="fa fa-search-plus fa-3x"></i>
                                </div>
                            </div>
                            <img src="${pageContext.request.contextPath}/libs/img/trangsuckimcuong.jpg" class="img-responsive loaitrangsuc" alt="">
                        </a>
                    </div>
                    <div class="col-sm-4 loaitrangsuc-item">
                        <h3 style="text-align:center; font-size:20px;"><span>Trang sức đá quý</span></h3>
                        <a href="sanphamloaitrangsuc.htm" class="loaitrangsuc-link">
                            <div class="caption">
                                <div class="caption-content">
                                    <i class="fa fa-search-plus fa-3x"></i>
                                </div>
                            </div>
                            <img src="${pageContext.request.contextPath}/libs/img/trangsuckimcuong.jpg" class="img-responsive loaitrangsuc" alt="">
                        </a>
                    </div>
                    <div class="col-sm-4 loaitrangsuc-item">
                        <h3 style="text-align:center; font-size:20px;"><span>Trang sức đá quý</span></h3>
                        <a href="sanphamloaitrangsuc.htm" class="loaitrangsuc-link">
                            <div class="caption">
                                <div class="caption-content">
                                    <i class="fa fa-search-plus fa-3x"></i>
                                </div>
                            </div>
                            <img src="${pageContext.request.contextPath}/libs/img/trangsuckimcuong.jpg" class="img-responsive loaitrangsuc" alt="">
                        </a>
                    </div>
                    <div class="col-sm-4 loaitrangsuc-item">
                        <h3 style="text-align:center; font-size:20px;"><span>Trang sức đá quý</span></h3>
                        <a href="sanphamloaitrangsuc.htm" class="loaitrangsuc-link">
                            <div class="caption">
                                <div class="caption-content">
                                    <i class="fa fa-search-plus fa-3x"></i>
                                </div>
                            </div>
                            <img src="${pageContext.request.contextPath}/libs/img/trangsuckimcuong.jpg" class="img-responsive loaitrangsuc" alt="">
                        </a>
                    </div>
                    <div class="col-sm-4 loaitrangsuc-item">
                        <h3 style="text-align:center; font-size:20px;"><span>Trang sức đá quý</span></h3>
                        <a href="sanphamloaitrangsuc.htm" class="loaitrangsuc-link">
                            <div class="caption">
                                <div class="caption-content">
                                    <i class="fa fa-search-plus fa-3x"></i>
                                </div>
                            </div>
                            <img src="${pageContext.request.contextPath}/libs/img/trangsuckimcuong.jpg" class="img-responsive loaitrangsuc" alt="">
                        </a>
                    </div>
                    <div class="col-sm-4 loaitrangsuc-item">
                        <h3 style="text-align:center; font-size:20px;"><span>Trang sức đá quý</span></h3>
                        <a href="sanphamloaitrangsuc.htm" class="loaitrangsuc-link">
                            <div class="caption">
                                <div class="caption-content">
                                    <i class="fa fa-search-plus fa-3x"></i>
                                </div>
                            </div>
                            <img src="${pageContext.request.contextPath}/libs/img/trangsuckimcuong.jpg" class="img-responsive loaitrangsuc" alt="">
                        </a>
                    </div>
                </div>
            </div>
        </section>

        <jsp:include page="ThuongHieuMenu.jsp" />
        <jsp:include page="FooterMenu.jsp" />

        <!-- Đăng ký -->
        <div class="portfolio-modal modal fade" id="dangky" tabindex="-1" role="dialog" aria-hidden="true">
            <div class="modal-content">
                <div class="close-modal" data-dismiss="modal">
                    <div class="lr">
                        <div class="rl">
                        </div>
                    </div>
                </div>
                <div class="container">
                    <div class="row">
                        <div class="col-lg-8 col-lg-offset-2">
                            <div class="modal-body">
                                <h2>ĐĂNG KÝ</h2>
                                <hr class="star-primary">
                                <div class="form">
                                    <form class="form-group form-validate form-horizontal" id="register-form" method="get" action="">
                                        <div class="form-group">
                                            <label for="ten" class="control-label col-lg-3">Họ và tên <span class="required">*</span></label>
                                            <div class="col-lg-9">
                                                <input class=" form-control" id="ten" name="ten" type="text" placeholder="Họ tên"/>
                                            </div>
                                        </div>

                                        <div class="form-group">
                                            <label for="ngaysinh" class="control-label col-lg-3">Ngày sinh <span class="required">*</span></label>
                                            <div class="col-lg-9">
                                                <input class=" form-control" id="ngaysinh" name="ngaysinh" type="date" />
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label class="control-label col-lg-3">Giới tính <span class="required">*</span></label>
                                            <div class="col-lg-9">                               
                                                <select class="form-control" id="gioitinh" name="gioitinh">
                                                    <option value="">--- Chọn giới tính ---</option>
                                                    <option value="1">Nam</option>
                                                    <option value="2">Nữ</option>
                                                </select>  
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label for="diachi" class="control-label col-lg-3">Địa chỉ <span class="required">*</span></label>
                                            <div class="col-lg-9">
                                                <textarea class="form-control" id="diachi" name="diachi" placeholder="Địa chỉ"></textarea>
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label for="sodienthoai" class="control-label col-lg-3">Số điện thoại <span class="required">*</span></label>
                                            <div class="col-lg-9">
                                                <input class=" form-control" id="sodienthoai" name="sodienthoai" type="text" placeholder="Số điện thoại"/>
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label for="ten" class="control-label col-lg-3">Email <span class="required">*</span></label>
                                            <div class="col-lg-9">
                                                <input class=" form-control" id="ten" name="ten" type="text" placeholder="Họ tên"/>
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label for="tendangnhap" class="control-label col-lg-3">Tên đăng nhập <span class="required">*</span></label>
                                            <div class="col-lg-9">
                                                <input class="form-control " id="tendangnhap" name="tendangnhap" type="text" placeholder="Tên đăng nhập"/>
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label for="matkhau" class="control-label col-lg-3">Mật khẩu <span class="required">*</span></label>
                                            <div class="col-lg-9">
                                                <input class="form-control " id="matkhau" name="matkhau" type="password" placeholder="Mật khẩu"/>
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label for="confirm_password" class="control-label col-lg-3">Nhập lại mật khẩu <span class="required">*</span></label>
                                            <div class="col-lg-9">
                                                <input class="form-control " id="confirm_password" name="confirm_password" type="password" placeholder="Nhập lại mật khẩu"/>
                                            </div>
                                        </div>

                                        <div class="form-group">
                                            <div class="col-lg-offset-2 col-lg-10">
                                                <button class="btn btn-success" type="submit">Đăng ký</button>
                                                <button type="button" class="btn btn-danger" data-dismiss="modal"><i class="fa fa-times"></i> Đóng
                                                </button>
                                            </div>
                                        </div>
                                    </form>
                                </div>
                            </div>

                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- Đăng ký end -->


</body>
</html>
