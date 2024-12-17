package project_petshop.petshop.persistence.crud;

import org.springframework.data.repository.CrudRepository;
import project_petshop.petshop.persistence.entity.Producto;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {
}
