package fiuba.algo3.tp2.vista.Handlers.OpcionesDeMenuHandlers;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class OpcionControlesEventHandler implements EventHandler<ActionEvent> {

    @Override
    public void handle(ActionEvent actionEvent) {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Controles");
        alert.setHeaderText("Controles del juego");
        String mensaje = "Movimiento:\n← → ↑ ↓\nPantalla completa:\nF\nModo ventana:\nEsc\nEquipar herramienta:\n1-7\nUsar herramienta:\nCtrl\nTips:\nPara crear una herramienta tenes que arrastrar los materiales desde el inventario(a la derecha) a la mesa de crafteo(a la izquierda), cuidado porque las recetas tienen que estar bien armadas. Tocar boton Mostrar recetas";
        alert.setContentText(mensaje);
        alert.show();
    }
}