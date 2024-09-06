<!DOCTYPE html>
<html>
<head>
    <title>View FIRs</title>
</head>
<body>
<h2>All FIRs</h2>
<ul>
    <c:forEach var="firReport" items="${firReports}">
        <li>${firReport.details} - ${firReport.complainant}</li>
    </c:forEach>
</ul>
</body>
</html>
