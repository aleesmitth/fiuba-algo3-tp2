package fiuba.algo3.tp2.vista;

import fiuba.algo3.tp2.modelo.Entidad.Materiales.Diamante;
import fiuba.algo3.tp2.modelo.Entidad.Materiales.Madera;
import fiuba.algo3.tp2.modelo.Entidad.Materiales.Metal;
import fiuba.algo3.tp2.modelo.Entidad.Materiales.Piedra;
import fiuba.algo3.tp2.modelo.Juego.Juego;
import fiuba.algo3.tp2.vista.Handlers.ButtonHandlers.BotonConstruirEventHandler;
import fiuba.algo3.tp2.vista.Handlers.ButtonHandlers.BotonVaciarEventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.*;
import javafx.scene.layout.*;
import javafx.scene.Node;
import javafx.event.EventHandler;
import org.omg.CORBA.IMP_LIMIT;

public class VistaMesaDeCrafteo {

    private GridPane matriz;
    private Juego juego;
    private Image madera = new Image("file:src/fiuba/algo3/tp2/vista/Imagenes/maderaInventario.jpg");
    private Image piedra = new Image("file:src/fiuba/algo3/tp2/vista/Imagenes/piedraInventario.jpg");
    private Image metal = new Image("file:src/fiuba/algo3/tp2/vista/Imagenes/ironInventario.jpg");
    private Image slotVacio = new Image("file:src/fiuba/algo3/tp2/vista/Imagenes/casilleroVacio.jpg");
    private VBox contenedorMesaDeCrafteo;
    protected final VistaMesaDeCrafteo vistaMesaDeCrafteo;
    private VistaInventarioMateriales vistaInventarioMateriales;

    public VistaMesaDeCrafteo(VBox contenedorMesaDeCrafteo, Juego juego, VistaInventarioMateriales vistaInventarioMateriales){
        this.matriz = new GridPane();
        this.juego = juego;
        this.contenedorMesaDeCrafteo = contenedorMesaDeCrafteo;
        this.vistaInventarioMateriales = vistaInventarioMateriales;
        this.dibujar();
        this.vistaMesaDeCrafteo = this;
    }

    private void dibujar() {

        this.agregarFondo(this.contenedorMesaDeCrafteo);

        this.matriz = this.armarMatriz();

        Button botonVaciar = new Button("Vaciar");
        BotonVaciarEventHandler botonVaciarEventHandler = new BotonVaciarEventHandler(juego, vistaInventarioMateriales, vistaMesaDeCrafteo);
        botonVaciar.setOnAction(botonVaciarEventHandler);

        Button botonConstruir = new Button("Construir");
        BotonConstruirEventHandler botonConstruirEventHandler = new BotonConstruirEventHandler(juego, this);
        botonConstruir.setOnAction(botonConstruirEventHandler);

        this.contenedorMesaDeCrafteo.setMaxSize(300, Region.USE_COMPUTED_SIZE);
        this.contenedorMesaDeCrafteo.setPadding(new Insets(10, 10, 10, 10));
        this.contenedorMesaDeCrafteo.setAlignment(Pos.CENTER);

        this.contenedorMesaDeCrafteo.getChildren().addAll(this.matriz,botonConstruir,botonVaciar);
        this.setearRecibirMaterial();
    }

    private GridPane armarMatriz(){

        GridPane matriz = new GridPane();

        for(int i = 0; i< 3; i++) {
            for(int j = 0; j<3; j++) {
                matriz.add(new ImageView(slotVacio),i,j);
            }
        }
        return matriz;
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
            else if(this.compararImagenes(imagenDeCelda, metal)){
                codigo = codigo + "A";
            }
            else {
                codigo = codigo + "-";
            }
        }
        this.matriz.getChildren().clear();

        return codigo;
    }

    private void agregarFondo(VBox contenedorMesaDeCrafteo){
        Image imagenFondo = new Image("file:src/fiuba/algo3/tp2/vista/Imagenes/texturaFondo.jpg");
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

                    if (compararImagenes(imagen.getImage(),madera)){
                        juego.sacarMaterialDeInventario(new Madera());
                    }else if (compararImagenes(imagen.getImage(),piedra)){
                        juego.sacarMaterialDeInventario(new Piedra());
                    }else if (compararImagenes(imagen.getImage(),metal)){
                        juego.sacarMaterialDeInventario(new Metal());
                    }
                    vistaInventarioMateriales.actualizar();
                }
            });
        }
    }

    private boolean compararImagenes(Image imagen1, Image imagen2) {
        for (int i = 0; i < imagen1.getWidth(); i++) {
            for (int j = 0; j < imagen1.getHeight(); j++) {
                if (!imagen1.getPixelReader().getColor(i, j).equals(imagen2.getPixelReader().getColor(i, j))) return false;
            }
        }
        return true;
    }

    public void actualizar(){
        this.contenedorMesaDeCrafteo.getChildren().clear();
        this.dibujar();
    }
}
