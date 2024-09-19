Feature: Cautare laptopuri Apple pe Emag
  Scenario: User nelogat cauta laptopuri
    Given User deschide browser
    When User cauta "emag.ro"
    And User cauta "laptopuri Apple"
    Then User primeste lista cu laptopuri Apple