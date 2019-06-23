package fiuba.algo3.tp2.modelo.Entidad.Jugador;

import fiuba.algo3.tp2.modelo.Entidad.Herramienta.Herramienta;
import fiuba.algo3.tp2.modelo.Entidad.Materiales.Madera;
import fiuba.algo3.tp2.modelo.Entidad.Materiales.Material;
import fiuba.algo3.tp2.modelo.Juego.Juego;
import fiuba.algo3.tp2.modelo.Mapa.MovilidadJugador.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


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
        assertFalse(juego.jugadorEstaEn(9,9));
        assertTrue(juego.jugadorEstaEn(9,10));

    }


    @Test
    public void test05JugadorSeMueveCorrectamenteIzquierdaVacia() {
        Juego juego = new Juego();
        juego.crearUnMapaParaTestSinMateriales();
        Movimiento izquierda = new Izquierda();

        assertTrue(juego.jugadorEstaEn(9,9));
        juego.moverJugador(izquierda);
        assertFalse(juego.jugadorEstaEn(9,9));
        assertTrue(juego.jugadorEstaEn(9,8));

    }


    @Test
    public void test06JugadorSeMueveCorrectamenteArribaVacio() {
        Juego juego = new Juego();
        juego.crearUnMapaParaTestSinMateriales();
        Movimiento arriba = new Arriba();

        assertTrue(juego.jugadorEstaEn(9,9));
        juego.moverJugador(arriba);
        assertFalse(juego.jugadorEstaEn(9,9));
        assertTrue(juego.jugadorEstaEn(8,9));

    }


    @Test
    public void test07JugadorSeMueveCorrectamenteAbajoVacio() {
        Juego juego = new Juego();
        juego.crearUnMapaParaTestSinMateriales();
        Movimiento abajo = new Abajo();

        assertTrue(juego.jugadorEstaEn(9,9));
        juego.moverJugador(abajo);
        assertFalse(juego.jugadorEstaEn(9,9));
        assertTrue(juego.jugadorEstaEn(10,9));
    }

    @Test
    public void test08JugadorSeMueveCorrectamenteDerechaLimite() {
        Juego juego = new Juego();
        juego.crearUnMapaParaTestSinMateriales();
        Movimiento derecha = new Derecha();

        assertTrue(juego.jugadorEstaEn(9,9));
        for(int i=0; i<80; i++){
            juego.moverJugador(derecha);
        }
        assertTrue(juego.jugadorEstaEn(9,59));
    }


    @Test
    public void test09JugadorSeMueveCorrectamenteIzquierdaLimite() {
        Juego juego = new Juego();
        juego.crearUnMapaParaTestSinMateriales();
        Movimiento izquierda = new Izquierda();

        assertTrue(juego.jugadorEstaEn(9,9));
        for(int i=0; i<10; i++){
            juego.moverJugador(izquierda);
        }
        assertTrue(juego.jugadorEstaEn(9,0));

    }


    @Test
    public void test10JugadorSeMueveCorrectamenteArribaLimite() {
        Juego juego = new Juego();
        juego.crearUnMapaParaTestSinMateriales();
        Movimiento arriba = new Arriba();

        assertTrue(juego.jugadorEstaEn(9,9));
        for(int i=0; i<10; i++){
            juego.moverJugador(arriba);
        }
        assertTrue(juego.jugadorEstaEn(0,9));
    }


    @Test
    public void test11JugadorSeMueveCorrectamenteAbajoLimite() {
        Juego juego = new Juego();
        juego.crearUnMapaParaTestSinMateriales();
        Movimiento abajo = new Abajo();

        assertTrue(juego.jugadorEstaEn(9,9));
       for(int i=10; i<80; i++){
            juego.moverJugador(abajo);
        }
        assertTrue(juego.jugadorEstaEn(79,9));
    }


    @Test
    public void test12JugadorNoSeMueveSobreObjeto() {
        Juego juego = new Juego();
        Movimiento arriba = new Arriba();
        Movimiento izquierda = new Izquierda();
        //Material//
        assertTrue(juego.posicionOcupadaEnMapa(7,7));
        //Jugador//
        assertTrue(juego.jugadorEstaEn(9,9));

        juego.moverJugador(arriba);
        juego.moverJugador(arriba);

        assertTrue(juego.jugadorEstaEn(7,9));

        juego.moverJugador(izquierda);
        juego.moverJugador(izquierda);

        assertTrue(juego.jugadorEstaEn(7,8));
    }

}
