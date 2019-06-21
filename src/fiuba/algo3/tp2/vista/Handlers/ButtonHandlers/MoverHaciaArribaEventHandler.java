package fiuba.algo3.tp2.vista.Handlers.ButtonHandlers;

import fiuba.algo3.tp2.modelo.Juego.Juego;
import fiuba.algo3.tp2.modelo.Mapa.MovilidadJugador.Arriba;
import fiuba.algo3.tp2.vista.VistaTablero;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class MoverHaciaArribaEventHandler implements EventHandler<ActionEvent> {

    private VistaTablero vistaTablero;
    private Juego juego;

    public MoverHaciaArribaEventHandler(Juego juego, VistaTablero vistaTablero){
        this.vistaTablero = vistaTablero;
        this.juego = juego;

    }

    @Override
    public void handle(ActionEvent actionEvent) {
        this.juego.moverJugador(new Arriba());
        System.out.println("Arriba was pressed");
        this.vistaTablero.actualizar();
    }

}