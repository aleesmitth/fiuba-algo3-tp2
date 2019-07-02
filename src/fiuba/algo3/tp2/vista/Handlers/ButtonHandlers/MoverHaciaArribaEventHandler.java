package fiuba.algo3.tp2.vista.Handlers.ButtonHandlers;

import fiuba.algo3.tp2.modelo.Juego.Juego;
import fiuba.algo3.tp2.modelo.Mapa.MovilidadJugador.Arriba;
import fiuba.algo3.tp2.modelo.Mapa.MovilidadJugador.Movimiento;
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
        Movimiento arriba = new Arriba();
        this.juego.moverJugador(arriba);
        System.out.println("Arriba was pressed");
        if (arriba.movio()) {
            this.vistaTablero.actualizar();
        }
    }
}
