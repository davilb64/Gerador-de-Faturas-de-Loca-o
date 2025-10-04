package com.geradordefaturas.locacao.model;

import java.util.List;

public class Ficha {
    private Contrato contrato;
    private List<FaturaDeLocacao> listaFaturas;
    public Ficha(Contrato contrato) {
        this.contrato = contrato;
    }

    public Contrato getContrato() {
        return contrato;
    }

    public List<FaturaDeLocacao> getListaFaturas() {
        return listaFaturas;
    }

    public void adicionarFatura(FaturaDeLocacao fatura) {
        listaFaturas.add(fatura);
    }
    public double calcularValorTotal(){
        double total = 0;
        for (FaturaDeLocacao fatura : listaFaturas) {
            total += fatura.getValor();
        }
        return total;
    }
}
