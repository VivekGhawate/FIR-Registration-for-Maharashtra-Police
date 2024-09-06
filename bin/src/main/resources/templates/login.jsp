<html>
<body>
<h2>Login</h2>
<form action="/login" method="post">
    <label for="username">Username:</label>
    <input type="text" id="username" name="username" required>
    <br>
    <label for="password">Password:</label>
    <input type="password" id="password" name="password" required>
    <br>
    <button type="submit">Login</button>
</form>
<p><a href="/register">Register</a> if you're new.</p>
<c:if test="${not empty errorMessage}">
    <p style="color:red;">${errorMessage}</p>
</c:if>
</body>
</html>
