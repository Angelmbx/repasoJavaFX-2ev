module com.example.practica_ex2ev {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.practica_ex2ev to javafx.fxml;
    exports com.example.practica_ex2ev;
}