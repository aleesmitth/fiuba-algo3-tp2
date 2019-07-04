package fiuba.algo3.tp2.vista;


import fiuba.algo3.tp2.modelo.Juego.Juego;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class ContenedorPrincipal extends BorderPane {

    private Juego juego;
    private Stage stage;

    private BarraDeMenu menuBar;
    private GridPane contenedorCentral;
    private GridPane contenedorInventario;
    private VBox contenedorMesaDeCrafteo;
    private VistaTablero vistaTablero;
    private VistaMesaDeCrafteo vistaMesaDeCrafteo;
    private VistaInventario vistaInventario;

    public ContenedorPrincipal(Stage stage, Juego juego) {
        this.stage = stage;
        this.juego = juego;
        this.setMenu(this.stage);
        this.setCentro(this.juego);
        this.setInventario(juego);
        this.setMesaDeCrafteo(juego);


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

    private void setMesaDeCrafteo(Juego juego) {

        contenedorMesaDeCrafteo = new VBox();

        vistaMesaDeCrafteo = new VistaMesaDeCrafteo(contenedorMesaDeCrafteo, juego);

        this.setLeft(contenedorMesaDeCrafteo);
    }

    public BarraDeMenu getBarraDeMenu() {
        return menuBar;
    }

    public VistaTablero getVistaTablero(){
        return vistaTablero;
    }

    public VistaInventario getVistaInventario(){
        return vistaInventario;
    }


}
