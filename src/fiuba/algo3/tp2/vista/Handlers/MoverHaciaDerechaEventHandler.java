package fiuba.algo3.tp2.vista.Handlers;

import fiuba.algo3.tp2.modelo.Juego.Juego;
import fiuba.algo3.tp2.modelo.Mapa.MovilidadJugador.Derecha;
import fiuba.algo3.tp2.vista.VistaTablero;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class MoverHaciaDerechaEventHandler implements EventHandler<ActionEvent> {

    private Juego juego;
    private VistaTablero vistaTablero;

    public MoverHaciaDerechaEventHandler(Juego juego, VistaTablero vistaTablero){
        this.juego = juego;
        this.vistaTablero = vistaTablero;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        juego.moverJugador(new Derecha());
        System.out.println("Derecha was pressed");
        vistaTablero.actualizar();
    }
}