package com.poshyweb.forum.controller;

import com.poshyweb.forum.model.Curso;
import com.poshyweb.forum.model.Topico;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class Controller {

    @RequestMapping(value = "/vi/hello") // Mostra o caminho da api
    @ResponseBody // indicamos que o retorno do método deve ser serializado e devolvido no corpo da resposta.
    public String Hello(){
       return "Ola Roberto.";
    }

    @RequestMapping(value = "/vi/topicos") // Mostra o caminho da api
    public List<Topico> lista(){
        Topico topico = new Topico("Duvida","Duvida com Spring ",new Curso("Spring","Progrmação"));

        return Arrays.asList(topico,topico,topico);
    }

}
