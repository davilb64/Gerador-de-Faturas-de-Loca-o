package com.geradordefaturas.locacao.repository;

import com.geradordefaturas.locacao.model.Contrato;
import java.util.List;
import java.util.Optional;

public interface ContratoRepository {

    // Encontra um contrato pelo ID. Retorna um Optional para evitar 'null'.
    Optional<Contrato> findById(int id);

    // Retorna todos os contratos.
    List<Contrato> findAll();

    // Salva um contrato (seja novo ou uma atualização) e retorna a versão salva.
    Contrato save(Contrato contrato);
}
