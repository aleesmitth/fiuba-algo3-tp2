package fiuba.algo3.tp2.vista;

import fiuba.algo3.tp2.modelo.Juego.Juego;
import fiuba.algo3.tp2.vista.Handlers.MoverHaciaAbajoEventHandler;
import fiuba.algo3.tp2.vista.Handlers.MoverHaciaArribaEventHandler;
import fiuba.algo3.tp2.vista.Handlers.MoverHaciaDerechaEventHandler;
import fiuba.algo3.tp2.vista.Handlers.MoverHaciaIzquierdaEventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

public class VistaControles {

    GridPane contenedorControles;

    public VistaControles(GridPane contenedorControles, Juego juego) {
        this.dibujar(contenedorControles, juego);
    }

    private void dibujar(GridPane contenedorControles, Juego juego) {

        Button botonArriba = new Button("Arriba");
        MoverHaciaArribaEventHandler botonMoverHaciaArribaEventHandler = new MoverHaciaArribaEventHandler(juego);
        botonArriba.setOnAction(botonMoverHaciaArribaEventHandler);

        Button botonIzquierda = new Button("Izquierda");
        MoverHaciaIzquierdaEventHandler botonMoverHaciaIzquierdaEventHandler = new MoverHaciaIzquierdaEventHandler(juego);
        botonArriba.setOnAction(botonMoverHaciaIzquierdaEventHandler);

        Button botonAbajo = new Button("Abajo");
        MoverHaciaAbajoEventHandler botonMoverHaciaAbajoEventHandler = new MoverHaciaAbajoEventHandler(juego);
        botonArriba.setOnAction(botonMoverHaciaAbajoEventHandler);

        Button botonDerecha = new Button("Derecha");
        MoverHaciaDerechaEventHandler botonMoverHaciaDerechaEventHandler = new MoverHaciaDerechaEventHandler(juego);
        botonArriba.setOnAction(botonMoverHaciaDerechaEventHandler);

        Button botonRomper = new Button("Romper");
        /*
            MoverHaciaArribaEventHandler botonMoverHaciaArribaEventHandler = new MoverHaciaArribaEventHandler(juego);
            botonArriba.setOnAction(botonMoverHaciaArribaEventHandler);
         */


        contenedorControles.add(botonArriba,1,0);
        contenedorControles.add(botonIzquierda,0,1);
        contenedorControles.add(botonAbajo,1,1);
        contenedorControles.add(botonDerecha,2,1);
        contenedorControles.add(botonRomper,3,0);

        contenedorControles.setMinSize(400, 200);
        contenedorControles.setPadding(new Insets(10, 10, 10, 10));
        contenedorControles.setVgap(5);
        contenedorControles.setHgap(5);
        contenedorControles.setAlignment(Pos.CENTER);
    }
}
