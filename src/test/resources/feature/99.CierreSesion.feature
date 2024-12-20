Feature: Cierre de sesión

  Scenario: Cierre de sesión correcto
    Given El usuario selecciona el menú de navegación
    When El usuario selecciona la opción Cerrar sesión en el menú de navegación
    And El usuario da clic en el botón de aceptar
    Then El usuario es redirigido a la pantalla de inicio de sesión