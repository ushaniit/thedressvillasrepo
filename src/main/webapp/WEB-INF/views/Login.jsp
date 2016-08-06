<%@ include file="header.jsp" %>
<div>
<div class="container">

<div style="text-align: center; font-size: 30px; font-weight: bold; font-family: ''segoe ui';'">
Login Page
</div>
           <div class="form-group row">
            <form action="perform-login" method="post">
                       <label for="UserName">User Name</label>
                       <input type="text" class="form-control" id="uname" name="username" value="" placeholder="User Name">
                    
                      <label for="Password">Password</label>
                        <input type="password" class="form-control" id="pass" name="password" value="" placeholder="password">
                
                      <button  type="submit" class="btn btn-primary">Login</button>
                      <button type="reset" class="btn btn-primary">Reset</button>
                      
                        <label for="Yet Not Registered"><a href="Register.jsp">Register Here</a></label>
                  
          </form>
        </div>
 </div>
 </div>
 
<%@ include file="footer.jsp" %>