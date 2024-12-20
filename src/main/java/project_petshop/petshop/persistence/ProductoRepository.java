package project_petshop.petshop.persistence;

import org.springframework.stereotype.Repository;
import project_petshop.petshop.persistence.crud.ProductoCrudRepository;
import project_petshop.petshop.persistence.entity.Producto;

import java.util.List;
import java.util.Optional;

@Repository
public class ProductoRepository {

    private ProductoCrudRepository productoCrudRepository;

    public List<Producto> getProducto() {
        return (List<Producto>) productoCrudRepository.findAll();
    }
    public Optional<Producto> getProductoById(int id) {
        return productoCrudRepository.findById(id);
    }

    public Producto createProducto(Producto producto) {
        return productoCrudRepository.save(producto);
    }

     public void deleteProducto(int id) {
        productoCrudRepository.deleteById(id);
     }
}
