Feature: Calculator Online
  Scenario Outline: Show operation result
    Given The calculator is showed
    When The user attempt to execute <operator> between <number1> and <number2>
    Then The corresponding <result> is showed
    Examples:
      | number1 | operator | number2 | result |
      | 1       | +        | 2       | 3      |
      | 11      | +        | 19      | 30     |
      | 9       | -        | 6       | 3      |
      | 90      | -        | 20      | 70     |
      | 9       | *        | 6       | 54     |
      | 2.400   | *        | 1.200   | 2.88   |