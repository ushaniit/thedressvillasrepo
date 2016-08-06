<%@ include file="header.jsp" %>

  <div class="container">
  <img src="resources/images/img24.jpg" />
      <div ng-app ="mainApp" ng-controller = "productcontroller">
      <div  >
          <input type="text"   ng-model="searchinst">
          
                    
                       <div ng-repeat="items in mus | filter:searchinst">
                       <form action="productdetail" method="post" modelAttribute="product">
                                    <input type=text name="id" value="{{ items.pid }}">
                                    <input type=text name="name" value="{{items.name}}">
                                    <input type=text name="brand" value="{{items.brand}}">
                                   <input type=text name="cartegory" value="{{items.cartegory}}">
                                   <input type=text name="price" value="{{items.price}}">
                          
         <input type="submit" class="btn btn-default" class="glyphicon glyphicon-plus"/>
                                       
                                     <input type=hidden name="desc" value="{{items.desc}}">
                </form>
                                       
                                </div>
              
        </div> 
        </div>
      </div>
    

<%@ include file="footer.jsp" %>