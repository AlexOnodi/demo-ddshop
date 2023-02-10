package licenta.demo.Mapper;

import licenta.demo.Dto.tabela_subcategorie_dto;
import licenta.demo.Entity.tabela_categorie_entity;
import licenta.demo.Entity.tabela_subcategorie_entity;
import licenta.demo.Service.tabela_categorie_service;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.springframework.beans.factory.annotation.Autowired;

@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)

public abstract class tabela_subcategorie_mapper {

    @Autowired
    private tabela_categorie_service tabela_categorie_service;

    public abstract tabela_subcategorie_dto dto_entity(tabela_subcategorie_entity tabela_subcategorie_entity);

    public abstract tabela_subcategorie_entity entity_dto(tabela_subcategorie_dto tabela_subcategorie_dto);


    protected Integer int_category(tabela_categorie_entity value){

        return tabela_categorie_service.getCategoryId(value);
    }

    protected tabela_categorie_entity category_int(Integer value){

        return tabela_categorie_service.getCategoryById(value);
    }

}
