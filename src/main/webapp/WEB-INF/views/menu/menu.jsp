<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="true"%>
<!DOCTYPE >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<!-- Bootstrap Core CSS -->
<title>FCCE 7eme Edition</title>
<link rel="icon" href="http://www.out.tn/uploads/media/default/0001/04/thumb_3687_default_big.png">
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
				<h1 align="Center" style="margin-left: 20px; color: blue;">FCEE</h1>
				7eme Edition
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
						<li><a href="javascript:void(0)"><i
								class="fa fa-dashboard fa-fw"></i>&ensp;&ensp;Tableau De Bord</a></li>
						<!-- ENSEIGNANT -->
						<c:url value="/enseignant/" var="enseignant" />
						<li><a href="${enseignant }"><i
								class="glyphicon glyphicon-briefcase"></i>
								&ensp;&ensp;Enseignants</a></li>
						<!-- INDUSTRIEL -->
						<c:url value="/industriel/" var="industriel" />
						<li><a href="${industriel }"><i
								class="glyphicon glyphicon-wrench"></i>
								&ensp;&ensp;Industriels</a></li>
						<!-- MEDIA -->
						<c:url value="/media/" var="media" />
						<li><a href="${media }"><i
								class="glyphicon glyphicon-facetime-video"></i>
								&ensp;&ensp;Medias</a></li>
						<!-- PARTICIPANT -->
						<c:url value="/participant/" var="participant" />
						<li><a href="${participant }"><i
								class="glyphicon glyphicon-education"></i>
								&ensp;&ensp;Participants</a></li>
					</ul>
				</div>
				<!-- /.sidebar-collapse -->
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