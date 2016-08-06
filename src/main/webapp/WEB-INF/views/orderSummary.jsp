<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<div id="main">
  <div id="header">
<%@include file="header.jsp" %>
</div>
<div id="body">

	<div class="content">
			<fieldset>
				<legend>SUMMARY PAGE </legend>
				<!-- for triggering webflow events using links,
					 the eventId to be triggered is given in "href" attribute as:
				 -->
				<a href="${flowExecutionUrl}&_eventId_home">Home</a><br /><br />
				<sf:form modelAttribute="product">
					<sf:label path="id">UserName:</sf:label>${product.pid}
					<br /><br />
					<sf:label path="name">Email Id:</sf:label>${product.name}
					<br /><br />
					<sf:label path="brand">Age :</sf:label>${product.brand}
					<br /><br />
					<!-- for triggering webflow events using form submission,
					 the eventId to be triggered is given in "name" attribute as:
					-->
				 
					<input name="_eventId_submit" type="submit" value="Confirm details" /><br />
				</sf:form>
			</fieldset>
		</div>
	

</div>

<div id="footer">

<%@include file="footer.jsp" %>
</div>

</div>