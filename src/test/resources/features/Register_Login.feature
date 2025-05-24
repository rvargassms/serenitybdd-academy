# language: es
Característica: Validacion de campos obligatorios a la hora de registrarse

  @camposobligatorios
  Escenario: Intenta registrarse sin completar ningún campo y valida alertas
    Dado "Franco" está en la página de registro de la tienda
    Cuando "Franco" hace clic en el botón 'Continue'
    Entonces "Franco" debería ver un mensaje de error indicando en cada campo los campos son obligatorios

  @registro
  Escenario: Registro de usuario
    Dado "Franco" está en la página de registro de la tienda
    Cuando "Franco" completa el formulario de registro


  @registro @registrousuario
  Esquema del escenario: Registro de usuario 3
    Dado "<nombre>" está en la página de registro de la tienda
    Cuando "<nombre>" completa el formulario con los siguientes datos3:
      | First Name  | Last Name | Email   | Telephone    | Password | Confirm Password |
      | <firstName> | <lastName>| <email> | <telephone>  | <pass>   | <confirmPass>    |

    Ejemplos:
      | nombre    | firstName | lastName  | email      | telephone     | pass  | confirmPass |
      | Franco    | Franco    | Gonzalez  | f@g.com    | 123456789     | fran  | Franco      |
      | Franco 1  | Franco 1  | Gonza1lez | f1@g.com   | 1234567111189 | fran1 | Franco1     |
      | Franco 2  | Franco 2  | Gonza1lez | f2@g.com   | 1234567111189 | fran2 | Franco2     |




