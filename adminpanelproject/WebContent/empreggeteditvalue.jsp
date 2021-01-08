<!DOCTYPE html>
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html;charset=ISO-8859-1">
<title>Edit employee details</title>
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
		import="com.deo.EmployeeDao,com.bean.Employee,com.servlet.EmployeeServlet,java.io.*"%>
	<%
		String empid = request.getParameter("empid");
		Employee empbean = EmployeeDao.getRecordById(Integer.parseInt(empid));
	%>
	<main class="app-content">
	<div class="app-title">
		<div>
			<h1>
				<i class="fa fa-file-text-o"></i> Edit Employee details
			</h1>
		</div>
		<ul class="app-breadcrumb breadcrumb">
			<li class="breadcrumb-item"><i class="fa fa-home fa-lg"></i></li>
			<li class="breadcrumb-item"><a href="#">Edit Employee
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
									<form action="empregistrationEdit" method="post" role="form" enctype="multipart/form-data">
										<div class="form-group">
											 <input class="form-control" type="hidden" name="empid" value="<%=empbean.getEmpid()%>">
										</div>
										<div class="form-group">
											<label class="control-label">Name</label> 
											<input class="form-control" type="text" name="empname" value="<%=empbean.getEmpname()%>">
										</div>
										<div class="form-group">
											<label class="control-label">Email</label> 
											<input class="form-control" type="email" name="empemail" value="<%=empbean.getEmpemail()%>">
										</div>
										<div class="form-group">
											<label class="control-label">Password</label> 
											<input class="form-control" type="text" name="emppassword" value="<%=empbean.getEmppassword()%>">
										</div>
										<div class="form-group">
											<label class="control-label">Address</label>
											<textarea class="form-control" rows="4" name="empaddress" id="empaddress"><%=empbean.getEmpaddress()%></textarea>
										</div>
										<div class="form-group">
											<label class="control-label">Gender</label>
											<div class="form-check">
												<label class="form-check-label"> <input
													class="form-check-input" type="radio" name="gender"
													value="male">Male
												</label>
											</div>
											<div class="form-check">
												<label class="form-check-label"> <input
													class="form-check-input" type="radio" name="gender"
													value="female">Female
												</label>
											</div>
										</div>
										<div class="form-group">
											<label class="control-label">Identity Proof</label> 
											<input class="form-control" type="file" value="<%=empbean.getEmpaddress()%>" name="empprooffile">
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