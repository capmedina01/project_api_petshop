package project_petshop.petshop.persistence;

import org.springframework.stereotype.Repository;
import project_petshop.petshop.persistence.crud.CategoriaCrudRepository;
import project_petshop.petshop.persistence.entity.Categoria;

import java.util.List;

@Repository
public class CategoriaRepository {

    private CategoriaCrudRepository categoriaCrudRepository;

    public List<Categoria> getCategoria(){
        return (List<Categoria>) categoriaCrudRepository.findAll();
    }

    public Categoria createCategoria(Categoria categoria){
        return categoriaCrudRepository.save(categoria);
    }

    public Categoria updateCategoria(Categoria categoria){
        return categoriaCrudRepository.save(categoria);
    }

    public void deleteCategoria(int id){
        categoriaCrudRepository.deleteById(id);

    }
}
