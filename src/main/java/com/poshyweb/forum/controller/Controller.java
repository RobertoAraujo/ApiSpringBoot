package com.poshyweb.forum.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @RequestMapping(value = "/vi/hello") // mostra o caminho da a api
    @ResponseBody // dis que nao e um pagina
    public String Hello(){
       return "Ola Roberto.";
    }

}
