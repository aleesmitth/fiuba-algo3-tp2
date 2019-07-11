package fiuba.algo3.tp2.vista.Handlers.ButtonHandlers;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.image.ImageView;
import javafx.stage.Popup;
import javafx.stage.Stage;

public class BotonMostrarRecetasEventHandler implements EventHandler<ActionEvent> {

    private Stage stage;

    public BotonMostrarRecetasEventHandler(Stage stage){
        this.stage = stage;
    }

    @Override
    public void handle(ActionEvent actionEvent){
        Popup popup = new Popup();
        popup.getContent().add(new ImageView("fiuba/algo3/tp2/vista/Imagenes/recetas.png"));
        popup.hideOnEscapeProperty();
        popup.show(stage);
    }
}
