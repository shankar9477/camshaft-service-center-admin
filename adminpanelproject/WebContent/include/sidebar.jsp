<!-- Sidebar menu-->
<div class="app-sidebar__overlay" data-toggle="sidebar"></div>
<aside class="app-sidebar">
	<div class="app-sidebar__user">
		<img class="app-sidebar__user-avatar" src="img/adminlogo.png" alt="User Image">
		<div>
			<p class="app-sidebar__user-name">Admin</p>
			<p class="app-sidebar__user-designation">Camshaft Service<br> Centre</p>
		</div>
	</div>
	<ul class="app-menu">
			<!-- ************Dashboard menu************  -->
		<li>
			<a class="app-menu__item active" href="index.jsp">
				<i class="app-menu__icon fa fa-dashboard"></i>
				<span class="app-menu__label">Dashboard</span>
			</a>
		</li>
			<!-- ************View menu************  -->
		<li class="treeview">
			<a class="app-menu__item" href="" data-toggle="treeview">
				<i class="app-menu__icon fa fa-eye"></i>
				<span class="app-menu__label">View</span>
				<i class="treeview-indicator fa fa-angle-right"></i>
			</a>
			<ul class="treeview-menu">
				<li>
					<a class="treeview-item" href="bootstrap-components.html">
					<i class="icon fa fa-circle-o"></i>Work Order</a>
				</li>
				<li>
					<a class="treeview-item" href="bootstrap-components.html">
					<i class="icon fa fa-circle-o"></i> Job cards</a>
				</li>				
			</ul>
		</li>
			<!-- ************Invoice menu************  -->
		<li class="treeview">
			<a class="app-menu__item" href="#" data-toggle="treeview">
				<i class="app-menu__icon fa fa-money"></i>
				<span class="app-menu__label">Invoice</span>
				<i class="treeview-indicator fa fa-angle-right"></i>
			</a>
			<ul class="treeview-menu">
				<li>
					<a class="treeview-item" href="adminmakeinvoice.jsp">
					<i class="icon fa fa-circle-o"></i> Make</a>
				</li>
				<li>
					<a class="treeview-item" href="bootstrap-components.html">
					<i class="icon fa fa-circle-o"></i>View</a>
				</li>				
			</ul>
		</li>
				<!-- ************Bill menu************  -->
		<li class="treeview">
			<a class="app-menu__item" href="#" data-toggle="treeview">
				<i class="app-menu__icon fa fa-money"></i>
				<span class="app-menu__label">Bill</span>
				<i class="treeview-indicator fa fa-angle-right"></i>
			</a>
			<ul class="treeview-menu">
				<li>
					<a class="treeview-item" href="adminbill.jsp">
					<i class="icon fa fa-circle-o"></i>View</a>
				</li>				
			</ul>
		</li>
			<!-- **************Report menu************** -->
		<li class="treeview">
			<a class="app-menu__item" href="#" data-toggle="treeview">
				<i class="app-menu__icon fa fa-file-o"></i>
				<span class="app-menu__label">Report</span>
				<i class="treeview-indicator fa fa-angle-right"></i>
			</a>
			<ul class="treeview-menu">
				<li>
					<a class="treeview-item" href="bootstrap-components.html">
					<i class="icon fa fa-circle-o"></i>Customers report</a>
				</li>
				<li>
					<a class="treeview-item" href="bootstrap-components.html">
					<i class="icon fa fa-circle-o"></i>Employees report</a>
				</li>
				<li>
					<a class="treeview-item" href="bootstrap-components.html">
					<i class="icon fa fa-circle-o"></i>Inventory report</a>
				</li>
				<li>
					<a class="treeview-item" href="bootstrap-components.html">
					<i class="icon fa fa-circle-o"></i>Invoice report</a>
				</li>
				<li>
					<a class="treeview-item" href="bootstrap-components.html">
					<i class="icon fa fa-circle-o"></i>Bill report</a>
				</li>				
			</ul>
		</li>	
	</ul>
</aside>