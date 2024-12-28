package com.wecp.progressive.entity;

public class Warehouse {

    private int warehouse_id;
    private String location;
    private int capacity;

    public Warehouse(){}
    
    public int getWarehouse_id() {
        return warehouse_id;
    }
   public Warehouse(int warehouse_id, String location, int capacity) {
    this.warehouse_id = warehouse_id;
    this.location = location;
    this.capacity = capacity;
}
 public void setWarehouse_id(int warehouse_id) {
        this.warehouse_id = warehouse_id;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    
}