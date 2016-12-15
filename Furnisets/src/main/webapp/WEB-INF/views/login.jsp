
<%@ include file="/WEB-INF/views/templates/header.jsp"%>
<div id="div7">
	<div id="div8">
		<div class="container-fluid">
			<form class="form-horizontal">
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
							<label class="control-label">Email</label>
						</div>
						<div class="col-md-9">
							<input type="email" id="inputEmail" placeholder="Email"
								class="form-control">
						</div>
					</div>
					<div class="form-group">
						<div class="col-md-3">
							<label class="control-label">Password</label>
						</div>
						<div class="col-md-9">
							<input type="password" class="form-control" id="inputPassword"
								placeholder="Password">
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
</div>
<%@ include file="/WEB-INF/views/templates/footer.jsp"%>
