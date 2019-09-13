 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
 
 <body>
 <div align="center">
 	<h1>L2 MENU</h1><hr>

<form:form method="POST" modelAttribute="l2menu">
    <form:input type="hidden" path="id" id="id"/>
    <form:input type="hidden" path="l2id" id="l2id"/>
    <table>
    <tr>
	    <td><label>Select Menu Master: </label></td>
	    <td><form:select path="menumaster" items="${menumasterList}"/></td>
	 </tr>
	 <tr>
	 	<td><label>Select L1 Menu: </label></td>
	 	<td><form:input path="l1name" id="${l1List}"  /></td>
	 </tr>
	 <tr>
	 	<td><label>L2 Menu Name: </label></td>
	 	<td><form:input path="l2name" id="l2name"  /></td>
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