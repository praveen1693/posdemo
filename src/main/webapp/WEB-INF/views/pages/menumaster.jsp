<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<body >
<br/>
<br/>
<div align="center">
    <h1>MENU MASTER</h1><hr/>
    <form:form method="POST" modelAttribute="menumaster">
    <form:input type="hidden" path="id" id="id"/>
    
    <table>
    	<tr>
    	<td><label>Menu Master ID:</label></td>
    	<td><form:input path="menumasterid" id="menumasterid"/></td>
    	</tr>
    	<tr>
    		<td><label>Menu Master Name: </label> </td>
    		<td><form:input path="menumaster" id="menumaster"  /></td>
    	</tr>
   
    	<tr>
    		<td><input type="submit" value="ADD"/></td>
    	</tr>
    </table>
   </form:form>
    <!-- load the MENU MASTER from the database  -->
    <label>Existing Menu Masters: </label>
    <table>
    <c:forEach items="${menumasterList}" var="mmlist">
    <tr><td>${mmlist.menumaster}</td></tr>
    </c:forEach>
    </table>
    
</div>	
</body>