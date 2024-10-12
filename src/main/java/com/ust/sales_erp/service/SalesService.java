package com.ust.sales_erp.service;

import com.ust.sales_erp.dto.SalesDto;
import com.ust.sales_erp.entity.Sales;
import com.ust.sales_erp.repo.SalesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SalesService {

    @Autowired
    private SalesRepo salesRepo;

    public static Sales salesDtoToSales(SalesDto salesDto) {
        return Sales.builder()
                .phoneModel(salesDto.getPhoneModel())
                .quantity(salesDto.getQuantity())
                .price(salesDto.getPrice())
                .phoneName(salesDto.getPhoneName())
                .phoneProcessor(salesDto.getPhoneProcessor())
                .phoneRam(salesDto.getPhoneRam())
                .phoneStorage(salesDto.getPhoneStorage())
                .phoneBatteryCapacity(salesDto.getPhoneBatteryCapacity())
                .discount(salesDto.getDiscount())
                .tax(salesDto.getTax())
                .saleType(salesDto.getSaleType())
                .saleId(salesDto.getSaleId())
                .saleName(salesDto.getSaleName())
                .saleDate(salesDto.getSaleDate())
                .saleStoreLocation(salesDto.getSaleStoreLocation())
                .customerName(salesDto.getCustomerName())
                .customerAddress(salesDto.getCustomerAddress())
                .customerPhone(salesDto.getCustomerPhone())
                .customerEmail(salesDto.getCustomerEmail())
                .build();
    }

    public Sales addSales(SalesDto sales){
        return salesRepo.save(salesDtoToSales(sales));
    }

    public Sales editSales(SalesDto sales){
        Optional<Sales> s= salesRepo.findById(sales.getSaleId());
        if(s.isPresent())
            return salesRepo.save(salesDtoToSales(sales));
        throw new RuntimeException("Sales not found");
    }

    public void deleteSales(String saleId){
        if(salesRepo.findById(saleId).isPresent())
            salesRepo.deleteById(saleId);
        throw new RuntimeException("Sales not found");
    }

    public Sales getASale(String saleId){
        Optional<Sales> s = salesRepo.findById(saleId);
        if(s.isPresent())
            return s.get();
        throw new RuntimeException("Sale not found");
    }

    public List<Sales> getAllSales(){
        return salesRepo.findAll();
    }
}
