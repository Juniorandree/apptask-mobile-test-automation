$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("feature/01.Login.feature");
formatter.feature({
  "line": 2,
  "name": "Registro de usuario",
  "description": "",
  "id": "registro-de-usuario",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@login"
    }
  ]
});
formatter.before({
  "duration": 66464,
  "status": "passed"
});
formatter.before({
  "duration": 35502,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Logueo de forma correcta",
  "description": "",
  "id": "registro-de-usuario;logueo-de-forma-correcta",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "transportista ingresa licencia \"TAI100\" placa \"TAI100\" contraseña \"PRUE1\"",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "transportista realiza operacion de inicio de sesion",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "resultado se tendra ingreso a punto de visita",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "TAI100",
      "offset": 32
    },
    {
      "val": "TAI100",
      "offset": 47
    },
    {
      "val": "PRUE1",
      "offset": 67
    }
  ],
  "location": "LoginSteps.ingresarCredenciales(String,String,String)"
});
formatter.result({
  "duration": 210507258,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.realizaOperacion()"
});
formatter.result({
  "duration": 4156082988,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.verificaResultado()"
});
formatter.result({
  "duration": 4050567073,
  "status": "passed"
});
formatter.uri("feature/99.CierreSesion.feature");
formatter.feature({
  "line": 1,
  "name": "Cierre de sesión",
  "description": "",
  "id": "cierre-de-sesión",
  "keyword": "Feature"
});
formatter.before({
  "duration": 16507,
  "status": "passed"
});
formatter.before({
  "duration": 12120,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Cierre de sesión correcto",
  "description": "",
  "id": "cierre-de-sesión;cierre-de-sesión-correcto",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "El usuario selecciona el menú de navegación",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "El usuario selecciona la opción Cerrar sesión en el menú de navegación",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "El usuario da clic en el botón de aceptar",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "El usuario es redirigido a la pantalla de inicio de sesión",
  "keyword": "Then "
});
formatter.match({
  "location": "MenuNavegacionSteps.seleccionarMenu()"
});
formatter.result({
  "duration": 520557169,
  "status": "passed"
});
formatter.match({
  "location": "MenuNavegacionSteps.seleccionarCerrarSesion()"
});
formatter.result({
  "duration": 1082277350,
  "status": "passed"
});
formatter.match({
  "location": "MenuNavegacionSteps.seleccionarCerrarSesionAceptar()"
});
formatter.result({
  "duration": 995860627,
  "status": "passed"
});
formatter.match({
  "location": "MenuNavegacionSteps.layoutInicioSesion()"
});
formatter.result({
  "duration": 1085683961,
  "status": "passed"
});
});