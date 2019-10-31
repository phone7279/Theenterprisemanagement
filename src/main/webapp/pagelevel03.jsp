﻿<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>反馈</title>
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
        <h3>
            客服</h3>
       
        <a href="pagelevel01.jsp" class="submit">在线客服</a><br>
        <a href="pagelevel02.jsp" class="submit">常见问题</a><br>
        <a href="pagelevel03.jsp" class="submit active">反馈</a>
    </div>
    <section id="getintouch" class="fadeInRightBig animated">
        <div class="container" style="border-bottom: 0;">
            <h1>
                <span>反馈</span>
            </h1>
        </div>
        <div class="container">

            <form class="contact" action="#" method="post" id="form">
            <div class="row clearfix">
                <div class="lbl">
                    <label for="name">
                        名字</label>
                </div>
                <div class="ctrl">
                    <input type="text" id="name" name="name" data-required="true" data-validation="text"
                        data-msg="Invalid Name" placeholder="Ex: LaiWei">
                </div>
            </div>
            <div class="row clearfix">
                <div class="lbl">
                    <label for="email">
                        <font color="red">*</font> 邮箱</label>
                </div>
                <div class="ctrl">
                    <input type="text" id="email" name="email" data-required="true" data-validation="email"
                        data-msg="Invalid E-Mail" placeholder="Ex: 1033076410@qq.com">
                </div>
            </div>
            <div class="row clearfix">
                <div class="lbl">
                    <label for="phone">
                        电话</label>
                </div>
                <div class="ctrl">
                    <input type="text" id="phone" name="phone" data-required="true" data-validation="custom"
                        data-msg="Invalid Phone #" placeholder="Ex: 13827667279">
                </div>
            </div>
            <div class="row clearfix">
                <div class="lbl">
                    <label for="message">
                        <font color="red">*</font> 问题</label>
                </div>
                <div class="ctrl">
                    <textarea id="message" name="message" rows="6" cols="10" style="resize: none;"></textarea>
                </div>
            </div>
            <div class="row  clearfix">
                <div class="span10 offset2">
                    <input type="submit" name="submit" id="submit" class="submit" value="发	送">
                </div>
            </div>
            </form>
        </div>
    </section>
</body>
</html>