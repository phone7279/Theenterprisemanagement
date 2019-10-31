<%@page language="java" pageEncoding="UTF-8" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>常见问题</title>
    <link href="css/demo.css" rel="stylesheet" type="text/css">
    <script src="js/jquery-1.10.2.min.js" type="text/javascript"></script>
    <!--Framework-->
    <script src="js/jquery-1.10.2.min.js" type="text/javascript"></script>
    <script src="js/jquery-ui.js" type="text/javascript"></script>
    <!--End Framework-->
     <script src="js/jquery.ffform.js" type="text/javascript"></script>
</head>
<body class="bounceIn animated">
    <div class="demos-buttons">
        <h3>
            客服</h3>
       
        <a href="pagelevel01.jsp" class="submit">在线客服</a><br>
        <a href="PL03S!selected.action" class="submit active">常见问题</a><br>
        <a href="pagelevel03.jsp" class="submit">反馈</a>
    </div>
    <section id="getintouch" class="rotateInUpLeft animated">
        <div class="container" style="border-bottom: 0;">
            <h1>
                <span>常见问题</span>
            </h1>
            <s:iterator value="list">
                邮箱：<s:property value="[0].email" /><br/>
                问题：<s:property value="[0].message" /><br/>
            </s:iterator>
        </div>
    </section>
</body>
</html>
