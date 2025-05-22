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


  @registro
     Escenario: Registro de usuario 2
    Dado "Franco" está en la página de registro de la tienda
    Y "Franco" completa el formulario con los siguientes datos:
      | campo       | valor         |
      | First Name  | Franco        |
      | Last Name   | Gonzalez      |
      | Email       | f@g.com       |
      | Telephone   | 123456789     |
      | Password    | 123456        |
      | Confirm     | 123456        |

