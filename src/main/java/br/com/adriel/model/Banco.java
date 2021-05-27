package br.com.adriel.model;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private Long id;
    private String nome;
    private String sigla;
    private String numero;

    private List<Agencia> agencias = new ArrayList<Agencia>();

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSigla() {
        return sigla;
    }
    public void setSigla(String sigla) {
        this.sigla = sigla;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public List<Agencia> getAgencias() {
        return agencias;
    }
    public void setAgencias(List<Agencia> agencias) {
        this.agencias = agencias;
    }
    
}
