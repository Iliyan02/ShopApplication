package com.prep.softuni.service.impl;

import com.prep.softuni.models.entity.Product;
import com.prep.softuni.repository.ProductRepository;
import com.prep.softuni.service.ProductService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;
    private final ModelMapper modelMapper;

    public ProductServiceImpl(ProductRepository productRepository, ModelMapper modelMapper) {
        this.productRepository = productRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public void addProduct(Product map) {
        productRepository.save(modelMapper.map(map, Product.class));
    }

    @Override
    public void delete() {
        productRepository.deleteAll();
    }
}
