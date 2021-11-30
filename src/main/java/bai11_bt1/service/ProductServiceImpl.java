package bai11_bt1.service;

import bai11_bt1.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl implements ProductService {
    private List<Product> productList;
    private List<Product> productListFind = new ArrayList<>();

    public ProductServiceImpl() {
        productList = new ArrayList<>();
        productList.add(new Product("111", 1, 1111));
        productList.add(new Product("222", 2, 2222));
        productList.add(new Product("333", 3, 3333));
    }

    @Override
    public int findIndexById(int id) {
        for (int index = 0; index < productList.size(); index++) {
            if (productList.get(index).getId() == id) {
                return index;
            }
        }
        return -1;
    }

    @Override
    public List<Product> findAll() {
        return productList;
    }

    @Override
    public void save(Product product) {
        productList.add(product);
    }

    @Override
    public Product findById(int id) {
        for (Product p : productList
        ) {
            if (p.getId() == id)
                return p;
        }
        return null;
    }

    @Override
    public void findByNameRE(String name) {

    }

    @Override
    public List<Product> findByName(String name) {

        for (Product p : productList
        ) {
            if (p.getName().contains(name)) {
                productListFind.add(p);
            }
        }
        return productListFind;
    }

    @Override
    public void update(int id, Product product) {
        productList.set(findIndexById(id), product);
    }

    @Override
    public void delete(int id) {
        productList.remove(findIndexById(id));
    }
}
