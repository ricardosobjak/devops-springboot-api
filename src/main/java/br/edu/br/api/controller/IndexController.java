package br.edu.br.api.controller;

import br.edu.br.api.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @Autowired
    private PersonService personService;

    @RequestMapping("/")
    public String hello() {
        StringBuilder sb = new StringBuilder();
        sb.append("<h1>SpringBoot API Demo</h1>");

        sb.append("<p>API em funcionamento!</p>");
        sb.append("<p>Acesse os serviços:</p>");
        sb.append("<ul>");
        sb.append("<li><a href='person'>Todas as pessoas: /person</a></li>");
        personService.getAll().forEach(e -> sb.append("<li><a href='person/" + e.getId().toString() + "'>Uma pessoa pelo ID: /person/" + e.getId().toString() + "</a></li>"));
        sb.append("</ul>");

        return sb.toString();
    }

}
