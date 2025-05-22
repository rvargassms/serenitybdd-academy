# language: es

Característica: Buscar productos desde la homepage

  Como usuario
  Quiero poder buscar productos desde la homepage
  Para encontrar lo que necesito sin tener que navegar por todo el listado de productos

  Escenario: Escenario Feliz - Busqueda de productos con término válido
    Dado que "Yas" tiene acceso al buscador desde la homepage
    Y tiene seleccionada la opcion "All Categories"
    Cuando "Yas" ingresa un "producto" en el campo de busqueda
    Y "Yas" hace click sobre el botón buscar
    Entonces "Yas" ve en pantalla todos los productos que coincidan con el "producto" ingresado

  Escenario: Escenario Negativo - Busqueda de productos con término inválido
    Dado "Yas" que el usuario tiene acceso al buscador desde la homepage y tiene seleccionada la opcion "All Categories"
    Cuando ingresa un término que no coincide con ningún producto (caracteres especiales, números, producto distinto al que se vende en la página)
    Y hace click sobre el botón buscar
    Entonces "actor" ve en pantalla un mensaje que indique "There is no product that matches the search criteria"


  Escenario: Escenario Alternativo - Busqueda de productos sin agregar ningun termino al campo de busqueda
    Dado "Yas" que el usuario tiene acceso al buscador desde la homepage y tiene seleccionada la opcion "All Categories"
    Cuando no ingresa  ningun termino al campo de bsuqueda
    Y hace click sobre el botón buscar
    Entonces "actor" ve en pantalla todos los productos disponibles como resultado por defecto

  Escenario: Escenario Alternativo Dos - Busqueda de productos que me traiga los primeros elementos 5 de la lista