package com.dio.carrefourwebdeveloper.main.Repository;

import java.time.LocalDate;
import java.util.List;

import com.dio.carrefourwebdeveloper.main.Models.Aluno;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunoRepo extends JpaRepository<Aluno, Long> {

    List<Aluno> findByDataNascimento(LocalDate dataNascimento);
}
    
    
