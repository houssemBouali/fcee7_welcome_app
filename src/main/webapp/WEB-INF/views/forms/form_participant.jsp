<!DOCTYPE html>
<html lang="fr">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<title>FCEE 7eme Edition</title>

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
</head>
<body>
	<%@ include file="/WEB-INF/views/menu/menu.jsp"%>
	<div id="page-wrapper">
		<div class="container-fluid">
			<div class="row">
				<div class="col-lg-12">
					<h1 class="page-header">Ajouter participant</h1>
					<div class="row">
						<div class="col-lg-12">
							<div class="panel panel-info">
								<div class="panel-heading">Remplir avec vos informations :</div>
								<div class="panel-body">
									<div class="row">
										<div class="col-lg-6">
											<form role="form">
												<div class="form-group">
													<label>Nom :</label> <input class="form-control"
														placeholder="Saisir votre nom">
												</div>
												<div class="form-group">
													<label>Prénom :</label> <input class="form-control"
														placeholder="Saisir votre prénom">
												</div>
												<div class="form-group">
													<label>Statut :</label> <label class="radio-inline">
														<input type="radio" name="optionsRadiosInline"
														id="optionsRadiosInline1" value="option1" checked>Etudiant
													</label> <label class="radio-inline"> <input type="radio"
														name="optionsRadiosInline" id="optionsRadiosInline2"
														value="option2">Autre
													</label>
												</div>
												<div class="form-group">
													<label>Etablissement :</label> <input class="form-control"
														placeholder="Saisir votre établissement">
												</div>
												<label>N° téléphone :</label>
												<div class="form-group input-group">

													<span class="input-group-addon">+216</span> <input
														type="text" class="form-control" placeholder="99 999 999">
												</div>
												<div class="form-group">
													<label>E-mail personnel :</label> <input
														class="form-control" type="email"
														placeholder="email@expl.com">
												</div>
												<div>
													<label>Workshop :</label> <input class="form-control"
														placeholder="liste des workshops ici">
												</div>
												<div style="margin-left: 30%; margin-top: 3%">
													<button type="submit" class="btn btn-success">Confirmer</button>
													<button type="reset" class="btn btn-info">Réinitialiser</button>
												</div>
											</form>
											<!-- /.col-lg-6 (nested) -->
										</div>
										<!-- /.row (nested) -->
									</div>
									<!-- /.panel-body -->
								</div>
								<!-- /.panel -->
							</div>
							<!-- /.col-lg-12 -->
						</div>
						<!-- /.row -->
					</div>
				</div>
			</div>
		</div>
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
