package com.geradordefaturas.locacao.model;

import java.util.ArrayList;
import java.util.List;

public abstract class Cliente {
    protected int id;
    protected List<Endereco> listaDeEnderecos;
    protected List<String> listaDeEmails;
    protected List<String> listaDeTelefones;

    public Cliente() {
        this.listaDeEnderecos = new ArrayList<>();
        this.listaDeEmails = new ArrayList<>();
        this.listaDeTelefones = new ArrayList<>();
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
}