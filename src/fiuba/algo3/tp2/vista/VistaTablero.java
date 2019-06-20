package fiuba.algo3.tp2.vista;


import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.GridPane;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;


public class VistaTablero {

    public VistaTablero(GridPane contenedorCentral){
        this.dibujar(contenedorCentral);
    }

    private void dibujar(GridPane contenedorCentral) {

        for(int i = 0; i< 80; i++) {
            for(int j = 0; j<60; j++) {
                contenedorCentral.add(new Rectangle(10,10,Color.GRAY),i,j);
            }
        }
        //Dibuja supuesto jugador.
        contenedorCentral.add(new Rectangle(10,10,Color.RED),9,9);

        contenedorCentral.setMinSize(200, 200);
        contenedorCentral.setPadding(new Insets(10, 10, 10, 10));
        contenedorCentral.setVgap(0);
        contenedorCentral.setHgap(0);
        contenedorCentral.setAlignment(Pos.CENTER);
    }
}

