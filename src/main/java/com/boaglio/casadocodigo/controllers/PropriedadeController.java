package com.boaglio.casadocodigo.controllers;

import com.boaglio.casadocodigo.dominio.Propriedade;
import com.boaglio.casadocodigo.repositories.PropriedadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PropriedadeController {

    @Autowired
    private PropriedadeRepository propriedadeRepository;

    @RequestMapping(value = "/find/{filtro}", method = RequestMethod.GET)
    List<Propriedade> findByFiltro(@PathVariable("filtro") String filtro) {
        return propriedadeRepository.findByFiltro(filtro);
    }
}
