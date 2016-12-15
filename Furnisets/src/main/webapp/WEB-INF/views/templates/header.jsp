<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE>
<html lang="en-US">
<html lang="en">
<head>
<title>Furnisets</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="shortcut icon"
	href="<c:url value="source/images/favicon.ico"/>" />
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/source/files/main.css" />
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script
	src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script type="text/javascript">
	var t1 = 0;
	window.onscroll = scroll1;

	function scroll1() {
		var toTop = document.getElementById('toTop');
		window.scrollY > 0 ? toTop.style.display = 'Block'
				: toTop.style.display = 'none';
	}
	function abcd() {
		var y1 = window.scrollY;
		y1 = y1 - 20;
		window.scrollTo(0, y1);
		if (y1 > 0) {
			t1 = setTimeout("abcd()", 0);
		} else {
			clearTimeout(t1);
		}
	}
</script>
</head>
<body>
	<div class="container-fluid" id="div0">
		<div class="row" id="div1">
			<div class="col-sm-4"></div>
			<div class="col-sm-4">
				<img class="img-responsive"
					src="<c:url value="source/images/logo.png"/>" alt="Furnisets"
					id="logo0" />
			</div>
			<div class="col-sm-4"></div>
		</div>
	</div>
	<nav class="navbar navbar-inverse">
		<div class="container-fluid">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target="#myNavbar" style="float: left; margin-left: 15px;">
					<span style="color: white;">Menu</span>
				</button>
			</div>
			<div class="collapse navbar-collapse" id="myNavbar">
				<ul class="nav navbar-nav">
					<li><a href="home">Home</a></li>
					<li class="dropdown"><a class="dropdown-toggle"
						data-toggle="dropdown" href="#">Product <span class="caret"></span></a>
						<ul class="dropdown-menu" id="ul0">
							<li><a href="#">Living Room</a></li>
							<li><a href="#">Bed Room</a></li>
							<li><a href="#">Kitchen and Dining</a></li>
							<li><a href="#">Study Room</a></li>
						</ul></li>
					<li><a href="tel">Contact Us</a></li>
					<li><a href="#">About Us</a></li>
					<li><a href="createprod">Add Product</a></li>
					<li><a href="retrive">View Product</a></li>
					<li><a href="retrive_u">View Users</a></li>
				</ul>
				<ul class="nav navbar-nav navbar-right">
					<li><a href="Signup"><span
							class="glyphicon glyphicon-user"></span> Sign Up</a></li>
					<li><a href="signin"><span
							class="glyphicon glyphicon-log-in"></span> Login</a></li>
				</ul>
			</div>
		</div>
	</nav>