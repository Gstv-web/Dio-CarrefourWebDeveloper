package com.dio.carrefourwebdeveloper.main.Service;

import java.util.List;

import com.dio.carrefourwebdeveloper.main.Models.AvaliacaoFisica;
import com.dio.carrefourwebdeveloper.main.Models.DTO.AvaliacaoFisicaDTO;
import com.dio.carrefourwebdeveloper.main.Models.DTO.AvaliacaoFisicaUpdateDTO;



public interface IAvaliacaoFisicaService {
    
    AvaliacaoFisica create(AvaliacaoFisicaDTO avaliacaoDTO);

    AvaliacaoFisica get(Long id);

    List<AvaliacaoFisica> getAll();

    AvaliacaoFisica update(Long id, AvaliacaoFisicaUpdateDTO avaliacaoUpdateDTO);

    void delete(Long id);
}
