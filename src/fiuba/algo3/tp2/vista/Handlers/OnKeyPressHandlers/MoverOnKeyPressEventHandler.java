package fiuba.algo3.tp2.vista.Handlers.OnKeyPressHandlers;

import fiuba.algo3.tp2.modelo.Juego.Juego;
import fiuba.algo3.tp2.modelo.Mapa.MovilidadJugador.Abajo;
import fiuba.algo3.tp2.modelo.Mapa.MovilidadJugador.Arriba;
import fiuba.algo3.tp2.modelo.Mapa.MovilidadJugador.Derecha;
import fiuba.algo3.tp2.modelo.Mapa.MovilidadJugador.Izquierda;
import fiuba.algo3.tp2.vista.VistaTablero;
import javafx.event.EventHandler;
import javafx.scene.input.KeyEvent;

public class MoverOnKeyPressEventHandler implements EventHandler<KeyEvent> {

    private VistaTablero vistaTablero;
    private Juego juego;

    public MoverOnKeyPressEventHandler(Juego juego, VistaTablero vistaTablero){
        this.vistaTablero = vistaTablero;
        this.juego = juego;
    }

    @Override
    public void handle(KeyEvent event) {
        switch(event.getCode()) {
            case UP:
                this.juego.moverJugador(new Arriba());
                System.out.println("Arriba was pressed");
                this.vistaTablero.actualizar();
                break;
            case DOWN:
                this.juego.moverJugador(new Abajo());
                System.out.println("Abajo was pressed");
                this.vistaTablero.actualizar();
                break;
            case LEFT:
                this.juego.moverJugador(new Izquierda());
                System.out.println("Left was pressed");
                this.vistaTablero.actualizar();
                break;
            case RIGHT:
                this.juego.moverJugador(new Derecha());
                System.out.println("Derecha was pressed");
                this.vistaTablero.actualizar();
                break;
        }
    }

}
