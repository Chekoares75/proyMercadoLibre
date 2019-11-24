#Author: your.email@your.domain.com
#Feature: Casos de prueba para el emergente Pop-up

@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario Outline: verificar aparcion del emergente
    Given ingresar al navegador y a la pagina web
    When ingresar elemento de busqueda para adulto <adulto>
    Then verificar que aparezca el emergente

    Examples: 
      | adulto  |
      | "adulto" |
      
      @tag2
  Scenario Outline: verificar que se realice la busqueda
    Given ingresar al navegador y a la pagina web
    When ingresar elemento de busqueda para adulto <adulto>
    When pulsar boton ver resultados
    Then verificar se realice la busqueda

    Examples: 
      | adulto  |
      | "adulto" |
      
      @tag3
  Scenario Outline: verificar que no se realice la busqueda por pulsar boton
    Given ingresar al navegador y a la pagina web
    When ingresar elemento de busqueda para adulto <adulto>
    When pulsar boton no ver resultados
    Then verificar que no aparezca el contenido de la busqueda

    Examples: 
      | adulto  |
      | "adulto" |

@tag4
  Scenario Outline: verificar que no se realice la busqueda por pulsar fuera del emergente
    Given ingresar al navegador y a la pagina web
    When ingresar elemento de busqueda para adulto <adulto>
    When pulsar fuera del emergente
    Then verificar que no aparezca el contenido de la busqueda

    Examples: 
      | adulto  |
      | "adulto" |
      
      @tag5
  Scenario Outline: verificar que no se realice la busqueda por pulsar boton cerrar
    Given ingresar al navegador y a la pagina web
    When ingresar elemento de busqueda para adulto <adulto>
    When pulsar boton cerrar emergente
    Then verificar que no aparezca el contenido de la busqueda

    Examples: 
      | adulto  |
      | "adulto" |
      
      @tag6
  Scenario Outline: verificar que se realice la busqueda estando logueado
    Given ingresar al navegador y a la pagina web
    When pulsar link inicia e ingresar correo <usuario>
    When ingresar clave <clave>
    When ingresar elemento de busqueda para adulto <adulto>
    When pulsar boton ver resultados
    Then verificar se realice la busqueda

    Examples: 
      | usuario  |clave  |adulto  |
      | "aulaambientalentrenubes@gmail.com" | "Bogota2019*" | "adulto" |