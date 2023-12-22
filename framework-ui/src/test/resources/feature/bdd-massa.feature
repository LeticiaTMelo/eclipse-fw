#Author: leticiamelo.work@gmail.com

@nExecuta
Feature: Pesquisa google
  Eu como usuario quero realizar pesquisa no google para invalidar informação

@nExecuta
  Scenario Outline: Pesquisar no google
  
    Given que eu esteja no "https://www.google.com.br"
    When pesquisar <pesquisa> 
    Then visualizo as <informacoes>

    Examples: 
       | pesquisa            |    informacoes    |
       |  "E2E Treinamentos" |"E2E Treinamentos" |
       |     "Saturno"       |    "Saturno"      |
       |   "Netuno"          |     "Netuno"      | 
       
       
  
   Scenario: Pesquisando google
    Given que eu esteja no "https://www.google.com.br"
    When pesquisar "Informação"
    Then visualizo as "Informação"