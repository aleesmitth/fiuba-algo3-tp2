package fiuba.algo3.tp2.Entidad.Herramientas;

import fiuba.algo3.tp2.Entidad.Herramienta.Herramienta;
import fiuba.algo3.tp2.Entidad.Jugador.Jugador;
import fiuba.algo3.tp2.Entidad.Materiales.Madera;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestTableroConstructor {

    @Test
    public void test01TableroConstruyeHachaDeMadera(){
        Jugador jugador = new Jugador();

        /**
         * se carga en la mesa de crafteo la receta de un hacha de madera.
         */
        jugador.agregarMaterialEnCasillero(new Madera(),0,0);
        jugador.agregarMaterialEnCasillero(new Madera(), 0,1);
        jugador.agregarMaterialEnCasillero(new Madera(), 1,0);
        jugador.agregarMaterialEnCasillero(new Madera(), 1,1);
        jugador.agregarMaterialEnCasillero(new Madera(), 2,1);

        /**
         * se presiona el boton de construir, que construye la receta previamente cargada
         */
        Herramienta hachaDeMadera = jugador.construirHerramienta();

        jugador.equiparHerramienta(hachaDeMadera);

        assertEquals(2, jugador.obtenerHerramientaEquipada().fuerza());
        assertEquals(100, jugador.obtenerHerramientaEquipada().durabilidad());

    }
}
