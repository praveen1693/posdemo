<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<body background-image: url("/static/img/img1.jpg");>
<br/>
<br/>
<div align="center">
    <h1>ESTABLISHMENT TABLE</h1><hr/>
    <form:form method="POST" modelAttribute="establishment">
    <form:input type="hidden" path="id" id="id"/>
    <form:input type="hidden" path="estid" id="estid"/>
    <table>
    	<tr>
    		<td><label>Establishment Name: </label> </td>
    		<td><form:input path="estname" id="estname"  /></td>
    	</tr>
    <!-- load the MENU MASTER from the database  -->
    	<tr>
    		<td><label>Menu Master Name: </label> </td>
    		<td><form:select path="menumaster" items="${menumasterList}"/></td>
    	</tr>
    	<tr>
    		<td><input type="submit" value="ADD"/></td>
    	</tr>
    </table>
    </form:form>
</div>	
</body>