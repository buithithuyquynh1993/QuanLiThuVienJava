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
            <li class=" list-group-item"><a href="${pageContext.request.contextPath}/Employee/ReaderList.htm"> Danh Sách Độc Giả </a> </li>
            <li class=" list-group-item"><a href="${pageContext.request.contextPath}/Employee/ReaderDetail.htm"> Chi tiết độc giả </a> </li>
            <li class=" list-group-item"><a href="${pageContext.request.contextPath}/Employee/AddBook.htm"> Nhân viên </a> </li>
            <li class=" list-group-item"><a href="${pageContext.request.contextPath}/Reader/ReaderPage.htm"> Độc giả </a> </li>
        </ul>
    </div>
    <div class="col-md-8">
        <div class="panel panel-success" align="centaligner">
            <div class="panel-heading">
                <font size="6" color="blue" face="arial"><b>   Tìm Kiếm Sách </b> </font>
            </div>
        </div>
        <form class="form-horizontal" role="form">
                <div class="form-group">
                    <div class="col-sm-6">
                      <input type="text" class="form-control" id="TenSach" placeholder="Tên Sách">
                    </div>
                    <div class="col-sm-6">
                        <input type="text" class="form-control" id="ChuDe" placeholder="Chủ đề">
                    </div>
                </div>
                <div class="form-group">
                    <div class="col-sm-6">
                        <input type="text" class="form-control" id="TacGia" placeholder="Tác giả">
                    </div>
                    <div class="col-sm-6">
                        <select id="LoaiSach" class="form-control">
                            <option> Sách Tham Khảo </option>
                            <option> Tạp Chí </option>
                        </select>
                     </div>
                </div>   
                <div class="form-group">
                    <div class="col-sm-12">
                        <button type="submit" class="btn btn-default">Sign in</button>
                    </div>
                </div>
            </form>
    </div>
        
    </jsp:attribute>
</me:template>