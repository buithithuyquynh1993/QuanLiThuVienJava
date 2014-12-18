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
            <li class=" list-group-item"><a href="${pageContext.request.contextPath}/Employee/ReaderList.htm"> Danh Sách Độc Giả </a> </li>
            <li class=" list-group-item"><a href="${pageContext.request.contextPath}/Employee/UpdateReaderInformation.htm"> Chỉnh Sửa thông tin độc giả </a> </li>
            <li class=" list-group-item"><a href="${pageContext.request.contextPath}/Employee/ReaderDetail.htm"> Chi tiết độc giả </a> </li>
        </ul>
    </div>
    <div class="col-md-8">
      <div class="panel panel-success" align="center">
        <div class="panel-heading">
            <font size="6" color="blue" face="arial"><b>  Trang độc giả </b> </font>
        </div>
    </div> 
        <p style="color: red"> Hiện hệ thống chưa hỗ trợ phần độc giả </p>
    </div>
    </jsp:attribute>
</me:template>