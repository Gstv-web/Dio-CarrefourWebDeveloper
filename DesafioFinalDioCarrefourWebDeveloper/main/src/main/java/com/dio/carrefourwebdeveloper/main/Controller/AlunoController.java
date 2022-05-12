package com.dio.carrefourwebdeveloper.main.Controller;

import java.util.List;

import javax.validation.Valid;

import com.dio.carrefourwebdeveloper.main.Models.Aluno;
import com.dio.carrefourwebdeveloper.main.Models.AvaliacaoFisica;
import com.dio.carrefourwebdeveloper.main.Models.DTO.AlunoDTO;
import com.dio.carrefourwebdeveloper.main.Service.impl.AlunoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/alunos")
public class AlunoController {
    
    @Autowired
    private AlunoService alunoService;


    @PostMapping
    public Aluno create(@Valid @RequestBody AlunoDTO dto) {
        return alunoService.create(dto);
    }

    @GetMapping("/avaliacoes/{id}")
    public List<AvaliacaoFisica> getAllAvaliacaoFisicaId(@PathVariable Long id) {
        return alunoService.getAllAvaliacaoFisicaId(id);
    }

    @GetMapping("/all")
    public List<Aluno> getAll(@RequestParam(value = "dataNascimento", required = false) String dataNascimento) {
        return alunoService.getAll(dataNascimento);
    }

    @PutMapping
    public Aluno update(@Valid @RequestBody AlunoDTO dto) {
        return alunoService.update(dto);
    }
}
