package com.geradordefaturas.locacao.model;

public class PessoaFisica extends Cliente {
    private String cpf;
    private String nome;

    public PessoaFisica() {
        super(); // Chama o construtor da classe pai (Cliente)
    }

    // Getters e Setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    // ... outros getters e setters ...

    @Override
    public String toString() {
        return this.nome != null ? this.nome : "";
    }
}