<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.*" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>s2-062 poc</title>
</head>
<body>
<div>
    学海无涯
    <%--<s:label id="test" name="%{payload}" />--%>
    <s:label id="%{payload}" name="%{payload}" value="label test"/>

</div>
</body>
</html>