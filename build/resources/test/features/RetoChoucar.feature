# language: es

Característica: Como un aspirante quiero entrar a la pagina de Choucair para hacerle pruebas

  Escenario: Ingresar a la pagina de Choucair y dirigirme a el formulario de contactenos
    Dado que el usuario quiere entrar a la pagina y dirigirse a la opcion de contatenos
    Cuando el abre el navegador y busca la pagina de Choucair y se dirige a esa opcion
      | temaInteres | nombre | apellido |
      | PQRS        | Maria  | Clara    |
    Entonces el sistema me debe mostrar el siguiente mensaje Pruebas móviles


    @Industrias
  Escenario: Ingresar a la pagina de Choucair y dirigirme a el formulario de Industrias
    Dado que el usuario quiere entrar a la pagina y dirigirse a la opcion de Industrias
    Cuando el abre el navegador y busca la pagina de Choucair y se dirige a esa opcion de Industrias

    Entonces el sistema de la pagina me debe mostrar el siguiente mensaje Retos de transformación