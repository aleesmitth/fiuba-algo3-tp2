package fiuba.algo3.tp2.vista;


import fiuba.algo3.tp2.modelo.Juego.Juego;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Region;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
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
                        contenedorCentral.add(this.dibujarRectangulo(jugador),j,i);
                        break;
                    case "M":
                        contenedorCentral.add(this.dibujarRectangulo(madera),j,i);
                        break;
                    case "P":
                        contenedorCentral.add(this.dibujarRectangulo(piedra),j,i);
                        break;
                    case "A":
                        contenedorCentral.add(this.dibujarRectangulo(metal),j,i);
                        break;
                    case "D":
                        contenedorCentral.add(this.dibujarRectangulo(diamante),j,i);
                        break;
                    case "-":
                        contenedorCentral.add(this.dibujarRectangulo(pasto),j,i);
                        break;
                }
            }
        }

        contenedorCentral.setPadding(new Insets(10, 10, 10, 10));
        contenedorCentral.setVgap(0);
        contenedorCentral.setHgap(0);

        contenedorCentral.setAlignment(Pos.CENTER);

        contenedorCentral.setMaxSize(Region.USE_COMPUTED_SIZE,Region.USE_COMPUTED_SIZE);
    }

    public void dibujarNuevo() {

        Image jugador = new Image("file:src/fiuba/algo3/tp2/vista/Imagenes/player.png");
        Image madera = new Image("file:src/fiuba/algo3/tp2/vista/Imagenes/madera.png");
        Image piedra = new Image("file:src/fiuba/algo3/tp2/vista/Imagenes/piedra.png");
        Image metal = new Image("file:src/fiuba/algo3/tp2/vista/Imagenes/iron.png");
        Image diamante = new Image("file:src/fiuba/algo3/tp2/vista/Imagenes/diamante.png");
        Image pasto = new Image("file:src/fiuba/algo3/tp2/vista/Imagenes/pasto.png");

        int filaDelJugador = juego.mapaDelJuego.celdaConJugador.obtenerFila();
        int columnaDelJugador = juego.mapaDelJuego.celdaConJugador.obtenerColumna();

        for(int i = (filaDelJugador-2); i <= (filaDelJugador+2); i++) {
            for(int j = (columnaDelJugador-2); j <= (columnaDelJugador+2); j++) {

                /**
                 * jugador:J madera:M piedra:P metal:A diamante:D vacio:-
                 */


                switch(juego.obtenerCodigoObjetoEnPosicion(i,j)){
                    case "J":
                        contenedorCentral.add(this.dibujarRectangulo(jugador),j,i);
                        break;
                    case "M":
                        contenedorCentral.add(this.dibujarRectangulo(madera),j,i);
                        break;
                    case "P":
                        contenedorCentral.add(this.dibujarRectangulo(piedra),j,i);
                        break;
                    case "A":
                        contenedorCentral.add(this.dibujarRectangulo(metal),j,i);
                        break;
                    case "D":
                        contenedorCentral.add(this.dibujarRectangulo(diamante),j,i);
                        break;
                    case "-":
                        contenedorCentral.add(this.dibujarRectangulo(pasto),j,i);
                        break;
                }
            }
        }

        contenedorCentral.setPadding(new Insets(10, 10, 10, 10));
        contenedorCentral.setVgap(0);
        contenedorCentral.setHgap(0);

        contenedorCentral.setAlignment(Pos.CENTER);

        contenedorCentral.setMaxSize(Region.USE_COMPUTED_SIZE,Region.USE_COMPUTED_SIZE);
    }


    public void actualizar() {
        this.dibujarNuevo();
    }

    private Rectangle dibujarRectangulo(Image image){
        Rectangle rectangle = new Rectangle(18, 18);
        ImagePattern imagePattern = new ImagePattern(image);
        rectangle.setFill(imagePattern);
        rectangle.setStroke(Color.BLACK);
        return rectangle;
    }
}

