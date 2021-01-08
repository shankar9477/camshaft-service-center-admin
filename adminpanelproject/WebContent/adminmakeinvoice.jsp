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
<title>Invoice - Admin</title>
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
.hr-primary{
  background-image: -webkit-linear-gradient(left, rgba(66,133,244,.8), rgba(66,133,244,.8), rgba(66,133,244,.8));
}
.footersection
{
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
				<i class="fa fa-file-text-o"></i> Invoice
			</h1>
		</div>
		<ul class="app-breadcrumb breadcrumb">
			<li class="breadcrumb-item"><i class="fa fa-home fa-lg"></i></li>
			<li class="breadcrumb-item"><a href="#">Invoice</a></li>
		</ul>
	</div>
	<div class="row">
		<div class="col-md-12">
			<div class="tile">
				<section class="invoice">
					<div class="row mb-4">
						<div class="col-6">
							<h2 class="page-header">
								<i class="fa fa-globe"></i> Camshaft Service Centre Inc
							</h2>
						</div>
						<div class="col-6">
							<h5 class="text-right">Current date</h5>
						</div>
					</div>
					
					<!-- Customer and vehicle info -->
					<div class="row invoice-info">
						<div class="col-12 table-responsive">
							<table class="table table-striped">
								<thead>
									<tr>
										<th>CUSTOMER INFO</th>
										<th>VEHICLE INFO</th>
									</tr>
								</thead>
							</table>
						</div>
						<div class="col-6">
							<div class="tile">
								<div class="tile-body">
									<form class="form-horizontal">
										<div class="form-group row">
											<label class="control-label col-md-3">Name</label>
											<div class="col-md-8">
												<label class="control-label col-md-5">[Name]</label>
											</div>
										</div>

										<div class="form-group row">
											<label class="control-label col-md-3">Mobile no.</label>
											<div class="col-md-8">
												<label class="control-label col-md-5">abc</label>
											</div>
										</div>
										<div class="form-group row">
											<label class="control-label col-md-3">Address</label>
											<div class="col-md-8">
												<label class="control-label col-md-5">abc asb hasbj
													ASD njsd nsja sannj sjn</label>
											</div>
										</div>
									</form>
								</div>
							</div>
						</div>
						<div class="col-6">
							<div class="tile">
								<div class="tile-body">
									<form class="form-horizontal">
										<div class="form-group row">
											<label class="control-label col-md-3">Vehicle number</label>
											<label class="control-label col-md-5">abc</label>
										</div>	
									</form>
								</div>
							</div>
						</div>
					</div>
					<!-- -->
					<!-- *******Work done*********** -->
					<div class="row invoice-info">
						<div class="col-12 table-responsive">
							<table class="table table-striped">
								<thead>
									<tr>
										<th>Work done</th>
										<th></th>
									</tr>
								</thead>
							</table>
						</div>
						<div class="col-6">
							<div class="tile">
								<div class="tile-body">
									<form class="form-horizontal">
										<div class="form-group row">
											<label class="control-label col-md-3">Expected time</label>
											<div class="col-md-8">
												<label class="control-label col-md-5">Time from db</label>
											</div>
										</div>
									</form>
								</div>
							</div>
						</div>
						<div class="col-6">
							<div class="tile">
								<div class="tile-body">
									<form class="form-horizontal">
										<div class="form-group row">
											<label class="control-label col-md-3">Actual time</label>
											<div class="col-md-8">
												<input class="form-control" type="date" placeholder="">
											</div>
										</div>	
									</form>
								</div>
							</div>
						</div>
					</div>
					<!-- //Work done -->
					<hr class="hr-primary" />
					<br>
					<!-- ************Job performed table*********** -->
					<div class="row">
						<div class="col-12 table-responsive">
							<table class="table table-striped">
								<thead>
									<tr>
										<th>Labour</th>
										<th>Hours</th>
										<th>Rate</th>
										<th>Amount</th>
									</tr>
								</thead>
								<tbody>
									<tr>
										<td>Service name</td>
										<td>2</td>
										<td>75.00</td>
										<td>150.00</td>
										</tr>
									<tr>
										<td></td>
										<td></td>
										<td></td>
										<td></td>
									</tr>
									<tr>
										<td></td>
										<td></td>
										<td></td>
										<td></td>
									</tr>
								</tbody>
							</table>
						</div>
					</div>
					<!-- //Job performed table -->

					<!-- **********Subtotal and tax********** -->
					<div class="row">
						<div class="col-md-7"></div>
						<div class="col-md-5">
							<div class="form-group row">
								<label class="control-label col-md-3">Subtotal</label>
								<div class="col-md-8">
									<label class="control-label col-md-3"><i class="fa fa-inr"></i></label> 
									Amount
								</div>
							</div>
						</div>
					</div>
					<!-- //Subtotal and tax  -->
					<hr class="hr-primary" />
					<br>

					<!--************part or services cost table************* -->
					<div class="row">
						<div class="col-12 table-responsive">
							<table class="table table-striped">
								<thead>
									<tr>
										<th>Qty</th>
										<th>Part name</th>
										<th>Brand name</th>
										<th>Price</th>
										<th>Subtotal</th>
									</tr>
								</thead>
								<tbody>
									<tr>
										<td>1</td>
										<td>abc</td>
										<td>abc</td>
										<td>0000</td>
										<td>0000</td>
									</tr>
								</tbody>
							</table>
						</div>
					</div>
					<!-- //part or services cost table  -->
					
					<!-- **********Subtotal and tax********** -->
					<div class="row">
						<div class="col-md-7">
						<br>
						<label><b>Comments</b></label>
						<hr class="hr-primary" />
						Please include the invoice number as reference when paying online or by check. 	
						</div>
						
						<div class="col-md-5">
							<div class="form-group row">
								
									<label class="control-label col-md-3">Subtotal</label>
									<div class="col-md-8">
										<label class="control-label col-md-3"><i class="fa fa-inr"></i></label> 
										Amount
									</div>
									<br>
									<br>
									<label class="control-label col-md-3">Sales tax rate</label>
									<div class="col-md-8">
										<label class="control-label col-md-3"><i class="fa fa-percent"></i></label> 
									Amount
									</div>
									<br>
									<br>
									<label class="control-label col-md-3">Total labour</label>
									<div class="col-md-8">
										<label class="control-label col-md-3"><i class="fa fa-inr"></i></label> 
									Amount
									</div>
									<br>
									<br>
									<label class="control-label col-md-3">Total services</label>
									<div class="col-md-8">
										<label class="control-label col-md-3"><i class="fa fa-inr"></i></label> 
									Amount
									</div>
									<br>
									<br>
									<label class="control-label col-md-3">Sales tax</label>
									<div class="col-md-8">
										<label class="control-label col-md-3"><i class="fa fa-inr"></i></label> 
									Amount
									</div>
									<br>
									<br>								
									
									<label class="control-label col-md-12">----------------------------------------------------------------</label>
									<br>
									<label class="control-label col-md-3"><b>Total</b></label>
									<div class="col-md-8">
										<label class="control-label col-md-3"><i class="fa fa-inr"></i></label> 
									Amount
									</div>
							</div>
							</div>
	
					</div>
					<!-- //Subtotal and tax  -->
					
					<!-- **********thanku section******** -->
					<div class="row">
						<div class="col-md-7">
							<br>
							<b style="size: 20px;color: #009688;"> Thank you for your business!</b></span> 	
						</div>
						<div class="col-md-5">
						Make all checks payable to<br>
						<b style="color: #009688;">Camshaft service centre</b>
						 	
						</div>
					</div>
					<!-- //thanku section -->
					
					<br><br><br>
					<!-- *************footer part********** -->
					<center>Should you have any enquiries concerning this invoice, please contact on +91 7878787878 </center>
					<div class="footersection">
						<center style="color: white;">
							
								Address: street , city, state, pincode.<br>
								Tel: 020 00 00 00 00 Fax: 0-0000-000-000 Email: email@gmail.com Web: www.camshaft.com 
							
						</center>
					</div>
					<!-- //footer part -->
					
					<!-- ******print button******* -->
					<br>
					<div class="text-right">
  						<button type="button" class="btn btn-primary">Submit</button>
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
		
		$('#demoDate').datepicker({
	      	format: "dd/mm/yyyy",
	      	autoclose: true,
	      	todayHighlight: true
	      });
	      
	      $('#demoSelect').select2();
	</script>
</body>
</html>