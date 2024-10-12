package com.ust.sales_erp.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Builder
public class Sales {

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
