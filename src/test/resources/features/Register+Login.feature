# language: es
  Característica: Validacion de campos obligatorios a la hora de registrarse
    Como un usuario no registrado
    Quiero validar los campos obligatorios a la hora de registrarme
    Para asegurarme de que no puedo registrarme sin completar los campos obligatorios

    @camposobligatorios
    Escenario: Ingresa al registro de la tienda sin completar ningun campo y le da al boton de Continue
      Dado "Franco" ingresa a la pagina de la tienda sin registrarse
      Entonces "Franco" valida que 'My account' se encuentre disponible
