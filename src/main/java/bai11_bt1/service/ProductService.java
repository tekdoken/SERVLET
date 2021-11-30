package bai11_bt1.service;

import bai11_bt1.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll();

    void save(Product product);

    Product findById(int id);
    int findIndexById(int id);

    void update(int id, Product product);

    void delete(int id);
}
