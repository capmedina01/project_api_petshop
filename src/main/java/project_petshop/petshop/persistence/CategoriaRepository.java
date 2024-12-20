package project_petshop.petshop.persistence;

import org.springframework.stereotype.Repository;
import project_petshop.petshop.persistence.crud.CategoriaCrudRepository;
import project_petshop.petshop.persistence.entity.Categoria;

import java.util.List;
import java.util.Optional;

@Repository
public class CategoriaRepository {

    private CategoriaCrudRepository categoriaCrudRepository;

    public List<Categoria> getCategoria(){
        return (List<Categoria>) categoriaCrudRepository.findAll();
    }

    public Optional<Categoria> getCategoriaById(int id){return categoriaCrudRepository.findById(id);}

    public Categoria createCategoria(Categoria categoria){
        return categoriaCrudRepository.save(categoria);
    }


    public void deleteCategoria(int id){
        categoriaCrudRepository.deleteById(id);

    }
}
