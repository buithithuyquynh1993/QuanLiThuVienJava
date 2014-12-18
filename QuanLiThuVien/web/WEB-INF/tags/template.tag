<%-- 
    Document   : template
    Created on : Dec 9, 2014, 10:59:10 AM
    Author     : USER
--%>

<%@tag description="put the tag description here" pageEncoding="UTF-8"%>

<%-- The list of normal or fragment attributes can be specified here: --%>
<%@attribute name="message"%>
<%@attribute name="link_css" fragment="flase" %>
<%@attribute name="content" fragment="true" %>

<html>
<head>
    <meta charset="utf-8">
    <title>Services Page - Travel by templatemo</title>
    <meta name="description" content="">
    <meta name="viewport" content="width=device-width">
    <meta name="author" content="templatemo">
    <link href='http://fonts.googleapis.com/css?family=Open+Sans:400,800,700,600,300' rel='stylesheet' type='text/css'>

    <link rel="stylesheet" href="${pageContext.request.contextPath}/templates/css/bootstrap.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/templates/css/font-awesome.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/templates/css/animate.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/templates/css/templatemo_misc.css"">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/templates/css/templatemo_style.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/templates/css/reader_style.css">

    <script src="${pageContext.request.contextPath}/templates/js/vendor/modernizr-2.6.1-respond-1.1.0.min.js"></script>
    <script src="${pageContext.request.contextPath}/templates/js/vendor/jquery-1.11.0.min.js"></script>
    <script src="http://ajax.googleapis.com/ajax/libs/jqueryui/1.9.1/jquery-ui.min.js"></script>

</head>
<body>
  <div class="site-header">
        <div class="container">
            <div class="main-header">
                <div class="row">
                    <div class="col-md-4 col-sm-6 col-xs-10">
                        <div class="logo">
                            <a rel="nofollow" href="http://www.templatemo.com/preview/templatemo_409_travel">
                                <img src="${pageContext.request.contextPath}/templates/images/logo.png" alt="travel html5 website template - templatemo" title="travel - free html5 template">
                            </a>
                        </div> <!-- /.logo -->
                    </div> <!-- /.col-md-4 -->
                    <div class="col-md-8 col-sm-6 col-xs-2">
                        <div class="main-menu">
                            <ul class="visible-lg visible-md">
                                <li><a href="index.html">Trang Chủ</a></li>
                                <li class="active"><a href="services.html">Tìm Kiếm Sách</a></li>
                                <li><a href="events.html">Đăng Ký Tập Huấn</a></li>
                                <li><a href="about.html">Liên hệ</a></li>
                                <li><a href="contact.html">Đăng nhập</a></li>
                            </ul>
                            <a href="#" class="toggle-menu visible-sm visible-xs">
                                <i class="fa fa-bars"></i>
                            </a>
                        </div> <!-- /.main-menu -->
                    </div> <!-- /.col-md-8 -->
                </div> <!-- /.row -->
            </div> <!-- /.main-header -->
            <div class="row">
                <div class="col-md-12 visible-sm visible-xs">
                    <div class="menu-responsive">
                        <ul>
                            <li><a href="index.html">Home</a></li>
                            <li class="active"><a href="services.html">Services</a></li>
                            <li><a href="events.html">Events</a></li>
                            <li><a href="about.html">About Us</a></li>
                            <li><a href="contact.html">Contact</a></li>
                        </ul>
                    </div> <!-- /.menu-responsive -->
                </div> <!-- /.col-md-12 -->
            </div> <!-- /.row -->
        </div> <!-- /.container -->
    </div> <!-- /.site-header -->

    <div class="page-top" id="templatemo_services">
    </div> <!-- /.page-header -->

    <div class="middle-content">
        <div class="container">
            <div class="row">
                <jsp:invoke fragment="content"/>
            </div>
        </div>
    </div> <!-- /.middle-content -->

    <div class="partner-list">
        <div class="container">
            <div class="row">
                <div class="col-md-2 col-sm-4 col-xs-6">
                    <div class="partner-item">
                        <img src="${pageContext.request.contextPath}/templates/images/partners/partner1.png" alt="">
                    </div> <!-- /.partner-item -->
                </div> <!-- /.col-md-2 -->
                <div class="col-md-2 col-sm-4 col-xs-6">
                    <div class="partner-item">
                        <img src="${pageContext.request.contextPath}/templates/images/partners/partner2.png" alt="">
                    </div> <!-- /.partner-item -->
                </div> <!-- /.col-md-2 -->
                <div class="col-md-2 col-sm-4 col-xs-6">
                    <div class="partner-item">
                        <img src="${pageContext.request.contextPath}/templates/images/partners/partner3.png" alt="">
                    </div> <!-- /.partner-item -->
                </div> <!-- /.col-md-2 -->
                <div class="col-md-2 col-sm-4 col-xs-6">
                    <div class="partner-item">
                        <img src="${pageContext.request.contextPath}/templates/images/partners/partner1.png" alt="">
                    </div> <!-- /.partner-item -->
                </div> <!-- /.col-md-2 -->
                <div class="col-md-2 col-sm-4 col-xs-6">
                    <div class="partner-item">
                        <img src="${pageContext.request.contextPath}/templates/images/partners/partner2.png" alt="">
                    </div> <!-- /.partner-item -->
                </div> <!-- /.col-md-2 -->
                <div class="col-md-2 col-sm-4 col-xs-6">
                    <div class="partner-item last">
                        <img src= "${pageContext.request.contextPath}/templates/images/partners/partner3.png" alt="">
                    </div> <!-- /.partner-item -->
                </div> <!-- /.col-md-2 -->
            </div> <!-- /.row -->
        </div> <!-- /.container -->
    </div> <!-- /.partner-list -->

    <div class="site-footer">
        <div class="container">
            <div class="row">
                <div class="col-md-4 col-sm-4">
                    <div class="footer-logo">
                        <a href="index.html">
                            <img src="${pageContext.request.contextPath}/templates/images/logo.png" alt="">
                        </a>
                    </div>
                </div> <!-- /.col-md-4 -->
                <div class="col-md-4 col-sm-4">
                    <div class="copyright">
                        <span>Copyright &copy; 2084 <a href="#">Company Name</a> <!-- Credit: www.templatemo.com --></span>
                    </div>
                </div> <!-- /.col-md-4 -->
                <div class="col-md-4 col-sm-4">
                    <ul class="social-icons">
                        <li><a href="#" class="fa fa-facebook"></a></li>
                        <li><a href="#" class="fa fa-twitter"></a></li>
                        <li><a href="#" class="fa fa-linkedin"></a></li>
                        <li><a href="#" class="fa fa-flickr"></a></li>
                        <li><a href="#" class="fa fa-rss"></a></li>
                    </ul>
                </div> <!-- /.col-md-4 -->
            </div> <!-- /.row -->
        </div> <!-- /.container -->
    </div> <!-- /.site-footer -->
    <script src= "${pageContext.request.contextPath}/templates/js/bootstrap.js"></script>
    <script src= "${pageContext.request.contextPath}/templates/js/plugins.js"></script>
    <script src= "${pageContext.request.contextPath}/templates/js/main.js"></script>
</body>
</html>