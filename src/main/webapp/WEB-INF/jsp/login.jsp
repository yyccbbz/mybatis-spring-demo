<%--
  Created by IntelliJ IDEA.
  User: yyccbbz
  Date: 2016-8-8
  Time: 23:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/js/jquery-easyui-1.4.5/themes/default/easyui.css" />
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/js/jquery-easyui-1.4.5/themes/icon.css" />
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/css/login.css" />
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/js/jquery-easyui-1.4.5/jquery.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/js/jquery-easyui-1.4.5/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/js/jquery-easyui-1.4.5/locale/easyui-lang-zh_CN.js" ></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/js/login.js"></script>
</head>
<body style="background-color: #F3F3F3">

    <div id="login">
        <p>用户账号：<input type="text" id="username" class="textbox"></p>
        <p>用户密码：<input type="password" id="password" class="textbox"></p>
    </div>
    <div id="btn">
        <a href="#" class="easyui-linkbutton">登录</a>
    </div>

</body>
</html>
