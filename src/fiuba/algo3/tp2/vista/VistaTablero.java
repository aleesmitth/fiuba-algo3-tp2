package fiuba.algo3.tp2.vista;


import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Label;


public class VistaTablero {

    public VistaTablero(GridPane contenedorCentral){
        this.dibujar(contenedorCentral);
    }

    private void dibujar(GridPane contenedorCentral) {

        for(int i = 0; i< 9; i++) {
            for(int j = 0; j<9; j++) {
                contenedorCentral.add(new Label("-"),i,j);
            }
        }

        contenedorCentral.setMaxSize(200, 200);
        contenedorCentral.setPadding(new Insets(10, 10, 10, 10));
        contenedorCentral.setVgap(5);
        contenedorCentral.setHgap(5);
        contenedorCentral.setAlignment(Pos.CENTER);
    }
}

