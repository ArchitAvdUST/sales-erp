package com.ust.sales_erp.controller;

import com.ust.sales_erp.dto.SalesDto;
import com.ust.sales_erp.entity.Sales;
import com.ust.sales_erp.service.SalesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class SalesController {

    @Autowired
    private SalesService salesService;

    @PostMapping("/sales")
    public ResponseEntity<Sales> addSales(SalesDto sales){
        return ResponseEntity.ok(salesService.addSales(sales));
    }

    @PutMapping("/sales")
    public ResponseEntity<Sales> updateSales(SalesDto sales){
        return ResponseEntity.ok(salesService.editSales(sales));
    }

    @DeleteMapping("/sales/{salesId}")
    public ResponseEntity<String> deleteSales(@PathVariable String salesId){
        salesService.deleteSales(salesId);
        return ResponseEntity.ok("Sales deleted");
    }

    @GetMapping("/sales/{salesId}")
    public ResponseEntity<Sales> getSales(@PathVariable String salesId){
        return ResponseEntity.ok(salesService.getASale(salesId));
    }

    @GetMapping("/sales")
    public ResponseEntity<List<Sales>> getAllSales(){
        return ResponseEntity.ok(salesService.getAllSales());
    }
}
