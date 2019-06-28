package fiuba.algo3.tp2.vista;

import fiuba.algo3.tp2.modelo.Juego.Juego;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.*;

public class VistaMesaDeCrafteo {

    private GridPane matriz;

    public VistaMesaDeCrafteo(VBox contenedorMesaDeCrafteo, Juego juego){
        this.matriz = new GridPane();
        this.dibujar(contenedorMesaDeCrafteo);
    }

    private void dibujar(VBox contenedorMesaDeCrafteo) {

        this.agregarFondo(contenedorMesaDeCrafteo);
        this.agregarMatriz();

        Button botonConstruir = new Button("Construir");

        contenedorMesaDeCrafteo.setMaxSize(200, Region.USE_COMPUTED_SIZE);
        contenedorMesaDeCrafteo.setPadding(new Insets(10, 10, 10, 10));
        contenedorMesaDeCrafteo.setAlignment(Pos.CENTER);

        contenedorMesaDeCrafteo.getChildren().addAll(this.matriz,botonConstruir);
    }

    private void agregarMatriz(){

        for(int i = 0; i< 3; i++) {
            for(int j = 0; j<3; j++) {
                this.agregarTextFeild(i,j);
            }
        }
    }

    private void agregarTextFeild(int fila, int columna){
        TextField textField = new TextField();
        textField.setMaxSize(Region.USE_COMPUTED_SIZE,Region.USE_COMPUTED_SIZE);
        textField.setAlignment(Pos.CENTER);
        matriz.add(textField, columna, fila);
    }

    private void agregarFondo(VBox contenedorMesaDeCrafteo){
        Image imagenFondo = new Image("file:src/fiuba/algo3/tp2/vista/Imagenes/Madera.jpg");
        BackgroundImage imagenDeFondo = new BackgroundImage(imagenFondo, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT);
        contenedorMesaDeCrafteo.setBackground(new Background(imagenDeFondo));
    }
}
