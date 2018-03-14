<%@ page language="java"  contentType="text/html; charset=UTF-8" %>
<html>
<body>
<h2>Hello World22!</h2>

springMVC上传文件
<form name="uu" action="/manage/product/upload.do" method="post" enctype="multipart/form-data">
    <input type="file" name="upload_file" />
    <input type="submit" value="上传">
</form>
富文本
<form name="uu33" action="/manage/product/richtext_img_upload.do" method="post" enctype="multipart/form-data">
    <input type="file" name="upload_file" />
    <input type="submit" value="上传">
</form>
</body>
</html>
