<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<div id="main">
  <div id="header">
<%@include file="header.jsp" %>
</div>
<script>
function delete1(id)
{
window.location="http://localhost:8080/thedressvilla/delete/"+id;
}
</script>

<div id="body">
		 <div class="content">
			<fieldset>
				<legend>ORDER PAGE </legend>
				<!-- for triggering webflow events using links,
					 the eventId to be triggered is given in "href" attribute as:
				 -->
			
				<sf:form modelAttribute="cart" method="post">
				<table class="table">
				
				<thead>
					<tr>
				<th>	PRODUCT NAME</th>
				<th>	Brand </th>	
				<th>	CARTEGORY </th>
				<th>	Quantity</th>
				<th>	Amount </th>
				<th>    Delete order</th>
				</tr>
				</thead>
				<tbody>
				<c:forEach items="${sessionScope.cart.listItem}" var="product">>
				<c:set  var="sum" value="${sum+product.p.price*product.quantity}"/> 
			
				<tr>
				
				<td>${product.p.name}</td>
				<td>${product.p.brand}</td>
					
					<td>${product.p.cartegory}</td>
					<td>${product.quantity}</td>
					<td>${product.p.price*product.quantity}</td>
					<td><a class="btn btn-danger"
								href="<c:url value='${session.getContextPath()}/deletep/${product.p.pid}'/>">Delete <span class="glyphicon glyphicon-remove-sign"></span></a></td>
					</tr>
					</c:forEach>
					<tr>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
					<td>Total Amount </td>
					<td>${sum}</td>
					</tr>
					
					</tbody>
			</table>
					
					<div class="row">
					<div class="col-md-4"></div>
					<div class="col-md-4"></div>
					<div class="col-md-4">
				<input class="btn btn-info" name="_eventId_submit" type="submit" value="Next" />
					
					</div>
					</div>
				</sf:form>
				
			</fieldset>
		</div>
	
</div>

<div id="footer"><%@include file="footer.jsp" %></div>

</div>