 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<body>
<br/>
<br/>
<div align="center">
	<h1>TABLES PAGE</h1><hr/>
	<form:form method="POST" modelAttribute="tables">
    <form:input type="hidden" path="id" id="id"/>
    <form:input type="hidden" path="tableid" id="tableid"/>
    <table>
	<tr>
		<td><label>Establishment Name:</label></td>
	<!-- load the ESTABLISHMENT from the database  -->
    	<td><form:select path="estname" items="${establishmentList}"/></td>
    </tr>
    <tr>
    	<td><label>Floor Name:</label></td>
    	<td><form:select path="floorname" items="${floorList}"/></td>
    </tr>
    <tr>
    	<td><label>Tables Name:</label></td>
    	<td><form:input path="tablename" id="tablename"  /></td>
    </tr>
    <tr>
    	<td><label>Capacity:</label></td>
    	<td><form:input path="capacity" id="capacity"  /></td>
    </tr>
    <tr>
    	<td><input type="submit" value="ADD"/></td>
	</tr>
	</table>
	</form:form>
</div>
</body>