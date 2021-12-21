package com.poshyweb.forum.controller;

import com.poshyweb.forum.dto.TopicoDTO;
import com.poshyweb.forum.model.Curso;
import com.poshyweb.forum.model.Topico;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ControllerTopico {

    @ResponseBody // indicamos que o retorno do método deve ser serializado e devolvido no corpo da resposta.
    @RequestMapping(path= "/vi/topicos", method = RequestMethod.GET) // Mostra o caminho da api
    public List<TopicoDTO> lista(){
        Topico topico = new Topico("Dúvida","Dúvida com Spring ",new Curso("Spring","Progrmação"));

        return TopicoDTO.converter(Arrays.asList(topico,topico,topico));
    }
}
