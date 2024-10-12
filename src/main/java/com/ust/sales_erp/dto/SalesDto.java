package com.ust.sales_erp.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.UniqueElements;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class SalesDto {

    @NotBlank
    private String phoneModel;
    @Min(value = 1, message = "Quantity must be greater than 0")
    private String quantity;
    @Min(value = 1, message = "Price must be greater than 0")
    private double price;
    @NotBlank
    private String phoneName;
    @NotBlank
    private String phoneProcessor;
    @NotBlank
    private String phoneRam;
    @NotBlank
    private String phoneStorage;
    @NotBlank
    private String phoneBatteryCapacity;

    private double discount;
    @Min(value = 1, message = "Tax must be greater than 0")
    private double tax;

    @NotBlank
    private String saleType;
    @UniqueElements
    private String saleId;
    @NotBlank
    private String saleName;
    @NotBlank
    private String saleDate;
    @NotBlank
    private String saleStoreLocation;

    @NotBlank
    private String customerName;
    @NotBlank
    private String customerAddress;
    @NotBlank
    private String customerPhone;
    @Email
    private String customerEmail;
}
