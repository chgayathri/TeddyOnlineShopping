<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
   pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
  <!DOCTYPE html>
<html lang="en">
<head>
<style type="text/css">
.img-rounded
{

}
</style>
<title>Web App</title>
<meta name="viewport" content="width-device-width,initial -scale=1">
<meta charset="utf-8">
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
 <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" ></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<meta name="viewport" content="width-device-width,  initial -scale=1">
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<jsp:include page="header.jsp"></jsp:include>
<body>
<div class= "container">
<h2><i>MedicalStore</i></h2> 
<div id="Slide Images" class="carousel slide" data-ride="carousel">
<ol class="carousel-indicators">
<li data-target="#Slide Images" data-slide-to="0" class="active"></li>
<li data-target="#Slide Images" data-slide-to="1" class="active"></li>
<li data-target="#Slide Images" data-slide-to="2" class="active"></li>
</ol>

<div class="carousel-inner">
<div class="item active">
<img class="img-rounded" class="img-responsive center-block" 
src="resources/med1.jpg" style="width:100%">
</div>

<div class="item">
<img class="img-rounded" class="img-responsive center-block" 
src="resources/med2.jpg" style="width:100%">
</div>

<div class="item">
<img class="img-rounded" class="img-responsive center-block" 
src="resources/med3.jpg" style="width:100%">
</div>
</div>

<a class="left carousel-control" href="#Slide Images" data-slide="prev">
<span class="glyphicon glyphicon-chevron-left"></span> 
<span class="sr-only">Previous</span>
</a>

<a class="right carousel-control" href="#Slide Images" data-slide="prev">
<span class="glyphicon glyphicon-chevron-right"></span> 
<span class="sr-only">Next</span>
</a>
</div>
</div>
</body></html>
