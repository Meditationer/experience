<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@page contentType="text/html;charset=UTF-8" language="java" %>
<%@page pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>物料信息</title>
    <%@include file="_header.jsp" %>
</head>
<body>
<%@include file="_navbar.jsp" %>
<div class=".container-fluid" role="main">
    <%-- 页面中取出服务器端保存的值,第一个是数据，地二个是分页，当前页，总页数--%>
    <c:set var="materiel" value="${requestScope.materiel}"/>
    <c:set var="page" value="${requestScope.page == null?1:requestScope.page}"/>
    <c:set var="totalPages" value="${requestScope.totalPage==null?1:requestScope.totalPage}"/>
    <%--搜索参数--%>
    <c:set var="ITEM_NO" value="${requestScope.ITEM_NO}"/>
    <c:set var="DESCRIPTION" value="${requestScope.DESCRIPTION}"/>
    <c:set var="GRAPHIC_NO" value="${requestScope.GRAPHIC_NO}"/>
    <c:set var="MATERIAL_TYPE" value="${requestScope.MATERIAL_TYPE}"/>
    <c:set var="SPECIFICATION1" value="${requestScope.SPECIFICATION1}"/>
    <c:set var="organization" value="${requestScope.organization}"/>
    <div class="row justify-content-center">
        <div class="col-lg-10">
                <form class="form-inline wise" action="<c:url value="/getMater"/>" method="get" onsubmit="return x();">
                    <div class="form-group">
                        &nbsp;<label for="one">物料编号&nbsp;</label>
                        <input type="text" class="form-control" id="one" name="ITEM_NO" value="${ITEM_NO}">
                    </div>
                    <div class="form-group">
                        &nbsp;<label for="four">物料描述&nbsp;</label>
                        <input type="text" class="form-control" id="four" name="DESCRIPTION" value="${DESCRIPTION}">
                    </div>
                    <div class="form-group">
                        &nbsp;<label for="five">材&#12288;&#12288;质</label>&nbsp;
                        <input type="text" class="form-control" id="five" name="MATERIAL_TYPE" value="${MATERIAL_TYPE}">
                    </div>
                    <div class="form-group">
                        &nbsp;<label for="three">规&#12288;&#12288;格</label>&nbsp;
                        <input type="text" class="form-control" id="three" name="SPECIFICATION1" value="${SPECIFICATION1}">
                    </div>
                    <div class="form-group">
                        &nbsp;<label for="two">图号/标准</label>&nbsp;
                        <input type="text" class="form-control" id="two" name="GRAPHIC_NO" value="${GRAPHIC_NO}">
                    </div>
                    <div class="form-group">
                        &nbsp;<label for="two">
                        <span>库存组织</span>
                        <span class="t_color">*</span>
                        </label>&nbsp;
                        <select class="form-control" id="required" name="organization" value="${organization}">
                            <option value ="0" <c:if test="${'0' eq organization}">selected</c:if>>请选择</option>
                            <option value="水电" <c:if test="${'水电' eq organization}">selected</c:if>>水电</option>
                            <option value="核电" <c:if test="${'核电' eq organization}">selected</c:if>>核电</option>
                        </select>
                    </div>
                    &#12288;&#12288;
                    <button type="submit" class="btn btn-default">查询</button>
                </form>
        </div>
    </div>
    <div class="row justify-content-center">
        <div class="col-lg-10 table-responsive">
            <table class="table table-hover table-striped table-bordered table-sm">
                <thead>
                <tr>
                    <td>物料编号</td>
                    <td>物料描述</td>
                    <td>图号/标准</td>
                    <td>规格</td>
                    <td>指定</td>
                    <td>材质</td>
                    <td>性能等级</td>
                    <td>表面处理</td>
                    <td>现有量</td>
                    <td>单位</td>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="m" items="${materiel}">
                    <tr>
                        <td>${m.ITEM_NO}</td>
                        <td>${m.DESCRIPTION}</td>
                        <td>${m.GRAPHIC_NO}</td>
                        <td>${m.SPECIFICATION1}</td>
                        <td>${m.SPECIFICATION2}</td>
                        <td>${m.MATERIAL_TYPE}</td>
                        <td>${m.PERFORMANCE_LV}</td>
                        <td>${m.FACE_TYPE}</td>
                        <td>${m.MOQD_FLAG}</td>
                        <td>${m.UNIT}</td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>


    <div class="row justify-content-center">
        <div>
            <nav>
                <%--分页标签--%>
                <ul class="pagination">
                    <li class="page-item ${page==1?'disabled':''}">
                        <a class="page-link" href="<c:url value="/getMater?page=${page-1>1?page-1:1}&ITEM_NO=${ITEM_NO}&GRAPHIC_NO=${GRAPHIC_NO}&MATERIAL_TYPE=${MATERIAL_TYPE}&DESCRIPTION=${DESCRIPTION}&SPECIFICATION1=${SPECIFICATION1}&organization=${organization}"/>">上一页</a>
                    </li>
                    <c:if test="${page!=1}">
                        <li class="page-item">
                            <a class="page-link" href="<c:url value="/getMater?page=1&ITEM_NO=${ITEM_NO}&GRAPHIC_NO=${GRAPHIC_NO}&MATERIAL_TYPE=${MATERIAL_TYPE}&DESCRIPTION=${DESCRIPTION}&SPECIFICATION1=${SPECIFICATION1}&organization=${organization}"/>">1</a>
                        </li>
                    </c:if>
                    <c:if test="${page>2}">
                        <li class="page-item disabled">
                            <a class="page-link">...</a>
                        </li>
                    </c:if>
                    <li class="page-item active">
                        <a class="page-link" href="<c:url value="/getMater?page=${page}&ITEM_NO=${ITEM_NO}&GRAPHIC_NO=${GRAPHIC_NO}&MATERIAL_TYPE=${MATERIAL_TYPE}&DESCRIPTION=${DESCRIPTION}&SPECIFICATION1=${SPECIFICATION1}&organization=${organization}"/>">${page}</a>
                    </li>
                    <c:if test="${totalPages-page>1}">
                        <li class="page-item disabled">
                            <a class="page-link">...</a>
                        </li>
                    </c:if>
                    <c:if test="${page!=totalPages}">
                        <li class="page-item">
                            <a class="page-link" href="<c:url value="/getMater?page=${totalPages}&ITEM_NO=${ITEM_NO}&GRAPHIC_NO=${GRAPHIC_NO}&MATERIAL_TYPE=${MATERIAL_TYPE}&DESCRIPTION=${DESCRIPTION}&SPECIFICATION1=${SPECIFICATION1}&organization=${organization}"/>">${totalPages}</a>
                        </li>
                    </c:if>

                    <li class="page-item ${page==totalPages?'disabled':''}">
                        <a class="page-link" href="<c:url value="/getMater?page=${page+1<totalPages?page+1:totalPages}&ITEM_NO=${ITEM_NO}&GRAPHIC_NO=${GRAPHIC_NO}&MATERIAL_TYPE=${MATERIAL_TYPE}&DESCRIPTION=${DESCRIPTION}&SPECIFICATION1=${SPECIFICATION1}&organization=${organization}"/>">下一页</a>
                    </li>
                </ul>
            </nav>
        </div>
    </div>

</div>
<style>
    .wise{
        /*color: blue;*/
        border:1px solid #dee2e6;
    }
    .t_color{
        color: red;
    }
</style>
<script type="text/javascript">
    function x() {
        var cont=document.getElementById("required");
        if (cont.value =="0" || cont.value =="") {
            alert("库存组织是必选项，请选择")
            return false;
        }
        return true;
    }
</script>
</body>
</html>
