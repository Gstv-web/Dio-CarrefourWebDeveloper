package com.dio.carrefourwebdeveloper.main.Repository;

import java.util.List;

import com.dio.carrefourwebdeveloper.main.Models.Matricula;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface MatriculaRepo extends JpaRepository<Matricula, Long> {
    
    /**
     * 
     * @param bairro referência para o filtro
     * @return  lista de alunos matriculados residentes no bairro informado como parâmetro
     */


    @Query(value = "SELECT * FROM tb_matricula m " + 
        "INNER JOIN tb_aluno a ON m.aluno_id = a.id " + 
        "WHERE a.bairro = :bairro", nativeQuery = true)
    List<Matricula> findAlunosMatriculadosBairro(String bairro);
}
