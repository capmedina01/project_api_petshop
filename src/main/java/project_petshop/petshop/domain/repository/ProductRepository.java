package project_petshop.petshop.domain.repository;

import project_petshop.petshop.domain.Product;

import java.util.List;
import java.util.Optional;

public interface ProductRepository {
    List<Product> getAll();
    Optional<Product>  getById(int id);
    Product save(Product product);
    void delete(int id);


}
