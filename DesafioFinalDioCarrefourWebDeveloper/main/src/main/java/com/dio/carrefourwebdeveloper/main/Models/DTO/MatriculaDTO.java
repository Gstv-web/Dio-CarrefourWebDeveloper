package com.dio.carrefourwebdeveloper.main.Models.DTO;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

import lombok.AllArgsConstructor;

import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
public class MatriculaDTO {
    
    @NotNull
    @Positive
    private Long alunoId;


    public Long getAlunoId() {
        return this.alunoId;
    }

    public void setAlunoId(Long alunoId) {
        this.alunoId = alunoId;
    }
    
}
