#Author: kevin.gutierrez@sophossolutions.com

Feature: Realizar compra 
  Kevin como usuario quiere poder entrar a plaza vea y realizar una compra

  @tag1
  Scenario: Compra exitosa
    Given Que Kevin ingresa a la pagina de plaza vea
    When Realice la compra del producto 
    Then Deberia ver su producto en el carrito 
   


