<%@ include file="/WEB-INF/views/templates/header.jsp"%>

<div id="div9">
	<div id="div10">
		<div class="container-fluid">
			<table class="table table-hover" id="tab0">
				<tr>
					<th style="display:none;">Id</th>
					<th>Product Name</th>
					<th>Product Price</th>
					<th>Quantity</th>
					<th>Category</th>
					<th>Detail</th>
				</tr>
				<c:forEach var="prod1" items="${product1}">
					<tr>
						<td style="display:none;">${prod1.id}</td>
						<td>${prod1.productName}</td>
						<td>${prod1.price}</td>
						<td>${prod1.quantity}</td>
						<td>${prod1.catagory}</td>
						<td><a href="details?id=${prod1.id}">Detail</a></td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</div>
</div>
<%@ include file="/WEB-INF/views/templates/footer.jsp"%>