<%@ include file="header.jsp" %>


 <div class="container">
  <img src="resources/images/img24.jpg" />
  <img src="resources/images/<%=request.getParameter("id")%>.jpg" class="image-responsive" height="300" width="300" border="1"/>
  <p><font face="Algerian" color="blue" size="60"><%=request.getParameter("name")%></font></p>
      </div>
      
      
      <div class="container">
     <p align="right"><font face="Times new roman" size="20"> <%=request.getParameter("brand")%></font></p>
    <p align="right"><font size="20">  <%=request.getParameter("desc")%></font></p>
      <p align="right"><font size="20"><%=request.getParameter("price")%></font></p>
       <p align="right">
       
       <!-- <button type="submit" name="_eventId_submit"  class="btn btn-primary"><span class="glyphicon glyphicon-shopping-cart"></span> Add to Cart</button> -->
       
       <a href="${pageContext.request.contextPath}/order/<%=request.getParameter("id")%>" role="button" name="_eventId_submit" 
  class="btn btn-lg btn-primary btn-full-width">add to cart
   <span class="glyphicon glyphicon-cart-in"></span>
       </a>
       
       </p>
       </div>


<%@ include file="footer.jsp" %>