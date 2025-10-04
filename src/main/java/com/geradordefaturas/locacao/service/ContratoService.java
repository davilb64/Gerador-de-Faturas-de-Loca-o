package com.geradordefaturas.locacao.service;

import com.geradordefaturas.locacao.model.Contrato;
import com.geradordefaturas.locacao.repository.ContratoRepository;
import java.util.List;
import java.util.Optional;

public class ContratoService {

    private final ContratoRepository contratoRepository;

    public ContratoService(ContratoRepository contratoRepository) {
        this.contratoRepository = contratoRepository;
    }

    public Optional<Contrato> consultarPorId(int id) {
        // No futuro, aqui pode ter lógica de negócio (ex: verificar permissões)
        return contratoRepository.findById(id);
    }

    public List<Contrato> listarTodos() {
        return contratoRepository.findAll();
    }

    public Contrato salvarContrato(Contrato contrato) {
        // No futuro, aqui pode ter lógica de validação (ex: verificar se as datas são válidas)
        return contratoRepository.save(contrato);
    }
}