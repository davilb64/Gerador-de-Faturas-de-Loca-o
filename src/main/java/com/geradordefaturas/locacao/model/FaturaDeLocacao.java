package com.geradordefaturas.locacao.model;

import java.time.LocalDate;
import java.time.LocalTime;

public class FaturaDeLocacao {
    private int numeroFatura;
    private double valor;
    private LocalDate dataEmissao;
    private LocalDate vencimento;
    private Contrato contrato;

    public FaturaDeLocacao() {
    }

    public FaturaDeLocacao(int numeroFatura, double valor, LocalDate dataEmissao, LocalDate vencimento, Contrato contrato) {
        this.numeroFatura = numeroFatura;
        this.valor = valor;
        this.dataEmissao = dataEmissao;
        this.vencimento = vencimento;
        this.contrato = contrato;
    }

    public int getNumeroFatura() {
        return numeroFatura;
    }

    public void setNumeroFatura(int numeroFatura) {
        this.numeroFatura = numeroFatura;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public LocalDate getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(LocalDate dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public LocalDate getVencimento() {
        return vencimento;
    }

    public void setVencimento(LocalDate vencimento) {
        this.vencimento = vencimento;
    }

    public Contrato getContrato() {
        return contrato;
    }

    public void setContrato(Contrato contrato) {
        this.contrato = contrato;
    }
}
