<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s"  uri="/struts-tags"%>  
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">  
<html>  
<head>  
<title>添加新用户</title>  
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">   
</head>  
<body>  
    <center>  
        <h1>修改用户</h1>  
        <s:form action="user_update" namespace="/user" method="post">  
            <s:hidden name="user.userid"></s:hidden>  
            <s:textfield label="用户名" name="user.username"></s:textfield>  
            <s:textfield label="年龄" name="user.age"></s:textfield>   
            <s:submit value="提交"></s:submit>  
        </s:form>  
    </center>  
  </body>  
</html>  