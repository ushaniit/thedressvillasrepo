<%@include file="header.jsp"%>
<br><br>
<br>
<div class="container central">
				 <h2 class="add-user-heading">REGISTRATION PAGE</h2>
				<form:form action="register" commandName="user" modelAttribute="user">
			
		<div class="row">
			<div class=col-xs-4><form:label path="username"><spring:message text="Name"/></form:label></div>
			<div class=col-xs-6><form:input path="username"/></div>
			<div class=col-xs-2><form:errors path="username" cssStyle="color: #ff0000;"/></div>
		</div>
			<div class="row">
			<div class=col-xs-4><form:label path="password"><spring:message text="Password"/></form:label></div>
			<div class=col-xs-6><form:input path="password"/></div>
			<div class=col-xs-2><form:errors path="password" cssStyle="color: #ff0000;"/></div>
		</div>
			<div class="row">
			<div class=col-xs-4><form:label path="role"><spring:message text="Role"/></form:label></div>
			<div class=col-xs-6><form:input path="role"/></div>
           <div class=col-xs-2><form:errors path="role" cssStyle="color: #ff0000;"/></div>
		</div>
			<div class="row">
			<div class=col-xs-4><form:label path="phone"><spring:message text="Phone"/></form:label></div>
			<div class=col-xs-6><form:input path="phone"/></div>
			<div class=col-xs-2><form:errors path="phone" cssStyle="color: #ff0000;"/></div>
		</div>
		<div class="row">
			<div class=col-xs-4><form:label path="address"><spring:message text="address"/></form:label></div>
			<div class=col-xs-6><form:input path="address"/></div>
			<div class=col-xs-2><form:errors path="address" cssStyle="color: #ff0000;"/></div>
		</div>
		<div class="row">
			<div class=col-xs-4><form:label path="email"><spring:message text="email"/></form:label></div>
			<div class=col-xs-6><form:input path="email"/></div>
			<div class=col-xs-2><form:errors path="email" cssStyle="color: #ff0000;"/></div>
		</div>
		
		<br>
		
		<div class="row">
			<div class=col-xs-4></div>
		    <div class=col-xs-6><input type="submit" value="<spring:message text="ADD USER"/>"></div>
		    
		</div>
	
</form:form>
</div>
<div id="footer">
<%@include file="footer.jsp" %>
</div>