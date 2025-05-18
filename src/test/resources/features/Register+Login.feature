# language: es
Característica: Validacion de campos obligatorios a la hora de registrarse

  @camposobligatorios
  Escenario: Intenta registrarse sin completar ningún campo y valida alertas
    Dado "Franco" está en la página de registro de la tienda
    Cuando "Franco" hace clic en el botón 'Continue'
    Entonces "Franco" debería ver un mensaje de error indicando en cada campo los campos son obligatorios

  @camposobligatorios
  Escenario: Intenta registrarse solo con el campo de nombre
    Dado "Franco" está en la página de registro de la tienda
    Cuando "Franco" completa el campo First Name

