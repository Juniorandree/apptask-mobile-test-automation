@login
Feature: Registro de usuario
  #En este feature realizaremos
  #el proceso de logueo de forma satisfactoria
  #hacia el aplicativo smart tracing task

  Scenario: Logueo de forma correcta
    Given transportista ingresa licencia "TAI100" placa "TAI100" contraseña "PRUE1"
    When transportista realiza operacion de inicio de sesion
    Then resultado se tendra ingreso a punto de visita
