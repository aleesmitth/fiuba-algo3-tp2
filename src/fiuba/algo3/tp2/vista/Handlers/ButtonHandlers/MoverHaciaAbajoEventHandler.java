package fiuba.algo3.tp2.vista.Handlers.ButtonHandlers;

import fiuba.algo3.tp2.modelo.Juego.Juego;
import fiuba.algo3.tp2.modelo.Mapa.MovilidadJugador.Abajo;
import fiuba.algo3.tp2.modelo.Mapa.MovilidadJugador.Movimiento;
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
        Movimiento abajo = new Abajo();
        this.juego.moverJugador(abajo);
        System.out.println("Abajo was pressed");
        if(abajo.movio()) {
            this.vistaTablero.actualizar();
        }
    }
}
