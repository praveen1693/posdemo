 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
 
<body><br/><br/>
<div align="center">
<h1>TAXES TABLE</h1><hr>

<form:form method="POST" modelAttribute="taxes">
    <form:input type="hidden" path="id" id="id"/>
    <form:input type="hidden" path="status" id="status"/>
    <form:input type="hidden" path="taxid" id="taxid"/>
    <table>
	<tr>
		<td><label>Tax Name:</label></td>
		<td><form:input path="taxname" id="taxname"  /></td>
	</tr>		
	<tr>
		<td><label>Tax Rate:</label></td>
		<td><form:input path="taxrate" id="taxrate"  /></td>
	</tr>
	<tr>
		<td><input type="submit" value="ADD"/></td>
		<td><input type="submit" value="INACTIVATE"/></td>
	</tr>
</table>
</form:form>

</div>
</body>