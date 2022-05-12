package com.dio.carrefourwebdeveloper.main.Service.impl;

import java.util.List;

import com.dio.carrefourwebdeveloper.main.Models.Aluno;
import com.dio.carrefourwebdeveloper.main.Models.Matricula;
import com.dio.carrefourwebdeveloper.main.Models.DTO.MatriculaDTO;
import com.dio.carrefourwebdeveloper.main.Repository.AlunoRepo;
import com.dio.carrefourwebdeveloper.main.Repository.MatriculaRepo;
import com.dio.carrefourwebdeveloper.main.Service.IMatriculaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MatriculaService implements IMatriculaService {

    @Autowired
    private MatriculaRepo matriculaRepo;

    @Autowired
    private AlunoRepo alunoRepo;

    @Override
    public Matricula create(MatriculaDTO matriculaDTO) {
        Matricula matricula = new Matricula();
        Aluno aluno = alunoRepo.findById(matriculaDTO.getAlunoId()).get();

        matricula.setAluno(aluno);

        return matriculaRepo.save(matricula);
    }

    @Override
    public Matricula get(Long id) {
        return matriculaRepo.findById(id).get();
    }

    @Override
    public List<Matricula> getAll(String bairro) {
        if(bairro == null) {
            return matriculaRepo.findAll();
        } else {
            return matriculaRepo.findAlunosMatriculadosBairro(bairro);
        }
    }

    @Override
    public void delete(Long id) {}    
    
  


}
    

