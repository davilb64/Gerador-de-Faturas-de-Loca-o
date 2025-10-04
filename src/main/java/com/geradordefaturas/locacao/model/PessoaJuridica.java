package com.geradordefaturas.locacao.model;

public class PessoaJuridica extends Cliente {
    private String cnpj;
    private String razaoSocial;
    private String nomeFantasia;

    public PessoaJuridica() {
        super(); // Chama o construtor da classe pai (Cliente)
    }

    // Getters e Setters
    public String getRazaoSocial() { return razaoSocial; }
    public void setRazaoSocial(String razaoSocial) { this.razaoSocial = razaoSocial; }
    // ... outros getters e setters ...

    @Override
    public String toString() {
        return this.razaoSocial != null ? this.razaoSocial : "";
    }
}