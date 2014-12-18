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
            <li class=" list-group-item"><a href="${pageContext.request.contextPath}/Employee/AddBook.htm"> Thêm Sách </a> </li>
            <li class=" list-group-item"><a href="${pageContext.request.contextPath}/Employee/UpdateBook.htm"> Chỉnh sửa sách </a> </li>
            <li class=" list-group-item"><a href="${pageContext.request.contextPath}/Employee/AddPosition.htm"> Thêm Vị Trí Sách </a> </li>
            <li class=" list-group-item"><a href="${pageContext.request.contextPath}/Employee/AddAuthor.htm"> Thêm Tác Giả </a> </li>
            <li class=" list-group-item"><a href="${pageContext.request.contextPath}/Employee/ReaderList.htm"> Danh Sách Độc Giả </a> </li>
            <li class=" list-group-item"><a href="${pageContext.request.contextPath}/Employee/UpdateReaderInformation.htm"> Chỉnh Sửa thông tin độc giả </a> </li>
            <li class=" list-group-item"><a href="${pageContext.request.contextPath}/Employee/ReaderDetail.htm"> Chi tiết độc giả </a> </li>
            
        </ul>
    </div>
    <div class="col-md-8">
         <div class="panel panel-success" align="center">
        <div class="panel-heading">
            <font size="6" color="blue" face="arial"><b>   Thêm Sách </b> </font>
        </div>
    </div>
    </div>
    </jsp:attribute>
</me:template>