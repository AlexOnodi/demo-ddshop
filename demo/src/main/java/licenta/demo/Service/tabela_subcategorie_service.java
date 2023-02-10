package licenta.demo.Service;


import licenta.demo.Dto.tabela_subcategorie_dto;
import licenta.demo.Entity.tabela_subcategorie_entity;
import licenta.demo.Mapper.tabela_subcategorie_mapper;
import licenta.demo.Repository.tabela_subcategorie_repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class tabela_subcategorie_service {

    private final tabela_subcategorie_repo tabela_subcategorie_repo;

    private final tabela_subcategorie_mapper tabela_subcategorie_mapper;

    @Autowired

    public tabela_subcategorie_service(licenta.demo.Repository.tabela_subcategorie_repo tabela_subcategorie_repo, licenta.demo.Mapper.tabela_subcategorie_mapper tabela_subcategorie_mapper) {
        this.tabela_subcategorie_repo = tabela_subcategorie_repo;
        this.tabela_subcategorie_mapper = tabela_subcategorie_mapper;
    }

    public tabela_subcategorie_entity creare_subcategorie(tabela_subcategorie_dto tabela_subcategorie_dto){

        return tabela_subcategorie_repo.save(tabela_subcategorie_mapper.entity_dto(tabela_subcategorie_dto));
    }

    public List<tabela_subcategorie_dto> afisare_subcategorie(){

        return tabela_subcategorie_repo
                .findAll()
                .stream()
                .map(tabela_subcategorie_mapper::dto_entity)
                .toList();
    }

    public void stergere_subcategorie(int id){

        tabela_subcategorie_repo.deleteById(id);
    }
}
