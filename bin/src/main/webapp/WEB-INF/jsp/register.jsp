<html>
<body>
<h2>Register</h2>
<form action="/register" method="post">
    <label for="username">Username:</label>
    <input type="text" id="username" name="username" required>
    <br>
    <label for="password">Password:</label>
    <input type="password" id="password" name="password" required>
    <br>
    <button type="submit">Register</button>
</form>
<c:if test="${not empty successMessage}">
    <p style="color:green;">${successMessage}</p>
</c:if>
</body>
</html>