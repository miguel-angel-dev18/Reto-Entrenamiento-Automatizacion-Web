@web @regression

Feature: Delete customer

  Background:
    Given the user is authenticated
      | user  | pass     |
      | admin | serenity |

  Scenario: Delete an existing customer from the customer grid
    When the user opens the "Customers" module from Northwind
    And the user registers a "New Customer" with valid data
      | customerId | companyName | contactName | contactTitle|     address      | region | postalCode | phone   | fax        |     email       |
      | C001       | ACME        | Ana Lopez   | Madre       | calle 127 #14-20 | Dresde |   1100002  | 6774136 |212-555-1234| test@correo.com |
    And the user searches for customerId "C001" in the customer grid
    And the user deletes the selected customer
    Then the customer should not be displayed in the customer grid


