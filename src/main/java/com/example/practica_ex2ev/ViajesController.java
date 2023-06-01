package com.example.practica_ex2ev;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
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
    private ImageView imageView;


    //instancias de la clase ciudad
    Ciudad venecia = new Ciudad("Venecia", "/Users/angel/IdeaProjects/practica_ex2ev/src/main/resources/imagenes/venecia.jpg");
    Ciudad barcelona = new Ciudad("Barcelona", "resources/imagenes/barcelona.jpg");
    Ciudad sanFrancisco = new Ciudad("San Francisco", "resources/imagenes/sanFrancisco.jpg");

    @FXML
    public void initialize(){

        ciudadesListView.getItems().addAll( venecia, barcelona, sanFrancisco);
        //secuenciaImagenesInfantil.addImage(getClass().getResource("images/infantil/01.jpg").toExternalForm());
        ciudadesListView.setOnMouseClicked(event -> {
            Ciudad selectedCiudad = ciudadesListView.getSelectionModel().getSelectedItem();
            if (selectedCiudad != null){
                String imagenUrl = selectedCiudad.getUrl();
                Image image = new Image(imagenUrl);
                imageView.setImage(image);
            }
        });
    }

    @FXML
    protected void onLimpiarEstiloClick() {}


    @FXML
    protected void onAsignarEstiloClick() {}


}