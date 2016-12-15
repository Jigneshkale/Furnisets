<%@ include file="/WEB-INF/views/templates/header.jsp"%>

<div id="div9">
	<div id="div10">
		<div class="container-fluid">
			<form:form cssClass="form-horizontal" action="update_u?id=${register.id}" method="post"
				modelAttribute="register" id="for1">
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
							<form:label path="firstName" id="lab0" cssClass="control-label">First Name</form:label>
						</div>
						<div class="col-md-9">
							<form:input path="firstName" placeholder="Product Name"
								cssClass="form-control" />
						</div>
					</div>
					<div class="form-group">
						<div class="col-md-3">
							<form:label path="lastName" id="lab0" cssClass="control-label">Last Name</form:label>
						</div>
						<div class="col-md-9">
							<form:input path="lastName" placeholder="Product Price"
								cssClass="form-control" />
						</div>
					</div>
					<div class="form-group">
						<div class="col-md-3">
							<form:label path="userName" id="lab0" cssClass="control-label">User Name</form:label>
						</div>
						<div class="col-md-9">
							<form:input path="userName" placeholder="Product Quantity"
								cssClass="form-control" />
						</div>
					</div>
					<div class="form-group">
						<div class="col-md-3">
							<form:label path="number" cssClass="control-label">Mobile No.</form:label>
						</div>
						<div class="col-md-9">
							<form:input path="number" cssClass="form-control" 
								placeholder="Category" />
						</div>
					</div>
					<div class="form-group">
						<div class="col-md-3">
							<form:label path="email" id="lab0" cssClass="control-label">Email</form:label>
						</div>
						<div class="col-md-9">
							<form:input cssClass="form-control" path="email"
								placeholder="Sub-Category" />
						</div>
					</div>
					<div class="form-group">
						<div class="col-md-3">
							<form:label path="password" id="lab0"
								cssClass="control-label">Password</form:label>
						</div>
						<div class="col-md-3"></div>
						<div class="col-md-9">
							<form:input cssClass="form-control" path="password"
								placeholder="Further-Category" />
						</div>
					</div>
<!-- 					<div class="form-group"> -->
<!-- 						<div class="col-md-3"> -->
<%-- 							<form:label path="description" id="lab0" cssClass="control-label">Description</form:label> --%>
<!-- 						</div> -->
<!-- 						<div class="col-md-9"> -->
<%-- 							<form:textarea rows="3" cols="5" cssClass="form-control" --%>
<%-- 								path="description" placeholder="Description" /> --%>
<!-- 						</div> -->
<!-- 					</div> -->
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