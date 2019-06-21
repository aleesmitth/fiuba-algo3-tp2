package fiuba.algo3.tp2.vista;

import fiuba.algo3.tp2.modelo.Juego.Juego;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class VistaMesaDeCrafteo {

    public VistaMesaDeCrafteo(GridPane contenedorMesaDeCrafteo, Juego juego){
        this.dibujar(contenedorMesaDeCrafteo);
    }

    private void dibujar(GridPane contenedorMesaDeCrafteo) {

        for(int i = 0; i< 3; i++) {
            for(int j = 0; j<3; j++) {
                contenedorMesaDeCrafteo.add(new TextField(),i,j);
            }
        }

        Button botonConstruir = new Button("Construir");
        contenedorMesaDeCrafteo.add(botonConstruir,1,3);

        contenedorMesaDeCrafteo.setMinSize(10, 10);
        contenedorMesaDeCrafteo.setPadding(new Insets(10, 10, 10, 10));
        contenedorMesaDeCrafteo.setVgap(5);
        contenedorMesaDeCrafteo.setHgap(5);
        contenedorMesaDeCrafteo.setAlignment(Pos.CENTER);
    }
}
