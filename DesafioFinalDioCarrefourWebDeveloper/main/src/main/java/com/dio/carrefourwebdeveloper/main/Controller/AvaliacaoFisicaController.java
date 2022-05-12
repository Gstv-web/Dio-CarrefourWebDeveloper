package com.dio.carrefourwebdeveloper.main.Controller;


import java.util.List;

import com.dio.carrefourwebdeveloper.main.Models.AvaliacaoFisica;
import com.dio.carrefourwebdeveloper.main.Models.DTO.AvaliacaoFisicaDTO;
import com.dio.carrefourwebdeveloper.main.Service.impl.AvaliacaoFisicaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/avaliacoes")
public class AvaliacaoFisicaController {
    
    @Autowired
    private AvaliacaoFisicaService avaliacaoFisicaService;


    @PostMapping
    public AvaliacaoFisica create(@RequestBody AvaliacaoFisicaDTO avaliacaoFisica) {
        return avaliacaoFisicaService.create(avaliacaoFisica);
    }

    @GetMapping
    public List<AvaliacaoFisica> getAll() {
        return avaliacaoFisicaService.getAll();
    }
}
