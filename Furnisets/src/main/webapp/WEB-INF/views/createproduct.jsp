<%@ include file="/WEB-INF/views/templates/header.jsp"%>

<div id="div9">
	<div id="div10">
		<div class="container-fluid">
			<form:form cssClass="form-horizontal" action="add" method="post"
				modelAttribute="prod" enctype="multipart/form-data" id="for1">
				<div class="row" id="rw0">

					<div class="form-group">
						<div class="col-md-12">
							<div class="text-center">
								<div class="h2">Create New Product</div>
							</div>
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
							<form:select cssClass="form-control" path="catagory"
								placeholder="Category">
								<form:option value="Living Room">Living Room</form:option>
								<form:option value="Bed Room">Bed Room</form:option>
								<form:option value="Kitchen and Dining">Kitchen and Dining</form:option>
								<form:option value="Study Room">Study Room</form:option>
								<form:option value="Hall">Hall</form:option>
								</form:select>
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
							<button type="submit" class="btn btn-default">Create</button>
						</div>
						<div class="col-md-offset-1 col-md-6">
							<button type="reset" class="btn btn-default">Reset</button>
						</div>
					</div>
				</div>
			</form:form>
			<form>
			
            <select name="category" class="required-entry" id="category" onchange="javascript: dynamicdropdown(this.options[this.selectedIndex].value);">
                <option value="">Select Language</option>
                <option value="Php">Php</option>
                <option value="Java">Java</option>
                <option value="Javascript">Javascript</option>
                <option value="Dotnet">Dotnet</option>
            </select>
            <script type="text/javascript" language="JavaScript">
                document.write('<select name="subcategory" id="subcategory" onchange="javascript: dynamicdropdownone(this.options[this.selectedIndex].value);"><option value="">Please select framework</option></select>')
            </script>
            <noscript>
                <select name="subcategory" id="subcategory" >
                    <option value="">Please select framework vesrion</option>
                </select>
            </noscript>
            <script type="text/javascript" language="JavaScript">
                document.write('<select name="sub_subcategory" onchange="javascript: urlRedirectTo(this.options[this.selectedIndex].value);" id="sub_subcategory"><option value="">Please select framework version</option></select>')
            </script>
            <noscript>
                <select name="sub_subcategory" id="sub_subcategory" >
                    <option value="">Please select framework vesrion</option>
                </select>
            </noscript>
        </div>
			
			</form>
		</div>
	</div>
	<div id="div11">
		<div class="row">
			<div class="col-md-1"></div>
			<div class="col-md-10">
				<h3 class="text-center"
					style="width: 100%; font-size: auto; color: #ffffff; text-shadow: 0px 0px 10px #000000;">
					${product0}<br /> ${product1}<br />
				</h3>
			</div>
			<div class="col-md-1"></div>
		</div>
	</div>
</div>
<%@ include file="/WEB-INF/views/templates/footer.jsp"%>