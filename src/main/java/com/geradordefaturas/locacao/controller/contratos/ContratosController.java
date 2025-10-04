package com.geradordefaturas.locacao.controller.contratos;

import com.geradordefaturas.locacao.model.*;
import com.geradordefaturas.locacao.repository.ContratoRepository;
import com.geradordefaturas.locacao.repository.ContratoRepositoryCSV;
import com.geradordefaturas.locacao.service.ContratoService;
import com.geradordefaturas.locacao.util.ScreenController;
import javafx.beans.property.SimpleStringProperty;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class ContratosController implements Initializable {

    @FXML private TableView<Contrato> tblContratos;
    @FXML private TableColumn<Contrato, Integer> colNContrato;
    @FXML private TableColumn<Contrato, String> colCliente;
    @FXML private TableColumn<Contrato, String> colVendedor;
    // CORREÇÃO: O tipo da coluna Período deve ser String, pois o método getPeriodo() retorna String
    @FXML private TableColumn<Contrato, String> colPeriodo;

    private ContratoService contratoService;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ContratoRepository repository = new ContratoRepositoryCSV();
        this.contratoService = new ContratoService(repository);
        carregarDadosDaTabela();
    }

    private void carregarDadosDaTabela() {
        colNContrato.setCellValueFactory(new PropertyValueFactory<>("id"));
        colPeriodo.setCellValueFactory(new PropertyValueFactory<>("periodo"));

        colCliente.setCellValueFactory(cellData -> {
            Cliente cliente = cellData.getValue().getCliente();
            String nomeExibido = "";
            if (cliente instanceof PessoaJuridica) {
                nomeExibido = ((PessoaJuridica) cliente).getRazaoSocial();
            } else if (cliente instanceof PessoaFisica) {
                nomeExibido = ((PessoaFisica) cliente).getNome();
            }
            return new SimpleStringProperty(nomeExibido);
        });

        colVendedor.setCellValueFactory(cellData -> {
            Vendedor vendedor = cellData.getValue().getVendedor();
            return new SimpleStringProperty(vendedor != null ? vendedor.getNome() : "");
        });

        // O método findAll() agora vai retornar os dados completos do CSV
        List<Contrato> contratosDoCsv = contratoService.listarTodos();
        tblContratos.getItems().setAll(contratosDoCsv);
    }

    @FXML
    private void sair() {
        ScreenController.changeScene("/view/MenuView.fxml");
    }

    @FXML
    private void abrirModalContrato() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/ContratoForm.fxml"));
            Parent root = loader.load();
            Stage stage = new Stage();
            stage.setTitle("Criação de Contrato");
            stage.setScene(new Scene(root));
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.showAndWait();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}