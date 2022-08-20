@Check
Feature: Probar funcionalidad de dar click al checbox

Scenario Outline: Desplegar lista del checkBox
Given Como usuario navego al sitio web de pruebas y selecciono el apartado checbox
When Como usuario doy click al icino de desplegar lista
Then Valido si la lista existe el <elemento> desplegada
    Examples:
        | elemento |
        | Desktop  |
        | Documents|
        | Downloads |
