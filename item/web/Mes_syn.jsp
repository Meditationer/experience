<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@page contentType="text/html;charset=UTF-8" language="java" %>
<%@page pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>MES同步错误查询</title>
    <%@include file="_header.jsp" %>
</head>
<body>
<%@include file="_navbar.jsp" %>
<div class=".container-fluid" role="main">
    <%-- 页面中取出服务器端保存的值,第一个是数据，地二个是分页，当前页，总页数--%>
    <c:set var="Messyn" value="${requestScope.Messyn}"/>
    <c:set var="page" value="${requestScope.page == 0?1:requestScope.page}"/>
    <c:set var="totalPages" value="${requestScope.totalPage==null?1:requestScope.totalPage}"/>
    <%--搜索参数--%>
    <c:set var="NO" value="${requestScope.NO}"/>
    <c:set var="SEGMENT1" value="${requestScope.SEGMENT1}"/>
    <c:set var="WIP_ENTITY_NAME" value="${requestScope.WIP_ENTITY_NAME}"/>
        <c:set var="beg" value="${requestScope.beg}"/>
        <c:set var="end" value="${requestScope.end}"/>
    <div class="row justify-content-center">
        <div class="col-lg-10 table-responsive">
            <form class="form-inline wise" action="<c:url value="/getMeserr"/>" method="get" >
                <input type="hidden" name="page" value="1">
                <div class="form-group">
                    &ensp;<label for="one">工序号&ensp;</label>
                    <input type="text" class="form-control" id="one" name="NO" value="${NO}">
                </div>
                <div class="form-group">
                    &ensp;<label for="five">工单号&ensp;</label>
                    <input type="text" class="form-control" id="five" name="WIP_ENTITY_NAME" value="${WIP_ENTITY_NAME}">
                </div>
                <div class="form-group">
                    &ensp;<label for="four">物料号&ensp;</label>
                    <input type="text" class="form-control" id="four" name="SEGMENT1" value="${SEGMENT1}">
                </div>
                <div class="form-group">
                    &ensp;<label >时间&ensp;</label>
                    <input type="text" readonly class="form-control minDate"  name="beg" value="${beg}" autocomplete="off"/>
                </div>
                <div class="form-group">
                    &ensp;<label >到&ensp;</label>
                    <input type="text" readonly  class="form-control maxDate"  name="end" value="${end}" autocomplete="off"/>
                </div>

                <button type="submit" class="btn btn-default">查询</button>
            </form>
        </div>
    </div>
    <div class="row justify-content-center">
        <div class="col-lg-10 table-responsive">
            <table class="table table-hover table-striped table-bordered table-sm">
                <thead>
                <tr>
                    <td>工序号</td>
                    <td>工单号</td>
                    <td>物料号</td>
                    <td>创建时间</td>
                    <td>导入日期</td>
                    <td>错误次数</td>
                    <td>错误原因</td>
                    <td>问题类型</td>
                    <td>状态</td>
                    <td>时间</td>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="m" items="${Messyn}">
                    <tr>
                        <td>${m.NO}</td>
                        <td>${m.WIP_ENTITY_NAME}</td>
                        <td>${m.SEGMENT1}</td>
                        <td>${m.CREATE_DATE}</td>
                        <td>${m.PROCESS_DATE}</td>
                        <td>${m.ERROR_COUNT}</td>
                        <td>${m.ERROR_MESSAGE}</td>
                        <td>${m.ERROR_TYPE}</td>
                        <td>${m.STATUS}</td>
                        <td>${m.CREATION_DATE}</td>
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
                        <a class="page-link" href="<c:url value="/getMeserr?page=${page-1>1?page-1:1}&NO=${NO}&SEGMENT1=${SEGMENT1}&WIP_ENTITY_NAME=${WIP_ENTITY_NAME}&beg=${beg}&end=${end}"/>">上一页</a>
                    </li>
                    <c:if test="${page!=1}">
                        <li class="page-item">
                            <a class="page-link" href="<c:url value="/getMeserr?page=1&NO=${NO}&SEGMENT1=${SEGMENT1}&WIP_ENTITY_NAME=${WIP_ENTITY_NAME}&beg=${beg}&end=${end}"/>">1</a>
                        </li>
                    </c:if>
                    <c:if test="${page>2}">
                        <li class="page-item disabled">
                            <a class="page-link">...</a>
                        </li>
                    </c:if>
                    <li class="page-item active">
                        <a class="page-link" href="<c:url value="/getMeserr?page=${page}&NO=${NO}&SEGMENT1=${SEGMENT1}&WIP_ENTITY_NAME=${WIP_ENTITY_NAME}&beg=${beg}&end=${end}"/>">${page}</a>
                    </li>
                    <c:if test="${totalPages-page>1}">
                        <li class="page-item disabled">
                            <a class="page-link">...</a>
                        </li>
                    </c:if>
                    <c:if test="${page!=totalPages}">
                        <li class="page-item">
                            <a class="page-link" href="<c:url value="/getMeserr?page=${totalPages}&NO=${NO}&SEGMENT1=${SEGMENT1}&WIP_ENTITY_NAME=${WIP_ENTITY_NAME}&beg=${beg}&end=${end}"/>">${totalPages}</a>
                        </li>
                    </c:if>

                    <li class="page-item ${page==totalPages?'disabled':''}">
                        <a class="page-link" href="<c:url value="/getMeserr?page=${page+1<totalPages?page+1:totalPages}&NO=${NO}&SEGMENT1=${SEGMENT1}&WIP_ENTITY_NAME=${WIP_ENTITY_NAME}&beg=${beg}&end=${end}"/>">下一页</a>
                    </li>
                </ul>
            </nav>
        </div>
    </div>

</div>
<style>
    body, html {
        min-height:101%;
        /*overflow-y:hidden;*/
    }
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
    };
    FlexDate.setSkin('#232323');
    var minDate=new FlexDate({
        e:'.minDate',
        format: 'yyyy-MM-dd',
        confirm:function (value) {
            maxDate.setMin(value);
        }
    });
    var maxDate=new FlexDate({
        e:'.maxDate',
        format: 'yyyy-MM-dd',
        confirm:function (value) {
            minDate.setMax(value);
        }
    })
</script>
</body>
</html>
