@Request
Feature: Request Car Insurance
  As an user
  I should be able to request quotation for Car Insurance

  Scenario: Successful request1
    Given Customer has car older than 10 years
    When Customer enters the car details on portal
      | Car Number       | 25PHLV     |
      | Damage Free Year |          4 |
      | DOB              | 01-11-1991 |
      | Gender           | Man        |
      | Postcode         | 1185SL     |
      | House Number     |        255 |
      | Living Situation | Single     |
    Then Application should advice for WA coverage

  Scenario: Successful request2
    Given Customer has new car
    When Customer enters the car details of new car on portal
      | Car Number       | 8ZBD51     |
      | Damage Free Year |          4 |
      | DOB              | 01-11-1991 |
      | Gender           | Man        |
      | Postcode         | 1185SL     |
      | House Number     |        255 |
      | Living Situation | Single     |
    Then Application should advice for All risk coverage

  Scenario: Successful request3
    Given Customer has older car
    When Customer chooses for WA coverage
      | Car Number       | 25PHLV     |
      | Damage Free Year |          4 |
      | DOB              | 01-11-1991 |
      | Gender           | Man        |
      | Postcode         | 1185SL     |
      | House Number     |        255 |
      | Living Situation | Single     |
    Then Premium should be calculated and displayed

  Scenario: Negative scenario1
    Given Customer is younger than 16 years
    When Customer enters car details
      | Car Number       | 25PHLV     |
      | Damage Free Year |          4 |
      | DOB              | 01-11-2010 |
      | Gender           | Man        |
      | Postcode         | 1185SL     |
      | House Number     |        255 |
      | Living Situation | Single     |
    Then Proper error message should be displayed for age
    
  Scenario: Negative scenario2
    Given Customer opens portal
    When Enters invalid car number
      | Car Number       | AB1234     |
      
    Then Proper error message should be displayed for invalid car number
