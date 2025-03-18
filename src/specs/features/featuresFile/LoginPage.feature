@authentification
Feature: Authentification de l application SwagLabs
  En tant que utilisateur je souhaite m ithentifier

  @login_CasPassant
  Scenario: Authentification de l application SwagLabs cas passant
    Given Je me connecte sur l application SwagLabs
    When Je saisis le user name "standard_user"
    And Je saisis le password "secret_sauce"
    And Je clique sur le bouton Login
    Then Je me redirige vers la page Home "Products"
