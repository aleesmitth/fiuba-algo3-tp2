package fiuba.algo3.tp2.vista;

import fiuba.algo3.tp2.vista.Handlers.MoverHaciaArribaEventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

public class VistaControles {

    public VistaControles(GridPane contenedorControles) {
        this.dibujar(contenedorControles);
    }

    private void dibujar(GridPane contenedorControles) {

        Button botonArriba = new Button("Up");
        MoverHaciaArribaEventHandler botonMoverHaciaArribaEventHandler = new MoverHaciaArribaEventHandler();
        botonArriba.setOnAction(botonMoverHaciaArribaEventHandler);

        contenedorControles.add(botonArriba,1,0);
        contenedorControles.add(new Button("Left"),0,1);
        contenedorControles.add(new Button("Down"),1,1);
        contenedorControles.add(new Button("Right"),2,1);

        contenedorControles.setMinSize(400, 200);
        contenedorControles.setPadding(new Insets(10, 10, 10, 10));
        contenedorControles.setVgap(5);
        contenedorControles.setHgap(5);
        contenedorControles.setAlignment(Pos.CENTER);
    }
}
