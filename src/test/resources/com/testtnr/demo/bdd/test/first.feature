Feature: the version can be retrieved
  Scenario: first makes call
    When the client calls version
    Then the client receives status code of "200"
    And the client receives first version "1.0"
    And the client receives first version "1.0"
    And the client receives first version "1.0"
    And the client receives first version "1.0"
    And the client receives first version "1.0"
    And the client receives first version "1.0"
    And the client receives first version "1.0"