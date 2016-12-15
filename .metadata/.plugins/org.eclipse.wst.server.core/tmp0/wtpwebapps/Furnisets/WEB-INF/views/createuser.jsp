<%@ include file="/WEB-INF/views/templates/header.jsp"%>
<div id="div5">
	<div id="div6">
		<div class="container-fluid">
			<form:form class="form-horizontal" action="add_u" method="post"
				modelAttribute="reg" id="for1">
				<div class="row" id="rw0">
					<div class="form-group">
						<div class="col-md-12">
							<div class="text-center">
								<div class="h2">Register</div>
							</div>
						</div>
					</div>
					<div class="form-group">
						<div class="col-md-3">
							<form:label path="firstName" id="lab0" cssClass="control-label">First Name</form:label>
						</div>
						<div class="col-md-9">
							<form:input path="firstName" name="U_first"
								placeholder="First Name" class="form-control" />
						</div>
					</div>
					<div class="form-group">
						<div class="col-md-3">
							<form:label path="lastName" id="lab0" class="control-label">Last Name</form:label>
						</div>
						<div class="col-md-9">
							<form:input path="lastName" type="text" name="U_last"
								placeholder="Last Name" class="form-control" />
						</div>
					</div>
					<div class="form-group">
						<div class="col-md-3">
							<form:label path="userName" id="lab0" class="control-label">Username</form:label>
						</div>
						<div class="col-md-9">
							<form:input path="userName" type="text" name="U_name"
								placeholder="username" class="form-control" />
						</div>
					</div>
					<div class="form-group">
						<div class="col-md-3">
							<form:label path="number" id="lab0" class="control-label">Mobile</form:label>
						</div>
						<div class="col-md-9">
							<form:input path="number" type="text" class="form-control"
								name="U_number" placeholder="Mobile" />
						</div>
					</div>
					<div class="form-group">
						<div class="col-md-3">
							<form:label path="email" class="control-label">Email</form:label>
						</div>
						<div class="col-md-9">
							<form:input path="email" type="text" class="form-control"
								name="U_email" placeholder="Email" />
						</div>
					</div>
					<div class="form-group">
						<div class="col-md-3">
							<form:label path="password" id="lab0" class="control-label">Password</form:label>
						</div>
						<div class="col-md-9">
							<form:input path="password" type="password" class="form-control"
								name="U_pass" placeholder="Password" />
						</div>
					</div>
					<!-- 					<div class="form-group"> -->
					<!-- 												<div class="col-md-3"> -->
					<%-- 													<form:label path="" id="lab0" class="control-label">Re-enter Password</form:label> --%>
					<!-- 												</div> -->
					<!-- 												<div class="col-md-3"></div> -->
					<!-- 												<div class="col-md-9"> -->
					<%-- 													<form:input path="" type="password" class="form-control" name="U_r_pass" --%>
					<%-- 														placeholder="Re-enter Password"> --%>
					<%-- 												</div> --%>
					<!-- 											</div> -->
					<div class="form-group">
						<div class="col-md-offset-3 col-md-2">
							<button type="submit" class="btn btn-default">Register</button>
						</div>
						<div class="col-md-offset-1 col-md-6">
							<button type="reset" class="btn btn-default">Reset</button>
						</div>
					</div>
				</div>
			</form:form>
		</div>
	</div>
	<div id="div11">
		<div class="row">
			<div class="col-md-1"></div>
			<div class="col-md-10">
				<h3 class="text-center"
					style="width: 100%; font-size: auto; color: #ffffff; text-shadow: 0px 0px 10px #000000;">
					${register0}<br /> ${register1}<br />
				</h3>
			</div>
			<div class="col-md-1"></div>
		</div>
	</div>
</div>
<%@ include file="/WEB-INF/views/templates/footer.jsp"%>