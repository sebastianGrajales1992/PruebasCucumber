Feature: Test a los alert de la pagina

Background: Navegar al sitio web
Given Navegar al sitio web donde esta el alert

Scenario: Validar si existe el alert
When Como usuario doy click al boton show alert
Then Como usuario valido si se muestra el alert


Scenario: Aceptar alert box
When Como usuario doy click en el boton show alertbox
Then Como usuario doy click en aceptar


Scenario Outline: Validar funcionamiento show confirm box
When Como usuario doy click al boton show confirm box
And Como usuario hago una <accion>
Then Como usuario espero una <respuesta> de acuerdo a la accion seleccionada
Examples:
    | accion | respuesta |
    | aceptar  | true  |
    | cancelar | false |


Scenario Outline: Validar funcionamiento show prompt box cuando se da aceptar
When Como usuario doy click al boton show prompt box
And Como usuario envio un <texto> al alert
And Como usuario en prompt hago una <accion>
Then Como usuario espero visualizar el <textoRespuesta> que se digito
Examples:
    |texto | accion   | textoRespuesta |
    | test | aceptar  | test           |
    | cat  | aceptar  | cat            |
    | dog  | aceptar  | dog            |

@smoke
Scenario: Validar funcionamiento show prompt box cuando se da cancelar
When Como usuario doy click en el boton show prompt box
And Como usuario en prompt doy click en cancelar
Then Como usuario Espero no visualizar el texto

@ColorHover
Scenario: Revisar color de boton al hacer hover
When Como usuario hago hover en boton
Then Como usuario valido el color del hover