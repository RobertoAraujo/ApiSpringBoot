package com.poshyweb.forum.controller;

import com.poshyweb.forum.dto.TopicoDTO;
import com.poshyweb.forum.model.Curso;
import com.poshyweb.forum.model.Topico;
import com.poshyweb.forum.repository.TopicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ControllerTopico {

    @Autowired
    private TopicoRepository repository;

    @ResponseBody // indicamos que o retorno do método deve ser serializado e devolvido no corpo da resposta.
    @RequestMapping(path= "/vi/topicos", method = RequestMethod.GET) // Mostra o caminho da api
    public List<TopicoDTO> lista(){
        List<Topico> topicos =repository.findAll();
        return TopicoDTO.converter(topicos);
    }
}
