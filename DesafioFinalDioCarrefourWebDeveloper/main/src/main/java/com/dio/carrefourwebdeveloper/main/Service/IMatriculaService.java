package com.dio.carrefourwebdeveloper.main.Service;

import java.util.List;

import com.dio.carrefourwebdeveloper.main.Models.Matricula;
import com.dio.carrefourwebdeveloper.main.Models.DTO.MatriculaDTO;

public interface IMatriculaService {
    
    Matricula create(MatriculaDTO matriculaDTO);

    Matricula get(Long id);

    List<Matricula> getAll(String bairro);

    void delete(Long id);
}
