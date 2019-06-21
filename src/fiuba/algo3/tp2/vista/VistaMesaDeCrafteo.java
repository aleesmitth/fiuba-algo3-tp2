package fiuba.algo3.tp2.vista;

import fiuba.algo3.tp2.modelo.Juego.Juego;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class VistaMesaDeCrafteo {

    public VistaMesaDeCrafteo(GridPane contenedorCentral, Juego juego){
        this.dibujar(contenedorCentral);
    }

    private void dibujar(GridPane contenedorCentral) {

        for(int i = 0; i< 3; i++) {
            for(int j = 0; j<3; j++) {
                contenedorCentral.add(new TextField(),i,j);
            }
        }

        Button botonConstruir = new Button("Construir");
        contenedorCentral.add(botonConstruir,1,3);

        contenedorCentral.setMaxSize(200, 200);
        contenedorCentral.setPadding(new Insets(10, 10, 10, 10));
        contenedorCentral.setVgap(5);
        contenedorCentral.setHgap(5);
        contenedorCentral.setAlignment(Pos.CENTER);
    }
}
