package fiuba.algo3.tp2.vista;


import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.TextField;


public class ContenedorPrincipal extends BorderPane {

    BarraDeMenu menuBar;
    Canvas canvasCentral;
    GridPane contenedorCentral;
    GridPane contenedorInventario;
    GridPane contenedorControles;
    GridPane contenedorMesDeCrafteo;

    public ContenedorPrincipal(Stage stage) {
        this.setMenu(stage);
        this.setCentro();
        this.setInventario();
        this.setControles();
        this.setMesaDeCrafteo();

    }

    private void setMenu(Stage stage) {
        this.menuBar = new BarraDeMenu(stage);
        this.setTop(menuBar);
    }

    private void setCentro() {

        contenedorCentral = new GridPane();

        VistaTablero vistaTablero = new VistaTablero(contenedorCentral);

        this.setCenter(contenedorCentral);

    }

    private void setInventario() {

        contenedorInventario = new GridPane();

        VistaInventario vistaInventario = new VistaInventario(contenedorInventario);

        this.setRight(contenedorInventario);
    }

    private void setControles() {

        contenedorControles = new GridPane();

        VistaControles vistaControles = new VistaControles(contenedorControles);

        this.setBottom(contenedorControles);
    }

    private void setMesaDeCrafteo() {

        contenedorMesDeCrafteo = new GridPane();

        VistaMesaDeCrafteo vistaMesaDeCrafteo = new VistaMesaDeCrafteo(contenedorMesDeCrafteo);

        this.setLeft(contenedorMesDeCrafteo);
    }


}
