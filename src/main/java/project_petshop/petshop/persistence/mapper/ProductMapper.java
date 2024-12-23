package project_petshop.petshop.persistence.mapper;


import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import project_petshop.petshop.domain.Product;
import project_petshop.petshop.persistence.entity.Producto;

import java.util.List;

@Mapper(componentModel = "spring", uses = {CategoryMapper.class})
public interface ProductMapper {

    @Mappings({
            @Mapping(source = "idProducto", target = "product_id"),
            @Mapping(source = "nombre", target = "product_name"),
            @Mapping(source = "idCategoria", target = "category_id"),
            @Mapping(source = "precioVenta", target = "product_price"),
            @Mapping(source = "cantidadStock", target = "product_quantity"),
            @Mapping(source = "estado", target = "product_active"),
            @Mapping(source = "categoria", target = "category")
    })
    Product toProduct(Producto producto);
    List<Product> toProducts(List<Producto> productos);

    @InheritInverseConfiguration
    @Mapping(target = "codigoBarras", ignore = true)
    Producto toProducto(Product product);
}
