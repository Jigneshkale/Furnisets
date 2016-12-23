<%@ include file="/WEB-INF/views/templates/header.jsp"%>
<div id="carousel-example-generic" class="carousel slide"
	data-ride="carousel">
	<!-- Indicators -->
	<ol class="carousel-indicators">
		<li data-target="#carousel-example-generic" data-slide-to="0"
			class="active"></li>
		<li data-target="#carousel-example-generic" data-slide-to="1"></li>
		<li data-target="#carousel-example-generic" data-slide-to="2"></li>
		<li data-target="#carousel-example-generic" data-slide-to="3"></li>
	</ol>

	<!-- Wrapper for slides -->
	<div class="carousel-inner" role="listbox" id="div2">
		<div class="item active">
			<img src="<c:url value="/source/images/Modern.jpg"/>" alt="Modern">
			<div class="carousel-caption">Modern</div>
		</div>
		<div class="item">
			<img src="<c:url value="/source/images/Simple.jpg"/>" alt="Simple">
			<div class="carousel-caption">Simple</div>
		</div>
		<div class="item">
			<img src="<c:url value="/source/images/Royal.jpg"/>" alt="Royal">
			<div class="carousel-caption">Royal</div>
		</div>
		<div class="item">
			<img src="<c:url value="/source/images/Vintage.jpg"/>" alt="Vintage">
			<div class="carousel-caption">Vintage</div>
		</div>
	</div>

	<!-- Controls -->
	<a class="left carousel-control" href="#carousel-example-generic"
		role="button" data-slide="prev" id="a0"> <span
		class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span> <span
		class="sr-only">Previous</span>
	</a> <a class="right carousel-control" href="#carousel-example-generic"
		role="button" data-slide="next" id="a1"> <span
		class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span> <span
		class="sr-only">Next</span>
	</a>
</div>
<div>
	<div id="div13">
	
	</div>
	<div id="div14">
	
	</div>
</div>

<%@ include file="/WEB-INF/views/templates/footer.jsp"%>
