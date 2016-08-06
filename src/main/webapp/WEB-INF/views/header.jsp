<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@page isELIgnored="false" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="resources/bootstrap/css/bootstrap.min.css" rel="stylesheet">
  <script src="resources/bootstrap/js/jquery-2.2.3.min.js"></script>
  <script src="resources/bootstrap/js/bootstrap.min.js"></script>
       <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.5/angular.min.js"></script> 
<style type="text/css">
 .tg  {border-collapse:collapse;border-spacing:0;border-color:#ccc;}
        .tg td{font-family:Arial, sans-serif;font-size:14px;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#fff;}
        .tg th{font-family:Arial, sans-serif;font-size:14px;font-weight:normal;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#f0f0f0;}
        .tg .tg-4eph{background-color:#f9f9f9}
  .navbar
       {
       background:grey;
       }
      
       .navbar li a{
       color:blue !important;
       }
       .navbar li a:hover{
        
       font-weight: bold;
       }
       .item{
       max-width:100%;
  max-height:100%;
      
       }
       .item img{
       max-width:100%;
  max-height:100%;
  margin:auto;
 
      
       }
        table, th , td {
            border: 1px solid grey;
            border-collapse: collapse;
            padding: 5px;
         }
         
         table tr:nth-child(odd) {
            background-color: #f2f2f2;
         }
         
         table tr:nth-child(even) {
            background-color: #ffffff;
         }
       </style>
        <script>
      angular.module("mainApp", []).controller('productcontroller', function($scope){
    	     
    	      $scope.mus= <%=request.getAttribute("list")%>
    	        
    });
      </script>
       
      
</head>
<body>

<img alt="FormGet" src="resources/images/img21.jpg" height="100" width="100">

     
 <nav class="navbar navbar-static-top row header">
<div class="container-fluid">
     <ul class="nav navbar-nav col-xs-5">
      <li class="active"><a href="home">Home</a></li>
       <li><a href="product">Product</a></li>
           <li class="dropdown">
    <a class="dropdown-toggle" data-toggle="dropdown" href="product">Brands
    <span class="caret"></span></a>
    <ul class="dropdown-menu">
      <li><a href="rangmanch">Rangmanch</a></li>
      <li><a href="trisha">trisha</a></li>
      <li><a href="ajil">ajil</a></li> 
    </ul>
  </li>
      <li><a href="contactus">Contact Us</a></li> 
        <li><a href="aboutus">About Us</a></li>
    </ul>
    <div class="navbar-header col-xs-4" style="float: right">
      <ul class="nav navbar-nav" style="float: right">
     <li><a href="Register"> Register</a></li>
         <li><a href="Login">Sign In</a></li> 
    </ul>
    </div>
	</div>

</nav>