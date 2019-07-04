package fiuba.algo3.tp2.vista;


import fiuba.algo3.tp2.modelo.Juego.Juego;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class ContenedorPrincipal extends BorderPane {

    private Juego juego;
    private Stage stage;

    private BarraDeMenu menuBar;
    private GridPane contenedorCentral;
    private GridPane contenedorInventarioMateriales;
    private HBox contenedorInventarioHerramientas;
    private VBox contenedorMesaDeCrafteo;
    private VistaTablero vistaTablero;
    private VistaMesaDeCrafteo vistaMesaDeCrafteo;
    private VistaInventarioMateriales vistaInventarioMateriales;
    private VistaInventarioHerramientas vistaInventarioHerramientas;


    public ContenedorPrincipal(Stage stage, Juego juego) {
        this.stage = stage;
        this.juego = juego;
        this.setMenu();
        this.setCentro();
        this.setInventarioMateriales();
        this.setMesaDeCrafteo();

        this.setInventarioHerramientas();
    }

    private void setMenu() {
        this.menuBar = new BarraDeMenu(stage);
        this.setTop(menuBar);
    }

    private void setCentro() {

        contenedorCentral = new GridPane();

        vistaTablero = new VistaTablero(contenedorCentral, juego);

        this.setCenter(contenedorCentral);
    }

    private void setInventarioMateriales() {

        contenedorInventarioMateriales = new GridPane();

        vistaInventarioMateriales = new VistaInventarioMateriales(contenedorInventarioMateriales, juego);

        this.setRight(contenedorInventarioMateriales);
    }

    private void setMesaDeCrafteo() {

        contenedorMesaDeCrafteo = new VBox();

        vistaMesaDeCrafteo = new VistaMesaDeCrafteo(contenedorMesaDeCrafteo, juego);

        this.setLeft(contenedorMesaDeCrafteo);
    }

    private void setInventarioHerramientas() {

        contenedorInventarioHerramientas = new HBox();

        vistaInventarioHerramientas = new VistaInventarioHerramientas(contenedorInventarioHerramientas, juego);

        this.setBottom(contenedorInventarioHerramientas);
    }

    public BarraDeMenu getBarraDeMenu() {
        return menuBar;
    }

    public VistaTablero getVistaTablero(){
        return vistaTablero;
    }

    public VistaInventarioMateriales getVistaInventarioMateriales(){
        return vistaInventarioMateriales;
    }

    public VistaInventarioHerramientas getVistaInventarioHerramientas() {
        return vistaInventarioHerramientas;
    }


}
