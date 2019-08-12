#Author: kevin.gutierrez@sophossolutions.com

Feature: Realizar compra 
  Kevin como usuario quiere poder entrar a plaza vea y realizar una compra

  #@tag1
  #Scenario: Compra exitosa
    #Given Que Kevin ingresa a la pagina de plaza vea
    #When Realice la compra del producto 
    #Then Deberia ver su producto en el carrito 
   
  
 @tag2
  Scenario Outline: Compra exitosa	
  Given Que Kevin ingresa a la pagina de plaza vea
  When Realice la compra del producto<producto>
  Then Deberia ver su producto en el carrito 

   Examples: 
      #| TestCase  | Producto | 
      #| name1     |     5    | 
      #| name2     |     7    |   
		| producto | 	
		|Televisor LG LED 49lk|
		#|Televisor LG LED 49\" FHD Smart TV 49LK5400 |  

   
#realiza
#hacerlo con el segundo escenario, no datos quemados 
#escenario outline
