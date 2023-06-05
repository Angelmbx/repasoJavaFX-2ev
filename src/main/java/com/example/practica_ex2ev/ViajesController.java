package com.example.practica_ex2ev;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import modelo.Ciudad;

import java.net.URL;
import java.util.ResourceBundle;

public class ViajesController {



    @FXML
    private ListView<Ciudad> ciudadesListView;

    @FXML
    private final ObservableList<Ciudad> listaCiudades =
            FXCollections.observableArrayList();

    @FXML
    private ImageView imageView;
    @FXML
    private Button asignarEstilobtn;
    @FXML
    private Button limpiarEstilobtn;




    @FXML
    public void initialize(){
      //  imageView = new ImageView();

        listaCiudades.add(new Ciudad("Venecia", "C:\\Users\\a21angelmb\\IdeaProjects\\repasoJavaFX-2ev\\src\\main\\resources\\imagenes\\venecia.jpg"));
        listaCiudades.add(new Ciudad("Las Vegas", "C:\\Users\\a21angelmb\\IdeaProjects\\repasoJavaFX-2ev\\src\\main\\resources\\imagenes\\LasVegas.jpg"));
        listaCiudades.add(new Ciudad("Bali", "C:\\Users\\a21angelmb\\IdeaProjects\\repasoJavaFX-2ev\\src\\main\\resources\\imagenes\\bali.jpg"));



        ciudadesListView.setItems(listaCiudades);

        //Debes modificar el ListView para que funcione con la clase Ciudad.
        ciudadesListView
                .getSelectionModel()
                .selectedItemProperty()
                .addListener(new ChangeListener<Ciudad>() {
                    @Override
                    public void changed(ObservableValue<? extends Ciudad> observableValue, Ciudad oldCiudad, Ciudad newCiudad) {
                        Image imagen=new Image(newCiudad.getUrl ());
                        imageView.setImage (imagen);
                    }

                }) ;

    }


    @FXML
    protected void onLimpiarEstiloClick() {}


    @FXML
    protected void onAsignarEstiloClick() {}


}