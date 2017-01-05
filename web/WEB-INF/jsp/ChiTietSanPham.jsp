<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <jsp:include page="MenuTC.jsp" />
        <style type="text/css" media="screen">
            .loupe { background-color:#555; background:rgba(0, 0, 0, 0.25); border:5px solid rgba(0, 0, 0, 0); 
                     cursor:url(../img/blank.png), url(blank.cur), none;}
            </style>
        </head>
        <body id="page-top" class="index">

        <!-- Loại trang sức -->
        <div id="home-blog">
            <div class="container content">
                <div class="col-md-12">
                    <div class="col-md-4 col-sm-2 chitietimg">
                        <img class="demo" src="${pageContext.request.contextPath}/libs/img/nhan-nu-kim-cuong-vang-trang-14k1_1_1.jpg" 
                             style="width: 100%; height: 326px; top: 0px; left: 0px;border: 1px solid #e5e5e5;"/>
                    </div>
                    <div class="col-md-8">
                        <div class="col-md-12 content-info">
                            <div class="tensp"><h2>Bông tai Kim Cương Vàng trắng 14k</h2></div>
                            <div class="masp"><span style="font-weight:bold">Mã sản phẩm:</span><span style="color:blue"> GCTRWA81088.500</span></div>				
                            <div class="giasp"><span style="color:red">23,618,000 VND</span></div>
                            <div class="status"><span style="font-weight:bold;">Tình trạng:</span><span style="color:red"> Còn hàng</span></div>
                            <div class="mua"><a href="#" class="btn btn-primary btn-md">MUA NGAY</a></div>
                            <div class="chitiet">Gọi đặt mua ngay TP.Đà Nẵng: 0905153806 hoặc 0905160719</div>
                            <div class="chitiet">- Bảo hành sản phẩm. <a href="">Tìm hiểu</a></div>
                            <div class="chitiet">- Giao hàng tận nơi. <a href="">Tìm hiểu</a></div>
                            <div class="chitiet">- Thanh toán an toàn tiện lợi. <a href="">Tìm hiểu</a></div>
                        </div>
                    </div>
                </div>	
                <div class="col-md-12 image">
                    <img src="${pageContext.request.contextPath}/libs/img/banner4.jpg" width="100%"/>
                </div>
                <div class="col-md-12 main">
                    <div class="col-md-7 main-info">
                        <h3 class="product-info">Tổng quan:</h3>
                        <span>
                            Bông tai, chất liệu vàng trắng 14K. Gắn 2 viên Kim cương 3.8 ly, độ tinh khiết SI1, màu nước G + 18 viên Kim cương 1.5 ly A.</br>
                            Giá bán sản phẩm mang tính chất tham khảo.</br> 
                            Giá bán sẽ thay đổi tương ứng khi trọng lượng vàng và Kim Cương thay đổi.</br> 
                            Khi Đơn Hàng thành công, PNJ sẽ xác nhận và báo giá chính xác tương ứng trọng lượng vàng thực tế của sản phẩm hiện có.</br>
                            PNJ Shopping Online sẽ lấy sản phẩm với giá bán thực tế tại cửa hàng tương ứng trọng lượng vàng cụ thể báo lại cho khách hàng và hưởng chính sách ưu đãi trên online.
                        </span>
                    </div>
                    <div class="col-md-5">
                        <h3 class="product-info">Thông tin sản phẩm</h3>
                        <span class="name">Bông tai Kim Cương Vàng trắng 14k</span>
                        <table class="table table-striped table-hover table-info">
                            <tr>
                                <td class="heading">Mã sản phẩm</td>
                                <td>GBD1WA71050.517</td>				 
                            </tr>
                            <tr>
                                <td class="heading">Chủng loại</td>
                                <td>Bông tai</td>				 
                            </tr>
                            <tr>
                                <td class="heading">Tuổi vàng</td>
                                <td>14K (585)</td>				 
                            </tr>
                            <tr>
                                <td class="heading">Màu đá chính</td>
                                <td>Trắng</td>				 
                            </tr>
                        </table>
                    </div>
                </div>
            </div>
        </div>
      
        <jsp:include page="FooterMenu.jsp" />

        <script type="text/javascript">$('.demo').loupe();</script>
    </body>
</html>
