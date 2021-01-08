
<!DOCTYPE html>
<%@page import="com.deo.JobcardDao"%>
<%@page import="com.bean.Jobcard"%>
<%@ page import="java.util.List"%>
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
<title>Jobcard Table - Admin</title>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- Main CSS-->
<link rel="stylesheet" type="text/css" href="css/main.css">
<!-- Font-icon css-->
<link rel="stylesheet" type="text/css"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<script type="text/javascript">
	function wm(id, t) {
		if (document.getElementById(id).value.length == 0) {
			alert(t + " will be filled out.");
		}
	}
</script>
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
				<i class="fa fa-th-list"></i> Jobcard Table
			</h1>
			<p>Table to display analytical data effectively</p>
		</div>
		<ul class="app-breadcrumb breadcrumb side">
			<li class="breadcrumb-item"><i class="fa fa-home fa-lg"></i></li>
			<li class="breadcrumb-item active"><a href="#">Jobcard
					Table</a></li>
		</ul>
	</div>
	<%@ page import="com.deo.JobcardDao,com.bean.Jobcard,java.util.*"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	<form name="form">
		<div class="row">
			<div class="col-md-12">
				<div class="text-right">
					<button type="button" class="btn btn-primary" onclick="window.location.href='technicianadd.jsp'">
						<i class="fa fa-plus" aria-hidden="true"></i>Add new Technician
					</button>
				</div>
				<br>
				<div class="tile">
					<div class="tile-body">
						<%
							List<Jobcard> list = JobcardDao.getAllRecords();
							request.setAttribute("list", list);
						%>
						<table class="table table-hover table-bordered" id="sampleTable">

							<tr>
								<th>Job Id</th>
		                    	<th>Vehicle Number</th>
			                    <th>Job Date</th>
			                    <th>Meter Reading</th>
			                    <th>Fuel</th>
			                    <th>Employee Id</th>
			                    <!-- <th>Part Id</th> -->
			                   <th>Customer Id</th>
			                   <th>Edit</th>
			                    <th>Delete</th>
			                   
							</tr>
							<c:forEach items="${list}" var="jc">
								<tr>
									<td>${jc.getId()}</td>
									<td>${jc.getVehicleno()}</td>
									<td>${jc.getJobdate()}</td>
									<td>${jc.getMeterreading()}</td>
									<td>${jc.getFuel()}</td>
									<td>${jc.getEmployeeid()}</td>
									<td>${jc.getCustomerid()}</td>
									
									<td>
										<button class="btn btn-primary btn-sm" type="button"
											onclick="window.location.href='techniciangeteditvalue.jsp?id=${jc.getId()}'">Edit</button>
									</td>
									<td>
										<button class="btn btn-primary btn-sm" type="button"
											onclick="window.location.href='technicianDelete.jsp?id=${jc.getId()}'">Delete</button>
									</td>
								</tr>
							</c:forEach>

						</table>
					</div>
				</div>
			</div>
		</div>
	</form>
	</main>
	<!-- Essential javascripts for application to work-->
	<script src="js/jquery-3.2.1.min.js"></script>
	<script src="js/popper.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/main.js"></script>
	<!-- The javascript plugin to display page loading on top-->
	<script src="js/plugins/pace.min.js"></script>
	<!-- Page specific javascripts-->
	<!-- Data table plugin-->
	<script type="text/javascript"
		src="js/plugins/jquery.dataTables.min.js"></script>
	<script type="text/javascript"
		src="js/plugins/dataTables.bootstrap.min.js"></script>
	<script type="text/javascript">
		$('#sampleTable').DataTable();
	</script>
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