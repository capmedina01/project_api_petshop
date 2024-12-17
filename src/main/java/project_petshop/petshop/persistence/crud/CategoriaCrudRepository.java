package project_petshop.petshop.persistence.crud;

import org.springframework.data.repository.CrudRepository;
import project_petshop.petshop.persistence.entity.Categoria;

public interface CategoriaCrudRepository extends CrudRepository<Categoria, Integer> {
}
