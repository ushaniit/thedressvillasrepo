<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.tg {
	border-collapse: collapse;
	border-spacing: 0;
	border-color: #ccc;
}

.tg td {
	font-family: Arial, sans-serif;
	font-size: 14px;
	padding: 10px 5px;
	border-style: solid;
	border-width: 1px;
	overflow: hidden;
	word-break: normal;
	border-color: #ccc;
	color: #333;
	background-color: #fff;
}

.tg th {
	font-family: Arial, sans-serif;
	font-size: 14px;
	font-weight: normal;
	padding: 10px 5px;
	border-style: solid;
	border-width: 1px;
	overflow: hidden;
	word-break: normal;
	border-color: #ccc;
	color: #333;
	background-color: #f0f0f0;
}

.tg .tg-4eph {
	background-color: #f9f9f9
}
</style>

</head>
<body>
	<c:url var="addAction" value="/admin/add" ></c:url>
	<form:form action="${addAction}" commandName="product" modelAttribute="product" method="POST" enctype="multipart/form-data">

		<table>

			<c:if test="${!empty product.name}">
				<tr>
					<td><form:label path="pid">
							<spring:message text="pid" />
						</form:label></td>
					<td><form:input path="pid" readonly="true" size="8"
							disabled="true" /> <form:hidden path="pid" /></td>
				</tr>
			</c:if>

			<tr>
				<td><form:label path="name">
						<spring:message text="name" />
					</form:label></td>
				<td><form:input path="name" /></td>
				<td><form:errors path="name" cssStyle="color: #ff0000;"/></td>
			</tr>
			<tr>
				<td><form:label path="brand">
						<spring:message text="brand" />
					</form:label></td>
				<td><form:input path="brand" /></td>
				 <td><form:errors path="brand" cssStyle="color: #ff0000;"/></td>
				
			</tr>

			<tr>
				<td><form:label path="desc">
						<spring:message text="desc" />
					</form:label></td>
				<td><form:input path="desc" /></td>
				<td><form:errors path="desc" cssStyle="color: #ff0000;"/></td>
			</tr>
			<tr>
				<td><form:label path="cartegory">
						<spring:message text="cartegory" />
					</form:label></td>
				<td><form:input path="cartegory" /></td>
				<td><form:errors path="cartegory" cssStyle="color: #ff0000;"/></td>
			</tr>
			<tr>
				<td><form:label path="price">
						<spring:message text="price" />
					</form:label></td>
				<td><form:input path="price" /></td>
				 <td><form:errors path="price" cssStyle="color: #ff0000;"/></td>
				
			</tr>

			<tr>
				<td><form:label path="img">
						<spring:message text="Please select a image to upload a image" />
					</form:label></td>
				<td><form:input path="img" type="file" /></td>
			</tr>

			<tr>
				<td colspan="2">
				<c:if test="${!empty product.name}">
						<input type="submit" value="<spring:message text="Edit"/>" />
					</c:if>
					<c:if test="${empty product.name}">
						<input type="submit" value="<spring:message text="Add"/>" />
						</c:if>
					</td>
			</tr>
		
		</table>


	</form:form>
	<br>
<br>
<h3>Products List</h3>
<c:if test="${!empty listProducts}">
    <table class="tg">
    <tr>
        <th width="80">Product ID</th>
        <th width="120">Product Name</th>
        <th width="120">Brand</th>
        <th width="60">Description</th>
        <th width="60">Cartegory</th>
       <th width="60">price</th>

    </tr>
    <c:forEach items="${listProducts}" var="product">
        <tr>
            <td>${product.pid}</td>
            <td>${product.name}</td>
            <td>${product.brand}</td>
	<td>${product.desc}</td>
	<td>${product.cartegory}</td>
	<td>${product.price}</td>
            <td><a href="<c:url value='/edit/${product.pid}' />" >Edit</a></td>
            <td><a href="<c:url value='/remove/${product.pid}' />" >Delete</a></td>
        </tr>
    </c:forEach>
    </table>
</c:if>

</body>
</html>