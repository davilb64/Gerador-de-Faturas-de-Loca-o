package com.geradordefaturas.locacao.service;

import com.geradordefaturas.locacao.model.Contrato;
import com.geradordefaturas.locacao.model.Ficha;

public class FichaService {
    public FichaService()
    {

    }
    public Ficha gerarFicha(Contrato contrato)
    {
     return new Ficha(contrato);
    }
}
