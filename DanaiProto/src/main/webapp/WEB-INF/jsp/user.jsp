<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="/WEB-INF/jsp/includes.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<link href="<c:url value="/resources/bootstrap/test.css" />" rel="stylesheet" type="text/css"/>
<title>User</title>
</head>
<body>
<h1>User for</h1>
<form:form action="user.do" method="POST" commandName="user">
	<table>
		<tr>
			<td>User ID</td>
			<td><form:input cssClass="input-xlarge" path="userId" /></td>
		</tr>
		<tr>
			<td>username</td>
			<td><form:input path="username" /></td>
		</tr>
		<tr>
			<td>password</td>
			<td><form:input path="password" /></td>
		</tr>
		<tr>
			<td>nama</td>
			<td><form:input path="nama" /></td>
		</tr>
		<tr>
			<td>foto</td>
			<td><form:input path="foto" /></td>
		</tr>
		<tr>
			<td>bio</td>
			<td><form:input path="bio" /></td>
		</tr>
		
		<tr>
		<td colspan="2">
			<input type="submit" name="action" value="Add" />
			<input type="submit" name="action" value="Edit" />
			<input type="submit" name="action" value="Delete" />
			<input type="submit" name="action" value="Search" />
		</td>
		</tr>
	</table>
</form:form>
<br>
<table>
	<tr>
	<th>ID</th>
	<th>username</th>
	<th>password</th>
	<th>nama</th>
	<th>foto</th>
	<th>bio</th>
	</tr>
	<c:forEach items="${userList}" var="user">
	<tr>
		<td>${user.userId}</td>
		<td>${user.username}</td>
		<td>${user.password}</td>
		<td>${user.nama}</td>
		<td>${user.foto}</td>
		<td>${user.bio}</td>
	</tr>
	</c:forEach>
</table>
<br>
<h1>Location</h1>
<table>
	<tr>
	<th>ID</th>
	<th>city</th>
	<th>province</th>
	</tr>
	<c:forEach items="${locationList}" var="location">
	<tr>
		<td>${location.locationId}</td>
		<td>${location.city}</td>
		<td>${location.province}</td>
	</tr>
	</c:forEach>
</table>
<br>
<h1>Category</h1>
<table>
	<tr>
	<th>ID</th>
	<th>name</th>
	</tr>
	<c:forEach items="${categoryList}" var="category">
	<tr>
		<td>${category.categoryId}</td>
		<td>${category.name}</td>
	</tr>
	</c:forEach>
</table>
<br>
<h1>Project</h1>
<table>
	<tr>
	<th>ID</th>
	<th>location</th>
	<th>username</th>
	<th>category</th>
	<th>title</th>
	<th>last date</th>
	</tr>
	<c:forEach items="${projectList}" var="project">
	<tr>
		<td>${project.projectId}</td>
		<td>${project.location.city}</td>
		<td>${project.user.nama}</td>
		<td>${project.category.name}</td>
		<td>${project.title}</td>
		<td>${project.lastDate}</td>
	</tr>
	</c:forEach>
</table>
</body>
</html>