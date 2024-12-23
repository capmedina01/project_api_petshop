package project_petshop.petshop.persistence.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import project_petshop.petshop.domain.Category;
import project_petshop.petshop.persistence.entity.Categoria;

@Mapper(componentModel = "spring")
public interface CategoryMapper {
    @Mappings({
            @Mapping(source = "idCategoria", target = "category_id"),
            @Mapping(source = "nombreCategoria", target = "category_name"),
            @Mapping(source = "estado", target = "category_active"),
    })
    Category toCategory(Categoria categoria);

    @InheritInverseConfiguration
    Categoria toCategoria(Category category);


}
