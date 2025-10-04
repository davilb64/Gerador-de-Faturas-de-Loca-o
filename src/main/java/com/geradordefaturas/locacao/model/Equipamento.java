package com.geradordefaturas.locacao.model;

public class Equipamento {
    private int id;
    private String sku;
    private String nome;
    private String descricao;

    public Equipamento(int id, String sku, String descricao, String nome) {
        this.id = id;
        this.sku = sku;
        this.descricao = descricao;
        this.nome = nome;
    }

    public Equipamento() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
