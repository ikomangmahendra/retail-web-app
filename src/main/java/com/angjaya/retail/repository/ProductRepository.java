package com.angjaya.retail.repository;

import com.angjaya.retail.domain.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
