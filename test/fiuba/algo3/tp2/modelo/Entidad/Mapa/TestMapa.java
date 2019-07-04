package fiuba.algo3.tp2.modelo.Entidad.Mapa;

import fiuba.algo3.tp2.modelo.Entidad.Jugador.Jugador;
import fiuba.algo3.tp2.modelo.Entidad.Materiales.Madera;
import fiuba.algo3.tp2.modelo.Entidad.Materiales.Material;
import fiuba.algo3.tp2.modelo.Juego.Juego;
import fiuba.algo3.tp2.modelo.Mapa.Celda;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestMapa {
    @Test
    public void test01NoPuedoColocarCosasEnLugarOcupadoPorJugador() {
        /**
         * Jugador iniciado en (2.2)
         */

        Juego juego = new Juego();
        juego.crearUnMapaParaTestSinMateriales();
        assertTrue(juego.jugadorEstaEn(2, 2));
    }

    @Test
    public void test02NoPuedoColocarCosasEnLugarOcupadoPorMaterial() {
        /**
         * Madera iniciada en (5.3)
         */

        Juego juego = new Juego();
        juego.crearUnMapaParaTestConMateriales();
        assertTrue(juego.posicionOcupadaEnMapa(5,3));
    }

    @Test
    public void test03PuedoColocarCosasEnLugarVacio() {

        Juego juego = new Juego();
        juego.crearUnMapaParaTestSinMateriales();
        assertFalse(juego.posicionOcupadaEnMapa(5, 3));

        juego.crearUnMapaParaTestConMateriales();

        assertTrue(juego.posicionOcupadaEnMapa(5, 3));

    }

    /**
     * aca la colocacion de cosas sobre el mapa tendria que hacerlo juego, todavia no esta implementado
     */
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
