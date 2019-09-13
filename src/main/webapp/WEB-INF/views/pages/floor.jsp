 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
 
<body><br/><br/>
<div align="center">
	<h1>FLOOR TABLE</h1><hr/>
	<form:form method="POST" modelAttribute="floor">
    <form:input type="hidden" path="id" id="id"/>
    <form:input type="hidden" path="floorid" id="floorid"/>
    <table>
	<tr>
	<!-- load the ESTABLISHMENT from the database  -->
		<td><label>Establishment Name: </label> </td>
    	<td><form:select path="estname" items="${establishmentList}"/></td>
    </tr>
    <tr>
    	<td><label>Floor Name: </label> </td>
    	<td><form:input path="floorname" id="floorname"  /></td>
    </tr>
    <tr>
    	<td><input type="submit" value="ADD"/></td>
    </tr>
    </table>
	</form:form>
</div>
</body>