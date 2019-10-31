<%@ page import="com.lw.fankui.FankuiEntity" %>
<%@page language="java" pageEncoding="UTF-8" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>问题广场</title>
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
       
        <a href="PL01S!selected.action" class="submit">在线客服</a><br>
        <a href="PL03S!selected.action" class="submit active">常见问题</a><br>
        <a href="pagelevel03.jsp" class="submit">反馈</a>
    </div>
    <section id="getintouch" class="rotateInUpLeft animated">
        <div class="container" style="border-bottom: 0;">
            <h1>
                <span>问题广场</span>
            </h1>

            <table border="0" width="100%">
                <s:iterator value="list">
                    <tr>
                        <td colspan="2"><b>用户&nbsp;(<s:property value="[0].email" />)&nbsp;问:</b></td>
                    </tr>
                    <tr>
                        <td width="5%"></td><td width="95%"><s:property value="[0].message" /></td>
                    </tr>
                    <tr>
                        <td colspan="2"><b>【<s:property value="[0].pass" />】热心人士(<s:property value="[0].jEmail" />)&nbsp;的回复:</b></td>
                    </tr>
                    <tr>
                        <td width="5%"></td><td width="95%"><s:property value="[0].jMessage" /></td>
                    </tr>
                    <tr>
                        <td colspan="2" align="right">
                            <div class="row  clearfix">
                                <div class="span10 offset2">
                                    <input type="submit" name="submit" id="submit" class="submit" value="🙋‍我来回答" align="right" onclick="javascript:alert('该功能未完善')" />
                                </div>
                            </div>
                        </td>
                    </tr>
                    <tr>
                        <td colspan="2"><hr/></td>
                    </tr>
                </s:iterator>
            </table>
        </div>
    </section>
</body>
</html>
