package br.edu.br.api.controller;

import br.edu.br.api.model.Person;
import br.edu.br.api.service.PersonService;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping({"", "/"})
    public List<Person> getAll() {
        return personService.getAll();
    }

    @GetMapping("{id}")
    public Optional<Person> getById(@PathVariable String id) {
        return personService.getById(UUID.fromString(id));
    }
}
