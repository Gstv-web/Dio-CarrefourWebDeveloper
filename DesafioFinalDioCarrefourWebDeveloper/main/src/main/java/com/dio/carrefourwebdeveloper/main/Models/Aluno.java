package com.dio.carrefourwebdeveloper.main.Models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor // Cria o construtor sem argumentos
@AllArgsConstructor // Cria o construtor com argumentos
@Entity // Anotação que diz que a classe é uma entidade
@Table(name = "tb_aluno") // Anotação que diz que a tabela é tb_aluno
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) // Anotação que ignora as propriedades da classe
public class Aluno {
    
    @Id // Anotação que diz que a propriedade é a chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Anotação que diz que o valor da chave primária será auto-incrementado
    private long id;

    @NotBlank // Anotação que diz que a propriedade é obrigatória
    @Column(name = "nome_aluno") // Anotação que diz que a coluna é nome_aluno
    private String nome;

    @NotBlank
    @Column(name = "cpf_aluno", unique = true)
    private String cpf;

    @Column(name = "bairro_aluno")
    private String bairro;

    @Column(name = "data_nascimento_aluno")
    private LocalDate dataNascimento;

    @OneToMany(mappedBy = "aluno", fetch = FetchType.LAZY) // Anotação que diz que a classe Matricula possui uma chave estrangeira para a classe Aluno
    @JsonIgnore // Anotação que ignora a propriedade da classe
    private List<AvaliacaoFisica> avaliacoesFisicas = new ArrayList<>();



    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
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

    public List<AvaliacaoFisica> getAvaliacoesFisicas() {
        return this.avaliacoesFisicas;
    }

    public void setAvaliacoesFisicas(List<AvaliacaoFisica> avaliacoesFisicas) {
        this.avaliacoesFisicas = avaliacoesFisicas;
    }


}
