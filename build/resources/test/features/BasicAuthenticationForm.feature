@Login
Feature: Comprobar una autenticacion basica en formulario

Background: Navegar al sitio web del login
Given Como usuario navego al sitio web del formulario de login

Scenario Outline: Comprobar que se hace una autenticacion correcta
    When Como usuario ingreso un <usuario>
    And Como usuario ingreso una <contraseña>
    And Como usuario doy click en el boton de login
    Then Como usuario Valido que el login sea exitoso
    Examples:
        | usuario | contraseña |
        | tomsmith  | SuperSecretPassword!  |

