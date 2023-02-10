package licenta.demo.Controller;

import licenta.demo.Dto.tabela_categorie_dto;
import licenta.demo.Service.tabela_categorie_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categorie")

public class tabela_categorie_controller {

    tabela_categorie_service tabela_categorie_service;

    @Autowired

    public tabela_categorie_controller(licenta.demo.Service.tabela_categorie_service tabela_categorie_service) {
        this.tabela_categorie_service = tabela_categorie_service;
    }

    @PostMapping("/adaugare")
    public ResponseEntity<Object> adaugare_categorie(@RequestBody tabela_categorie_dto tabela_categorie_dto){

        return new ResponseEntity<>(tabela_categorie_service.creare_categorie(tabela_categorie_dto), HttpStatus.OK);
    }

    @GetMapping("/afisare")
    public ResponseEntity<List<tabela_categorie_dto>>afisare_categorie(){

        return new ResponseEntity<>(tabela_categorie_service.afisare_categorie(),HttpStatus.OK);
    }

    @DeleteMapping("/stergere/{id}")
    public ResponseEntity<Integer>stergere_categorie(@PathVariable Integer id){

        tabela_categorie_service.stergere_categorie(id);

        return new ResponseEntity<>(id,HttpStatus.OK);
    }
}
