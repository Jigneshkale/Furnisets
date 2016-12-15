<%@ include file="/WEB-INF/views/templates/header.jsp"%>

<div id="div9">
	<div id="div10">
		<div class="container-fluid">
			<table class="table table-hover" id="tab0">
				<tr>
					<th>Id</th>
					<th>First Name</th>
					<th>Last Price</th>
					<th>User Name</th>
					<th>Mobile Number</th>
					<th>Email</th>
					<th>Password</th>
					<th>Edit</th>
					<th>Delete</th>
				</tr>
				<c:forEach var="reg" items="${registerList}">
					<tr>
						<td>${reg.id}</td>
						<td>${reg.firstName}</td>
						<td>${reg.lastName}</td>
						<td>${reg.userName}</td>
						<td>${reg.number}</td>
						<td>${reg.email}</td>
						<td>${reg.password}</td>

<!-- 						<th><div class="dd"> -->
<!-- 								<span>More Info</span> -->
<!-- 								<div class="dd1"> -->
<%-- 									<p>${reg.description}</p> --%>
<!-- 								</div> -->
<!-- 							</div></th> -->

						<td><a href="edituser?id=${reg.id}">Edit</a></td>
						<td><a href="delete_u?id=${reg.id}">Delete</a></td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</div>
</div>
<%@ include file="/WEB-INF/views/templates/footer.jsp"%>