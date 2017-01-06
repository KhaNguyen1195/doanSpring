<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <jsp:include page="MenuTC.jsp" />
        <style type="text/css">
            .table,tbody,tr,td, .table,tfoot,tr,td {  
                vertical-align: middle;
            }

            @media screen and (max-width: 600px) { 
                table#cart tbody td .form-control { 
                    width:20%; 
                    display: inline !important;
                } 

                .actions .btn { 
                    width:36%; 
                    margin:1.5em 0;
                } 

                .actions .btn-danger { 
                    float:center;
                } 

                table#cart thead {
                    display: none;
                } 

                table#cart tbody td {
                    display: block;
                    padding: .6rem;
                    min-width:200px;
                } 

                table#cart tbody tr td:first-child {
                    background: #333;
                    color: #fff;
                } 

                table#cart tbody td:before { 
                    content: attr(data-th);
                    font-weight: bold; 
                    display: inline-block;
                    width: 8rem;
                } 

                table#cart tfoot td {
                    display:block;
                } 
                table#cart tfoot td .btn {
                    display:block;
                }
            }</style>
    </head>
    <body id="page-top" class="index">

        <!-- Gio hang -->  
        <div id="home-blog">
            <div class="container table-reponsive"> 
                <div class="masp"><h2 style="text-transform: none; text-align: center;">Giỏ hàng của bạn</h2></div>
                 <table id="cart" class="table table-hover table-condensed" style="vertical-align: middle;"> 
                      <thead>  
                           <tr> 
                                <th style="width:50%">Tên sản phẩm</th> 
                                <th style="width:10%">Giá</th> 
                                <th style="width:8%">Số lượng</th> 
                                <th style="width:22%" class="text-center">Thành tiền</th> 
                                <th style="width:10%"> </th> 
                               </tr> 
                          </thead> 
                      <tbody style="vertical-align: middle;">
                        <tr style="vertical-align: middle;">
                            <td data-th="Giỏ hàng" style="vertical-align: middle;">
                                <div class="row">
                                    <div class="col-sm-2 hidden-xs">
                                        <img src="${pageContext.request.contextPath}/libs/img/nhan-nu-kim-cuong-vang-trang-14k1_1_1.jpg" 
                                             alt="Sản phẩm 1" width="100" class="img-responsive" style="border: 1px solid #dcedf8;">
                                    </div>
                                    <div class="col-sm-10">
                                        <h4 class="nomargin">Sản phẩm 1</h4>
                                        <p style="font-size: 15px;">Mô tả của sản phẩm 1</p>
                                    </div>
                                </div>
                            </td>
                            <td data-th="Giá">200.000 đ</td>
                            <td data-th="Số lượng"><input type="number" class="form-control text-center" value="1"></td>
                            <td data-th="Thành tiền" class="text-center">200.000 đ</td>
                            <td class="actions" data-th="">
                                <button class="btn btn-danger btn-sm"><i class="fa fa-trash-o"></i></button></td>
                        </tr> 
                          <tr>
                            <td data-th="Giỏ hàng">
                                <div class="row">
                                    <div class="col-sm-2 hidden-xs">
                                        <img src="${pageContext.request.contextPath}/libs/img/nhan-nu-kim-cuong-vang-trang-14k1_1_1.jpg" 
                                             alt="Sản phẩm 1" width="100" class="img-responsive" style="border: 1px solid #dcedf8;">
                                    </div>
                                    <div class="col-sm-10">
                                        <h4 class="nomargin">Sản phẩm 2</h4>
                                        <p style="font-size: 15px;">Mô tả của sản phẩm 2</p>
                                    </div>
                                </div>
                            </td>
                            <td data-th="Giá">300.000 đ</td>
                            <td data-th="Số lượng"><input type="number" class="form-control text-center" value="1"></td>
                            <td data-th="Thành tiền" class="text-center">300.000 đ</td>
                            <td class="actions" data-th="">
                                <button class="btn btn-danger btn-sm"><i class="fa fa-trash-o"></i></button></td>
                        </tr> 
                          </tbody><tfoot> 
                           <tr class="visible-xs"> 
                                <td class="text-center"><strong>Tổng 200.000 đ</strong>
                                    </td> 
                               </tr> 
                           <tr> 
                                <td><a href="sanphamloaitrangsuc.htm" class="btn btn-warning"><i class="fa fa-angle-left"></i> Tiếp tục mua hàng</a>
                                    </td> 
                                <td colspan="2" class="hidden-xs"> </td> 
                                <td class="hidden-xs text-center"><strong>Tổng tiền:<span> 500.000 đ</span></strong>
                                    </td> 
                                <td><a href="#" class="btn btn-success btn-block">Thanh toán <i class="fa fa-angle-right"></i></a>
                                    </td> 
                               </tr> 
                          </tfoot> 
                     </table>
            </div>
        </div>

        <jsp:include page="FooterMenu.jsp" />

        <script type="text/javascript">$('.demo').loupe();</script>
    </body>
</html>
