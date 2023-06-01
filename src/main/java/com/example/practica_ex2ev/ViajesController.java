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
    private ListView<Ciudad> ciudadesListView;

    @FXML
    private Button limpiarEstilobtn;

    @FXML
    private GridPane panelBotones;

    @FXML
    private Pane panelImagenes;


    Ciudad venecia = new Ciudad("Venecia", "images/venecia.jpg");
    Ciudad barcelona = new Ciudad("Barcelona", "images/barcelona.jpg");
    Ciudad sanFrancisco = new Ciudad("San Francisco", "images/sanFrancisco.jpg");

    @FXML
    public void initialize(){

        ciudadesListView.getItems().addAll( venecia, barcelona, sanFrancisco);
        //secuenciaImagenesInfantil.addImage(getClass().getResource("images/infantil/01.jpg").toExternalForm());
        ciudadesListView.setOnMouseClicked(event -> {
            Ciudad selectedCiudad = ciudadesListView.getSelectionModel().getSelectedItem();
            if (selectedCiudad != null){
                String imagenUrl = selectedCiudad.getUrl();



            }


        });
    }

    @FXML
    protected void onLimpiarEstiloClick() {}


    @FXML
    protected void onAsignarEstiloClick() {}


}