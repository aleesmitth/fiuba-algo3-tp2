package fiuba.algo3.tp2.modelo.Entidad.Mapa;

import fiuba.algo3.tp2.modelo.Entidad.Jugador.Jugador;
import fiuba.algo3.tp2.modelo.Entidad.Materiales.Madera;
import fiuba.algo3.tp2.modelo.Entidad.Materiales.Material;
import fiuba.algo3.tp2.modelo.Mapa.Celda;
import fiuba.algo3.tp2.modelo.Mapa.Mapa;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestMapa {
    @Test
    public void test01NoPuedoColocarCosasEnLugarOcupadoPorJugador() {
        /**
         * Jugador iniciado en (9.9)
         */

        Mapa mapa = Mapa.getMapa();

        assertFalse(mapa.puedoColocar(9, 9));
    }

    @Test
    public void test02NoPuedoColocarCosasEnLugarOcupadoPorMaterial() {
        /**
         * Diamante iniciado en (2.2)
         */

        Mapa mapa = Mapa.getMapa();

        assertFalse(mapa.puedoColocar(2,2));
    }

    @Test
    public void test03PuedoColocarCosasEnLugarVacio() {
        /**
         * Diamante iniciado en (2.2)
         */
        Mapa mapa = Mapa.getMapa();

        assertTrue(mapa.puedoColocar(1, 1));
        assertFalse(mapa.puedoColocar(2, 2));
        assertTrue(mapa.puedoColocar(3, 3));

    }

    @Test
    public void test04PuedoColocarJugadorEnCasilleroVacio() {

        Celda celda = new Celda(1,1);
        Jugador jugador = new Jugador();

        celda.ocuparCelda(jugador);

        assertTrue(celda.celdaEstaOcupada());

    }


    @Test
    public void test05PuedoColocarMaterialEnCasilleroVacio() {

        Celda celda = new Celda(1,1);
        Material madera = new Madera();

        celda.ocuparCelda(madera);

        assertTrue(celda.celdaEstaOcupada());

    }
}
