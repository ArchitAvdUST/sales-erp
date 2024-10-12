package com.ust.sales_erp.repo;

import com.ust.sales_erp.entity.Sales;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SalesRepo extends MongoRepository<Sales, String> {
}
