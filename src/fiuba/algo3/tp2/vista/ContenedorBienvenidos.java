package fiuba.algo3.tp2.vista;

import fiuba.algo3.tp2.vista.Handlers.BotonEntrarEventHandler;
import fiuba.algo3.tp2.vista.Handlers.OpcionSalirEventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class ContenedorBienvenidos extends VBox {

    Stage stage;

    public ContenedorBienvenidos(Stage stage, Scene proximaEscena) {

        super();

        this.stage = stage;

        this.setAlignment(Pos.CENTER);
        this.setSpacing(20);
        this.setPadding(new Insets(25));

        Image imagen = new Image("file:src/fiuba/algo3/tp2/vista/Imagenes/wallpaperInicio.png");
        BackgroundImage imagenDeFondo = new BackgroundImage(imagen, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT);
        this.setBackground(new Background(imagenDeFondo));

        Label etiqueta = new Label();
        etiqueta.setFont(Font.font("tahoma", FontWeight.BOLD, 64));
        etiqueta.setText("AlgoCraft");
        etiqueta.setTextFill(Color.WHITE);


        Button botonEntrar = new Button();
        botonEntrar.setText("Entrar");
        BotonEntrarEventHandler botonEntrarEventHandler = new BotonEntrarEventHandler(stage, proximaEscena);
        botonEntrar.setOnAction(botonEntrarEventHandler);

        Button botonSalir = new Button();
        botonSalir.setText("Salir");
        OpcionSalirEventHandler opcionSalirEventHandler = new OpcionSalirEventHandler();
        botonSalir.setOnAction(opcionSalirEventHandler);

        this.getChildren().addAll(etiqueta, botonEntrar, botonSalir);
    }

}
