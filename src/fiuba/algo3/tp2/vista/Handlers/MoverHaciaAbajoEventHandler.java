package fiuba.algo3.tp2.vista.Handlers;

import fiuba.algo3.tp2.modelo.Juego.Juego;
import fiuba.algo3.tp2.modelo.Mapa.MovilidadJugador.Abajo;
import fiuba.algo3.tp2.vista.VistaTablero;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class MoverHaciaAbajoEventHandler implements EventHandler<ActionEvent> {

    private Juego juego;
    private VistaTablero vistaTablero;

    public MoverHaciaAbajoEventHandler(Juego juego, VistaTablero vistaTablero){
        this.vistaTablero = vistaTablero;
        this.juego = juego;

    }

    @Override
    public void handle(ActionEvent actionEvent) {
        this.juego.moverJugador(new Abajo());
        System.out.println("Abajo was pressed");
        this.vistaTablero.actualizar();

    }
}
