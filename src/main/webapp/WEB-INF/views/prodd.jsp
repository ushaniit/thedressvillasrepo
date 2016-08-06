<%@ include file="header.jsp" %>


 <div class="container">
  <img src="resources/images/img24.jpg" />
  <p><font face="Algerian" color="blue" size="60"><%=request.getParameter("name")%></font></p>
      </div>
      
      
      <div class="container">
     <p align="right"><font face="Times new roman" size="20"> <%=request.getParameter("brand")%></font></p>
    <p align="right"><font size="20">  <%=request.getParameter("desc")%></font></p>
      <p align="right"><font size="20"><%=request.getParameter("price")%></font></p>
       <p align="right"><button type="submit" class="btn btn-primary"><span class="glyphicon glyphicon-shopping-cart"></span> Add to Cart</button></p>
       </div>


<%@ include file="footer.jsp" %>