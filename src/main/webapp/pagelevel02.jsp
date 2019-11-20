<%@ page import="com.opensymphony.xwork2.ActionContext" %>
<%@page pageEncoding="UTF-8" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>帖子</title>
    <link href="css/demo.css" rel="stylesheet" type="text/css">
    <script src="js/jquery-1.10.2.min.js" type="text/javascript"></script>
    <!--Framework-->
    <script src="js/jquery-1.10.2.min.js" type="text/javascript"></script>
    <script src="js/jquery-ui.js" type="text/javascript"></script>
    <!--End Framework-->
    <script src="js/jquery.ffform.js" type="text/javascript"></script>
    <style type="text/css">
        a {
            text-decoration-line: none;
        }
        a:link{
            color: #969696;
        }
        a:visited{
            color: #969696;
        }
        a:hover{
            color: #4B9DE0;
        }
        .test1 {
            overflow: hidden;
            text-overflow: ellipsis;
            display: -webkit-box;
            -webkit-line-clamp: 2;
            -webkit-box-orient: vertical;
        }
    </style>
</head>
<body class="bounceIn animated">
<div class="demos-buttons">
    <% String string = (String) ActionContext.getContext().getApplication().get("name");
        if (string == null) out.print("<a href=\"login.jsp\">点击登录</a>！");
        else
            out.print("欢迎您，" + string + " <a href='accountZX!disLogin.action'>注销</a>");
    %>
    <h3><a href="PL03ST!selectedTop.action" style="text-decoration-line:none;link: bleak;color: black">帖吧</a></h3>
    <a href="PL03ST!selectedTop.action" class="submit active">帖子</a><br>
    <a href="pagelevel03.jsp" class="submit">发帖</a><br/>
    <a href="PL01S!selected.action" class="submit">在线客服</a><br>
</div>
</div>
<section id="getintouch" class="rotateInUpLeft animated">
    <div class="container" style="border-bottom: 0;">
        <h1><span>帖  子</span></h1>
        <p></p>
        <table border="0" width="100%">
            <s:iterator value="list" var="tiezi">
                <tr>
                    <td colspan="2"><b><font color="black" size="5">
                        【#<s:property value="%{#tiezi.getTitle()}"/>#】</font></b>
                    </td>
                </tr>
                <tr>
                    <td width="5%"></td>
                    <td width="95%"><div class="test1">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color="#808080"><s:property value="%{#tiezi.message}"/></font></div></td>
                </tr>
                <tr>
                    <td colspan="2" align="right">
                        <s:form action="PL03SL!selectedLast" METHOD="post" name="SL">
                            <input type="hidden" value="<s:property value='%{#tiezi.getId()}'/>" name="id"/>
                            <% if(string==null) out.print("<td> <input type=\"text\" style= \"background-color:transparent;border:0;\" name=\"t2\" value=\"查看详情\" disabled title=\"登陆后方可查看\" /> </td>");else out.print("<input type=\"submit\" value=\"查看详情\" style=\"background:transparent;\"/>");%>
                        </s:form>
                    </td>
                </tr>
                <tr>
                    <td colspan="2">
                        <hr/>
                    </td>
                </tr>
            </s:iterator>
        </table>
    </div>
</section>
</body>
</html>
