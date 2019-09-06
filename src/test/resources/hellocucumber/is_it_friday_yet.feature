Feature: Is it Friday yet?
    Everybody wants to know when it is Friday

    Scenario: Sunday is not Friday
        Given today is "Sunday"
        When I ask whether it is Friday yet
        Then I should be told "Nope"
    
    Scenario: Friday is Friday
        Given today is "Friday"
        When I ask whether it is Friday yet
        Then I should be told "TGIF"

    Scenario Outline: Today is or not Friday
        Given today is "<day>"
        When I ask whether it is Friday yet
        Then I should be told "<answer>"

    Examples:
        | day            | answer |
        | Friday         | TGIF   |
        | Sunday         | Nope   |
        | anything else! | Nope   |
