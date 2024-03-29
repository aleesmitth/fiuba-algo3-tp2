package fiuba.algo3.tp2.vista;

import fiuba.algo3.tp2.modelo.Juego.Juego;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import java.io.File;
import fiuba.algo3.tp2.vista.Handlers.OnKeyPressHandlers.AplicacionOnKeyPressEventHandler;

public class Aplicacion extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(final Stage stage) throws Exception {

        Media sound = new Media(new File("src/fiuba/algo3/tp2/vista/sounds/main.mp3").toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);

        stage.setTitle("AlgoCraft");

        Juego juego = new Juego();

        ContenedorPrincipal contenedorPrincipal = new ContenedorPrincipal(stage, juego);
        Scene escenaJuego = new Scene(contenedorPrincipal, 1280,720);

        AplicacionOnKeyPressEventHandler aplicacionOnKeyPressEventHandler = new AplicacionOnKeyPressEventHandler(stage, contenedorPrincipal.getBarraDeMenu(), juego, contenedorPrincipal.getVistaTablero(), contenedorPrincipal.getVistaInventarioMateriales(), contenedorPrincipal.getVistaInventarioHerramientas());
        escenaJuego.setOnKeyPressed(aplicacionOnKeyPressEventHandler);

        ContenedorBienvenidos contenedorBienvenidos = new ContenedorBienvenidos(stage, escenaJuego);
        Scene escenaBienvenidos = new Scene(contenedorBienvenidos ,1280,720);

        stage.setScene(escenaBienvenidos);
        stage.setFullScreen(false);

        stage.show();
        mediaPlayer.play();
        mediaPlayer.setVolume(0.3);
    }
}
