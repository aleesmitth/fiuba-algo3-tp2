package fiuba.algo3.tp2.vista.Handlers.OnKeyPressHandlers;

import fiuba.algo3.tp2.vista.BarraDeMenu;
import fiuba.algo3.tp2.vista.VistaInventarioYMesa;
import javafx.event.EventHandler;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

public class AplicacionOnKeyPressEventHandler implements EventHandler<KeyEvent> {

    private Stage stage;
    private BarraDeMenu menuBar;
    private VistaInventarioYMesa inventario;

    public AplicacionOnKeyPressEventHandler(Stage stage, BarraDeMenu menuBar) {
        this.stage = stage;
        this.menuBar = menuBar;
    }

    @Override
    public void handle(KeyEvent event) {

        switch (event.getCode()) {
            case ESCAPE:
                stage.setMaximized(false);
                menuBar.aplicacionMinimizada();
                break;
            case E:
                VistaInventarioYMesa.Inventario();
            case F:
                stage.setFullScreen(true);
                menuBar.aplicacionFullScreen();
                break;
        }
    }
}
