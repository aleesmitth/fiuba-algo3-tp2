package fiuba.algo3.tp2.vista;

import fiuba.algo3.tp2.modelo.Juego.Juego;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;

public class VistaInventarioHerramientas {

    private Juego juego;
    private HBox contenedorInventario;

    public VistaInventarioHerramientas(HBox contenedorInventario, Juego juego) {
        this.juego = juego;
        this.contenedorInventario = contenedorInventario;
        this.dibujar();
        this.actualizar(1);
    }

    private void dibujar() {
        this.agregarFondo();

        ImageView posicion1 = new ImageView(new Image("file:src/fiuba/algo3/tp2/vista/Imagenes/casilleroVacio.jpg"));
        ImageView posicion2 = new ImageView(new Image("file:src/fiuba/algo3/tp2/vista/Imagenes/casilleroVacio.jpg"));
        ImageView posicion3 = new ImageView(new Image("file:src/fiuba/algo3/tp2/vista/Imagenes/casilleroVacio.jpg"));
        ImageView posicion4 = new ImageView(new Image("file:src/fiuba/algo3/tp2/vista/Imagenes/casilleroVacio.jpg"));
        ImageView posicion5 = new ImageView(new Image("file:src/fiuba/algo3/tp2/vista/Imagenes/casilleroVacio.jpg"));
        ImageView posicion6 = new ImageView(new Image("file:src/fiuba/algo3/tp2/vista/Imagenes/casilleroVacio.jpg"));
        ImageView posicion7 = new ImageView(new Image("file:src/fiuba/algo3/tp2/vista/Imagenes/casilleroVacio.jpg"));

        this.contenedorInventario.setMaxSize(Region.USE_COMPUTED_SIZE, 200);
        this.contenedorInventario.setPadding(new Insets(10, 10, 10, 10));
        this.contenedorInventario.setAlignment(Pos.CENTER);

        this.contenedorInventario.getChildren().addAll(posicion1, posicion2, posicion3, posicion4, posicion5, posicion6, posicion7);
    }

    private void agregarFondo(){
        Image imagenFondo = new Image("file:src/fiuba/algo3/tp2/vista/Imagenes/texturaFondo.jpg");
        BackgroundImage imagenDeFondo = new BackgroundImage(imagenFondo, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT);
        contenedorInventario.setBackground(new Background(imagenDeFondo));
    }

    public void actualizar(int posicion) {
        this.clear();
        this.dibujar();

        ImageView madera = new ImageView(new Image("file:src/fiuba/algo3/tp2/vista/Imagenes/maderaInventario.jpg"));

        this.contenedorInventario.getChildren().remove(posicion - 1);
        this.contenedorInventario.getChildren().add(posicion - 1,madera);

    }

    private void clear() {
        this.contenedorInventario.getChildren().clear();
    }
}
