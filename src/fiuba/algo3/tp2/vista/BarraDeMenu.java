package fiuba.algo3.tp2.vista;

import fiuba.algo3.tp2.vista.Handlers.OpcionesDeMenuHandlers.OpcionAcercaDeEventHandler;
import fiuba.algo3.tp2.vista.Handlers.OpcionesDeMenuHandlers.OpcionControlesEventHandler;
import fiuba.algo3.tp2.vista.Handlers.OpcionesDeMenuHandlers.OpcionPantallaCompletaEventHandler;
import fiuba.algo3.tp2.vista.Handlers.OpcionesDeMenuHandlers.OpcionSalirEventHandler;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;

public class BarraDeMenu extends MenuBar {

    MenuItem opcionPantallaCompleta = new MenuItem("Pantalla completa");

    public BarraDeMenu(Stage stage) {

        Menu menuArchivo = new Menu("Archivo");
        Menu menuVista = new Menu("Vista");
        Menu menuAyuda = new Menu("Ayuda");

        MenuItem opcionSalir = new MenuItem("Salir");
        MenuItem opcionAcercaDe = new MenuItem("Acerca de");
        MenuItem opcionControles = new MenuItem("Controles");

        OpcionSalirEventHandler opcionSalirEventHandler = new OpcionSalirEventHandler();
        opcionSalir.setOnAction(opcionSalirEventHandler);

        OpcionAcercaDeEventHandler opcionAcercaDeEventHandler = new OpcionAcercaDeEventHandler();
        opcionAcercaDe.setOnAction(opcionAcercaDeEventHandler);

        OpcionControlesEventHandler opcionControlesEventHandler = new OpcionControlesEventHandler();
        opcionControles.setOnAction(opcionControlesEventHandler);

        OpcionPantallaCompletaEventHandler opcionPantallaCompletaEventHandler = new OpcionPantallaCompletaEventHandler(stage, opcionPantallaCompleta);
        opcionPantallaCompleta.setOnAction(opcionPantallaCompletaEventHandler);
        opcionPantallaCompleta.setDisable(false);

        menuVista.getItems().addAll(opcionPantallaCompleta);
        menuAyuda.getItems().addAll(opcionAcercaDe,opcionControles);
        menuArchivo.getItems().addAll(opcionSalir);

        this.getMenus().addAll(menuArchivo, menuVista, menuAyuda);
    }

    public void aplicacionFullScreen() {
        opcionPantallaCompleta.setDisable(true);
    }
    public void aplicacionMinimizada() {
        opcionPantallaCompleta.setDisable(false);
    }
}
