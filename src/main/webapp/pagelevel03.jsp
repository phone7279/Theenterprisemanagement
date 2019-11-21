<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <script type="text/javascript">
        function validate_required(field, alerttxt) {
            with (field) {
                if (value == null || value == "") {
                    alert(alerttxt);
                    return false
                }
                else {
                    return true
                }
            }
        }

        function validate_form(thisform) {
            with (thisform) {
                if (validate_required(title, "标题不能为空！") == false) {
                    email.focus();
                    return false
                }
                if (validate_required(message, "内容不能为空！") == false) {
                    message.focus();
                    return false
                }
            }
            alert("发送成功！");
        }

    </script>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>发帖</title>
    <link href="css/demo.css" rel="stylesheet" type="text/css">
    <script src="js/jquery-1.10.2.min.js" type="text/javascript"></script>
    <!--Framework-->
    <script src="js/jquery-1.10.2.min.js" type="text/javascript"></script>
    <script src="js/jquery-ui.js" type="text/javascript"></script>
    <!--End Framework-->
    <script src="js/jquery.ffform.js" type="text/javascript"></script>
</head>
<body class="flipInX animated">
<div class="demos-buttons">
    <c:if test="${sessionScope.name==null}"><script>window.alert("您尚未登录，现在登陆！");window.location.href = "login.jsp";</script></c:if>
    <c:if test="${sessionScope.name!=null}">欢迎您，${sessionScope.name}&nbsp;<a href='accountZX!disLogin.action' style='text-decoration-line: none'>注销</a></c:if>
    <h3><a href="PL03ST!selectedTop.action" style="text-decoration-line:none;link: bleak;color: black">帖吧</a></h3>
    <a href="PL03ST!selectedTop.action" class="submit">帖子</a><br>
    <a href="pagelevel03.jsp" class="submit active">发帖</a><br/>
    <a href="PL01S!selected.action" class="submit">在线客服</a><br>
</div>
</div>
<section id="getintouch" class="fadeInRightBig animated">
    <div class="container" style="border-bottom: 0;">
        <h1>
            <span>发帖</span>
        </h1>
    </div>
    <div class="container">

        <form class="contact" action="PL03IT!insertTop.action" method="post" id="form" onsubmit="return validate_form(this);">
            <input type="hidden" value="${sessionScope.name}" name="name"/>
            <div class="row clearfix">
                <div class="lbl">
                    <label for="name">标题</label>
                </div>
                <div class="ctrl">
                    <input type="text" id="name" name="title" data-required="true" data-validation="text"
                           data-msg="Invalid Name" placeholder="标题">
                </div>
            </div>
            <div class="row clearfix">
                <div class="lbl">
                    <label for="message">内容</label>
                </div>
                <div class="ctrl">
                    <textarea id="message" name="message" rows="10" cols="8" style="resize: none;"></textarea>
                </div>
            </div>
            <div class="row  clearfix">
                <div class="span10 offset2">
                    <input type="submit" name="submit" id="submit" class="submit" value="发  送">
                </div>
            </div>
        </form>
    </div>
</section>
</body>
</html>
