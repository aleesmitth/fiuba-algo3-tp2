package fiuba.algo3.tp2.vista;


import fiuba.algo3.tp2.modelo.Juego.Juego;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.image.Image;
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

        this.agregarFondo(contenedorCentral);

        for(int i = 0; i < FILAS_DEL_MAPA; i++) {
            for(int j = 0; j < COLUMNAS_DEL_MAPA; j++) {

                /**
                 * jugador:J madera:M piedra:P metal:A diamante:D vacio:-
                 */


                switch(juego.obtenerCodigoObjetoEnPosicion(i,j)){
                    case "J":
                        contenedorCentral.add(this.dibujarRectangulo(Color.RED),j,i);
                        break;
                    case "M":
                        contenedorCentral.add(this.dibujarRectangulo(Color.BROWN),j,i);
                        break;
                    case "P":
                        contenedorCentral.add(this.dibujarRectangulo(Color.GRAY),j,i);
                        break;
                    case "A":
                        contenedorCentral.add(this.dibujarRectangulo(Color.GAINSBORO),j,i);
                        break;
                    case "D":
                        contenedorCentral.add(this.dibujarRectangulo(Color.LIGHTBLUE),j,i);
                        break;
                    case "-":
                        contenedorCentral.add(this.dibujarRectangulo(Color.GREEN),j,i);
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

    private Rectangle dibujarRectangulo(Color color){

        Rectangle celda = new Rectangle(10,10, color);

        return celda;
    }

    private void agregarFondo(GridPane contenedorCentral){
        Image imagenFondo = new Image("file:src/fiuba/algo3/tp2/vista/Imagenes/TexturaPasto.jpg");
        BackgroundImage imagenDeFondo = new BackgroundImage(imagenFondo, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT);
        contenedorCentral.setBackground(new Background(imagenDeFondo));
    }

}

