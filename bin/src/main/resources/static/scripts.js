// Example: Simple form validation
document.addEventListener('DOMContentLoaded', function() {
    var form = document.querySelector('form');
    if (form) {
        form.addEventListener('submit', function(event) {
            var password = document.getElementById('password');
            var confirmPassword = document.getElementById('confirmPassword');
            if (password && confirmPassword && password.value !== confirmPassword.value) {
                alert('Passwords do not match!');
                event.preventDefault();
            }
        });
    }
});
