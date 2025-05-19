# language: es
  Característica: Validar Ingreso a la pagina de Shop

    @loginincorrecto
    Escenario: Ingresa al login de la tienda solo con email y le da al boton de login
      Dado "Franco" ingresa a la pagina de la tienda sin registrarse
      Entonces "Franco" valida que 'My account' se encuentre disponible
      Cuando "Franco" ingresa su email y hace clic en el botón Login
      Entonces "Franco" debería ver un mensaje de error de inicio de sesión

    @loginincorrecto
    Escenario: Ingresa al login de la tienda solo con password y le da al boton de login
      Dado "Franco" ingresa a la pagina de la tienda sin registrarse
      Entonces "Franco" valida que 'My account' se encuentre disponible
      Cuando "Franco" ingresa su password y hace clic en el botón Login
      Entonces "Franco" debería ver un mensaje de error de inicio de sesión