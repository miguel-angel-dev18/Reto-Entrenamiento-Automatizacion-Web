@web @smoke
Feature: Customer registration

  As a system user
  I want to register a new customer
  So that the customer can be managed in the platform

  Scenario: Successful customer registration
    Given the user is authenticated
      | user  | pass     |
      | admin | serenity |
    When the user opens the "Customers" module from Northwind
    And the user registers a "New Customer" with valid data
      | customerId | companyName | contactName | contactTitle|     address      | region | postalCode | phone   | fax        |     email       |
      | C001       | ACME        | Ana Lopez   | Madre       | calle 127 #14-20 | Dresde |   1100002  | 6774136 |212-555-1234| test@correo.com |
    Then the customer should be registered successfully
