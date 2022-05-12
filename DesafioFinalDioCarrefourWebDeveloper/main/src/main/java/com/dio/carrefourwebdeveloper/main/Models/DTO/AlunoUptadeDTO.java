package com.dio.carrefourwebdeveloper.main.Models.DTO;

import java.time.LocalDate;

import lombok.AllArgsConstructor;

import lombok.NoArgsConstructor;



@NoArgsConstructor
@AllArgsConstructor
public class AlunoUptadeDTO {

    private String nome;

    private String bairro;

    private LocalDate dataNascimento;


    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getBairro() {
        return this.bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public LocalDate getDataNascimento() {
        return this.dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

}
