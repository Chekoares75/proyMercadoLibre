#Author: diegoh.rodriguez@tcs.com
#Feature: Casos de prueba para el inicio de sesion
@tag
Feature: Title of your feature
  I want to use this template for my feature file
  
  @tag1
  Scenario Outline: Verificar solicitud de clave con usuario registrado
    Given ingresar al navegador y a la pagina web
    When pulsar link inicia e ingresar usuario registrado <usuario> 
    Then verificar que se solicite clave

    Examples: 
      | usuario  |
      | "HDORDGZ" |
      
  @tag2
  Scenario Outline: Verificar solicitud de clave con correo registrado
    Given ingresar al navegador y a la pagina web
    When pulsar link inicia e ingresar correo registrado <correo>
    Then verificar que se solicite clave

    Examples: 
      | correo  |
      | "aulaambientalentrenubes@gmail.com" |
           
  @tag3
  Scenario Outline: Verificar campo Email o usuario como campo obligatorio
    Given ingresar al navegador y a la pagina web
    When pulsar link inicia e ingresar correo vacio <correo>
    Then verificar mensaje de error completa dato 

    Examples: 
      | correo  |
      | "" | 
      
       @tag4
  Scenario Outline: Verificar que el campo Email o usuario tenga formato valido
    Given ingresar al navegador y a la pagina web
    When pulsar link inicia e ingresar correo <correo> 
    Then verificar mensaje de error revisa tu Email o usuario

    Examples: 
      | correo  |
      | "@@@" | 
      | "aulambiental@gmai.com" |  
      
       @tag5
  Scenario Outline: Verificar inicio de sesion exitoso con usuario
    Given ingresar al navegador y a la pagina web
    When pulsar link inicia e ingresar correo <usuario>
    When ingresar clave <clave>
    Then verificar inicio de sesion

    Examples: 
      | usuario  | clave |
     | "HDORDGZ" |     "Bogota2019*" | 
      
      @tag6
  Scenario Outline: Verificar inicio de sesion exitoso con correo
    Given ingresar al navegador y a la pagina web
    When pulsar link inicia e ingresar correo <correo>
    When ingresar clave <clave>
    Then verificar inicio de sesion

    Examples: 
      | correo  | clave |
      | "aulaambientalentrenubes@gmail.com" |     "Bogota2019*" | 
      
      @tag7
  Scenario Outline: Verificar que campo clave sea obligatorio
    Given ingresar al navegador y a la pagina web
    When pulsar link inicia e ingresar correo <correo>
    When ingresar clave vacia <clave>
    Then verificar mensaje de error completa dato

    Examples: 
      | correo  | clave |
     | "aulaambientalentrenubes@gmail.com" |     "" |
      
      @tag8
  Scenario Outline: Verificar que campo clave no inicie sesion con clave incorrecta
    Given ingresar al navegador y a la pagina web
    When pulsar link inicia e ingresar correo <correo>
    When ingresar clave incorrecta <clave>
    Then verificar mensaje de error revisa clave

    Examples: 
      | correo  | clave |
    | "aulaambientalentrenubes@gmail.com" |     "ClaveIncorrecta" | 
    
          @tag9
  Scenario Outline: Verificar funcionalidad boton no se mi clave
    Given ingresar al navegador y a la pagina web
    When pulsar link inicia e ingresar correo <correo>  
    When pulsar boton no se mi clave 
    Then verificar redireccion a opciones de recuperacion

    Examples: 
      | correo  |
     | "aulaambientalentrenubes@gmail.com" | 
    
  @tag10
  Scenario Outline: Verificar relacion inicio de sesion con pais de origen del correo
    Given ingresar al navegador y a la pagina web con pais diferente a Colombia
    When pulsar link inicia e ingresar correo <correo>
    Then verificar mensaje de error error pais

    Examples: 
      | correo  |
      | "aulaambientalentrenubes@gmail.com" | 