@ReservaVuelo
Feature: Flujo para pagar la reserva de vuelo
Background: Como usuario navegar a la pagina de pagar la reserva
Given navegar al sitio web de pagar la reserva

Scenario Outline: Validar visualizacion de tipo de tarjetas
When Como usuario obtengo la lista de opciones de tipo de tarjetas
Then Como usuario valido si se encuentra el <tipoTarjeta> en la lista
Examples:
    | tipoTarjeta | 
    | Visa  |
    |American Express|
    |Diner's Club|
    |Pichincha|

Scenario: Realizar compra
When Como usuario doy click en el boton de pagar
Then Como usuario deseo ver un mensaje informando del exito de la transaccion.