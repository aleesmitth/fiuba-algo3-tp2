package fiuba.algo3.tp2.vista.Handlers;

import fiuba.algo3.tp2.modelo.Juego.Juego;
import fiuba.algo3.tp2.modelo.Mapa.MovilidadJugador.Arriba;
import fiuba.algo3.tp2.vista.VistaTablero;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class MoverHaciaArribaEventHandler implements EventHandler<ActionEvent> {

    private Juego juego;
    private VistaTablero vistaTablero;

    public MoverHaciaArribaEventHandler(Juego juego, VistaTablero vistaTablero){
        this.juego = juego;
        this.vistaTablero = vistaTablero;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        juego.moverJugador(new Arriba());
        System.out.println("Arriba was pressed");
        vistaTablero.actualizar();
    }

}
