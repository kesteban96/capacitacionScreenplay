#Author: kevin.gutierrez@sophossolutions.com


#en una aplicación puede haber muchos feature
#Las etiquetas Agrupa feature y escenarios 
@tag
Feature: Busqueda en Google
  Kevin como usuario quiere poder entrar a google y buscar una palabra
   
#Este es meramente un caso de prueba, el que no tiene la tabla
#si tengo 4 escenarios para cada uno debo hacerle la divicion  
  @smoketest
  Scenario: Busqueda Exitosa
    Given Que kevin esta en la pagina de google 
    When Cuando busca la palabra "Quesito"
    Then Deberia ver el resultado de wikipedia 



