<!DOCTYPE html>
<html>
<head>
    <title>Submit FIR</title>
</head>
<body>
<h2>Submit FIR</h2>
<form action="/submit-fir" method="post">
    <label for="details">Details:</label>
    <textarea id="details" name="details" required></textarea>
    <br>
    <label for="complainant">Complainant:</label>
    <input type="text" id="complainant" name="complainant" required>
    <br>
    <label for="suspect">Suspect:</label>
    <input type="text" id="suspect" name="suspect">
    <br>
    <button type="submit">Submit FIR</button>
</form>
<c:if test="${not empty successMessage}">
    <p style="color:green;">${successMessage}</p>
</c:if>
</body>
</html>
