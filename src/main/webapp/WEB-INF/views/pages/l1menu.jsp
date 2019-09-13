 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
 
 <body>
 <div align="center">
 	<h1>L1 MENU</h1><hr>

<form:form method="POST" modelAttribute="l1menu">
    <form:input type="hidden" path="id" id="id"/>
    <form:input type="hidden" path="l1id" id="l1id"/>
    <table>
    <tr>
	    <td><label>Menu Master Name: </label></td>
	    <td><form:select path="menumaster" items="${menumasterList}"/></td>
	 </tr>
	 <tr>
	 	<td><label>L1 Menu Name: </label></td>
	 	<td><form:input path="l1name" id="l1name"  /></td>
	 </tr>
	 <tr>
	 	<td><label>Select Tax: </label></td>
	    <td><form:select path="taxrate" items="${taxList}"/></td>
	 </tr>
	 <tr>
	 	<td><input type="submit" value="ADD"/></td>
	 </tr>
 	</table>
 </form:form>
 </div>
  
 </body>