package com.application.rest.service.impl;

import com.application.rest.entities.Product;
import com.application.rest.persistence.IProductDao;
import com.application.rest.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements IProductService {

    @Autowired
    private IProductDao productDao;

    @Override
    public List<Product> findAll() {
        return productDao.findAll();
    }

    @Override
    public Optional<Product> findById(Long id) {
        return productDao.findById(id);
    }

    @Override
    public List<Product> findByPriceInRange(BigDecimal minprice, BigDecimal maxprice) {
        return productDao.findByPriceInRange(minprice, maxprice);
    }

    @Override
    public void save(Product product) {
        productDao.save(product);
    }

    @Override
    public void deleteById(long id) {
        productDao.deleteById(id);

    }
}
