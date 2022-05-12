package com.dio.carrefourwebdeveloper.main.Service;

import java.util.List;

import com.dio.carrefourwebdeveloper.main.Models.Aluno;
import com.dio.carrefourwebdeveloper.main.Models.AvaliacaoFisica;
import com.dio.carrefourwebdeveloper.main.Models.DTO.AlunoDTO;
import com.dio.carrefourwebdeveloper.main.Models.DTO.AlunoUptadeDTO;



public interface IAlunoService {
    
    Aluno create(AlunoDTO alunoDTO);

    Aluno get(Long id);

    List<Aluno> getAll(String dataNascimento);

    Aluno update(Long id, AlunoUptadeDTO alunoUptadeDTO);

    void delete(Long id);

    List<AvaliacaoFisica> getAllAvaliacaoFisicaId(Long id);
}
