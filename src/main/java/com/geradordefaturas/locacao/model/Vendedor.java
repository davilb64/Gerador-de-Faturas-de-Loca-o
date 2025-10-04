package com.geradordefaturas.locacao.model;

public class Vendedor {
    private int codVendedor;
    private String nome;

    public Vendedor() {}

    // Getters e Setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    // ... outros getters e setters ...

    @Override
    public String toString() {
        return this.nome != null ? this.nome : "";
    }
}