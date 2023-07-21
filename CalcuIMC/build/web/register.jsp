<!DOCTYPE html>
<html>
<head>
    <title>Registro de usuario</title>
</head>
<body>
    <h1>Registro de usuario</h1>
    <h1>Captura tus datos</h1>
    <form action="register" method="post">
        <label>Nombre completo:</label>
        <input type="text" name="fullName" required><br>
        <label>Edad:</label>
        <input type="number" name="age" min="15" required><br>
        <label>Sexo:</label>
        <input type="radio" name="sex" value="M" required> Masculino
        <input type="radio" name="sex" value="F" required> Femenino<br>
        <label>Estatura (m):</label>
        <input type="number" step="0.01" name="height" min="1" max="2.5" required><br>
        <label>Peso (kg):</label>
        <input type="number" step="0.01" name="weight" required><br>
        <input type="submit" value="Registrarse">
    </form>
</body>
</html>

