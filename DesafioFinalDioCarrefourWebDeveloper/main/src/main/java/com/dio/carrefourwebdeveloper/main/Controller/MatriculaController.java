package com.dio.carrefourwebdeveloper.main.Controller;

import java.util.List;

import com.dio.carrefourwebdeveloper.main.Models.Matricula;
import com.dio.carrefourwebdeveloper.main.Models.DTO.MatriculaDTO;
import com.dio.carrefourwebdeveloper.main.Service.impl.MatriculaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/matriculas")
public class MatriculaController {
    
    @Autowired
    private MatriculaService matriculaService;

    @PostMapping
    public Matricula create(@RequestBody MatriculaDTO matricula) {
        return matriculaService.create(matricula);
    }

    @GetMapping("/all")
    public List<Matricula> getAll(@RequestParam(value = "bairro", required = false) String bairro) {
        return matriculaService.getAll(bairro);
    }

}
