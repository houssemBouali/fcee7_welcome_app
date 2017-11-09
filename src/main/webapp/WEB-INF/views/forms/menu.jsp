<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<!DOCTYPE >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<!-- Bootstrap Core CSS -->
<link
	href="<%=request.getContextPath()%>/resources/vendor/bootstrap/css/bootstrap.min.css"
	rel="stylesheet">

<!-- MetisMenu CSS -->
<link
	href="<%=request.getContextPath()%>/resources/vendor/metisMenu/metisMenu.min.css"
	rel="stylesheet">

<!-- Custom CSS -->
<link
	href="<%=request.getContextPath()%>/resources/dist/css/sb-admin-2.css"
	rel="stylesheet">

<!-- Custom Fonts -->
<link
	href="<%=request.getContextPath()%>/resources/vendor/font-awesome/css/font-awesome.min.css"
	rel="stylesheet" type="text/css">
<title>Insert title here</title>
</head>
<body>
	<div>
		<nav class="navbar navbar-default navbar-static-top" role="navigation"
			style="margin-bottom: 0">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target=".navbar-collapse">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<h1 align="Center" style="margin-left: 20px; color: blue;">FCEE
					7eme Edition</h1>
			</div>
			<div>
				<img alt="logo"
					src="http://www.out.tn/uploads/media/default/0001/04/thumb_3687_default_big.png"
					height="70px" width="300px" align="right">
			</div>
			<br>
			<div class="navbar-default sidebar" role="navigation">
				<div class="sidebar-nav navbar-collapse">
					<ul class="nav" id="side-menu">
						<c:url value="/home/" var="home" />
						<li><a href="${home }"><i class="fa fa-dashboard fa-fw"></i>
								Tableau De Bord</a></li>
						<!-- ENSEIGNANT -->
						<c:url value="/enseignant/" var="enseignant" />
						<li><a href="${enseignant }"><i
								class="fa fa-bar-chart-o fa-fw"></i> Enseignants</a> <!-- INDUSTRIEL -->
							<c:url value="/industriel/" var="industriel" />
						<li><a href="${industriel }"><i class="fa fa-table fa-fw"></i>
								Industriels</a></li>
						<!-- MEDIA -->
						<c:url value="/media/" var="media" />
						<li><a href="${media }"><i class="fa fa-edit fa-fw"></i>
								Medias</a></li>
						<!-- PARTICIPANT -->
						<c:url value="/participant/" var="participant" />
						<li><a href="${participant }"><i
								class="fa fa-wrench fa-fw"></i>Participants </a></li>
					</ul>

				</div>
				<!-- /.sidebar-collapse -->s
			</div>
			<!-- /.navbar-static-side -->
		</nav>
	</div>
	<!-- jQuery -->
	<script
		src="<%=request.getContextPath()%>/resources/vendor/jquery/jquery.min.js"></script>

	<!-- Bootstrap Core JavaScript -->
	<script
		src="<%=request.getContextPath()%>/resources/vendor/bootstrap/js/bootstrap.min.js"></script>

	<!-- Metis Menu Plugin JavaScript -->
	<script
		src="<%=request.getContextPath()%>/resources/vendor/metisMenu/metisMenu.min.js"></script>

	<!-- Custom Theme JavaScript -->
	<script
		src="<%=request.getContextPath()%>/resources/dist/js/sb-admin-2.js"></script>
</body>
</html>