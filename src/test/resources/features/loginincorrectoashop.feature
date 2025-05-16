# language: es
  Característica: Validar Ingreso a la pagina de Shop

    @loginincorrecto
    Escenario: Ingresa a la pagina sin registrarse
      Dado "Serjey" ingresa a la pagina de la tienda sin registrarse
      Entonces "Serjey" valida que 'My account' se encuentre disponible
      Entonces "Serjey" valida campos email y password y boton login