package fiuba.algo3.tp2.vista.Handlers.ButtonHandlers;

import fiuba.algo3.tp2.modelo.Entidad.Herramienta.Herramienta;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import fiuba.algo3.tp2.modelo.Juego.Juego;

public class BotonConstruirEventHandler implements EventHandler<ActionEvent> {

    Juego juego;

    public BotonConstruirEventHandler(Juego juego){
        this.juego = juego;
    }

    @Override
    public void handle(ActionEvent actionEvent){
        Herramienta herramienta = this.juego.construirHerramienta();
        this.juego.agregarHerramientaAlInventario(herramienta);

    }
}
