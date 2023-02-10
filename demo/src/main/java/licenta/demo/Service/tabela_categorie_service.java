package licenta.demo.Service;

import licenta.demo.Dto.tabela_categorie_dto;
import licenta.demo.Entity.tabela_categorie_entity;
import licenta.demo.Mapper.tabela_categorie_mapper;
import licenta.demo.Repository.tabela_categorie_repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class tabela_categorie_service {

    private final licenta.demo.Repository.tabela_categorie_repo tabela_categorie_repo;

    private final licenta.demo.Mapper.tabela_categorie_mapper tabela_categorie_mapper;

    @Autowired

    public tabela_categorie_service(licenta.demo.Repository.tabela_categorie_repo tabela_categorie_repo, licenta.demo.Mapper.tabela_categorie_mapper tabela_categorie_mapper) {
        this.tabela_categorie_repo = tabela_categorie_repo;
        this.tabela_categorie_mapper = tabela_categorie_mapper;
    }

    public tabela_categorie_entity creare_categorie(tabela_categorie_dto tabela_categorie_dto){

        return tabela_categorie_repo.save(tabela_categorie_mapper.entity_dto(tabela_categorie_dto));
    }

    public List<tabela_categorie_dto> afisare_categorie(){

        return tabela_categorie_repo
                .findAll()
                .stream()
                .map(tabela_categorie_mapper::dto_entity)
                .toList();
    }

    public void stergere_categorie(int id){

        tabela_categorie_repo.deleteById(id);
    }

    public int getCategoryId(tabela_categorie_entity tabela_categorie_entity){

        return tabela_categorie_entity.getId();
    }

    public tabela_categorie_entity getCategoryById(int id){

        return tabela_categorie_repo
                .findById(id)
                .orElse(null);
    }
}
