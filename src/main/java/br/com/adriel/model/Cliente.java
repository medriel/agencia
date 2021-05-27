package br.com.adriel.model;

import java.util.ArrayList;
import java.util.List;

import br.com.adriel.Cpf;

public class Cliente {
    private Long id;
    private Cpf cpf;
    private String nome;
    
    private List<Conta> contas = new ArrayList<Conta>();

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Cpf getCpf() {
        return cpf;
    }
    public void setCpf(Cpf cpf) {
        this.cpf = cpf;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getContas() {
        return contas;
    }
    
}
