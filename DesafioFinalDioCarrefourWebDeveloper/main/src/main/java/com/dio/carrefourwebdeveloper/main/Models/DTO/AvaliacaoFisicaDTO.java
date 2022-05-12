package com.dio.carrefourwebdeveloper.main.Models.DTO;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
public class AvaliacaoFisicaDTO {

    private Long alunoId;

    private double peso;

    private double altura;


    public Long getAlunoId() {
        return this.alunoId;
    }

    public void setAlunoId(Long alunoId) {
        this.alunoId = alunoId;
    }

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    
}
