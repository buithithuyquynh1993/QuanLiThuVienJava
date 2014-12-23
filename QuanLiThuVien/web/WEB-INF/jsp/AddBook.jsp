<%-- 
    Document   : SearchBook
    Created on : Dec 9, 2014, 10:52:56 AM
    Author     : Thao
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="me" uri="/WEB-INF/tlds/mytags.tld" %>
<me:template>
    <jsp:attribute name= "content">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/templates/css/css_myself.css" />
        <form class="subscribeForm ticket-item" method="post">
            <h3 class="widget-title text-center" style="display:block">Thêm sách mới</h3>
            <h4>Thông tin sách</h4><br>
            <div class="row">
                <div class="col-md-6 col-sm-12 col-md-push-1">
                    <span>Tên sách: </span><input id="subscribe" type="text"><br/>
                    <span>Tập: </span>		<input type="text"/><br/>
                    <span>Cuốn:</span>		<input type="text"/>
                </div>
                <div class="col-md-6 col-sm-12 col-md-push-1">
                    <div style="float: left"><br/>
                        <a class="ticket-btn">Hiển thị mã vạch</a>
                    </div>
                    <div style="float:right; margin-right:40%">
                        <h5 class="text-center">Mã vạch</h5><br/>
                        <img src="images/about_1.jpg" width="150" height="80"/>
                    </div>
                </div>
            </div>
            <div class="row">
                    <div class="col-md-6 col-sm-12 col-md-push-1">
                    <p>Nội dung tóm tắt:</p><br>
                    <textarea rows="10" cols="65"></textarea>
                </div>
                <div class="col-md-6 col-sm-12 col-md-push-1">
                    <div style="float: left"><br/><br/><br/><br/>	
                            <a class="ticket-btn">Brown...</a>
                    </div>
                    <div style="float:right; margin-right:40%">
                            <h5 class="text-center">Mục lục</h5><br/>
                        <img src="images/about_1.jpg" width="200" height="250"/>
                    </div>
                </div>
            </div>
            <h4>Thông tin tác giả - Nhà xuất bản</h4>
            <div class="row text-center">
                    <span>Tác giả: </span>
                <select>
                    <c:forEach items="${_listTG}" var="em">
                        <option value="${em.id}">${em.tenTacGia}</option>
                    </c:forEach>
                </select>
                <span>Quốc tịch: </span>
                <label>nnnn</label><br/><br/>
                <span>Nhà xuất bản: </span>
                <select>
                    <c:forEach items="${_listNXB}" var="em">
                        <option value="${em.id}">${em.tenNxb}</option>
                    </c:forEach>
                </select>
                <span>Quốc gia: </span>
                <label>nnnn</label>
            </div><br/>
            <h4>Thông tin nhóm sách - Chủ đề</h4>
            <div class="row" style="margin-left:31%">
                    <span>Nhóm sách: </span>
                <select>
                    <c:forEach items="${_listNhomSach}" var="em">
                        <option value="${em.id}">${em.tenNhom}</option>
                    </c:forEach>
                </select><br/><br/>
                <span>Chủ đề: </span>
                <select>
                    <c:forEach items="${_listChuDe}" var="em">
                        <option value="${em.id}">${em.tenChuDe}</option>
                    </c:forEach>
                </select>
            </div><br/>
            <h4>Vị trí sách trên kệ (Tầng - Ngăn - Kệ)</h4>
            <div class="row" style="margin-left:31%">
                    <span>Tầng: </span>
                    <select>
                        <c:forEach items="${_listTang}" var="em">
                            <option value="${em.id}">${em.tang} - ${em.ngan} - ${em.ke}</option>
                        </c:forEach>
                    </select>
            </div>
            <div class="row" style="margin-top:30px">
                    <div class="col-md-2 col-md-push-3">
                                            <a class="ticket-btn">Thêm</a>
                </div>
                    <div class="col-md-2 col-md-push-6">
                                            <a class="ticket-btn">Thoát</a>
                </div>
            </div>
        </form>
</jsp:attribute>
</me:template>