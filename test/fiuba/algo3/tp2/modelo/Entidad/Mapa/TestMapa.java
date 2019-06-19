package fiuba.algo3.tp2.modelo.Entidad.Mapa;

import fiuba.algo3.tp2.modelo.Entidad.Jugador.Jugador;
import fiuba.algo3.tp2.modelo.Entidad.Materiales.Madera;
import fiuba.algo3.tp2.modelo.Entidad.Materiales.Material;
import fiuba.algo3.tp2.modelo.Mapa.Celda;
import fiuba.algo3.tp2.modelo.Mapa.Tablero;
import org.junit.jupiter.api.Test;

public class TestMapa {
    @Test
    public void test01NoPuedoColocarCosasEnLugarOcupadoPorJugador() {
        /**
         * Jugador iniciado en (9.9)
         */

        Tablero tablero = Tablero.getTablero();

        assertFalse(tablero.puedoColocar(9, 9));
    }

    @Test
    public void test02NoPuedoColocarCosasEnLugarOcupadoPorMaterial() {
        /**
         * Diamante iniciado en (2.2)
         */

        Tablero tablero = Tablero.getTablero();

        assertFalse(tablero.puedoColocar(2,2));
    }

    @Test
    public void test03PuedoColocarCosasEnLugarVacio() {
        /**
         * Diamante iniciado en (2.2)
         */
        Tablero tablero = Tablero.getTablero();

        assertTrue(tablero.puedoColocar(1, 1));
        assertFalse(tablero.puedoColocar(2, 2));
        assertTrue(tablero.puedoColocar(3, 3));

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
