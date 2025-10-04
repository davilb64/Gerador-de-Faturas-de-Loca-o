package com.geradordefaturas.locacao.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Contrato {
    private static int idCounter = 0;
    private int id;
    private Cliente cliente;
    private Vendedor vendedor;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private List<ItemContrato> listaItensContrato;

    public Contrato() {
    }

    public Contrato(Cliente cliente, Vendedor vendedor, LocalDate dataInicio, LocalDate dataFim, List<ItemContrato> listaItensContrato) {
        this.id = idCounter++;
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.listaItensContrato = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }

    public List<ItemContrato> getListaItensContrato() {
        return listaItensContrato;
    }

    public void adicionarItem(ItemContrato itemContrato) {
        this.listaItensContrato.add(itemContrato);
    }

    public void removerItem(ItemContrato itemContrato) {
        this.listaItensContrato.remove(itemContrato);
    }

    public double calcularValorTotal() {
        double total = 0;
        for (ItemContrato itemContrato : listaItensContrato) {
            total += itemContrato.getValorDaLocacaoUnitario()*itemContrato.getQuantidade();
        }
        return total;
    }

    public String getPeriodo() {
        // Define o formato que queremos para a data (ex: 04/10/2025)
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // Verifica se as datas não são nulas antes de formatar
        if (getDataInicio() != null && getDataFim() != null) {
            return getDataInicio().format(formatador) + " a " + getDataFim().format(formatador);
        }

        // Retorna um texto vazio se as datas não estiverem definidas
        return "Período não definido";
    }
}
