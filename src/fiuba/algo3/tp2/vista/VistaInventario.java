package fiuba.algo3.tp2.vista;

import fiuba.algo3.tp2.modelo.Entidad.Materiales.Diamante;
import fiuba.algo3.tp2.modelo.Entidad.Materiales.Madera;
import fiuba.algo3.tp2.modelo.Entidad.Materiales.Metal;
import fiuba.algo3.tp2.modelo.Entidad.Materiales.Piedra;
import fiuba.algo3.tp2.modelo.Juego.Juego;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;

public class VistaInventario {

    private Juego juego;

    public VistaInventario(GridPane contenedorInventario, Juego juego) {
        this.juego = juego;
        this.dibujar(contenedorInventario);
    }

    private void dibujar(GridPane contenedorInventario) {

        Image madera = new Image("file:src/fiuba/algo3/tp2/vista/Imagenes/maderaInventario.jpg");
        Image piedra = new Image("file:src/fiuba/algo3/tp2/vista/Imagenes/piedraInventario.jpg");
        Image acero = new Image("file:src/fiuba/algo3/tp2/vista/Imagenes/ironInventario.jpg");
        Image diamante = new Image("file:src/fiuba/algo3/tp2/vista/Imagenes/diamanteInventario.jpg");

        Label labelCantidadDeMadera = new Label(this.juego.getCantidadDeMaterial(new Madera()));
        Label labelCantidadDePiedra = new Label(this.juego.getCantidadDeMaterial(new Piedra()));
        Label labelCantidadDeMetal = new Label(this.juego.getCantidadDeMaterial(new Metal()));
        Label labelCantidadDeDiamante = new Label(this.juego.getCantidadDeMaterial(new Diamante()));


        this.agregarFondo(contenedorInventario);

        contenedorInventario.add(new Label("Inventario:"),0,0);
        contenedorInventario.add(new ImageView(madera),0,1);
        contenedorInventario.add(labelCantidadDeMadera,1,1);
        contenedorInventario.add(new ImageView(piedra),0,2);
        contenedorInventario.add(labelCantidadDePiedra,1,2);
        contenedorInventario.add(new ImageView(acero),0,3);
        contenedorInventario.add(labelCantidadDeMetal,1,3);
        contenedorInventario.add(new ImageView(diamante),0,4);
        contenedorInventario.add(labelCantidadDeDiamante,1,4);

        contenedorInventario.setMinSize(200, Region.USE_COMPUTED_SIZE);
        contenedorInventario.setPadding(new Insets(10, 10, 10, 10));
        contenedorInventario.setVgap(5);
        contenedorInventario.setHgap(5);
        contenedorInventario.setAlignment(Pos.CENTER);
    }

    private void agregarFondo(GridPane contenedorInventario){
        Image imagenFondo = new Image("file:src/fiuba/algo3/tp2/vista/Imagenes/Madera.jpg");
        BackgroundImage imagenDeFondo = new BackgroundImage(imagenFondo, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT);
        contenedorInventario.setBackground(new Background(imagenDeFondo));
    }
}
