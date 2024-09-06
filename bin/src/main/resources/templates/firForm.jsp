<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>FIR Form</title>
    <link rel="stylesheet" type="text/css" href="/styles.css">
</head>
<body>
<h2>FIR Form</h2>
<form action="/fir/submit" method="post">
    <label for="district">District:</label>
    <input type="text" id="district" name="district" required>
    <br>
    <label for="policeStation">Police Station:</label>
    <input type="text" id="policeStation" name="policeStation" required>
    <br>
    <!-- Include additional FIR fields here -->
    <input type="hidden" id="firNumber" name="firNumber" value="${fir.firNumber}">
    <input type="submit" value="Submit FIR">
</form>
<p><a href="/">Back to Home</a></p>
</body>
</html>
