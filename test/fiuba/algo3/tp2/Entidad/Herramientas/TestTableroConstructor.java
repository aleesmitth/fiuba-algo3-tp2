package fiuba.algo3.tp2.Entidad.Herramientas;

import fiuba.algo3.tp2.Entidad.Jugador.Jugador;
import fiuba.algo3.tp2.Entidad.Materiales.Madera;
import fiuba.algo3.tp2.Entidad.Materiales.Material;
import fiuba.algo3.tp2.Entidad.Materiales.MaterialVacio;
import fiuba.algo3.tp2.Entidad.MesaDeCrafteo.TableroConstructor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestTableroConstructor {

    @Test
    public void test01TableroConstruyeHachaDeMadera(){
        Jugador jugador = new Jugador();
        TableroConstructor mesaDeCrafteo = new TableroConstructor();
        mesaDeCrafteo.agregarMaterialEnCasillero(new Madera(),0,0);
        mesaDeCrafteo.agregarMaterialEnCasillero(new Madera(), 0,1);
        mesaDeCrafteo.agregarMaterialEnCasillero(new Madera(), 1,0);
        mesaDeCrafteo.agregarMaterialEnCasillero(new Madera(), 1,1);
        mesaDeCrafteo.agregarMaterialEnCasillero(new Madera(), 2,1);
        jugador.equiparHerramienta(jugador.construirHerramienta(madera1,madera2,vacio,madera3,madera4,vacio,vacio,madera5,vacio));

        assertEquals(2, jugador.obtenerHerramientaEquipada().fuerza());
        assertEquals(100, jugador.obtenerHerramientaEquipada().durabilidad());

    }
}
