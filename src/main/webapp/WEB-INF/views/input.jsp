<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="jakarta.tags.core" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD"
	crossorigin="anonymous">
<title>Input Data</title>
<style>
/* Align text to center in the table */
h1, th, td {
  text-align: center;
}
h1{
  text-align: center;
}
h2 {
  text-align: left;
}

b {
  font-weight: bold;
}

</style>
</head>
<body>
	<div class="container" >
		<h1 class="text-primary">Loan Repayment Management System</h1>
		<h2 class="text-secondary">Before processing the Data</h2>
		<a href="/output" class="btn btn-success">Process the Data</a>
		<table class="table table-bordered table-striped">
			<thead>
				<tr>
					<th>PytId</th>
					<th>customerId</th>
					<th>LoanId</th>
					<th>CustomerName</th>
					<th>LoanType</th>
					<th>InstallmentAmtInRs</th>
					<th>DueDate</th>
					<th>ActualPytDate</th>
					<th>RevisedInstallmentInRs</th>
					<th>LoanAmount</th>
				</tr>
			</thead>

			<tbody>
				<form:forEach var="unProcessedData" items="${unProcessedDataList}">
				<tr>
					<td>${unProcessedData.pytId}</td>
					<td>${unProcessedData.customerId}</td>
					<td>${unProcessedData.loanId}</td>
					<td>${unProcessedData.customerName}</td>
					<td>${unProcessedData.loanType}</td>
					<td><b>${unProcessedData.installmentAmtInRs}</b></td>
					<td>${unProcessedData.dueDate}</td>
					<td>${unProcessedData.actualPytDate}</td>
					<td><b>${unProcessedData.revisedInstallmentInRs}</b></td>
					<td>${unProcessedData.loanAmount}</td>

				</tr>

				</form:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>