package licenta.demo.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@Table(name = "tabela_subcategorie")
public class tabela_subcategorie_entity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;

   // private int id_categorie;

    private String nume;

    @ManyToOne
    @JoinColumn(name = "id_categorie")
    @JsonBackReference
    private tabela_categorie_entity tabela_categorie_entity_id;
}
