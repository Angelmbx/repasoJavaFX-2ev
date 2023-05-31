package com.example.practica_ex2ev;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import modelo.Ciudad;

public class ViajesController {

    @FXML
    private Button asignarEstilobtn;

    @FXML
    private ListView<String> ciudadesListView;

    @FXML
    private Button limpiarEstilobtn;

    @FXML
    private GridPane panelBotones;

    @FXML
    private Pane panelImagenes;


    Ciudad madrid = new Ciudad();
    Ciudad barcelona = new Ciudad();
    Ciudad sanFrancisco = new Ciudad();

    @FXML
    public void initialize(){
        madrid.setNombre("Madrid");
        barcelona.setNombre("Barcelona");
        sanFrancisco.setNombre("San Francisco");


        ciudadesListView.getItems().addAll(madrid.toString(), barcelona.toString(), sanFrancisco.toString());
    }

    @FXML
    protected void onLimpiarEstiloClick() {}

    @FXML
    protected void onAsignarEstiloClick() {}


}