package com.example.pharmacy;
public class SuppliersData {

    private final int supplierId;
    private final String supplierName;
    private final String supplierContact;
    private String supplierEmail;
    private String supplierLocation;

    public SuppliersData(int supplierId, String supplierName, String supplierContact, String supplierEmail, String supplierLocation) {
        this.supplierId = supplierId;
        this.supplierName = supplierName;
        this.supplierContact = supplierContact;
        this.supplierEmail = supplierEmail;
        this.supplierLocation = supplierLocation;
    }

    public Integer getSupplierId() {
        return supplierId;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public String getSupplierContact() {
        return supplierContact;
    }

    public String getSupplierEmail() {
        return supplierEmail;
    }

    public String getSupplierLocation() {
        return supplierLocation;
    }
}
