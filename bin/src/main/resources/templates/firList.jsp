<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>FIR List</title>
    <link rel="stylesheet" type="text/css" href="/styles.css">
</head>
<body>
<h2>All FIRs</h2>
<table>
    <thead>
    <tr>
        <th>ID</th>
        <th>FIR Number</th>
        <th>Complainant Name</th>
        <th>Details</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="fir" items="${firs}">
        <tr>
            <td>${fir.id}</td>
            <td>${fir.firNumber}</td>
            <td>${fir.complainantFullName}</td>
            <td><a href="/fir/details/${fir.id}">View Details</a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<p><a href="/">Back to Home</a></p>
</body>
</html>
