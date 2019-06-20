package fiuba.algo3.tp2.modelo.Entidad.Jugador;

import fiuba.algo3.tp2.modelo.Entidad.Herramienta.Herramienta;
import fiuba.algo3.tp2.modelo.Entidad.Materiales.Madera;
import fiuba.algo3.tp2.modelo.Entidad.Materiales.Material;
import fiuba.algo3.tp2.modelo.Juego.Juego;
import fiuba.algo3.tp2.modelo.Mapa.MovilidadJugador.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class TestJugador {

    @Test
    public void test01CorrectaInicialzacionDelJugadorConHachaDeMadera() {
        Jugador jugador = new Jugador();
        Herramienta hacha = jugador.obtenerHerramientaEquipada();

        assertEquals(100,hacha.durabilidad());
        assertEquals(2,hacha.fuerza());
    }

    @Test
    public void test02JugadorUsaHachaContraMadera() {
        Jugador jugador = new Jugador();
        Material madera = new Madera();
        jugador.usarHerramientaContra(madera);
        Herramienta hacha = jugador.obtenerHerramientaEquipada();

        assertEquals(98,hacha.durabilidad());
        assertEquals(2,hacha.fuerza());
        assertEquals(8,madera.durabilidad());
    }


    @Test
    public void test03JugadorSeIniciaCorrectamenteEnPosicionNueveXNueve() {
        Juego juego = new Juego();
        juego.crearUnMapaParaTestSinMateriales();

        assertTrue(juego.jugadorEstaEn(9,9));

    }

    @Test
    public void test04JugadorSeMueveCorrectamenteDerechaVacia() {
        Juego juego = new Juego();
        juego.crearUnMapaParaTestSinMateriales();
        Movimiento derecha = new Derecha();

        assertTrue(juego.jugadorEstaEn(9,9));
        juego.moverJugador(derecha);
        assertTrue(juego.jugadorEstaEn(9,10));

    }


    @Test
    public void test05JugadorSeMueveCorrectamenteIzquierdaVacia() {
        Juego juego = new Juego();
        juego.crearUnMapaParaTestSinMateriales();
        Movimiento izquierda = new Izquierda();

        assertTrue(juego.jugadorEstaEn(9,9));
        juego.moverJugador(izquierda);
        assertTrue(juego.jugadorEstaEn(9,8));

    }


    @Test
    public void test06JugadorSeMueveCorrectamenteArribaVacio() {
        Juego juego = new Juego();
        juego.crearUnMapaParaTestSinMateriales();
        Movimiento arriba = new Arriba();

        assertTrue(juego.jugadorEstaEn(9,9));
        juego.moverJugador(arriba);
        assertTrue(juego.jugadorEstaEn(8,9));

    }


    @Test
    public void test07JugadorSeMueveCorrectamenteAbajoVacio() {
        Juego juego = new Juego();
        juego.crearUnMapaParaTestSinMateriales();
        Movimiento abajo = new Abajo();

        assertTrue(juego.jugadorEstaEn(9,9));
        juego.moverJugador(abajo);
        assertTrue(juego.jugadorEstaEn(10,9));
    }

    /**
     * EL JUGADOR NO CAMINA MAS DE 1 TILE ARREGLARLO
     */
    /*@Test
    public void test08JugadorSeMueveCorrectamenteDerechaLimite() {
        Juego juego = new Juego();
        juego.crearUnMapaParaTestSinMateriales();
        Movimiento derecha = new Derecha();

        assertTrue(juego.jugadorEstaEn(9,9));
        juego.moverJugador(derecha);
        assertTrue(juego.jugadorEstaEn(9,10));
        juego.moverJugador(derecha);
        assertTrue(juego.jugadorEstaEn(9,11));


    }*/

    /**
     * EL JUGADOR NO CAMINA MAS DE 1 TILE ARREGLARLO
     */
    /*@Test
    public void test09JugadorSeMueveCorrectamenteIzquierdaLimite() {
        Juego juego = new Juego();
        juego.crearUnMapaParaTestSinMateriales();
        Movimiento izquierda = new Izquierda();

        assertTrue(juego.jugadorEstaEn(9,9));
        for(int i=0; i<60; i++){
            juego.moverJugador(izquierda);
        }
        assertTrue(juego.jugadorEstaEn(9,59));

    }*/

    /**
     * EL JUGADOR NO CAMINA MAS DE 1 TILE ARREGLARLO
     */
    /*@Test
    public void test10JugadorSeMueveCorrectamenteArribaLimite() {
        Mapa mapa = Mapa.getTableroTest();
        Movimiento arriba = new Arriba();

        assertFalse(mapa.puedoColocar(9,9));

        mapa.moverJugador(arriba);
        mapa.moverJugador(arriba);
        mapa.moverJugador(arriba);
        mapa.moverJugador(arriba);
        mapa.moverJugador(arriba);
        mapa.moverJugador(arriba);
        mapa.moverJugador(arriba);
        mapa.moverJugador(arriba);
        mapa.moverJugador(arriba);

        assertFalse(mapa.puedoColocar(8,9));

    }*/

    /**
     * EL JUGADOR NO CAMINA MAS DE 1 TILE ARREGLARLO
     */
    /*@Test
    public void test11JugadorSeMueveCorrectamenteAbajoLimite() {

        Mapa mapa = Mapa.getTableroTest();
        Movimiento abajo = new Abajo();

        assertFalse(mapa.puedoColocar(9,9));


        mapa.moverJugador(abajo);

        assertFalse(mapa.puedoColocar(9,9));
    }*/
    /**
     * EL JUGADOR NO CAMINA MAS DE 1 TILE ARREGLARLO
     */
    /*@Test
    public void test12JugadorNoSeMueveSobreObjeto() {

        Mapa mapa = Mapa.getTableroTest();
        Movimiento arriba = new Arriba();
        Movimiento izquierda = new Izquierda();

        //Diamante inicial en posicion (8.8)//
        assertFalse(mapa.puedoColocar(8,8));


        assertFalse(mapa.puedoColocar(9,9));
        mapa.moverJugador(arriba);
        assertFalse(mapa.puedoColocar(8,9));
        mapa.moverJugador(izquierda);
        assertFalse(mapa.puedoColocar(8,9));

    }*/




}