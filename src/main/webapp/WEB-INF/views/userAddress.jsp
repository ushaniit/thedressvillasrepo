<style>

.wrapper {
	margin-top: 80px;
	margin-bottom: 80px;
}
.form-signin {
	max-width: 580px;
	padding: 15px 35px 45px;
	margin: 0 auto;
	background-color: #f4f7f8;
	border: 1px solid rgba(0, 0, 0, 0.1);
}
.form-signin-heading {
	margin-bottom: 30px;
}
</style>



<div id="header">
	<%@ include file="header.jsp"%>
</div>
<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>

<div>
	<p>&nbsp;</p>
	<p>&nbsp;</p>
	<p>&nbsp;</p>
	<p>&nbsp;</p>

</div>
<div class="container">
	<div class="row">

		<div class="col-md-2"></div>
		<div class="col-md-8">



			<sf:form class="form-signin" modelAttribute="uaddress">

				<h2 class="form-signin-heading btn-info" style="width: 100%">Billing
					Address</h2>
				<table class="table">
					<tr>
						<td><form:label path="cname">
								<spring:message text="Customer Name" />
							</form:label></td>
						<td><form:input path="cname" style="width:150px;"
								class="form-control" /></td>
								<form:input type="hidden" path="cname"></form:input>
						<td><form:errors path="cname" /></td>
					</tr>

					<tr>
						<td><form:label path="caddress">
								<spring:message text="Address" />
							</form:label></td>
						<td><form:input path="caddress" style="width:150px;"
								class="form-control" /><form:input type="hidden" path="caddress"></form:input></td>
						<td><form:errors path="caddress" /></td>
					</tr>

					<tr>
						<td><form:label path="mobile">
								<spring:message text="Mobile" />
							</form:label></td>
						<td><form:input path="mobile" style="width:150px;"
								class="form-control" /><form:input type="hidden" path="mobile"></form:input></td>
						<td><form:errors path="mobile" /></td>
					</tr>
					
						<tr>
						<td><form:label path="zipcode">
								<spring:message text="Zipcode" />
							</form:label></td>
						<td><form:input path="zipcode" style="width:150px;"
								class="form-control" /></td>
						<td><form:errors path="zipcode" /></td>
					</tr>
					

				

				</table>

				<div class="row">
					<div class="col-md-2">
						<input class="btn btn-info" name="_eventId_edit" type="submit"
							value="Prev" />
					</div>
					<div class="col-md-8"></div>
					<div class="col-md-2">
						<input class="btn btn-info" name="_eventId_submit" type="submit"
							value="Next" />
					</div>
				</div>
			</sf:form>



		</div>

	</div>

</div>

<p>&nbsp;</p>
<p>&nbsp;</p>
<p>&nbsp;</p>

<div id="footer">
	<%@ include file="footer.jsp"%>
</div>