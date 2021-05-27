package br.com.adriel.model;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private Long id;
    private String cpf;
    private String nome;
    
    private List<Conta> contas = new ArrayList<Conta>();

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
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
