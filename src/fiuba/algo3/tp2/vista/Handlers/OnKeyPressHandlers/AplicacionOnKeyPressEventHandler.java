package fiuba.algo3.tp2.vista.Handlers.OnKeyPressHandlers;

import fiuba.algo3.tp2.modelo.Juego.Juego;
import fiuba.algo3.tp2.modelo.Mapa.MovilidadJugador.*;
import fiuba.algo3.tp2.vista.BarraDeMenu;
import fiuba.algo3.tp2.vista.VistaTablero;
import javafx.event.EventHandler;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

public class AplicacionOnKeyPressEventHandler implements EventHandler<KeyEvent> {

    private Stage stage;
    private BarraDeMenu menuBar;
    private VistaTablero vistaTablero;
    private Juego juego;

    public AplicacionOnKeyPressEventHandler(Stage stage, BarraDeMenu menuBar, Juego juego, VistaTablero vistaTablero) {
        this.stage = stage;
        this.menuBar = menuBar;
        this.juego = juego;
        this.vistaTablero = vistaTablero;
    }

    @Override
    public void handle(KeyEvent event) {

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
            case P:
                this.juego.jugadorGolpea();
                System.out.println("Golpear was pressed");
                this.vistaTablero.actualizar();
                break;
        }
    }
}
