package br.com.adriel.model;

import java.util.ArrayList;
import java.util.List;

public class Conta {
    private Long id;
    private String numero;
    private Boolean poupanca;
    private Boolean especial;
    private Double saldo;
    private Double limite;

    private Cliente cliente; 

    private Agencia agencia;

    private List<Movimentacao> movimentacoes = new ArrayList<Movimentacao>();

    public Agencia getAgencia() {
        return agencia;
    }
    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public Boolean getPoupanca() {
        return poupanca;
    }
    public void setPoupanca(Boolean poupanca) {
        this.poupanca = poupanca;
    }
    public Boolean getEspecial() {
        return especial;
    }
    public void setEspecial(Boolean especial) {
        this.especial = especial;
    }
    public Double getSaldo() {
        return saldo;
    }
    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
    public Double getLimite() {
        return limite;
    }
    public void setLimite(Double limite) {
        this.limite = limite;
    }
    public List<Movimentacao> getMovimentacoes() {
        return movimentacoes;
    }
    public void setMovimentacoes(List<Movimentacao> movimentacoes) {
        this.movimentacoes = movimentacoes;
    }
    
}
