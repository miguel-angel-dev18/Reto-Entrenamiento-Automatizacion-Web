package com.co.choucair.models;


import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.datatable.DataTable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CustomerLoombokData {

    // ===== Cliente =====
    private String customerId;
    private String companyName;

    // ===== Contacto =====
    private String contactName;
    private String contactTitle;

    // ===== Dirección =====
    private String address;
    private String region;
    private String postalCode;
    private String phone;
    private String fax;

    // ===== Detalles =====
    private String email;
    private String newsletter;

    // ===== Mapper desde DataTable =====
    public static List<CustomerLoombokData> setData(DataTable table) {

        List<CustomerLoombokData> data = new ArrayList<>();
        List<Map<String, String>> mapList = table.asMaps();

        for (Map<String, String> map : mapList) {
            data.add(
                    new ObjectMapper().convertValue(map, CustomerLoombokData.class)
            );
        }
        return data;
    }

    // ===== Getters y Setters =====
    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactTitle() {
        return contactTitle;
    }

    public void setContactTitle(String contactTitle) {
        this.contactTitle = contactTitle;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNewsletter() {
        return newsletter;
    }

    public void setNewsletter(String newsletter) {
        this.newsletter = newsletter;
    }
}

