package project_petshop.petshop.persistence;

import org.springframework.stereotype.Repository;
import project_petshop.petshop.domain.Product;
import project_petshop.petshop.domain.repository.ProductRepository;
import project_petshop.petshop.persistence.crud.ProductoCrudRepository;
import project_petshop.petshop.persistence.entity.Producto;
import project_petshop.petshop.persistence.mapper.ProductMapper;

import java.util.List;
import java.util.Optional;

@Repository
public class ProductoRepository implements ProductRepository {

    private ProductoCrudRepository productoCrudRepository;
    private ProductMapper mapper;

    @Override
    public List<Product> getAll() {
        List<Producto> productos = (List<Producto>) productoCrudRepository.findAll();
        return mapper.toProducts(productos);
    }

    @Override
    public Optional<Product> getById(int id) {
        return productoCrudRepository.findById(id).map(producto -> mapper.toProduct(producto));
    }

    @Override
    public Product save(Product product) {
        Producto producto = mapper.toProducto(product);
        return mapper.toProduct(productoCrudRepository.save(producto));
    }

    @Override
    public void delete(int id) {
        productoCrudRepository.deleteById(id);

    }


}
