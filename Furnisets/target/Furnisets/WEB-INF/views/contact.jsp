<%@ include file="/WEB-INF/views/templates/header.jsp"%>

<div id="div3">
	<div id="div4">
		<div class="container-fluid">
			<form class="form-horizontal" action="sendcontact" method="post"
				id="form0">
				<div class="row" id="rw0">
				<div class="form-group">
						<div class="col-md-12">
							<div class="text-center">
								<div class="h2">Contact Us</div>
							</div>
						</div>
					</div>
					<div class="form-group">
						<div class="col-md-3">
							<label class="control-label">Name</label>
						</div>
						<div class="col-md-9">
							<input type="text" name="c_name" placeholder="Name"
								class="form-control">
						</div>
					</div>
					<div class="form-group">
						<div class="col-md-3">
							<label class="control-label">Mobile</label>
						</div>
						<div class="col-md-9">
							<input type="text" class="form-control" name="c_number"
								placeholder="Mobile">
						</div>
					</div>
					<div class="form-group">
						<div class="col-md-3">
							<label class="control-label">Email</label>
						</div>
						<div class="col-md-9">
							<input type="text" class="form-control" name="c_email"
								placeholder="Email">
						</div>
					</div>
					<div class="form-group">
						<div class="col-md-3">
							<label class="control-label">Suggestion</label>
						</div>
						<div class="col-md-9">
							<textarea rows="3" cols="5" class="form-control" name="c_sugg"
								placeholder="Suggestion"></textarea>
						</div>
					</div>
					<div class="form-group">
						<div class="col-md-3"></div>
						<div class="col-md-9">
							<p>We shall contact you as soon as possible.</p>
						</div>
					</div>
					<div class="form-group">
						<div class="col-md-offset-3 col-md-9">
							<button type="submit" class="btn btn-default">Submit</button>
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
				<h3 class="text-center" style="width: 100%; font-size: auto; color: #ffffff; text-shadow: 0px 0px 10px #000000;">
					${success}<br /> ${success1}<br /> ${success2}<br />
				</h3>
			</div>
			<div class="col-md-1"></div>
		</div>
	</div>
</div>
<%@ include file="/WEB-INF/views/templates/footer.jsp"%>