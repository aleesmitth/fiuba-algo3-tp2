package fiuba.algo3.tp2.vista;

import fiuba.algo3.tp2.modelo.AlgoCraft.AlgoCraft;
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

    public ContenedorPrincipal(Stage stage, AlgoCraft algocraft) {
        this.setMenu(stage);
        this.setCentro(algocraft);
        this.setInventario(algocraft);
        this.setControles(algocraft);

    }

    private void setMenu(Stage stage) {
        this.menuBar = new BarraDeMenu(stage);
        this.setTop(menuBar);
    }

    private void setCentro(AlgoCraft algoCraft) {

        contenedorCentral = new GridPane();

        VistaTablero vistaTablero = new VistaTablero(contenedorCentral);

        this.setCenter(contenedorCentral);

    }

    private void setInventario(AlgoCraft algoCraft) {

        contenedorInventario = new GridPane();

        VistaInventario vistaInventario = new VistaInventario(contenedorInventario);

        this.setRight(contenedorInventario);
    }

    private void setControles(AlgoCraft algoCraft) {

        contenedorControles = new GridPane();

        VistaControles vistaControles = new VistaControles(contenedorControles);

        this.setBottom(contenedorControles);
    }


}
