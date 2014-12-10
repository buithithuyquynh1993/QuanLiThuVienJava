<%-- 
    Document   : SearchBook
    Created on : Dec 9, 2014, 10:52:56 AM
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="me" uri="/WEB-INF/tlds/mytags.tld" %>
<me:template >
    <jsp:attribute name= "content">
    <div class="col-md-4">
        <ul class="list-group">
            <li class="list-group-item"><a href="${pageContext.request.contextPath}/Public/SearchBook.htm"> Tìm Kiếm Sách </a> </li>
            <li class=" list-group-item"><a href="${pageContext.request.contextPath}/Employee/AddBook.htm"> Nhân viên </a> </li>
            <li class=" list-group-item"><a href="${pageContext.request.contextPath}/Reader/ReaderPage.htm"> Độc giả </a> </li>
        </ul>
    </div>
    <div class="col-md-8">
        <div class="panel panel-success" align="center">
            <div class="panel-heading">
                <font size="6" color="blue" face="arial"><b>   Tìm Kiếm Sách </b> </font>
            </div>
        </div>
    </div>
    </jsp:attribute>
</me:template>