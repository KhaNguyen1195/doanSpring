
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="Creative - Bootstrap 3 Responsive Admin Template">
        <meta name="author" content="GeeksLabs">
        <meta name="keyword" content="Creative, Dashboard, Admin, Template, Theme, Bootstrap, Responsive, Retina, Minimal">
        <link href="${pageContext.request.contextPath}/libs/img/Diamond-icon.png" rel="shortcut icon" >
        <title>Quản trị hệ thống</title>

        <!-- Bootstrap CSS -->
        <link type="text/css" href="${pageContext.request.contextPath}/libs/css/bootstrap-ad.min.css" rel="stylesheet" >
        <link href="" rel="stylesheet" type="text/css"/>
        <!-- bootstrap theme -->
        <link type="text/css" href="${pageContext.request.contextPath}/libs/css/bootstrap-theme-ad.css" rel="stylesheet" >
        <link href="<c:url value='' />" rel="stylesheet">
        <!--external css-->
        <!-- font icon -->
        <link type="text/css" href="${pageContext.request.contextPath}/libs/css/elegant-icons-style-ad.css" rel="stylesheet" >
        <link type="text/css" href="${pageContext.request.contextPath}/libs/css/font-awesome-ad.min.css" rel="stylesheet" >
        <link type="text/css" href="${pageContext.request.contextPath}/libs/css/line-icons.css" rel="stylesheet" >
        <!-- Custom styles -->
        <link type="text/css" href="${pageContext.request.contextPath}/libs/css/style-ad.css" rel="stylesheet" >
        <link type="text/css" href="${pageContext.request.contextPath}/libs/css/style-responsive-ad.css" rel="stylesheet" >
        <!-- javascripts -->
        <script type="text/javascript" src="${pageContext.request.contextPath}/libs/js/jquery-ad.js"></script>

        <!-- bootstrap -->
        <script type="text/javascript" src="${pageContext.request.contextPath}/libs/js/bootstrap-ad.min.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/libs/js/bootstrap-switch-ad.js"></script>
        <!-- nice scroll -->
        <script type="text/javascript" src="${pageContext.request.contextPath}/libs/js/jquery.nicescroll.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/libs/js/jquery.localscroll.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/libs/js/jquery.scrollTo.min.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/libs/js/jquery.slimscroll.min.js"></script>
        <!--custome script for all page-->
        <script type="text/javascript" src="${pageContext.request.contextPath}/libs/js/scripts.js"></script>
        <!-- custom script for this page-->
        <script type="text/javascript" src="${pageContext.request.contextPath}/libs/js/morris.min.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/libs/js/morris-script.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/libs/js/jquery.tagsinput.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/libs/js/form-validation-script.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/libs/js/form-component.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/libs/js/jquery.validate.min.js"></script>


    </head>
    <body>
        <header class="header dark-bg">
            <div class="toggle-nav">
                <div class="icon-reorder tooltips" data-original-title="Menu" data-placement="bottom"><i class="icon_menu"></i></div>
            </div>

            <!--logo start-->
            <a href="index1.html" class="logo">Quản trị <span class="lite">Hệ thống</span></a>
            <!--logo end-->

            <div class="top-nav notification-row">                
                <!-- notification dropdown start-->
                <ul class="nav pull-right top-menu">

                    <li class="dropdown">
                        <a data-toggle="dropdown" class="dropdown-toggle" href="#">
                            <span class="username">Jenifer Smith</span>
                            <b class="caret"></b>
                        </a>
                        <ul class="dropdown-menu extended logout">
                            <div class="log-arrow-up"></div>
                            <li class="eborder-top">
                                <a href="#"><i class="icon_profile"></i> My Profile</a>
                            </li>
                            <li>
                                <a href="login.html"><i class="icon_key_alt"></i> Log Out</a>
                            </li>
                        </ul>
                    </li>
                    <!-- user login dropdown end -->
                </ul>
                <!-- notificatoin dropdown end-->
            </div>
        </header>      
        <!--header end-->

        <!--sidebar start-->
        <aside>
            <div id="sidebar"  class="nav-collapse ">
                <!-- sidebar menu start-->
                <ul class="sidebar-menu">                
                    <li class="active">
                        <a class="" href="index.jsp">
                            <i class="icon_house_alt"></i>
                            <span>Trang chủ</span>
                        </a>
                    </li>
                    <li class="sub-menu">
                        <a href="javascript:;" class="">
                            <i class="fa fa-users"></i>
                            <span>Quản lý người dùng</span>
                            <span class="menu-arrow arrow_carrot-right"></span>
                        </a>
                        <ul class="sub">
                            <li><a class="" href="dsnhanvien.html">Quản lý nhân viên</a></li>                          
                            <li><a class="" href="dskhachhang.html">Quản lý khách hàng</a></li>
                        </ul>
                    </li>       
                    <li class="sub-menu">
                        <a href="javascript:;" class="">
                            <i class="fa fa-list-alt"></i>
                            <span>Quản lý danh mục</span>
                            <b class="menu-arrow arrow_carrot-right"></b>
                        </a>
                        <ul class="sub">
                            <li><a class="" href="danhsachloaitrangsuc.htm">Loại trang sức</a></li>
                            <li><a class="" href="danhsachtrangsuc.htm">Trang sức</a></li>
                            <li><a class="" href="danhsachsanpham.htm">Sản phẩm</a></li>
                            <li><a class="" href="danhsachthuonghieu.htm">Thương hiệu</a></li>
                            <li><a class="" href="dschatlieu.html">Chất liệu</a></li>
                            <li><a class="" href="dschungloai.html">Chủng loại</a></li>
                            <li><a class="" href="dsloaivang.html">Loại vàng</a></li>
                            <li><a class="" href="dsloaida.html">Loại đá</a></li>
                            <li><a class="" href="dsmauda.html">Màu đá</a></li>
                            <li><a class="" href="dsnhacungcap.html">Nhà cung cấp</a></li>
                        </ul>
                    </li>
                    <li class="sub-menu">
                        <a href="javascript:;" class="">
                            <i class="fa fa-cubes"></i>
                            <span>Quản lý kho hàng</span>
                            <span class="menu-arrow arrow_carrot-right"></span>
                        </a>
                        <ul class="sub">                          
                            <li><a class="" href="">Nhập kho</a></li>
                            <li><a class="" href=""><span>Xuất kho</span></a></li>
                        </ul>
                    </li>
                    <li>
                        <a class="" href="">
                            <i class="fa fa-shopping-cart"></i>
                            <span>Quản lý đơn hàng</span>
                        </a>
                    </li>
                    <li>                     
                        <a class="" href="">
                            <i class="icon_menu-square_alt2"></i>
                            <span>Quản lý hóa đơn</span>

                        </a>

                    </li>
                </ul>
                <!-- sidebar menu end-->
            </div>
        </aside>
    </body>
</html>
