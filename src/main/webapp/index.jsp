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
</head>
<body>
<table border="0" width="100%">
    <tr>
        <td width="50%">
            <form action="PL02.action" method="post" name="WenTi">
                <textarea style="width:600px; height:200px; resize: none;" disabled ><s:property value="aa" /></textarea><br>
                常见问题：
                <input type="submit" value="#" name="c1">
                <input type="submit" value="#" name="c2">
                <input type="submit" value="#" name="c3">
                <select name="c4">
                    <option value="" selected="#" disabled>更多...</option>
                    <option value="">A</option>
                    <option value="">B</option>
                </select>
                <br>
                <input type="text" name="aa">
                <input type="submit" value="发送">
            </form>
        </td>
    </tr>
</table>

</body>

</html>
