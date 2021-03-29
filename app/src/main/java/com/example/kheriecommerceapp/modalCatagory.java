package com.example.kheriecommerceapp;

public class modalCatagory {
    private String CatagoryIconLink;
    private String CatagoryName;

    public modalCatagory(String catagoryIconLink, String catagoryName) {
        CatagoryIconLink = catagoryIconLink;
        CatagoryName = catagoryName;
    }

    public String getCatagoryIconLink() {
        return CatagoryIconLink;
    }

    public String getCatagoryName() {
        return CatagoryName;
    }

    public void setCatagoryIconLink(String catagoryIconLink) {
        CatagoryIconLink = catagoryIconLink;
    }

    public void setCatagoryName(String catagoryName) {
        CatagoryName = catagoryName;
    }
}
