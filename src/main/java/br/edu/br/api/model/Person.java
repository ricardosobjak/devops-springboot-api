package br.edu.br.api.model;

import java.util.UUID;
import lombok.Data;

@Data
public class Person {

    private UUID id;
    private String name;
    private String email;
    private String password;

    public Person(UUID id, String name, String email, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
    }

}
