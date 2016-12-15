<%@ include file="/WEB-INF/views/templates/header.jsp"%>

<div id="div9">
	<div id="div10">
		<div class="container-fluid">
			<table class="table table-hover" id="tab0">
				<tr>
					<th>Id</th>
					<th>Product Name</th>
					<th>Product Price</th>
					<th>Quantity</th>
					<th>Category</th>
					<th>Sub-Category</th>
					<th>Further-Category</th>
					<th>Description</th>
					<th>Edit</th>
					<th>Delete</th>
				</tr>
				<c:forEach var="prod" items="${productList}">
					<tr>
						<td>${prod.id}</td>
						<td>${prod.productName}</td>
						<td>${prod.price}</td>
						<td>${prod.quantity}</td>
						<td>${prod.catagory}</td>
						<td>${prod.subCatagory}</td>
						<td>${prod.furtherCatagory}</td>

						<th><div class="dd">
								<span>More Info</span>
								<div class="dd1">
									<p>${prod.description}</p>
								</div>
							</div></th>

						<td><a href="editprod?id=${prod.id}">Edit</a></td>
						<td><a href="delete?id=${prod.id}">Delete</a></td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</div>
</div>
<%@ include file="/WEB-INF/views/templates/footer.jsp"%>