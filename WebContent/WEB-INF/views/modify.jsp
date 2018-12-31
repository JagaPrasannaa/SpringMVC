<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="/WEB-INF/views/includes.jsp"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Modify Details</title>
</head>
<body>
	<form:form name="employeeIdForm" method="POST" action="getEmployee">
		<div align="left">
			<table>
				<tr>
					<td>Select the Employee Id:</td>
					<td><select name="employeeId" onchange="this.form.submit();">
							<option value="">--Choose Employee Id--</option>
							<c:forEach items="${EmployeeIds}" var="employeeId">
								<option value='${employeeId}'>${employeeId}</option>
							</c:forEach>
					</select></td>
				</tr>

			</table>

		</div>
	</form:form>
	<form:form name="modifyForm" method="POST" action="modify">
		<div align="center">
			<table>
				<tr>
					<td>Employee Id</td>
					<td><input type="text" name="employeeId"
						value="${Employee.employeeId}" readonly="readonly" /></td>
				</tr>
				<tr>
					<td>Employee Name</td>
					<td><input type="text" name="empName"
						value="${Employee.empName}" /></td>
				</tr>
				<tr>
					<td>Dept</td>
					<td><input type="text" name="dept" value="${Employee.dept}"
						disabled="disabled"/></td>
					<td><select name="dept">
							<option value="">--Modify Department--</option>
							<option value="Accounts">Accounts</option>
							<option value="Human Resource">Human Resource</option>
							<option value="Infrastructure Management">Infrastructure
								Management</option>
					</select></td>
				</tr>
				<tr>
					<td>Designation</td>
					<td><input type="text" name="designation"
						value="${Employee.designation}" /></td>
				</tr>
				<tr>
					<td>Salary</td>
					<td><input type="text" name="salary"
						value="${Employee.salary}" /></td>
				</tr>
				<tr>
					<td><input type="submit" value="Update" /><input type="submit" value="Delete" onclick="document.modifyForm.action='remove';" /></td>
					<td><input type="submit" value="Back"
						onclick="document.modifyForm.action='start';document.modifyForm.method='GET'" /></td>
				</tr>
			</table>
			<div style="color: red">${msg}</div>
		</div>
	</form:form>
</body>
</html>