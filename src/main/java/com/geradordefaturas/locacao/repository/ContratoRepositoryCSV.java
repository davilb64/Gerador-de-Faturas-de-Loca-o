package com.geradordefaturas.locacao.repository;

import com.geradordefaturas.locacao.model.*;
import org.apache.commons.csv.*;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ContratoRepositoryCSV implements ContratoRepository {

    private static final String ARQUIVO_CSV = "./contratos.csv";
    // CORREÇÃO 1: Adicionado cliente_nome e vendedor_nome ao cabeçalho
    private static final String[] CABECALHO = {"id", "dataInicio", "dataFim", "cliente_nome", "vendedor_nome"};
    private final DateTimeFormatter formatadorDeData = DateTimeFormatter.ISO_LOCAL_DATE;

    public ContratoRepositoryCSV() {
        File arquivo = new File(ARQUIVO_CSV);
        if (!arquivo.exists()) {
            try (CSVPrinter printer = new CSVPrinter(new FileWriter(ARQUIVO_CSV), CSVFormat.DEFAULT.withHeader(CABECALHO))) {
                // Cria o arquivo com o cabeçalho correto se ele não existir
            } catch (IOException e) {
                System.err.println("Erro ao criar o arquivo CSV: " + e.getMessage());
            }
        }
    }

    @Override
    public List<Contrato> findAll() {
        List<Contrato> contratos = new ArrayList<>();
        try (Reader reader = Files.newBufferedReader(Paths.get(ARQUIVO_CSV));
             CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT
                     .withHeader(CABECALHO).withFirstRecordAsHeader().withTrim())) {

            for (CSVRecord registro : csvParser) {
                Contrato contrato = new Contrato();
                contrato.setId(Integer.parseInt(registro.get("id")));
                contrato.setDataInicio(LocalDate.parse(registro.get("dataInicio"), formatadorDeData));
                contrato.setDataFim(LocalDate.parse(registro.get("dataFim"), formatadorDeData));

                // CORREÇÃO 2: Lendo os nomes do CSV e criando objetos para exibição
                String nomeCliente = registro.get("cliente_nome");
                String nomeVendedor = registro.get("vendedor_nome");

                PessoaJuridica clienteMock = new PessoaJuridica();
                clienteMock.setRazaoSocial(nomeCliente);
                contrato.setCliente(clienteMock);

                Vendedor vendedorMock = new Vendedor();
                vendedorMock.setNome(nomeVendedor);
                contrato.setVendedor(vendedorMock);

                contratos.add(contrato);
            }
        } catch (IOException | IllegalArgumentException e) {
            System.err.println("Erro ao ler o arquivo CSV. Verifique o cabeçalho: " + e.getMessage());
        }
        return contratos;
    }

    private void salvarTodos(List<Contrato> contratos) {
        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(ARQUIVO_CSV));
             CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT.withHeader(CABECALHO))) {
            for (Contrato contrato : contratos) {
                // CORREÇÃO 3: Salvando os nomes do cliente e vendedor
                String nomeCliente = (contrato.getCliente() instanceof PessoaJuridica) ? ((PessoaJuridica) contrato.getCliente()).getRazaoSocial() : "";
                String nomeVendedor = (contrato.getVendedor() != null) ? contrato.getVendedor().getNome() : "";

                csvPrinter.printRecord(
                        contrato.getId(),
                        contrato.getDataInicio().format(formatadorDeData),
                        contrato.getDataFim().format(formatadorDeData),
                        nomeCliente,
                        nomeVendedor
                );
            }
        } catch (IOException e) {
            System.err.println("Erro ao salvar o arquivo CSV: " + e.getMessage());
        }
    }

    @Override
    public Optional<Contrato> findById(int id) {
        return findAll().stream()
                .filter(contrato -> contrato.getId() == id)
                .findFirst();
    }

    @Override
    public Contrato save(Contrato contrato) {
        List<Contrato> contratos = findAll();
        if (contrato.getId() == 0) {
            int novoId = contratos.stream().mapToInt(Contrato::getId).max().orElse(0) + 1;
            contrato.setId(novoId);
            contratos.add(contrato);
        } else {
            contratos.removeIf(c -> c.getId() == contrato.getId());
            contratos.add(contrato);
        }
        salvarTodos(contratos);
        return contrato;
    }
}