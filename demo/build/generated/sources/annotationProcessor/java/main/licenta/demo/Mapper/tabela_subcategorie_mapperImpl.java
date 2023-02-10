package licenta.demo.Mapper;

import javax.annotation.processing.Generated;
import licenta.demo.Dto.tabela_subcategorie_dto;
import licenta.demo.Entity.tabela_subcategorie_entity;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-02-10T12:20:08+0200",
    comments = "version: 1.5.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.6.jar, environment: Java 17.0.4 (Amazon.com Inc.)"
)
@Component
public class tabela_subcategorie_mapperImpl extends tabela_subcategorie_mapper {

    @Override
    public tabela_subcategorie_dto dto_entity(tabela_subcategorie_entity tabela_subcategorie_entity) {
        if ( tabela_subcategorie_entity == null ) {
            return null;
        }

        tabela_subcategorie_dto tabela_subcategorie_dto = new tabela_subcategorie_dto();

        tabela_subcategorie_dto.setId( tabela_subcategorie_entity.getId() );
        tabela_subcategorie_dto.setNume( tabela_subcategorie_entity.getNume() );
        tabela_subcategorie_dto.setTabela_categorie_entity_id( int_category( tabela_subcategorie_entity.getTabela_categorie_entity_id() ) );

        return tabela_subcategorie_dto;
    }

    @Override
    public tabela_subcategorie_entity entity_dto(tabela_subcategorie_dto tabela_subcategorie_dto) {
        if ( tabela_subcategorie_dto == null ) {
            return null;
        }

        tabela_subcategorie_entity tabela_subcategorie_entity = new tabela_subcategorie_entity();

        tabela_subcategorie_entity.setId( tabela_subcategorie_dto.getId() );
        tabela_subcategorie_entity.setNume( tabela_subcategorie_dto.getNume() );
        tabela_subcategorie_entity.setTabela_categorie_entity_id( category_int( tabela_subcategorie_dto.getTabela_categorie_entity_id() ) );

        return tabela_subcategorie_entity;
    }
}
