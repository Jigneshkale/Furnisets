<%@ include file="/WEB-INF/views/templates/header.jsp"%>

<div id="div9">
	<div id="div10">
		<div class="container-fluid">
	<img src="${pageContext.request.contextPath}/source/images/products/${product.productName}${product.id}.jpg"/>
			<p style="display:none;">${product.id}</p>
			<p>${product.productName}</p>
			<p>${product.price}</p>
			<p>${product.quantity}</p>
			<p>${product.catagory}</p>
			<p>${product.subCatagory}</p>
			<p>${product.furtherCatagory}</p>
			
			<p>${product.description}</p>
		</div>
	</div>
</div>
<%@ include file="/WEB-INF/views/templates/footer.jsp"%>