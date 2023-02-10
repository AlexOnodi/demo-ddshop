package licenta.demo.Repository;

import licenta.demo.Entity.tabela_categorie_entity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface tabela_categorie_repo extends JpaRepository<tabela_categorie_entity,Integer> {
}
