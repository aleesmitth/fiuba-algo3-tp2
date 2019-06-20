package fiuba.algo3.tp2.vista;


import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.GridPane;
import javafx.scene.control.TextField;


public class VistaTablero {

    public VistaTablero(GridPane contenedorCentral){
        this.dibujar(contenedorCentral);
    }

    private void dibujar(GridPane contenedorCentral) {

        for(int i = 0; i< 3; i++) {
            for(int j = 0; j<3; j++) {
                contenedorCentral.add(new TextField(),i,j);
            }
        }

        contenedorCentral.setMinSize(400, 200);
        contenedorCentral.setPadding(new Insets(10, 10, 10, 10));
        contenedorCentral.setVgap(5);
        contenedorCentral.setHgap(5);
        contenedorCentral.setAlignment(Pos.CENTER);
    }
}

