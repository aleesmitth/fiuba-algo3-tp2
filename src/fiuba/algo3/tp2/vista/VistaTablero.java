package fiuba.algo3.tp2.vista;


import fiuba.algo3.tp2.modelo.Juego.Juego;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import static fiuba.algo3.tp2.modelo.Juego.Juego.COLUMNAS_DEL_MAPA;
import static fiuba.algo3.tp2.modelo.Juego.Juego.FILAS_DEL_MAPA;


public class VistaTablero {

    private final GridPane contenedorCentral;
    private final Juego juego;

    public VistaTablero(GridPane contenedorCentral, Juego juego){
        this.contenedorCentral = contenedorCentral;
        this.juego = juego;
        this.dibujar();
    }

    public void dibujar() {

        Image jugador = new Image("file:src/fiuba/algo3/tp2/vista/Imagenes/player.png");
        Image madera = new Image("file:src/fiuba/algo3/tp2/vista/Imagenes/madera.png");
        Image piedra = new Image("file:src/fiuba/algo3/tp2/vista/Imagenes/piedra.png");
        Image metal = new Image("file:src/fiuba/algo3/tp2/vista/Imagenes/iron.png");
        Image diamante = new Image("file:src/fiuba/algo3/tp2/vista/Imagenes/diamante.png");
        Image pasto = new Image("file:src/fiuba/algo3/tp2/vista/Imagenes/pasto.png");

        for(int i = 0; i < FILAS_DEL_MAPA; i++) {
            for(int j = 0; j < COLUMNAS_DEL_MAPA; j++) {

                /**
                 * jugador:J madera:M piedra:P metal:A diamante:D vacio:-
                 */


                switch(juego.obtenerCodigoObjetoEnPosicion(i,j)){
                    case "J":
                        contenedorCentral.add(new ImageView(jugador),j,i);
                        break;
                    case "M":
                        contenedorCentral.add(new ImageView(madera),j,i);
                        break;
                    case "P":
                        contenedorCentral.add(new ImageView(piedra),j,i);
                        break;
                    case "A":
                        contenedorCentral.add(new ImageView(metal),j,i);
                        break;
                    case "D":
                        contenedorCentral.add(new ImageView(diamante),j,i);
                        break;
                    case "-":
                        contenedorCentral.add(new ImageView(pasto),j,i);
                        break;
                }
            }
        }

        contenedorCentral.setGridLinesVisible(true);
        contenedorCentral.setPadding(new Insets(10, 10, 10, 10));
        contenedorCentral.setVgap(0);
        contenedorCentral.setHgap(0);

        contenedorCentral.setAlignment(Pos.CENTER);

        contenedorCentral.setMaxSize(Region.USE_COMPUTED_SIZE,Region.USE_COMPUTED_SIZE);
    }

    public void actualizar() {
        this.dibujar();

    }
}

