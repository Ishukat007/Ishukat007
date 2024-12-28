package com.wecp.progressive.service.impl;

import com.wecp.progressive.service.SupplierService;

public class SupplierServiceImplArraylist implements SupplierService  {
    private List<Supplier>supplierList = new ArrayList<>();
    @Override
    public List<Supplier> getAllSuppliers(){
        return supplierList;
    }
    @Override
    public int addSupplier(Supplier supplier){
        supplierList.add(supplier);
        return supplierList.size();
    }
}