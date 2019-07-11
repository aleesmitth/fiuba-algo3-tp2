package fiuba.algo3.tp2.vista.Handlers.OpcionesDeMenuHandlers;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class OpcionAcercaDeEventHandler implements EventHandler<ActionEvent> {

    @Override
    public void handle(ActionEvent actionEvent) {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Acerca de...");
        alert.setHeaderText("Informacion del Juego");
        String mensaje = "75.07 Algoritmos y  programación III.";
        alert.setContentText(mensaje);
        alert.show();
    }
}
