<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList"%>
<%@taglib uri="http://www.li.cn/tag" prefix="lt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% 
		int[] ages = {12,44,56};
		double[] score = {123.9,144.8,135.3};
		String[] str = {"张","王","李","赵"};
		Map<String, Object> map = new HashMap<String, Object> ();
		map.put("name", "小明");
		map.put("age", 12);
		List<String> names = new ArrayList<String>();
		names.add("小明");
		names.add("小红");
	%>
	<lt:client-ip/>
	<lt:for-each items="<%=names %>" item="age">
		<div>${age} </div>
	</lt:for-each>
</body>
</html>