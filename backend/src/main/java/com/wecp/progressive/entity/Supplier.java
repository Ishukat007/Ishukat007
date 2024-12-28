package com.wecp.progressive.entity;

public class Supplier implements Comparable<Supplier> {
    private int supplier_Id;
    private String supplier_name;
    private String contact_email;
    private String contact_phone;
    private String address;
    private String role;

    public Supplier(){}

    public Supplier(int supplier_Id, String supplier_name, String contact_email, String contact_phone, String address,
            String role)  {
        this.supplier_Id = supplier_Id;
        this.supplier_name = supplier_name;
        this.contact_email = contact_email;
        this.contact_phone = contact_phone;
        this.address = address;
        this.role = role;
    }
    public int getSupplier_Id() {
        return supplier_Id;
    }

    public void setSupplier_Id(int supplier_Id) {
        this.supplier_Id = supplier_Id;
    }

    public String getSupplier_name() {
        return supplier_name;
    }

    public void setSupplier_name(String supplier_name) {
        this.supplier_name = supplier_name;
    }

    public String getContact_email() {
        return contact_email;
    }

    public void setContact_email(String contact_email) {
        this.contact_email = contact_email;
    }

    public String getContact_phone() {
        return contact_phone;
    }

    public void setContact_phone(String contact_phone) {
        this.contact_phone = contact_phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
    @Override
    public int compareTo(Supplier other){
        return this.supplier_name.compareTo(other.getSupplier_name());
    }
}