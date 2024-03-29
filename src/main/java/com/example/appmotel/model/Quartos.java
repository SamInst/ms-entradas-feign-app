package com.example.appmotel.model;

import com.example.appmotel.response.StatusDoQuarto;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_quartos")
public class Quartos {
    @Id
    private Long id;
    private Integer numero;
    private String descricao;
    private Integer capacidadePessoa;
    private StatusDoQuarto statusDoQuarto;

    public void setId(Long id) {this.id = id;}
    public Long getId() {return id;}
    public Integer getNumero() {
        return numero;
    }
    public String getDescricao() {
        return descricao;
    }
    public Integer getCapacidadePessoa() {
        return capacidadePessoa;
    }
    public StatusDoQuarto getStatusDoQuarto() {
        return statusDoQuarto;
    }
    public void setStatusDoQuarto(StatusDoQuarto statusDoQuarto) {
        this.statusDoQuarto = statusDoQuarto;
    }

    public Quartos(Long id, Integer numero, String descricao, Integer capacidadePessoa, StatusDoQuarto statusDoQuarto) {
        this.id = id;
        this.numero = numero;
        this.descricao = descricao;
        this.capacidadePessoa = capacidadePessoa;
        this.statusDoQuarto = statusDoQuarto;
    }
    public Quartos() {
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setCapacidadePessoa(Integer capacidadePessoa) {
        this.capacidadePessoa = capacidadePessoa;
    }

}
