Feature: Vamos realizar test a una tabla statica

Background: como usuario navego a la pagina web de la tabla
    Given Navego al sitio web de la tabla statica

Scenario: Validar el valor que retorna la celda fila 5 columna 2
    Then Como usuario valido el valor de la celda fila 5 columna 2


Scenario: Validar que la tabla se muestre
    Then Como usuario valido si la tabla se muestra en la pagina

@Table
Scenario: Modificar el valor para la celda fila 4, columna 1
    When Como usuario modifico el valor de la celda
    Then Como usuario valido el nuevo valor de la celda