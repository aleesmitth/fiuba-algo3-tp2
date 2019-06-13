package fiuba.algo3.tp2.Entidad.Mapa;

import fiuba.algo3.tp2.Entidad.Jugador.Jugador;
import fiuba.algo3.tp2.Entidad.Materiales.Madera;
import fiuba.algo3.tp2.Entidad.Materiales.Material;
import fiuba.algo3.tp2.Mapa.Celda;
import fiuba.algo3.tp2.Mapa.Tablero;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMapa {
    @Test
    public void test01NoPuedoColocarCosasEnLugarOcupadoPorJugador() {
        /**
         * Jugador iniciado en (9.9)
         */

        Tablero tablero = new Tablero(9, 9);

        assertEquals(false, tablero.puedoColocar(9, 9));
    }

    @Test
    public void test02NoPuedoColocarCosasEnLugarOcupadoPorMaterial() {
        /**
         * Diamante iniciado en (2.2)
         */

        Tablero tablero = new Tablero(9, 9);

        assertEquals(false, tablero.puedoColocar(2,2));
    }

    @Test
    public void test03PuedoColocarCosasEnLugarVacio() {
        /**
         * Diamante iniciado en (2.2)
         */
        Tablero tablero = new Tablero(9, 9);

        assertEquals(true, tablero.puedoColocar(1, 1));
        assertEquals(false, tablero.puedoColocar(2, 2));
        assertEquals(true, tablero.puedoColocar(3, 3));

    }

    @Test
    public void test04PuedoColocarJugadorEnCasilleroVacio() {

        Celda celda = new Celda(1,1);
        Jugador jugador = new Jugador();

        celda.ocuparCelda(jugador);

        assertEquals(true, celda.celdaEstaOcupada());

    }


    @Test
    public void test05PuedoColocarMaterialEnCasilleroVacio() {

        Celda celda = new Celda(1,1);
        Material madera = new Madera();

        celda.ocuparCelda(madera);

        assertEquals(true, celda.celdaEstaOcupada());

    }
}
