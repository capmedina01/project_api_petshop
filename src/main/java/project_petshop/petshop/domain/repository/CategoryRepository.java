package project_petshop.petshop.domain.repository;

import project_petshop.petshop.domain.Category;

import java.util.List;
import java.util.Optional;

public interface CategoryRepository {

    List<Category> getAll();
    Optional<Category> getById(int id);
    Category save(Category category);
    void delete(Category category);
}
