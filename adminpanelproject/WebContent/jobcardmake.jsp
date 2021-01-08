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
<title>Jobcard - Admin</title>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- Main CSS-->
<link rel="stylesheet" type="text/css" href="css/main.css">
<!-- Font-icon css-->
<link rel="stylesheet" type="text/css"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
hr {
	height: 4px;
}

.hr-primary {
	background-image: -webkit-linear-gradient(left, rgba(66, 133, 244, .8),
		rgba(66, 133, 244, .8), rgba(66, 133, 244, .8));
}

.footersection {
	background-color: #009688;
}
</style>
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
				<i class="fa fa-file-text-o"></i> Jobcard
			</h1>
		</div>
		<ul class="app-breadcrumb breadcrumb">
			<li class="breadcrumb-item"><i class="fa fa-home fa-lg"></i></li>
			<li class="breadcrumb-item"><a href="#">Jobcard</a></li>
		</ul>
	</div>
	<%@ page import="java.util.*,java.text.SimpleDateFormat"%>
	<%@ page import="com.bean.workorderbean,com.deo.workorderdeo,java.io.*" %>
	<%
		String custworkorderid = request.getParameter("custworkorderid");
		workorderbean orderbean = workorderdeo.getRecordById(Integer.parseInt(custworkorderid));
	%>
	<div class="row">
		<div class="col-md-12">
			<div class="tile">
				<section class="invoice">
					<div class="row mb-4">
						<div class="col-6">
							<h2 class="page-header">Service Jobcard</h2>
						</div>
						<div class="col-6">
							<h2 class="page-header text-right">
								<i class="fa fa-globe"></i> Camshaft Service Centre Inc
							</h2>
						</div>
						<%-- <div class="col-6">
							<%
								SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
								String date = sdf.format(new Date());
							%>
							<h5 class="text-right">Date: <%= date %></h5>
						</div> --%>
					</div>

					<table class="table table-hover">
						<tbody>
		
						</tbody>
					</table>


					<!-- ******print button******* -->
					<br>
					<div class="row d-print-none mt-2">
						<div class="col-12 text-right">
							<br>
							<br> <a class="btn btn-primary"
								href="javascript:window.print();" target="_blank"><i
								class="fa fa-print"></i> Print</a>
						</div>
					</div>
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