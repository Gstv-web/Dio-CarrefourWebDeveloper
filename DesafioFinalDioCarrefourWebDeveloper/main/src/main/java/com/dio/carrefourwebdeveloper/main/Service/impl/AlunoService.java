package com.dio.carrefourwebdeveloper.main.Service.impl;

import java.time.LocalDate;
import java.util.List;

import com.dio.carrefourwebdeveloper.main.Models.Aluno;
import com.dio.carrefourwebdeveloper.main.Models.AvaliacaoFisica;
import com.dio.carrefourwebdeveloper.main.Models.DTO.AlunoDTO;
import com.dio.carrefourwebdeveloper.main.Models.DTO.AlunoUptadeDTO;
import com.dio.carrefourwebdeveloper.main.Repository.AlunoRepo;
import com.dio.carrefourwebdeveloper.main.Service.IAlunoService;
import com.dio.carrefourwebdeveloper.main.infra.utils.JavaTimeUtils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlunoService implements IAlunoService {
    
    @Autowired
    private AlunoRepo repo;

    @Override
    public Aluno create(AlunoDTO dto) {
        Aluno aluno = new Aluno();
        aluno.setNome(dto.getNome());
        aluno.setCpf(dto.getCpf());
        aluno.setBairro(dto.getBairro());
        aluno.setDataNascimento(dto.getDataNascimento());

        return repo.save(aluno);
    }

    @Override
    public Aluno get(Long id) {
        return null;
    }

    @Override
    public List<Aluno> getAll(String dataNascimento) {
        if(dataNascimento == null) {
            return repo.findAll();
        } else {
            LocalDate localdate = LocalDate.parse(dataNascimento, JavaTimeUtils.LOCAL_DATE_FORMATTER);
            return repo.findByDataNascimento(localdate);
        }
    }

    @Override
    public Aluno update(Long id, AlunoUptadeDTO updateDto) {
        return null;
    }

    @Override
    public void delete(Long id) {}


    @Override
    public List<AvaliacaoFisica> getAllAvaliacaoFisicaId(Long id) {
        Aluno aluno = repo.findById(id).get();

        return aluno.getAvaliacoesFisicas();
    }
}
