package com.geradordefaturas.locacao.model;

public class ItemContrato {
    private Equipamento equipamento;
    private int quantidade;
    private double valorDaLocacaoUnitario;

    public ItemContrato() {
    }

    public ItemContrato(Equipamento equipamento, int quantidade, double valorDaLocacaoUnitario) {
        this.equipamento = equipamento;
        this.quantidade = quantidade;
        this.valorDaLocacaoUnitario = valorDaLocacaoUnitario;
    }

    public Equipamento getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(Equipamento equipamento) {
        this.equipamento = equipamento;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValorDaLocacaoUnitario() {
        return valorDaLocacaoUnitario;
    }

    public void setValorDaLocacaoUnitario(double valorDaLocacaoUnitario) {
        this.valorDaLocacaoUnitario = valorDaLocacaoUnitario;
    }
}
