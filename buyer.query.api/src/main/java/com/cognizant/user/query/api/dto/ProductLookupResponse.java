package com.cognizant.user.query.api.dto;

import com.cognizant.user.core.dto.BaseResponse;
import com.cognizant.user.core.models.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductLookupResponse extends BaseResponse {
    private List<Product> products;

    public ProductLookupResponse(String message) {
        super(message);
    }

    public ProductLookupResponse(List<Product> products) {
        super(null);
        this.products = products;
    }

    public ProductLookupResponse(String message, Product product) {
        super(message);
        this.products = new ArrayList<>();
        this.products.add(product);
    }

    public ProductLookupResponse(Product product) {
        super(null);
        this.products = new ArrayList<>();
        this.products.add(product);
    }

    public List<Product> getProducts() {
        return this.products;
    }

    public void setUsers(List<Product> users) {
        this.products = users;
    }
}
