<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
</head>
<body>
<center>

	<table>
		<tr>
			<td>SID</td>
			<td>BID</td>
			<td>NAME</td>
			<td>PHONE</td>
			<td>EMAIL</td>
		</tr>
		<tr>
			<td>${STO.sid}</td>
			<td>${STO.bid}</td>
			<td>${STO.name}</td>
			<td>${STO.phone}</td>
			<td>${STO.email}</td>
		</tr>
		
	</table>



</center>
</body>
</html>