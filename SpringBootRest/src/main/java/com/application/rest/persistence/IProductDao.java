package com.application.rest.persistence;

import com.application.rest.entities.Product;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

public interface IProductDao {

    List<Product> findAll();

    Optional<Product> findById(Long id);

    List<Product> findByPriceInRange(BigDecimal minprice, BigDecimal maxprice);

    void save(Product product);

    void deleteById(long id);
}
