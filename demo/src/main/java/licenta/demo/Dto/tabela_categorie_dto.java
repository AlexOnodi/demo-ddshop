package licenta.demo.Dto;

import licenta.demo.Entity.tabela_subcategorie_entity;
import lombok.Data;

import java.util.List;

@Data

public class tabela_categorie_dto {

    private int id;

    private String nume;

    private List<tabela_subcategorie_entity>tabela_subcategorie_entityList;
}
