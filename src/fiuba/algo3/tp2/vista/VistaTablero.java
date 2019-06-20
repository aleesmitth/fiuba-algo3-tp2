package fiuba.algo3.tp2.vista;


import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Label;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;


public class VistaTablero {

    public VistaTablero(GridPane contenedorCentral){
        this.dibujar(contenedorCentral);
    }

    private void dibujar(GridPane contenedorCentral) {

        new Rectangle(100,100,Color.GRAY);

        for(int i = 0; i< 20; i++) {
            for(int j = 0; j<20; j++) {
                contenedorCentral.add(new Rectangle(30,30,Color.GRAY),i,j);
            }
        }

        contenedorCentral.setMinSize(200, 200);
        contenedorCentral.setPadding(new Insets(10, 10, 10, 10));
        contenedorCentral.setVgap(5);
        contenedorCentral.setHgap(5);
        contenedorCentral.setAlignment(Pos.CENTER);
    }
}

