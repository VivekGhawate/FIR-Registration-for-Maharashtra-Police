<html>
<body>
<h2>All FIRs</h2>
<ul>
    <c:forEach var="firReport" items="${firReports}">
        <li>${firReport.details} - ${firReport.complainant}</li>
    </c:forEach>
</ul>
</body>
</html>
