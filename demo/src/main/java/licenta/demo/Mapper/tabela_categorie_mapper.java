package licenta.demo.Mapper;

import licenta.demo.Dto.tabela_categorie_dto;
import licenta.demo.Entity.tabela_categorie_entity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)

public interface tabela_categorie_mapper {

    tabela_categorie_dto dto_entity(tabela_categorie_entity tabela_categorie_entity);

    tabela_categorie_entity entity_dto(tabela_categorie_dto tabela_categorie_dto);



}
