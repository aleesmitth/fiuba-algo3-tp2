package fiuba.algo3.tp2.vista.Handlers.ButtonHandlers;

import fiuba.algo3.tp2.modelo.Entidad.Materiales.Madera;
import fiuba.algo3.tp2.modelo.Entidad.Materiales.Metal;
import fiuba.algo3.tp2.modelo.Entidad.Materiales.Piedra;
import fiuba.algo3.tp2.vista.VistaInventarioMateriales;
import fiuba.algo3.tp2.vista.VistaMesaDeCrafteo;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import fiuba.algo3.tp2.modelo.Juego.Juego;

public class BotonVaciarEventHandler implements EventHandler<ActionEvent> {

    Juego juego;
    private VistaMesaDeCrafteo vistaMesaDeCrafteo;
    private VistaInventarioMateriales vistaInventarioMateriales;

    public BotonVaciarEventHandler(Juego juego, VistaInventarioMateriales vistaInventarioMateriales, VistaMesaDeCrafteo vistaMesaDeCrafteo){
        this.juego = juego;
        this.vistaInventarioMateriales = vistaInventarioMateriales;
        this.vistaMesaDeCrafteo = vistaMesaDeCrafteo;
    }

    @Override
    public void handle(ActionEvent actionEvent) {

        String string = vistaMesaDeCrafteo.obtenerCodigoMesaDeCrafteoGrafica();

        for (int i = 0; i < 9; i++) {
            switch (string.charAt(i)) {
                case 'M':
                    this.juego.agregarMaterialAlInventario(new Madera());
                    break;
                case 'P':
                    this.juego.agregarMaterialAlInventario(new Piedra());
                    break;
                case 'A':
                    this.juego.agregarMaterialAlInventario(new Metal());
                    break;
                default:
                    break;
            }
        }
        this.vistaMesaDeCrafteo.actualizar();
        this.vistaInventarioMateriales.actualizar();
    }
}
