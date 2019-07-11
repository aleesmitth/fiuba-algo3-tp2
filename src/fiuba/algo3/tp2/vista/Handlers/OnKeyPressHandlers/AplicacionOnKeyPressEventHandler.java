package fiuba.algo3.tp2.vista.Handlers.OnKeyPressHandlers;

import fiuba.algo3.tp2.modelo.Juego.Juego;
import fiuba.algo3.tp2.modelo.Mapa.MovilidadJugador.*;
import fiuba.algo3.tp2.vista.BarraDeMenu;
import fiuba.algo3.tp2.vista.VistaInventarioHerramientas;
import fiuba.algo3.tp2.vista.VistaInventarioMateriales;
import fiuba.algo3.tp2.vista.VistaTablero;
import javafx.event.EventHandler;
import javafx.scene.input.KeyEvent;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

import java.io.File;

public class AplicacionOnKeyPressEventHandler implements EventHandler<KeyEvent> {

    private Stage stage;
    private BarraDeMenu menuBar;
    private VistaTablero vistaTablero;
    private VistaInventarioMateriales vistaInventarioMateriales;
    private Juego juego;
    private VistaInventarioHerramientas vistaInventarioHerramientas;

    public AplicacionOnKeyPressEventHandler(Stage stage, BarraDeMenu menuBar, Juego juego, VistaTablero vistaTablero, VistaInventarioMateriales vistaInventarioMateriales, VistaInventarioHerramientas vistaInventarioHerramientas) {
        this.stage = stage;
        this.menuBar = menuBar;
        this.juego = juego;
        this.vistaTablero = vistaTablero;
        this.vistaInventarioMateriales = vistaInventarioMateriales;
        this.vistaInventarioHerramientas = vistaInventarioHerramientas;
    }

    @Override
    public void handle(KeyEvent event) {

        Media sound = new Media(new File("src/fiuba/algo3/tp2/vista/sounds/smack.mp3").toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.setVolume(0.3);

        switch (event.getCode()) {
            case ESCAPE:
                stage.setMaximized(false);
                menuBar.aplicacionMinimizada();
                break;
            case F:
                stage.setFullScreen(true);
                menuBar.aplicacionFullScreen();
                break;
            case UP:
                Movimiento arriba = new Arriba();
                this.juego.moverJugador(arriba);
                System.out.println("Arriba was pressed");
                if(arriba.movio()) {
                    this.vistaTablero.actualizar();
                }
                break;
            case DOWN:
                Movimiento abajo = new Abajo();
                this.juego.moverJugador(abajo);
                System.out.println("Abajo was pressed");
                if(abajo.movio()) {
                    this.vistaTablero.actualizar();
                }
                break;
            case LEFT:
                Movimiento izquierda = new Izquierda();
                this.juego.moverJugador(izquierda);
                System.out.println("Izquierda was pressed");
                if(izquierda.movio()) {
                    this.vistaTablero.actualizar();
                }
                break;
            case RIGHT:
                Movimiento derecha = new Derecha();
                this.juego.moverJugador(derecha);
                System.out.println("Derecha was pressed");
                if(derecha.movio()) {
                    this.vistaTablero.actualizar();
                }
                break;
            case CONTROL:
                if(!juego.herramientaDelJugadorEstaRota()) {
                    this.juego.jugadorGolpea();
                    System.out.println("Golpear was pressed");
                    mediaPlayer.play();
                    this.vistaInventarioMateriales.actualizar();
                    this.vistaTablero.actualizar();
                }else{
                    this.vistaInventarioHerramientas.actualizar(0);
                }
                break;
            case DIGIT1:
                if (this.juego.cambiarHerramientaEquipada(1)) {
                    this.vistaInventarioHerramientas.actualizar(1);
                    System.out.print("Herramienta 1");
                }
                break;
            case DIGIT2:
                if (this.juego.cambiarHerramientaEquipada(2)) {
                    this.vistaInventarioHerramientas.actualizar(2);
                    System.out.print("Herramienta 2");
                }
                break;
            case DIGIT3:
                if (this.juego.cambiarHerramientaEquipada(3)) {
                    this.vistaInventarioHerramientas.actualizar(3);
                    System.out.print("Herramienta 3");
                }
                break;
            case DIGIT4:
                if (this.juego.cambiarHerramientaEquipada(4)) {
                    this.vistaInventarioHerramientas.actualizar(4);
                    System.out.print("Herramienta 4");
                }
                break;
            case DIGIT5:
                if (this.juego.cambiarHerramientaEquipada(5)) {
                    this.vistaInventarioHerramientas.actualizar(5);
                    System.out.print("Herramienta 5");
                }
                break;
            case DIGIT6:
                if (this.juego.cambiarHerramientaEquipada(6)) {
                    this.vistaInventarioHerramientas.actualizar(6);
                    System.out.print("Herramienta 6");
                }
                break;
            case DIGIT7:
                if (this.juego.cambiarHerramientaEquipada(7)) {
                    this.vistaInventarioHerramientas.actualizar(7);
                    System.out.print("Herramienta 7");
                }
                break;
        }
    }
}
