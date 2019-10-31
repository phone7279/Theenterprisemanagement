<%@page language="java" pageEncoding="UTF-8" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@taglib prefix="sd" uri="/struts-dojo-tags" %>
<!DOCTYPE html>
<html>
<head>
    <s:head theme="xhtml" />
    <sd:head parseContent="true" />
<title>
    机器人首页
</title>
    <script type="text/javascript">
        function validate_email(field,alerttxt)
        {
            with (field)
            {
                apos=value.indexOf("@")
                dotpos=value.lastIndexOf(".")
                if (apos<1||dotpos-apos<2)
                {alert(alerttxt);return false}
                else {return true}
            }
        }

        function validate_form(thisform)
        {
            with (thisform)
            {
                if (validate_email(email,"Not a valid e-mail address!")==false)
                {email.focus();return false}
            }
        }
    </script>
</head>

<body>
<form action="submitpage.htm"onsubmit="return validate_form(this);" method="post">
    Email: <input type="text" name="email" size="30">
    <input type="submit" value="Submit">
</form>

<a href="PL01S!selected.action">fadsfasdfadsfad</a>
</body>

</html>
