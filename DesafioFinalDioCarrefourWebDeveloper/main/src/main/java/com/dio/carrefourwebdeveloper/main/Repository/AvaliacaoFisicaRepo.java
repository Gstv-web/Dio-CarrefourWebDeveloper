package com.dio.carrefourwebdeveloper.main.Repository;

import com.dio.carrefourwebdeveloper.main.Models.AvaliacaoFisica;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AvaliacaoFisicaRepo  extends JpaRepository<AvaliacaoFisica, Long> {

}
 

