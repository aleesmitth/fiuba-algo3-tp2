package fiuba.algo3.tp2.vista.Handlers.ButtonHandlers;

import fiuba.algo3.tp2.modelo.Juego.Juego;
import fiuba.algo3.tp2.modelo.Mapa.MovilidadJugador.Derecha;
import fiuba.algo3.tp2.modelo.Mapa.MovilidadJugador.Movimiento;
import fiuba.algo3.tp2.vista.VistaTablero;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class MoverHaciaDerechaEventHandler implements EventHandler<ActionEvent> {

    private Juego juego;
    private VistaTablero vistaTablero;

    public MoverHaciaDerechaEventHandler(Juego juego, VistaTablero vistaTablero){
        this.vistaTablero = vistaTablero;
        this.juego = juego;

    }

    @Override
    public void handle(ActionEvent actionEvent) {
        Movimiento derecha = new Derecha();
        this.juego.moverJugador(derecha);
        System.out.println("Derecha was pressed");
        if(derecha.movio()) {
            this.vistaTablero.actualizar();
        }
    }
}