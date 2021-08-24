<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import= "ex.*" %>
<% Employee emp = new Employee("0001", "湊　雄輔"); %>
<!DOCTYPE html>
<html>
<body>
<p>IDは <%= emp.getId() %>、 <%= emp.getName() %></p>
</body>
</html>