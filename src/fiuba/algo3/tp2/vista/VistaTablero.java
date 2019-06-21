package fiuba.algo3.tp2.vista;


import fiuba.algo3.tp2.modelo.Juego.Juego;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import static fiuba.algo3.tp2.modelo.Juego.Juego.COLUMNAS_DEL_MAPA;
import static fiuba.algo3.tp2.modelo.Juego.Juego.FILAS_DEL_MAPA;


public class VistaTablero {

    private GridPane contenedorCentral;
    private Juego juego;

    public VistaTablero(GridPane contenedorCentral, Juego juego){
        this.contenedorCentral = contenedorCentral;
        this.juego = juego;
        this.dibujar();

    }

    public void dibujar() {


        for(int i = 0; i< FILAS_DEL_MAPA; i++) {
            for(int j = 0; j<COLUMNAS_DEL_MAPA; j++) {

                /**
                 * jugador:J madera:M piedra:P metal:A diamante:D vacio:-
                 */


                switch(juego.obtenerCodigoObjetoEnPosicion(i,j)){
                    case "J":
                        contenedorCentral.add(new Rectangle(10,10,Color.RED),i,j);
                    case "M":
                        contenedorCentral.add(new Rectangle(10,10,Color.BROWN),i,j);
                        break;
                    case "P":
                        contenedorCentral.add(new Rectangle(10,10,Color.GRAY),i,j);
                        break;
                    case "A":
                        contenedorCentral.add(new Rectangle(10,10,Color.GAINSBORO),i,j);
                        break;
                    case "D":
                        contenedorCentral.add(new Rectangle(10,10,Color.LIGHTBLUE),i,j);
                        break;
                    case "-":
                        contenedorCentral.add(new Rectangle(10,10,Color.GREEN),i,j);
                        break;
                }
            }
        }

        contenedorCentral.setMinSize(200, 200);
        contenedorCentral.setPadding(new Insets(10, 10, 10, 10));
        contenedorCentral.setVgap(0);
        contenedorCentral.setHgap(0);
        contenedorCentral.setAlignment(Pos.CENTER);
    }

    public void actualizar() {
        this.dibujar();

    }
}

