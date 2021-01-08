<!DOCTYPE html>
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html;charset=ISO-8859-1">
<title>Edit technician details</title>
<meta name="description"
	content="Vali is a responsive and free admin theme built with Bootstrap 4, SASS and PUG.js. It's fully customizable and modular.">
<!-- Twitter meta-->
<meta property="twitter:card" content="summary_large_image">
<meta property="twitter:site" content="@pratikborsadiya">
<meta property="twitter:creator" content="@pratikborsadiya">
<!-- Open Graph Meta-->
<meta property="og:type" content="website">
<meta property="og:site_name" content="Vali Admin">
<meta property="og:title" content="Vali - Free Bootstrap 4 admin theme">
<meta property="og:url"
	content="http://pratikborsadiya.in/blog/vali-admin">
<meta property="og:image"
	content="http://pratikborsadiya.in/blog/vali-admin/hero-social.png">
<meta property="og:description"
	content="Vali is a responsive and free admin theme built with Bootstrap 4, SASS and PUG.js. It's fully customizable and modular.">
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- Main CSS-->
<link rel="stylesheet" type="text/css" href="css/main.css">
<!-- Font-icon css-->
<link rel="stylesheet" type="text/css"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<body>
	<!-- Navbar-->
	<%@ include file="include/header.jsp"%>
	<!-- //Navbar -->
	<!-- Sidebar menu-->
	<%@ include file="include/sidebar.jsp"%>
	<!-- //Sidebar -->
	<%@ page
		import="com.deo.techniciandeo,com.bean.technicianbean,com.servlet.technicianservlet,java.io.*"%>
	<%
		String techid = request.getParameter("techid");
		technicianbean techbean = techniciandeo.getRecordById(Integer.parseInt(techid));
	%>
	<main class="app-content">
	<div class="app-title">
		<div>
			<h1>
				<i class="fa fa-file-text-o"></i> Edit Technician details
			</h1>
		</div>
		<ul class="app-breadcrumb breadcrumb">
			<li class="breadcrumb-item"><i class="fa fa-home fa-lg"></i></li>
			<li class="breadcrumb-item"><a href="#">Edit Technician
					details</a></li>
		</ul>
	</div>
	<div class="row">
		<div class="col-md-12">
			<div class="tile">
				<section class="invoice">
					<div class="row invoice-info">
						<div class="col-2"></div>
						<div class="col-8">
							<div class="tile">
								<div class="tile-body">
									<form action="technicianEdit.jsp" method="post" role="form">
										<div class="form-group">
											 <input class="form-control" type="hidden" name="techid" value="<%=techbean.getTechid()%>">
										</div>
										<div class="form-group">
											<label class="control-label">Name</label> <input
												class="form-control" type="text" name="techname" value="<%=techbean.getTechname()%>">
										</div>
										<div class="form-group">
											<label class="control-label">Email</label> <input
												class="form-control" type="email" name="techemail" value="<%=techbean.getTechemail()%>">
										</div>
										<div class="form-group">
											<label class="control-label">Address</label>
											<textarea class="form-control" rows="4" name="techaddress"
												id="techaddress" ><%=techbean.getTechaddress()%></textarea>
										</div>
										<div class="form-group">
											<label class="control-label">Mobile no.</label> <input
												class="form-control" type="number" name="techmobileno" id="techmobileno"
												value="<%=techbean.getTechmobileno()%>">
										</div>
										<div class="form-group">
											<label class="control-label">Gender</label>
											<div class="form-check">
												<label class="form-check-label"> <input
													class="form-check-input" type="radio" name="techgender"
													value="male">Male
												</label>
											</div>
											<div class="form-check">
												<label class="form-check-label"> <input
													class="form-check-input" type="radio" name="techgender"
													value="female">Female
												</label>
											</div>
										</div>
										
										<div class="tile-footer">
											<button class="btn btn-primary" type="submit" name="submit"
												value="Edit">
												<i class="fa fa-fw fa-lg fa-check-circle"></i>Edit
											</button>
											&nbsp;&nbsp;&nbsp;<a class="btn btn-secondary" href="#"><i
												class="fa fa-fw fa-lg fa-times-circle"></i>Cancel</a>
										</div>
									</form>
								</div>
							</div>
						</div>
						<div class="col-2"></div>
					</div>
				</section>
			</div>
		</div>
	</div>
	</main>
</body>
</html>