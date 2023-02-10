package licenta.demo.Mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import licenta.demo.Dto.tabela_categorie_dto;
import licenta.demo.Entity.tabela_categorie_entity;
import licenta.demo.Entity.tabela_subcategorie_entity;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-02-10T12:00:25+0200",
    comments = "version: 1.5.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.6.jar, environment: Java 17.0.4 (Amazon.com Inc.)"
)
@Component
public class tabela_categorie_mapperImpl implements tabela_categorie_mapper {

    @Override
    public tabela_categorie_dto dto_entity(tabela_categorie_entity tabela_categorie_entity) {
        if ( tabela_categorie_entity == null ) {
            return null;
        }

        tabela_categorie_dto tabela_categorie_dto = new tabela_categorie_dto();

        tabela_categorie_dto.setId( tabela_categorie_entity.getId() );
        tabela_categorie_dto.setNume( tabela_categorie_entity.getNume() );
        List<tabela_subcategorie_entity> list = tabela_categorie_entity.getTabela_subcategorie_entityList();
        if ( list != null ) {
            tabela_categorie_dto.setTabela_subcategorie_entityList( new ArrayList<tabela_subcategorie_entity>( list ) );
        }

        return tabela_categorie_dto;
    }

    @Override
    public tabela_categorie_entity entity_dto(tabela_categorie_dto tabela_categorie_dto) {
        if ( tabela_categorie_dto == null ) {
            return null;
        }

        tabela_categorie_entity tabela_categorie_entity = new tabela_categorie_entity();

        tabela_categorie_entity.setId( tabela_categorie_dto.getId() );
        tabela_categorie_entity.setNume( tabela_categorie_dto.getNume() );
        List<tabela_subcategorie_entity> list = tabela_categorie_dto.getTabela_subcategorie_entityList();
        if ( list != null ) {
            tabela_categorie_entity.setTabela_subcategorie_entityList( new ArrayList<tabela_subcategorie_entity>( list ) );
        }

        return tabela_categorie_entity;
    }
}
