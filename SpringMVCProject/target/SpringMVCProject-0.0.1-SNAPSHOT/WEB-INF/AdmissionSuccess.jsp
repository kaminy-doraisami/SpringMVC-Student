<html>
<body>
	<h1>Your application was submitted successfully!</h1>
	<h2>Details submitted are</h2>
	<table>
		<tr>
			<td>Student Name :</td>
			<td>${student1.studentName}</td>
		</tr>
		<tr>
			<td>Student ID :</td>
			<td>${student1.studentId}</td>
		</tr>
		<tr>
			<td>Student DOB :</td>
			<td>${student1.studentDOB}</td>
		</tr>
		<tr>
			<td>Student Address :</td>
			<td>Street: ${student1.studentAddress.street}</td>
			<td>City: ${student1.studentAddress.city}</td>
			<td>Country: ${student1.studentAddress.country}</td>
			<td>PIN: ${student1.studentAddress.pinCode}</td>
		</tr>
		<tr>
			<td>Student Mobile :</td>
			<td>${student1.studentMobile}</td>
		</tr>
		<tr>
			<td>Student Skills :</td>
			<td>${student1.studentSkills}</td>
		</tr>

	</table>
</body>
</html>