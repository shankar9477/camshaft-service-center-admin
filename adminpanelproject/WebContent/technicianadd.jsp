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
<title>Add technician - Admin</title>
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
				<i class="fa fa-file-text-o"></i> Technician Registration
			</h1>
		</div>
		<ul class="app-breadcrumb breadcrumb">
			<li class="breadcrumb-item"><i class="fa fa-home fa-lg"></i></li>
			<li class="breadcrumb-item"><a href="#">Technician
					Registration</a></li>
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
									<form action="technicianservlet" method="post" role="form">
										<div class="form-group">
											<label class="control-label">Name</label> <input
												class="form-control" type="text" name="techname" id="techname"
												placeholder="Enter full name">
										</div>
										<div class="form-group">
											<label class="control-label">Email</label> <input
												class="form-control" type="text" name="techemail"
												id="techemail" placeholder="Enter email address">
										</div>
										<div class="form-group">
											<label class="control-label">Address</label>
											<textarea class="form-control" rows="4" name="techaddress"
												id="techaddress" placeholder="Enter your address"></textarea>
										</div>
										<div class="form-group">
											<label class="control-label">Mobile no.</label> <input
												class="form-control" type="number" name="techmobileno" id="techmobileno"
												placeholder="Enter mobile no">
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
												value="Register">
												<i class="fa fa-fw fa-lg fa-check-circle"></i>Register
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