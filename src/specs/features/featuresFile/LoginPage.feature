@authentification
Feature: Authentification de l application nopcommerce
  En tant que utilisateur je souhaite m ithentifier

  @login_CasPassant
  Scenario: Authentification de l application nopcommerce cas passant
    Given Je me connecte sur l application nopcommerce
    When Je saisis le Email "admin@yourstore.com"
    And Je saisis le Password "admin"
    And Je clique sur le bouton LogIn
    Then Je me redirige vers la page Home ""
