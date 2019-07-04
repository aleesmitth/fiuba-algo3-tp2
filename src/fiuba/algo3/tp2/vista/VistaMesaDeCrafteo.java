package fiuba.algo3.tp2.vista;

import fiuba.algo3.tp2.modelo.Juego.Juego;
import fiuba.algo3.tp2.vista.Handlers.ButtonHandlers.BotonConstruirEventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;

public class VistaMesaDeCrafteo {

    private GridPane matriz;
    private Juego juego;

    public VistaMesaDeCrafteo(VBox contenedorMesaDeCrafteo, Juego juego){
        this.matriz = new GridPane();
        this.juego = juego;
        this.dibujar(contenedorMesaDeCrafteo);
    }

    private void dibujar(VBox contenedorMesaDeCrafteo) {

        Image slotVacio = new Image("file:src/fiuba/algo3/tp2/vista/Imagenes/casilleroVacio.jpg");

        this.agregarFondo(contenedorMesaDeCrafteo);
        this.agregarMatriz(slotVacio);

        Button botonConstruir = new Button("Construir");
        BotonConstruirEventHandler botonConstruirEventHandler = new BotonConstruirEventHandler(juego);
        botonConstruir.setOnAction(botonConstruirEventHandler);

        contenedorMesaDeCrafteo.setMaxSize(300, Region.USE_COMPUTED_SIZE);
        contenedorMesaDeCrafteo.setPadding(new Insets(10, 10, 10, 10));
        contenedorMesaDeCrafteo.setAlignment(Pos.CENTER);

        contenedorMesaDeCrafteo.getChildren().addAll(this.matriz,botonConstruir);
    }

    private void agregarMatriz(Image slotVacio){

        for(int i = 0; i< 3; i++) {
            for(int j = 0; j<3; j++) {
                this.matriz.add(new ImageView(slotVacio),i,j);
            }
        }
    }

    private void agregarFondo(VBox contenedorMesaDeCrafteo){
        Image imagenFondo = new Image("file:src/fiuba/algo3/tp2/vista/Imagenes/Madera.jpg");
        BackgroundImage imagenDeFondo = new BackgroundImage(imagenFondo, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT);
        contenedorMesaDeCrafteo.setBackground(new Background(imagenDeFondo));
    }
}
