<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
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
<script language="javascript" type="text/javascript">
	function urlRedirectTo(obj) {
		//if('wordpress_version1' == obj)
		//window.location = 'https://wordpress.org/download/';
		//if('wordpress_version2' == obj)
		//window.location = 'https://wordpress.org/download/';
	}
	function dynamicdropdown(listindex) {
		document.getElementById("sub_subcategory").length = 0;
		document.getElementById("sub_subcategory").options[0] = new Option(
				"Please select framework version", "");
		document.getElementById("subcategory").length = 0;
		switch (listindex) {
		case "Php":
			document.getElementById("subcategory").options[0] = new Option(
					"Please select framework", "");
			document.getElementById("subcategory").options[1] = new Option(
					"Wordpress", "Wordpress");
			document.getElementById("subcategory").options[2] = new Option(
					"Magento", "Magento");
			break;

		case "Java":
			document.getElementById("subcategory").options[0] = new Option(
					"Please select framework", "");
			document.getElementById("subcategory").options[1] = new Option(
					"Strauts", "Strauts");
			document.getElementById("subcategory").options[2] = new Option(
					"Hibernate", "Hibernate");
			break;
		case "Javascript":
			document.getElementById("subcategory").options[0] = new Option(
					"Please select framework", "");
			document.getElementById("subcategory").options[1] = new Option(
					"Prototype", "Prototype");
			document.getElementById("subcategory").options[2] = new Option(
					"jQuery", "jQuery");
			break;
		case "Dotnet":
			document.getElementById("subcategory").options[0] = new Option(
					"Please select framework", "");
			document.getElementById("subcategory").options[1] = new Option(
					"VbScript", "VbScript");
			break;
		default:
			document.getElementById("subcategory").options[0] = new Option(
					"Please select framework", "");
			break;
		}
		return true;
	}

	function dynamicdropdownone(listindex) {
		document.getElementById("sub_subcategory").length = 0;
		switch (listindex) {
		case "Wordpress":
			document.getElementById("sub_subcategory").options[0] = new Option(
					"Please select framework", "");
			document.getElementById("sub_subcategory").options[1] = new Option(
					"Wordpress Version1", "wordpress_version1");
			document.getElementById("sub_subcategory").options[2] = new Option(
					"Wordpress Version2", "wordpress_version2");
			break;

		case "Magento":
			document.getElementById("sub_subcategory").options[0] = new Option(
					"Please select framework", "");
			document.getElementById("sub_subcategory").options[1] = new Option(
					"Magento Version1", "magento_version1");
			document.getElementById("sub_subcategory").options[2] = new Option(
					"Magento Version2", "magento_version2");
			break;
		case "Strauts":
			document.getElementById("sub_subcategory").options[0] = new Option(
					"Please select framework", "");
			document.getElementById("sub_subcategory").options[1] = new Option(
					"Strauts Version1", "strauts_version1");
			document.getElementById("sub_subcategory").options[2] = new Option(
					"Strauts Version2", "strauts_version2");
			break;

		case "Hibernate":
			document.getElementById("sub_subcategory").options[0] = new Option(
					"Please select framework", "");
			document.getElementById("sub_subcategory").options[1] = new Option(
					"Hibernate Version1", "hibernate_version1");
			document.getElementById("sub_subcategory").options[2] = new Option(
					"Hibernate Version2", "hibernate_version2");
			break;
		case "Prototype":
			document.getElementById("sub_subcategory").options[0] = new Option(
					"Please select framework", "");
			document.getElementById("sub_subcategory").options[1] = new Option(
					"Prototype Version1", "prototype_version1");
			document.getElementById("sub_subcategory").options[2] = new Option(
					"Prototype Version2", "prototype_version2");
			break;

		case "jQuery":
			document.getElementById("sub_subcategory").options[0] = new Option(
					"Please select framework", "");
			document.getElementById("sub_subcategory").options[1] = new Option(
					"jQuery Version1", "jquery_version1");
			document.getElementById("sub_subcategory").options[2] = new Option(
					"jQuery Version2", "jquery_version2");
			break;
		case "VbScript":
			document.getElementById("sub_subcategory").options[0] = new Option(
					"Please select framework", "");
			document.getElementById("sub_subcategory").options[1] = new Option(
					"VbScript Version1", "vbscript_version1");
			document.getElementById("sub_subcategory").options[2] = new Option(
					"VbScript Version2", "vbscript_version2");
			break;
		default:
			document.getElementById("sub_subcategory").options[0] = new Option(
					"Please select framework version", "");
			break;
		}
		return true;
	}
</script>
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
			<div class="row">
				<div class="col-sm-12">
					<p
						style="width: 100%; font-size: 140%; color: #9d9d9d; margin-bottom: 0px; margin-left: 2%;">
						${logintext}<br />${logintext1} ${username}<br />
					</p>
				</div>
			</div>
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
						data-toggle="dropdown" href="#">Product-Category<span
							class="caret"></span></a>
						<ul class="dropdown-menu" id="ul0">
							<li><a href="all">All Products</a></li>
							<li><a href="living?catagory=Living Room">Living Room</a></li>
							<li><a href="bed?catagory=Bed Room">Bed Room</a></li>
							<li><a href="k&d?catagory=Kitchen and Dining">Kitchen
									and Dining</a></li>
							<li><a href="study?catagory=Study Room">Study Room</a></li>
						</ul></li>
					<li><a href="tel">Contact Us</a></li>
					<li><a href="#">About Us</a></li>
					<sec:authorize access="hasRole('ROLE_ADMIN')">
						<li class="dropdown"><a class="dropdown-toggle"
							data-toggle="dropdown" href="#">Admin-functions<span
								class="caret"></span></a>
							<ul class="dropdown-menu" id="ul0">
								<li><a href="createprod">Add Product</a></li>
								<li><a href="retrive">View Product</a></li>
								<li><a href="retrive_u">View Users</a></li>
							</ul></li>


					</sec:authorize>
				</ul>
				<ul class="nav navbar-nav navbar-right">
					<li><a href="Signup"><span
							class="glyphicon glyphicon-user"></span> Sign Up</a></li>
					<li><a href="signin"><span
							class="glyphicon glyphicon-log-in"></span> Login</a></li>
					<li><a href="${pageContext.request.contextPath}/signout"><span
							class="glyphicon glyphicon-log-out"></span> Logout</a></li>
					<li><a href="Mybag"><span
							class="glyphicon glyphicon-shopping-cart"></span></a></li>
				</ul>
			</div>
		</div>
	</nav>