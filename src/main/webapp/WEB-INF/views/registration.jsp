<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<!--[if lt IE 7]>      <html class="no-js lt-ie9 lt-ie8 lt-ie7"> <![endif]-->
<!--[if IE 7]>         <html class="no-js lt-ie9 lt-ie8"> <![endif]-->
<!--[if IE 8]>         <html class="no-js lt-ie9"> <![endif]-->
<!--[if gt IE 8]>      <html class="no-js"> <!--<![endif]-->
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title></title>
<meta name="description" content="">
<meta name="viewport"
	content="width=device-width, initial-scale=1 shrink-to-fit=no">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
	crossorigin="anonymous"></script>
</head>
<body>
	<!--[if lt IE 7]>
            <p class="browsehappy">You are using an <strong>outdated</strong> browser. Please <a href="#">upgrade your browser</a> to improve your experience.</p>
        <![endif]-->
	<div class="container">
		<div class="row">
			<div class="col-md-6 offset-md-3">
				<div class="card bg-success text-white rounded">
					<div class="card-header text-center fs-3">Registration Form</div>
					<b class="fs-bol text-center pt-1 bg-warning">${msg }</b>
					<div class="card-body">
						<form action="createUser" method="post">
							<div class="mb-3">
								<label for="name" class="form-label">Your Full Name</label> <input
									type="text" class="form-control" id="name" name="name"
									aria-describedby="emailHelp" placeholder="Enter your full Name">

							</div>
							<div class="mb-3">
								<label for="email" class="form-label">Email address</label> <input
									type="email" class="form-control" id="email" name="email"
									placeholder="Enter your email address">
							</div>
							<div class="mb-3">
								<label for="password" class="form-label">Password</label> <input
									type="password" class="form-control" id="password" name="password"
									placeholder="Enter password">
							</div>
							<div class="mb-3 form-check">
								<input type="checkbox" class="form-check-input" name="check"
									id="exampleCheck1"> <label class="form-check-label"
									for="exampleCheck1">Agreed on Terms and Condition.</label>
							</div>
							<button type="submit"
								class="btn btn-outline-warning mb-2 col-md-12">Registration</button>
						</form>
					</div>
				</div>
				<div class="refer-page">
					<p>Do you have an account? Go to <a href="login-page">Login</a> Page</p>
				</div>
			</div>
		</div>
	</div>

</body>
</html>