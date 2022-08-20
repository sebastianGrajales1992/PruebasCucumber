Feature: Busqueda en el sitio google

Background: Navegacion al sitio de Google
    Given Como usuario navego al sitio web de google

 Scenario: Busqueda de la palabra pinguino con el boton de buscar en google
 When Como usuario busco la palabra pinguino
 And Como usuario doy click en el boton buscar
 Then Espero que se visualice el elemento con el texto Spheniscidae

 Scenario: Busqueda de la palabra Ping Pong al dar enter
 When Como usuario busco la palabra ping pong
 And Como usuario doy enter