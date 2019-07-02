package fiuba.algo3.tp2.vista.Handlers.ButtonHandlers;

import fiuba.algo3.tp2.modelo.Juego.Juego;
import fiuba.algo3.tp2.modelo.Mapa.MovilidadJugador.Izquierda;
import fiuba.algo3.tp2.modelo.Mapa.MovilidadJugador.Movimiento;
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
        Movimiento izquierda = new Izquierda();
        this.juego.moverJugador(izquierda);
        System.out.println("Left was pressed");
        if(izquierda.movio()) {
            this.vistaTablero.actualizar();
        }
    }
}