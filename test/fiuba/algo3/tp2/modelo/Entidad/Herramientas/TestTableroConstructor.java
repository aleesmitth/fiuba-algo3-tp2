package fiuba.algo3.tp2.modelo.Entidad.Herramientas;

import fiuba.algo3.tp2.modelo.Entidad.Jugador.Jugador;
import fiuba.algo3.tp2.modelo.Entidad.Materiales.*;
import fiuba.algo3.tp2.modelo.Entidad.Materiales.MaterialVacio;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestTableroConstructor {

    @Test
    public void test01TableroConstruyeHachaDeMadera(){
        Jugador jugador = new Jugador();
        Material madera1 = new Madera();
        Material madera2 = new Madera();
        Material madera3 = new Madera();
        Material madera4 = new Madera();
        Material madera5 = new Madera();
        Material vacio = new MaterialVacio();
        jugador.equiparHerramienta(jugador.construirHerramienta(madera1,madera2,vacio,madera3,madera4,vacio,vacio,madera5,vacio));

        assertEquals(2, jugador.obtenerHerramientaEquipada().fuerza());
        assertEquals(100, jugador.obtenerHerramientaEquipada().durabilidad());

    }
}
