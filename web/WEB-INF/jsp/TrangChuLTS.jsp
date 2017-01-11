<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <jsp:include page="MenuTC.jsp" />

    </head>
    <body id="page-top" class="index">

        <!-- Loại trang sức -->
        <div class="container content">
            <div class="row">
                <c:forEach var="item" items="${lsttrangsuc}" varStatus="status"> 
                <div class="col-md-12 product-title">
                    
                    <ul style="display: block;margin: 0;padding: 0;list-style: none;text-align: center;">
                        
                        <li style="display: inline-block;position: relative;">  
                            <a href="http://pnj.com.vn/san-pham/trang-suc-da-quy/ruby-da-quy/" title="Ruby Đá Quý">
                                Ruby Đá Quý<i></i></a><span class="line-doc">|</span>
                        </li>
                        <li style="display: inline-block;position: relative;">  
                            <a href="http://pnj.com.vn/san-pham/trang-suc-da-quy/sapphire-da-quy/" title="Sapphire đá quý">
                                Sapphire đá quý<i></i></a><span class="line-doc">|</span>
                        </li>
                        <li style="display: inline-block;position: relative;">  
                            <a href="http://pnj.com.vn/san-pham/trang-suc-da-quy/topaz-da-quy/" title="Topaz Đá Quý">
                                Topaz Đá Quý<i></i></a><span class="line-doc">|</span>
                        </li>
                        <li style="display: inline-block;position: relative;">  
                            <a href="http://pnj.com.vn/san-pham/trang-suc-da-quy/citrine-da-quy/" title="Citrine Đá Quý">
                                Citrine Đá Quý<i></i></a><span class="line-doc">|</span>
                        </li>
                        <li style="display: inline-block;position: relative;">  
                            <a href="http://pnj.com.vn/san-pham/trang-suc-da-quy/amethyst-da-quy/" title="Amethyst đá quý">
                                Amethyst đá quý<i></i></a>
                        </li>
                    </ul>
                </div>
                </c:forEach>
                <div class="col-md-3 col-sm-6 info">
                    <div  class="hovereffect">
                        <img src="${pageContext.request.contextPath}/libs/img/nhan-nu-ruby-vang-18k.jpg" style="width:250px;height:250px"/>
                        <div class="overlay">
                            <h3>Bông tai Kim Cương Vàng trắng 14k</h3>
                            <span>GCTRWA81088.500</span></br>
                            <span >23,618,000 VND</span></br>
                            <span class="state" style="color:red;">CÒN HÀNG</span></br>
                            <a href="chitietsanpham.htm"><input class="btn-chitiet" type="submit" name="submit" value="Xem chi tiết"/></a>
                        </div>
                    </div>
                </div>
                <div class="col-md-3 col-sm-6 info">
                    <div  class="hovereffect">
                        <img src="${pageContext.request.contextPath}/libs/img/nhan-nu-ruby-vang-18k.jpg" style="width:250px;height:250px"/>
                        <div class="overlay">
                            <h3>Bông tai Kim Cương Vàng trắng 14k</h3>
                            <span>GCTRWA81088.500</span></br>
                            <span >23,618,000 VNĐ</span></br>
                            <span class="state" style="color:red;">CÒN HÀNG</span></br>
                            <a href="chitietsanpham.htm"><input class="btn-chitiet" type="submit" name="submit" value="Xem chi tiết"/></a>
                        </div>
                    </div>
                </div>
                <div class="col-md-3 col-sm-6 info">
                    <div  class="hovereffect">
                        <img src="${pageContext.request.contextPath}/libs/img/nhan-nu-ruby-vang-18k.jpg" style="width:250px;height:250px"/>
                        <div class="overlay">
                            <h3>Bông tai Kim Cương Vàng trắng 14k</h3>
                            <span>GCTRWA81088.500</span></br>
                            <span >23,618,000 VND</span></br>
                            <span class="state" style="color:red;">CÒN HÀNG</span></br>
                            <a href="chitietsanpham.htm"><input class="btn-chitiet" type="submit" name="submit" value="Xem chi tiết"/></a>
                        </div>
                    </div>
                </div>
                <div class="col-md-3 col-sm-6 info">
                    <div  class="hovereffect">
                        <img src="${pageContext.request.contextPath}/libs/img/nhan-nu-ruby-vang-18k.jpg" style="width:250px;height:250px"/>
                        <div class="overlay">
                            <h3>Bông tai Kim Cương Vàng trắng 14k</h3>
                            <span>GCTRWA81088.500</span></br>
                            <span >23,618,000 VND</span></br>
                            <span class="state" style="color:red;">CÒN HÀNG</span></br>
                            <a href="chitietsanpham.htm"><input class="btn-chitiet" type="submit" name="submit" value="Xem chi tiết"/></a>
                        </div>
                    </div>
                </div>
                <div class="col-md-3 col-sm-6 info">
                    <div  class="hovereffect">
                        <img src="${pageContext.request.contextPath}/libs/img/nhan-nu-ruby-vang-18k.jpg" style="width:250px;height:250px"/>
                        <div class="overlay">
                            <h3>Bông tai Kim Cương Vàng trắng 14k</h3>
                            <span>GCTRWA81088.500</span></br>
                            <span >23,618,000 VND</span></br>
                            <span class="state" style="color:red;">CÒN HÀNG</span></br>
                            <a href="chitietsanpham.htm"><input class="btn-chitiet" type="submit" name="submit" value="Xem chi tiết"/></a>
                        </div>
                    </div>
                </div>
                <div class="col-md-3 col-sm-6 info">
                    <div  class="hovereffect">
                        <img src="${pageContext.request.contextPath}/libs/img/nhan-nu-ruby-vang-18k.jpg" style="width:250px;height:250px"/>
                        <div class="overlay">
                            <h3>Bông tai Kim Cương Vàng trắng 14k</h3>
                            <span>GCTRWA81088.500</span></br>
                            <span >23,618,000 VND</span></br>
                            <span class="state" style="color:red;">CÒN HÀNG</span></br>
                            <a href="chitietsanpham.htm"><input class="btn-chitiet" type="submit" name="submit" value="Xem chi tiết"/></a>
                        </div>
                    </div>
                </div>
                <div class="col-md-3 col-sm-6 info">
                    <div  class="hovereffect">
                        <img src="${pageContext.request.contextPath}/libs/img/nhan-nu-ruby-vang-18k.jpg" style="width:250px;height:250px"/>
                        <div class="overlay">
                            <h3>Bông tai Kim Cương Vàng trắng 14k</h3>
                            <span>GCTRWA81088.500</span></br>
                            <span >23,618,000 VND</span></br>
                            <span class="state" style="color:red;">CÒN HÀNG</span></br>
                            <a href="chitietsanpham.htm"><input class="btn-chitiet" type="submit" name="submit" value="Xem chi tiết"/></a>
                        </div>
                    </div>
                </div>
                <div class="col-md-3 col-sm-6 info">
                    <div  class="hovereffect">
                        <img src="${pageContext.request.contextPath}/libs/img/nhan-nu-ruby-vang-18k.jpg" style="width:250px;height:250px"/>
                        <div class="overlay">
                            <h3>Bông tai Kim Cương Vàng trắng 14k</h3>
                            <span>GCTRWA81088.500</span></br>
                            <span >23,618,000 VND</span></br>
                            <span class="state" style="color:red;">CÒN HÀNG</span></br>
                            <a href="chitietsanpham.htm"><input class="btn-chitiet" type="submit" name="submit" value="Xem chi tiết"/></a>
                        </div>
                    </div>
                </div>
                <div class="col-md-3 col-sm-6 info">
                    <div  class="hovereffect">
                        <img src="${pageContext.request.contextPath}/libs/img/nhan-nu-ruby-vang-18k.jpg" style="width:250px;height:250px"/>
                        <div class="overlay">
                            <h3>Bông tai Kim Cương Vàng trắng 14k</h3>
                            <span>GCTRWA81088.500</span></br>
                            <span >23,618,000 VND</span></br>
                            <span class="state" style="color:red;">CÒN HÀNG</span></br>
                            <a href="chitietsanpham.htm"><input class="btn-chitiet" type="submit" name="submit" value="Xem chi tiết"/></a>
                        </div>
                    </div>
                </div>
                <div class="col-md-3 col-sm-6 info">
                    <div  class="hovereffect">
                        <img src="${pageContext.request.contextPath}/libs/img/nhan-nu-ruby-vang-18k.jpg" style="width:250px;height:250px"/>
                        <div class="overlay">
                            <h3>Bông tai Kim Cương Vàng trắng 14k</h3>
                            <span>GCTRWA81088.500</span></br>
                            <span >23,618,000 VND</span></br>
                            <span class="state" style="color:red;">CÒN HÀNG</span></br>
                            <a href="chitietsanpham.htm"><input class="btn-chitiet" type="submit" name="submit" value="Xem chi tiết"/></a>
                        </div>
                    </div>
                </div>
                <div class="col-md-3 col-sm-6 info">
                    <div  class="hovereffect">
                        <img src="${pageContext.request.contextPath}/libs/img/nhan-nu-ruby-vang-18k.jpg" style="width:250px;height:250px"/>
                        <div class="overlay">
                            <h3>Bông tai Kim Cương Vàng trắng 14k</h3>
                            <span>GCTRWA81088.500</span></br>
                            <span >23,618,000 VND</span></br>
                            <span class="state" style="color:red;">CÒN HÀNG</span></br>
                            <a href="chitietsanpham.htm"><input class="btn-chitiet" type="submit" name="submit" value="Xem chi tiết"/></a>
                        </div>
                    </div>
                </div>
                <div class="col-md-3 col-sm-6 info">
                    <div class="hovereffect">
                        <img src="${pageContext.request.contextPath}/libs/img/nhan-nu-ruby-vang-18k.jpg" style="width:250px;height:250px"/>
                        <div class="overlay">
                            <h3>Bông tai Kim Cương Vàng trắng 14k</h3>
                            <span>GCTRWA81088.500</span></br>
                            <span >23,618,000 VND</span></br>
                            <span class="state" style="color:red;">CÒN HÀNG</span></br>
                            <a href="chitietsanpham.htm"><input class="btn-chitiet" type="submit" name="submit" value="Xem chi tiết"/></a>
                        </div>
                    </div>
                </div>


            </div>
        </div>


        <jsp:include page="ThuongHieuMenu.jsp" />
        <jsp:include page="FooterMenu.jsp" />


    </body>
</html>
