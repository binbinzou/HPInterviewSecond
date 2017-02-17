<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>  
<%@ taglib prefix="s"  uri="/struts-tags"%>  
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">  
<html>  
<head>  
<title>用户列表</title>  
<meta http-equiv="pragma" content="no-cache">  
<meta http-equiv="cache-control" content="no-cache">  
<meta http-equiv="expires" content="0">     
</head>  
<body>  
<s:fielderror fieldName="message" theme="simple"/>
<s:form action="user_queryAllUser" namespace="/user" method="post"> 
<s:submit value="返回"></s:submit>  
</s:form> 
</body>  
</html>  