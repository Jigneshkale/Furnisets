
<%@ include file="/WEB-INF/views/templates/header.jsp"%>
<div id="div7">
	<div id="div8">
		<div class="container-fluid">
			<form class="form-horizontal" action="loggedin" method="post">
				<div class="row" id="rw0">
					<div class="form-group">
						<div class="col-md-12">
							<div class="text-center">
								<div class="h2">Login</div>
							</div>
						</div>
					</div>
					<div class="form-group">
						<div class="col-md-3">
							<label class="control-label">Name</label>
						</div>
						<div class="col-md-9">
							<input type="text" id="inputEmail" placeholder="Email"
								class="form-control" name="log_name">
						</div>
					</div>
					<div class="form-group">
						<div class="col-md-3">
							<label class="control-label">Password</label>
						</div>
						<div class="col-md-9">
							<input type="password" class="form-control" id="inputPassword"
								placeholder="Password" name="log_pass">
						</div>
					</div>
					<div class="form-group">
						<div class="col-md-offset-3 col-md-9">
							<button type="submit" class="btn btn-default">Sign in</button>
						</div>
					</div>
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
					${register0}<br /> ${register1}<br />
				</h3>
			</div>
			<div class="col-md-1"></div>
		</div>
	</div>
</div>
<%@ include file="/WEB-INF/views/templates/footer.jsp"%>
