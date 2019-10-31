<%@page language="java" pageEncoding="UTF-8" %>
<%@ page import="java.util.*" %>
<%@page import="java.text.SimpleDateFormat" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>在线客服</title>
    <link href="css/demo.css" rel="stylesheet" type="text/css">
    <script src="js/jquery-1.10.2.min.js" type="text/javascript"></script>
    <!--Framework-->
    <script src="js/jquery-1.10.2.min.js" type="text/javascript"></script>
    <script src="js/jquery-ui.js" type="text/javascript"></script>
    <!--End Framework-->
     <script src="js/jquery.ffform.js" type="text/javascript"></script>
</head>
<%--<body class="flipInX animated">--%>
<body>
    <div class="demos-buttons">
        <h3>
            客服</h3>
        <a href="pagelevel01.jsp" class="submit active">在线客服</a><br>
        <a href="pagelevel02.jsp" class="submit">常见问题</a><br>
        <a href="pagelevel03.jsp" class="submit">反馈</a></div>
    <section id="getintouch">
        <div class="container" style="border-bottom: 0;">
            <h1>
                <span>在线客服</span>
            </h1>
            <form class="contact" action="PL01.action" method="post" id="form">
                <div class="row clearfix">
                    <div class="ctrl">
                        <s:iterator value="list" status="st">
                            <s:if test="#st.odd">(<% out.print(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())); %>)&nbsp;&nbsp;我：</s:if><s:else>(<% out.print(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())); %>)小E：</s:else><s:property/><br>
                        </s:iterator>
                    </div>
                </div>
                <div class="row clearfix">
                    <div class="ctrl">
                        <input type="text" id="name" name="wt" data-required="true" data-validation="text"
                               data-msg="Invalid Name" placeholder="请输入要询问的内容" />
                        <div class="row  clearfix">
                            <div class="span10 offset2">
                                <input type="submit" name="submit" id="submit" class="submit" value="发	送" align="right" />
                            </div>
                        </div>
                    </div>
                </div>
            </form>
        </div>
    </section>
</body>
</html>
