@CRAM-51
@REQ_CRAM-8
Feature: En tant que visiteur je peux créer un compte en tant que particulier en cliquant sur "Connecte-toi" et "Pas de compte"

	@TEST_CRAM-70
	Scenario: Test Auto En tant que visiteur je peux créer un compte en tant que particulier en cliquant sur "Connecte-toi" et "Pas de compte"
		Feature: Creer un compte
		
		  Scenario: Creer un compte particulier
		    Given Le particulier est sur la page principale
		    When il va sur la page de connexion
		    And il va sur la page de création de compte
		    And il écrit son prénom "John"
		    And il écrit son nom "Doe"
		    And il écrit son email "kaa@kaa.com"
		    And il écrit son mot de passe "Azer123!"
		    And il s'enregistre
		    Then on doit arriver à la page principale
