<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>--%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<!-- <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head> -->
<body >
   <br/>
   <br/>

   
	
<div align="center">
	<h1>USERS PAGE</h1><hr/>
	<form:form method="POST" modelAttribute="users">
		<form:input type="hidden" path="id" id="id"/>
		<table>
			<tr>
				<td><label>Name: </label> </td>
				<td><form:input path="username" id="username"/></td>
				
		    </tr>
	    	
	    	<tr>
				<td><label>Password: </label> </td>
				<td><form:input path="password" id="password"/></td>
			
		    </tr>
		    <tr>
		    	<td>
		    		<form:select path="role">
		    			<form:option value="manager">Manager</form:option>
		    			<form:option value="pos">POS</form:option>
		    		</form:select>
		    	</td>
		    </tr>
			<tr>
				<td><input type="submit" value="ADD"/></td>	
			</tr>
		</table>
	</form:form>
</div>
</body> 