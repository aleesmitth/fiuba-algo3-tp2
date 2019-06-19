package fiuba.algo3.tp2.vista;

import fiuba.algo3.tp2.vista.Handlers.OpcionPantallaCompletaEventHandler;
import fiuba.algo3.tp2.vista.Handlers.OpcionSalirEventHandler;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;

public class BarraDeMenu extends MenuBar {

    MenuItem opcionPantallaCompleta = new MenuItem("Pantalla completa");

    public BarraDeMenu(Stage stage) {

        Menu menuArchivo = new Menu("Archivo");
        Menu menuVista = new Menu("Vista");

        MenuItem opcionSalir = new MenuItem("Salir");

        OpcionSalirEventHandler opcionSalirEventHandler = new OpcionSalirEventHandler();
        opcionSalir.setOnAction(opcionSalirEventHandler);

        OpcionPantallaCompletaEventHandler opcionPantallaCompletaEventHandler = new OpcionPantallaCompletaEventHandler(stage, opcionPantallaCompleta);
        opcionPantallaCompleta.setOnAction(opcionPantallaCompletaEventHandler);
        opcionPantallaCompleta.setDisable(true);

        menuVista.getItems().addAll(opcionPantallaCompleta);
        menuArchivo.getItems().addAll(opcionSalir);

        this.getMenus().addAll(menuArchivo, menuVista);
    }
}
