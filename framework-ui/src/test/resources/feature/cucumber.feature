#Author: leticiamelo.work@gmail.com

Feature:Realizar Realizar pesquisa no google
Eu como usuario quero realizar pesquisas no google para receber as informacoes


Background: Acessar o google
    Given que eu esteja no "https://www.google.com.br"
Scenario: Pesquisar E2E Treinamentos
    
    When pesquisar "E2E Treinamentos"
    Then valido escola "E2E Treinamentos"

Scenario: Pesquisar Inovacao

    When pesquisar "Inovação"
    Then valido inovacao "Inovação"

Scenario: Pesquisar Felicidade

    When pesquisar "Felicidade"
    Then valido felicidade "Felicidade"
 