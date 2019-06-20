package fiuba.algo3.tp2.vista;

import fiuba.algo3.tp2.modelo.AlgoCraft.AlgoCraft;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Aplicacion extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(final Stage stage) throws Exception {

        stage.setTitle("AlgoCraft");

        AlgoCraft algoCraft = new AlgoCraft();

        ContenedorPrincipal contenedorPrincipal = new ContenedorPrincipal(stage,algoCraft);
        Scene escenaJuego = new Scene(contenedorPrincipal, 1280,720);

        ContenedorBienvenidos contenedorBienvenidos = new ContenedorBienvenidos(stage, escenaJuego);
        Scene escenaBienvenidos = new Scene(contenedorBienvenidos ,1280,720);

        stage.setScene(escenaBienvenidos);
        stage.setFullScreen(false);

        stage.show();
    }
}
