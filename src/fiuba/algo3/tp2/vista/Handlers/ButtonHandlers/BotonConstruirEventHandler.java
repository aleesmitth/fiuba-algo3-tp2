package fiuba.algo3.tp2.vista.Handlers.ButtonHandlers;

import fiuba.algo3.tp2.modelo.Entidad.Herramienta.Herramienta;
import fiuba.algo3.tp2.vista.VistaMesaDeCrafteo;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import fiuba.algo3.tp2.modelo.Juego.Juego;

public class BotonConstruirEventHandler implements EventHandler<ActionEvent> {

    Juego juego;
    private VistaMesaDeCrafteo vistaMesaDeCrafteo;

    public BotonConstruirEventHandler(Juego juego, VistaMesaDeCrafteo vistaMesaDeCrafteo){
        this.juego = juego;
        this.vistaMesaDeCrafteo = vistaMesaDeCrafteo;
    }

    @Override
    public void handle(ActionEvent actionEvent){
        String string = vistaMesaDeCrafteo.obtenerCodigoMesaDeCrafteoGrafica();
        System.out.println(string);

        Herramienta herramienta = this.juego.construirHerramienta(string);
        this.juego.agregarHerramientaAlInventario(herramienta);

        this.vistaMesaDeCrafteo.actualizar();
        System.out.println("Se vacio mesa de crafteo");


    }
}
