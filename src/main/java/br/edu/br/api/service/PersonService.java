package br.edu.br.api.service;

import br.edu.br.api.model.Person;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    private List<Person> data;

    public PersonService() {
        data = new ArrayList<>();

        data.add(new Person(UUID.randomUUID(), "James Smith", "james@a.com", "1234"));
        data.add(new Person(UUID.randomUUID(), "Karen Still", "karen@b.com", "1234"));
        data.add(new Person(UUID.randomUUID(), "Mari Koll", "mari@c.com", "1234"));
        data.add(new Person(UUID.randomUUID(), "Lane Taylor", "lane@d.com", "1234"));
    }

    public List<Person> getAll() {
        return data;
    }

    public Optional<Person> getById(UUID uuid) {
        return data.stream().filter(e -> e.getId().equals(uuid)).findFirst();
    }
}
