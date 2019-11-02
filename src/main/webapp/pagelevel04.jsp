<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <script type="text/javascript">
        function validate_required(field,alerttxt)
        {
            with (field)
            {
                if (value==null||value=="")
                {alert(alerttxt);return false}
                else {return true}
            }
        }
        function validate_form(thisform)
        {
            with (thisform)
            {
                if (validate_required(name,"昵称不能为空！")==false)
                {name.focus();return false}
                if(validate_required(message, "问题不能为空！")==false)
                {message.focus();return false}
            }
        }
    </script>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>回复</title>
    <link href="css/demo.css" rel="stylesheet" type="text/css">
    <script src="js/jquery-1.10.2.min.js" type="text/javascript"></script>
    <!--Framework-->
    <script src="js/jquery-1.10.2.min.js" type="text/javascript"></script>
    <script src="js/jquery-ui.js" type="text/javascript"></script>
    <!--End Framework-->
    <script src="js/jquery.ffform.js" type="text/javascript"></script>
</head>
<body class="flipInX animated">
<section id="getintouch" class="fadeInRightBig animated">
    <div class="container" style="border-bottom: 0;">
        <h1>
            <span>回复</span>
        </h1>
    </div>
    <div class="container">

        <form class="contact" action="PL03U!update.action" method="post" id="form" onsubmit="return validate_form(this);">
            <div class="row clearfix">
                <div class="lbl">
                    <label for="message">
                        问题</label>
                </div>
                <div class="ctrl">
                    <s:iterator value="str1" var="str1">
                    <s:hidden value="%{#str1}" name="str1" />
                    </s:iterator>
                    <textarea id="message" name="message" rows="6" cols="10" style="resize: none;" disabled><s:property value="str2" /> </textarea>
                </div>
            </div>
            <div class="row clearfix">
                <div class="lbl">
                    <label for="name">
                        <font color="red">*</font>昵称</label>
                </div>
                <div class="ctrl">
                    <input type="text" id="name" name="jEmail" data-required="true" data-validation="text"
                           data-msg="Invalid Name" placeholder="Ex: Name/E-mail">
                </div>
            </div>
            <div class="row clearfix">
                <div class="lbl">
                    <label for="jMessage">
                        <font color="red">*</font>回复</label>
                </div>
                <div class="ctrl">
                    <textarea id="jMessage" name="jMessage" rows="6" cols="10" style="resize: none;"></textarea>
                </div>
            </div>
            <div class="row  clearfix">
                <div class="span10 offset2">
                    <input type="submit" name="submit" id="submit" class="submit" value="确	定">
                    <input type="button" name="submit" id="back" class="submit" value="取    消" onclick="javascript:history.back(-1);">
                </div>
            </div>
        </form>
    </div>
</section>
</body>
</html>
