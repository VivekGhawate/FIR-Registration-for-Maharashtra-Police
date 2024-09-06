<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>FIR Details</title>
    <link rel="stylesheet" type="text/css" href="/styles.css">
</head>
<body>
<h2>FIR Details</h2>
<table>
    <tr>
        <th>ID:</th>
        <td>${fir.id}</td>
    </tr>
    <tr>
        <th>FIR Number:</th>
        <td>${fir.firNumber}</td>
    </tr>
    <tr>
        <th>District:</th>
        <td>${fir.district}</td>
    </tr>
    <tr>
        <th>Police Station:</th>
        <td>${fir.policeStation}</td>
    </tr>
    <!-- Add additional FIR fields here -->
</table>
<p><a href="/fir/list">Back to FIR List</a></p>
<p><a href="/">Back to Home</a></p>
</body>
</html>
