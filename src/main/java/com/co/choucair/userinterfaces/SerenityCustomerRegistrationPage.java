package com.co.choucair.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class SerenityCustomerRegistrationPage
{

    public static final Target CUSTOMER_ID_INPUT =
            Target.the("Customer ID input")
                    .locatedBy("//input[@name='CustomerID']");


    public static final Target COMPANY_NAME_INPUT =
            Target.the("Company Name input")
                    .locatedBy("//input[@name='CompanyName']");

    public static final Target CONTACT_NAME_INPUT =
            Target.the("Contact Name input")
                    .locatedBy("//input[@name='ContactName']");

    public static final Target CONTACT_TITLE_INPUT =
            Target.the("Contact Title input")
                    .locatedBy("//input[@name='ContactTitle']");


    public static final Target REPRESENTATIVES =
            Target.the("Representatives multi select")
                    .locatedBy("//label[normalize-space()='Representatives']/following::input[contains(@class,'select2-input')][1]");

    public static final Target ADDRESS_INPUT =
            Target.the("Address input")
                    .locatedBy("//input[@name='Address']");


    public static final Target COUNTRY_SELECT =
            Target.the("Country select")
                    .locatedBy("//label[normalize-space()='Country']/following::span[contains(@class,'select2-chosen')][1]");

    public static final Target CITY_SELECT =
            Target.the("City select")
                    .locatedBy("//label[normalize-space()='City']/following::span[contains(@class,'select2-chosen')][1]");


    public static final Target REGION_INPUT =
            Target.the("Region input")
                    .locatedBy("//input[@name='Region']");


    public static final Target POSTAL_CODE_INPUT =
            Target.the("Postal code input")
                    .locatedBy("//input[@name='PostalCode']");


    public static final Target PHONE_INPUT =
            Target.the("Phone input")
                    .locatedBy("//input[@name='Phone']");

    public static final Target FAX_INPUT =
            Target.the("Fax input")
                    .locatedBy("//input[@name='Fax']");

    public static final Target EMAIL_INPUT =
            Target.the("Email input")
                    .locatedBy("//input[@name='Email']");

    public static Target customerLink(String customerId) {
        return Target.the("Customer link " + customerId)
                .locatedBy("//a[@data-item-id='" + customerId + "']");
    }



    public static Target RECORD_LINK_BY_ID(String id) {
        return Target.the("record link with id " + id)
                .located(By.xpath(
                        "//a[contains(@class,'s-EditLink') and normalize-space()='" + id + "']"
                ));
    }



    public static final Target QUICK_SEARCH =
            Target.the("quick search del grid de clientes")
                    .located(By.xpath(
                            "//input[starts-with(@id,'Serenity_Demo_Northwind_CustomerGrid') and contains(@id,'QuickSearchInput')]"
                    ));







}
