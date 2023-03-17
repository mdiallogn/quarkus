package org.acme.getting.started.service;

import org.acme.getting.started.model.Product;

import java.util.Arrays;
import java.util.List;

public class ProductService {

    private final List<Product> products = Arrays.asList(new Product("Computer", 1500), new Product("Mouse", 50));

    public List<Product> getProducts(){
        return products;
    }
}
