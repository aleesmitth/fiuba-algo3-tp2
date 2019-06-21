package fiuba.algo3.tp2.vista;


import fiuba.algo3.tp2.modelo.Juego.Juego;
import fiuba.algo3.tp2.vista.Handlers.OnKeyPressHandlers.MoverOnKeyPressEventHandler;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class ContenedorPrincipal extends BorderPane {

    private BarraDeMenu menuBar;
    private GridPane contenedorCentral;
    private GridPane contenedorInventario;
    private GridPane contenedorControles;
    private GridPane contenedorMesaDeCrafteo;
    private VistaTablero vistaTablero;
    private VistaMesaDeCrafteo vistaMesaDeCrafteo;
    private VistaControles vistaControles;
    private VistaInventario vistaInventario;

    public ContenedorPrincipal(Stage stage, Juego juego) {
        this.setMenu(stage);
        this.setCentro(juego);
        this.setInventario(juego);
        this.setControles(juego);
        this.setMesaDeCrafteo(juego);

        MoverOnKeyPressEventHandler moverOnKeyPressEventHandler = new MoverOnKeyPressEventHandler(juego, vistaTablero);
        this.setOnKeyPressed(moverOnKeyPressEventHandler);


    }

    private void setMenu(Stage stage) {
        this.menuBar = new BarraDeMenu(stage);
        this.setTop(menuBar);
    }

    private void setCentro(Juego juego) {

        contenedorCentral = new GridPane();

        vistaTablero = new VistaTablero(contenedorCentral, juego);

        this.setCenter(contenedorCentral);

    }

    private void setInventario(Juego juego) {

        contenedorInventario = new GridPane();

        vistaInventario = new VistaInventario(contenedorInventario, juego);

        this.setRight(contenedorInventario);
    }

    private void setControles(Juego juego) {

        contenedorControles = new GridPane();

        vistaControles = new VistaControles(contenedorControles, juego, vistaTablero);

        this.setBottom(contenedorControles);
    }

    private void setMesaDeCrafteo(Juego juego) {

        contenedorMesaDeCrafteo = new GridPane();

        vistaMesaDeCrafteo = new VistaMesaDeCrafteo(contenedorMesaDeCrafteo, juego);

        this.setLeft(contenedorMesaDeCrafteo);
    }

    public BarraDeMenu getBarraDeMenu() {
        return menuBar;
    }


}
