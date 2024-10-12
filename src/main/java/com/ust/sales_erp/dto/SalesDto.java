package com.ust.sales_erp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class SalesDto {

    private String phoneModel;
    private String quantity;
    private double price;
    private String phoneName;
    private String phoneProcessor;
    private String phoneRam;
    private String phoneStorage;
    private String phoneBatteryCapacity;
    private double discount;
    private double tax;

    private String saleType;
    private String saleId;
    private String saleName;
    private String saleDate;
    private String saleStoreLocation;

    private String customerName;
    private String customerAddress;
    private String customerPhone;
    private String customerEmail;
}
