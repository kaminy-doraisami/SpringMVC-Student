<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<body>
	<h1>STUDENT ADMISSION FORM</h1>
	<form:errors path="student1.*" />
	<form action="/SpringMVCProject/submitAdmissionForm.html"
		method="post">
		<table>
			<tr>
				<td>Student's Name : <input type="text" name="studentName" />
				</td>
			</tr>
			<tr>
				<td>Student's ID : <input type="text" name="studentId" />
				</td>
			<tr>
				<td>Student's DOB : <input type="text" name="studentDOB" />
				</td>
			</tr>
			<tr>
				<td>Student's Address :</td>
			</tr>
			<tr>
				<td>Street: <input type="text" name="studentAddress.street" />
				</td>
				<td>City: <input type="text" name="studentAddress.city" />
				</td>
				<td>Country: <input type="text" name="studentAddress.country" />
				</td>
				<td>PIN: <input type="text" name="studentAddress.pinCode" />
				</td>
			</tr>
			<tr>
				<td>Student's Mobile No : <input type="text"
					name="studentMobile" />
				</td>
			</tr>
			<tr>
				<td>Student's Skill set : <select name="studentSkills" multiple>
						<option value="Mathematics">Maths</option>
						<option value="Physics">Physics</option>
						<option value="Chemistry">Chemistry</option>
						<option value="Computer Science">CS</option>
				</select> <input type="submit" value="Click here to submit" />
				</td>
			</tr>
		</table>
	</form>
</body>
</html>