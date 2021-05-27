package br.com.adriel.model;

public class Movimentacao {
    private String descricao;
    private String tipo;
    private Double valor;
    private Boolean confirmado;

    private Conta conta;

    public Conta getConta() {
        return conta;
    }
    public void setConta(Conta conta) {
        this.conta = conta;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public Double getValor() {
        return valor;
    }
    public void setValor(Double valor) {
        this.valor = valor;
    }
    public Boolean getConfirmado() {
        return confirmado;
    }
    public void setConfirmado(Boolean confirmado) {
        this.confirmado = confirmado;
    }

    
}
