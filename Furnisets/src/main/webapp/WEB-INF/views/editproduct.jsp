<%@ include file="/WEB-INF/views/templates/header.jsp"%>

<div id="div9">
	<div id="div10">
		<div class="container-fluid">
			<form:form cssClass="form-horizontal"
				action="update?id=${product.id}" method="post"
				modelAttribute="product" id="for1">
				<div class="row" id="rw0">

					<div class="form-group">
						<div class="col-md-12">
							<div class="text-center">
								<div class="h2">Edit Product</div>
							</div>
						</div>
					</div>
					<div class="form-group">
						<div class="col-md-3">
							<form:label path="id" id="lab0" cssClass="control-label">Id</form:label>
						</div>
						<div class="col-md-9">
							<form:input path="id" placeholder="Product ID"
								cssClass="form-control" disabled="true" />
						</div>
					</div>

					<div class="form-group">
						<div class="col-md-3">
							<form:label path="productName" id="lab0" cssClass="control-label">Name</form:label>
						</div>
						<div class="col-md-9">
							<form:input path="productName" placeholder="Product Name"
								cssClass="form-control" />
						</div>
					</div>
					<div class="form-group">
						<div class="col-md-3">
							<form:label path="price" id="lab0" cssClass="control-label">Price</form:label>
						</div>
						<div class="col-md-9">
							<form:input path="price" placeholder="Product Price"
								cssClass="form-control" />
						</div>
					</div>
					<div class="form-group">
						<div class="col-md-3">
							<form:label path="quantity" id="lab0" cssClass="control-label">Quantity</form:label>
						</div>
						<div class="col-md-9">
							<form:input path="quantity" placeholder="Product Quantity"
								cssClass="form-control" />
						</div>
					</div>
					<div class="form-group">
						<div class="col-md-3">
							<form:label path="catagory" cssClass="control-label">Category</form:label>
						</div>
						<div class="col-md-9">
							<form:input cssClass="form-control" path="catagory"
								placeholder="Category" />
						</div>
					</div>
					<div class="form-group">
						<div class="col-md-3">
							<form:label path="subCatagory" id="lab0" cssClass="control-label">Sub-Category</form:label>
						</div>
						<div class="col-md-9">
							<form:input cssClass="form-control" path="subCatagory"
								placeholder="Sub-Category" />
						</div>
					</div>
					<div class="form-group">
						<div class="col-md-3">
							<form:label path="furtherCatagory" id="lab0"
								cssClass="control-label">Further-Category</form:label>
						</div>
						<div class="col-md-3"></div>
						<div class="col-md-9">
							<form:input cssClass="form-control" path="furtherCatagory"
								placeholder="Further-Category" />
						</div>
					</div>
					<div class="form-group">
						<div class="col-md-3">
							<form:label path="description" id="lab0" cssClass="control-label">Description</form:label>
						</div>
						<div class="col-md-9">
							<form:textarea rows="3" cols="5" cssClass="form-control"
								path="description" placeholder="Description" />
						</div>
					</div>
					<div class="form-group">
						<div class="col-md-3">
							<form:label path="image" id="lab0" cssClass="control-label">Image</form:label>
						</div>
						<div class="col-md-3"></div>
						<div class="col-md-9">
							<form:input type="file" cssClass="form-control" path="image"
								placeholder="Further-Category" />
						</div>
					</div>
					<div class="form-group">
						<div class="col-md-offset-3 col-md-2">
							<button type="submit" class="btn btn-default">Update</button>
						</div>
						<div class="col-md-offset-1 col-md-6">
							<button type="reset" class="btn btn-default">Reset</button>
						</div>
					</div>
				</div>
			</form:form>
		</div>
	</div>
</div>
<%@ include file="/WEB-INF/views/templates/footer.jsp"%>