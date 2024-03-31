<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="styles.css">
    <title>File Upload</title>
</head>
<body>
    <h2>File Upload Form</h2>
    <form action="uploadFile" method="post" enctype="multipart/form-data">
        <input type="file" name="file" id="file">
        <input type="submit" value="Upload">
    </form>
</body>
</html>
