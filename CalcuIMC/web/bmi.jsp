<%@page import="model.user"%>
<!DOCTYPE html>
<html>
<head>
    <title>IMC - Índice de Masa Corporal</title>
</head>

<body>
    <h1>IMC - Índice de Masa Corporal</h1>
    <h2>Datos del usuario</h2>
    <p>Nombre completo: ${user.fullName}</p>
    <p>Edad: ${user.age}</p>
    <p>Sexo: ${user.gender}</p>
    <p>Estatura: ${user.height} m</p>
    <p>Peso: ${user.weight} kg</p>
    <h2>Resultado del IMC</h2>
    <p>IMC: ${user.bmi}</p>
    <p>Fecha de medición: ${user.bmiDate}</p>
</body>
</html>

