package fiuba.algo3.tp2.vista.Handlers;

import fiuba.algo3.tp2.modelo.Juego.Juego;
import fiuba.algo3.tp2.modelo.Mapa.MovilidadJugador.Arriba;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class MoverHaciaArribaEventHandler implements EventHandler<ActionEvent> {

    private Juego juego;

    public MoverHaciaArribaEventHandler(Juego juego){
        this.juego = juego;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        juego.moverJugador(new Arriba());
    }

}
