package com.dio.carrefourwebdeveloper.main.Service.impl;

import java.util.List;

import com.dio.carrefourwebdeveloper.main.Models.Aluno;
import com.dio.carrefourwebdeveloper.main.Models.AvaliacaoFisica;
import com.dio.carrefourwebdeveloper.main.Models.DTO.AvaliacaoFisicaDTO;
import com.dio.carrefourwebdeveloper.main.Models.DTO.AvaliacaoFisicaUpdateDTO;
import com.dio.carrefourwebdeveloper.main.Repository.AlunoRepo;
import com.dio.carrefourwebdeveloper.main.Repository.AvaliacaoFisicaRepo;
import com.dio.carrefourwebdeveloper.main.Service.IAvaliacaoFisicaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AvaliacaoFisicaService implements IAvaliacaoFisicaService {

    @Autowired
    private AvaliacaoFisicaRepo avaliacaoRepo;

    @Autowired
    private AlunoRepo alunoRepo;


    @Override
    public AvaliacaoFisica create(AvaliacaoFisicaDTO dto) {
        AvaliacaoFisica avaliacaoFisica = new AvaliacaoFisica(); // cria uma nova avaliação física
        Aluno aluno = alunoRepo.findById(dto.getAlunoId()).get(); // busca o aluno pelo id

        avaliacaoFisica.setAluno(aluno); // seta o aluno na avaliação física
        avaliacaoFisica.setPeso(dto.getPeso()); // seta o peso na avaliação física
        avaliacaoFisica.setAltura(dto.getAltura()); // seta a altura na avaliação física

        return avaliacaoRepo.save(avaliacaoFisica); // salva a avaliação física
    }

    @Override
    public AvaliacaoFisica get(Long id) {
        return null;
    }

    @Override
    public List<AvaliacaoFisica> getAll() {

        return avaliacaoRepo.findAll();
    }

    @Override
    public AvaliacaoFisica update(Long id, AvaliacaoFisicaUpdateDTO updateDto) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

}
