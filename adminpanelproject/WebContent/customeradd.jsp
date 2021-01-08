<!DOCTYPE html>
<html lang="en">
<head>
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
<title>Add customer - Admin</title>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- Main CSS-->
<link rel="stylesheet" type="text/css" href="css/main.css">
<!-- Font-icon css-->
<link rel="stylesheet" type="text/css"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<body class="app sidebar-mini rtl">
	<!-- Navbar-->
	<%@ include file="include/header.jsp"%>
	<!-- //Navbar -->
	<!-- Sidebar menu-->
	<%@ include file="include/sidebar.jsp"%>
	<!-- //Sidebar -->
	<main class="app-content">
	<div class="app-title">
		<div>
			<h1>
				<i class="fa fa-file-text-o"></i> Customer
			</h1>
		</div>
		<ul class="app-breadcrumb breadcrumb">
			<li class="breadcrumb-item"><i class="fa fa-home fa-lg"></i></li>
			<li class="breadcrumb-item"><a href="#">Customer</a></li>
		</ul>
	</div>
	<div class="row">
		<div class="col-md-12">
			<div class="tile">
				<section class="invoice">

					<!-- Changes -->
					<div class="row invoice-info">
						<div class="col-2"></div>
						<div class="col-8">
							<div class="tile"> 
								<div class="tile-body">
									<form action="customerservlet" method="post" role="form">
										<div class="form-group">
											<label class="control-label">Name</label> <input
												class="form-control" type="text" name="custname" id="custname"
												placeholder="Enter name" >
										</div>
										<div class="form-group">
											<label class="control-label">Email</label> <input
												class="form-control" type="text" name="custemail" id="custemail"
												placeholder="Enter email">
										</div>
										<div class="form-group">
											<label class="control-label">Password</label> <input
												class="form-control" type="password" name="custpassword" id="custpassword"
												placeholder="Enter password">
										</div>
										<div class="form-group">
											<label class="control-label">Address</label> 
											<textarea class="form-control" type="text "rows="4" name="custaddress" id="custaddress"
												placeholder="Enter address"></textarea>
										</div>
										<div class="form-group">
											<label class="control-label">City</label> 
											<select class="form-control" id="custcity" name="custcity">
												<option value="">Select</option>
												<option value="pune">Pune</option>
												<option value="mumbai">Mumbai</option>
												<option value="nagpur">Nagpur</option>
												<option value="nashik">Nashik</option>
											</select>
										</div>
										<div class="form-group">
											<label class="control-label">State</label> 
											<select class="form-control" id="custstate" name="custstate">
												<option value="">Select</option>
												<option value="maharashtra">Maharashtra</option>
												<option value="Karnataka">Karnataka</option>
												<option value="gujarat">Gujarat</option>
											</select>
										</div>
										<div class="form-group">
											<label class="control-label">Mobile No.</label> <input
												class="form-control" type="text" name="custmobileno" id="custmobileno"
												placeholder="Enter mobile number">
										</div>
										
										<div class="tile-footer">
											<button class="btn btn-primary" type="submit" name="submit"
												value="Register">
												<i class="fa fa-fw fa-lg fa-check-circle"></i>Add
											</button>
											&nbsp;&nbsp;&nbsp;<a class="btn btn-secondary" href="customer.jsp"><i
												class="fa fa-fw fa-lg fa-times-circle"></i>Cancel</a>
										</div>
									</form>
								</div>

							</div>
						</div>
						<div class="col-2"></div>
					</div>
					<!-- -->
				</section>
			</div>
		</div>
	</div>
	</main>
	<!-- Essential javascripts for application to work-->
	<script src="js/jquery-3.2.1.min.js"></script>
	<script src="js/popper.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/main.js"></script>
	<!-- The javascript plugin to display page loading on top-->
	<script src="js/plugins/pace.min.js"></script>
	<!-- Page specific javascripts-->
	<!-- Google analytics script-->
	<script type="text/javascript">
		if (document.location.hostname == 'pratikborsadiya.in') {
			(function(i, s, o, g, r, a, m) {
				i['GoogleAnalyticsObject'] = r;
				i[r] = i[r] || function() {
					(i[r].q = i[r].q || []).push(arguments)
				}, i[r].l = 1 * new Date();
				a = s.createElement(o), m = s.getElementsByTagName(o)[0];
				a.async = 1;
				a.src = g;
				m.parentNode.insertBefore(a, m)
			})(window, document, 'script',
					'//www.google-analytics.com/analytics.js', 'ga');
			ga('create', 'UA-72504830-1', 'auto');
			ga('send', 'pageview');
		}
	</script>
</body>
</html>