package licenta.demo.Entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@Table(name = "tabela_categorie")
public class tabela_categorie_entity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;

    private String nume;

    @OneToMany(mappedBy = "tabela_categorie_entity_id")
    @JsonManagedReference
    private List<tabela_subcategorie_entity> tabela_subcategorie_entityList;
}
