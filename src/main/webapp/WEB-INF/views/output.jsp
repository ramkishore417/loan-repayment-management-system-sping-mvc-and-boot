<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="jakarta.tags.core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD"
	crossorigin="anonymous">
<title>Output Data</title>
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
		<h2 class="text-secondary">After processing the Data</h2>
		<a href="/" class="btn btn-primary">Go Back</a>
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
				<c:forEach var="processedData" items="${processedDataList}">
				<tr>
					<td>${processedData.pytId}</td>
					<td>${processedData.customerId}</td>
					<td>${processedData.loanId}</td>
					<td>${processedData.customerName}</td>
					<td>${processedData.loanType}</td>
					<td><b>${processedData.installmentAmtInRs}</b></td>
					<td>${processedData.dueDate}</td>
					<td>${processedData.actualPytDate}</td>
					<td><b>${processedData.revisedInstallmentInRs}</b></td>
					<td>${processedData.loanAmount}</td>

				</tr>

				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>