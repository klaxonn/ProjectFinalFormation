Feature: Creer un compte

  Scenario: Creer un compte particulier
    Given Le particulier est sur la page principale
    When il va sur la page de connexion
    And il va sur la page de création de compte
    And il écrit son prénom "John"
    And il écrit son nom "Doe"
    And il écrit son email "ka@ka.com"
    And il écrit son mot de passe "Azer123!"
    And il s'enregistre
    Then on doit arriver à la page principale
