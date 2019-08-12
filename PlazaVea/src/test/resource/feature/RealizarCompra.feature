#Author: kevin.gutierrez@sophossolutions.com

Feature: Realizar compra 
  Kevin como usuario quiere poder entrar a plaza vea y realizar una compra
 
 @tag2
  Scenario Outline: Compra exitosa	
  Given Que Kevin ingresa a la pagina de plaza vea
  When Realice la compra del producto<producto>
  Then Deberia ver su <productocomprado>

   Examples:   
		| producto            |productocomprado   |
		|Televisor LG LED 49lk|Televisor LG LED 49|							 
		  

   
