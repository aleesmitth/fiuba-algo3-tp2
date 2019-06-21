package fiuba.algo3.tp2.vista.Handlers;

import fiuba.algo3.tp2.modelo.Juego.Juego;
import fiuba.algo3.tp2.modelo.Mapa.MovilidadJugador.Izquierda;
import fiuba.algo3.tp2.vista.VistaTablero;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class MoverHaciaIzquierdaEventHandler implements EventHandler<ActionEvent> {

    private Juego juego;
    private VistaTablero vistaTablero;

    public MoverHaciaIzquierdaEventHandler(Juego juego, VistaTablero vistaTablero){
        this.vistaTablero = vistaTablero;
        this.juego = juego;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        this.juego.moverJugador(new Izquierda());
        System.out.println("Left was pressed");
        this.vistaTablero.actualizar();
    }
}