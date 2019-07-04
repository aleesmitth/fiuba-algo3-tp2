package fiuba.algo3.tp2.vista;

import fiuba.algo3.tp2.modelo.Juego.Juego;
import fiuba.algo3.tp2.vista.Handlers.ButtonHandlers.BotonConstruirEventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.input.DragEvent;
import javafx.scene.input.TransferMode;
import javafx.scene.Node;
import javafx.event.EventHandler;

public class VistaMesaDeCrafteo {

    private GridPane matriz;
    private Juego juego;
    private Image madera = new Image("file:src/fiuba/algo3/tp2/vista/Imagenes/maderaInventario.jpg");
    private Image piedra = new Image("file:src/fiuba/algo3/tp2/vista/Imagenes/piedraInventario.jpg");
    private Image hierro = new Image("file:src/fiuba/algo3/tp2/vista/Imagenes/ironInventario.jpg");
    private VBox contenedorMesaDeCrafteo;

    public VistaMesaDeCrafteo(VBox contenedorMesaDeCrafteo, Juego juego){
        this.matriz = new GridPane();
        this.juego = juego;
        this.contenedorMesaDeCrafteo = contenedorMesaDeCrafteo;
        this.dibujar();
    }

    private void dibujar() {

        Image slotVacio = new Image("file:src/fiuba/algo3/tp2/vista/Imagenes/casilleroVacio.jpg");

        this.agregarFondo(this.contenedorMesaDeCrafteo);
        this.agregarMatriz(slotVacio);

        Button botonConstruir = new Button("Construir");
        BotonConstruirEventHandler botonConstruirEventHandler = new BotonConstruirEventHandler(juego, this);
        botonConstruir.setOnAction(botonConstruirEventHandler);

        this.contenedorMesaDeCrafteo.setMaxSize(300, Region.USE_COMPUTED_SIZE);
        this.contenedorMesaDeCrafteo.setPadding(new Insets(10, 10, 10, 10));
        this.contenedorMesaDeCrafteo.setAlignment(Pos.CENTER);

        this.contenedorMesaDeCrafteo.getChildren().addAll(this.matriz,botonConstruir);
        this.setearRecibirMaterial();
    }

    private void agregarMatriz(Image slotVacio){

        for(int i = 0; i< 3; i++) {
            for(int j = 0; j<3; j++) {
                this.matriz.add(new ImageView(slotVacio),i,j);
            }
        }
    }

    public String obtenerCodigoMesaDeCrafteoGrafica(){
        String codigo = "";
        for(int i = 0; i< 9; i++) {
            ImageView imageViewDeCelda = (ImageView) this.matriz.getChildren().get(i);
            Image imagenDeCelda = imageViewDeCelda.getImage();

            if(this.compararImagenes(imagenDeCelda, madera)){
                codigo = codigo + "M";
            }
            else if(this.compararImagenes(imagenDeCelda, piedra)){
                codigo = codigo + "P";
            }
            else if(this.compararImagenes(imagenDeCelda, madera)){
                codigo = codigo + "A";
            }
            else {
                codigo = codigo + "-";
            }
        }
        return codigo;
    }

    private void agregarFondo(VBox contenedorMesaDeCrafteo){
        Image imagenFondo = new Image("file:src/fiuba/algo3/tp2/vista/Imagenes/Madera.jpg");
        BackgroundImage imagenDeFondo = new BackgroundImage(imagenFondo, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT);
        contenedorMesaDeCrafteo.setBackground(new Background(imagenDeFondo));
    }

    private void setearRecibirMaterial(){
        for(Node a:this.matriz.getChildren()){
            a.setOnDragOver(new EventHandler<DragEvent>() {
                @Override
                public void handle(DragEvent event) {
                    if(event.getDragboard().hasImage()){
                        event.acceptTransferModes(TransferMode.ANY);
                    }
                }
            });
            a.setOnDragDropped(new EventHandler<DragEvent>() {
                @Override
                public void handle(DragEvent event) {
                    Image casilleroOcupado = event.getDragboard().getImage();
                    ImageView imagen = (ImageView)a;
                    imagen.setImage(casilleroOcupado);
                }
            });
        }
    }

    private boolean compararImagenes(Image imagen1, Image imagen2) {
        for (int i = 0; i < imagen1.getWidth(); i++)
        {
            for (int j = 0; j < imagen1.getHeight(); j++)
            {
                if (!imagen1.getPixelReader().getColor(i, j).equals(imagen2.getPixelReader().getColor(i, j))) return false;
            }
        }
        return true;
    }

    public void actualizar(){
        Image slotVacio = new Image("file:src/fiuba/algo3/tp2/vista/Imagenes/casilleroVacio.jpg");

        this.agregarFondo(this.contenedorMesaDeCrafteo);
        this.agregarMatriz(slotVacio);

        Button botonConstruir = new Button("Construir");
        BotonConstruirEventHandler botonConstruirEventHandler = new BotonConstruirEventHandler(juego, this);
        botonConstruir.setOnAction(botonConstruirEventHandler);

        this.contenedorMesaDeCrafteo.setMaxSize(300, Region.USE_COMPUTED_SIZE);
        this.contenedorMesaDeCrafteo.setPadding(new Insets(10, 10, 10, 10));
        this.contenedorMesaDeCrafteo.setAlignment(Pos.CENTER);


        this.setearRecibirMaterial();
    }
}
