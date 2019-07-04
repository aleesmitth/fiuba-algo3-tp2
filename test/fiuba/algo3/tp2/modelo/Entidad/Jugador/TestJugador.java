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

        assertTrue(juego.jugadorEstaEn(2,2));

    }

    @Test
    public void test04JugadorSeMueveCorrectamenteDerechaVacia() {
        Juego juego = new Juego();
        juego.crearUnMapaParaTestSinMateriales();
        Movimiento derecha = new Derecha();

        assertTrue(juego.jugadorEstaEn(2,2));
        juego.moverJugador(derecha);
        assertFalse(juego.jugadorEstaEn(2,2));
        assertTrue(juego.jugadorEstaEn(2,3));

    }


    @Test
    public void test05JugadorSeMueveCorrectamenteIzquierdaVacia() {
        Juego juego = new Juego();
        juego.crearUnMapaParaTestSinMateriales();
        Movimiento izquierda = new Izquierda();

        assertTrue(juego.jugadorEstaEn(2,2));
        juego.moverJugador(izquierda);
        assertFalse(juego.jugadorEstaEn(2,2));
        assertTrue(juego.jugadorEstaEn(2,1));

    }


    @Test
    public void test06JugadorSeMueveCorrectamenteArribaVacio() {
        Juego juego = new Juego();
        juego.crearUnMapaParaTestSinMateriales();
        Movimiento arriba = new Arriba();

        assertTrue(juego.jugadorEstaEn(2,2));
        juego.moverJugador(arriba);
        assertFalse(juego.jugadorEstaEn(2,2));
        assertTrue(juego.jugadorEstaEn(1,2));

    }


    @Test
    public void test07JugadorSeMueveCorrectamenteAbajoVacio() {
        Juego juego = new Juego();
        juego.crearUnMapaParaTestSinMateriales();
        Movimiento abajo = new Abajo();

        assertTrue(juego.jugadorEstaEn(2,2));
        juego.moverJugador(abajo);
        assertFalse(juego.jugadorEstaEn(2,2));
        assertTrue(juego.jugadorEstaEn(3,2));
    }

    @Test
    public void test08JugadorSeMueveCorrectamenteDerechaLimite() {
        Juego juego = new Juego();
        juego.crearUnMapaParaTestSinMateriales();
        Movimiento derecha = new Derecha();

        assertTrue(juego.jugadorEstaEn(2,2));
        for(int i=0; i<49; i++){
            juego.moverJugador(derecha);
        }
        assertTrue(juego.jugadorEstaEn(2,49));
    }


    @Test
    public void test09JugadorSeMueveCorrectamenteIzquierdaLimite() {
        Juego juego = new Juego();
        juego.crearUnMapaParaTestSinMateriales();
        Movimiento izquierda = new Izquierda();

        assertTrue(juego.jugadorEstaEn(2,2));
        for(int i=0; i<10; i++){
            juego.moverJugador(izquierda);
        }
        assertTrue(juego.jugadorEstaEn(2,0));

    }


    @Test
    public void test10JugadorSeMueveCorrectamenteArribaLimite() {
        Juego juego = new Juego();
        juego.crearUnMapaParaTestSinMateriales();
        Movimiento arriba = new Arriba();

        assertTrue(juego.jugadorEstaEn(2,2));
        for(int i=0; i<10; i++){
            juego.moverJugador(arriba);
        }
        assertTrue(juego.jugadorEstaEn(0,2));
    }


    @Test
    public void test11JugadorSeMueveCorrectamenteAbajoLimite() {
        Juego juego = new Juego();
        juego.crearUnMapaParaTestSinMateriales();
        Movimiento abajo = new Abajo();

        assertTrue(juego.jugadorEstaEn(2,2));
       for(int i=10; i<80; i++){
            juego.moverJugador(abajo);
        }
        assertTrue(juego.jugadorEstaEn(39,2));
    }


    @Test
    public void test12JugadorNoSeMueveSobreObjeto() {
        Juego juego = new Juego();
        Movimiento abajo = new Abajo();
        Movimiento derecha  = new Derecha();
        //Material//
        assertTrue(juego.posicionOcupadaEnMapa(5,3));
        //Jugador//
        assertTrue(juego.jugadorEstaEn(2,2));

        juego.moverJugador(abajo);
        juego.moverJugador(abajo);
        juego.moverJugador(abajo);
        juego.moverJugador(derecha);
        assertTrue(juego.jugadorEstaEn(5,2));
        juego.moverJugador(derecha);
        assertTrue(juego.jugadorEstaEn(5,2));
    }

    @Test
    public void test13JugadorGolpeaObjeto() {
        Juego juego = new Juego();
        Movimiento abajo = new Abajo();
        Movimiento derecha  = new Derecha();
        //Material//
        assertTrue(juego.posicionOcupadaEnMapa(5,3));
        //Jugador//
        assertTrue(juego.jugadorEstaEn(2,2));

        juego.moverJugador(abajo);
        juego.moverJugador(abajo);
        juego.moverJugador(abajo);
        juego.moverJugador(derecha);
        assertTrue(juego.jugadorEstaEn(5,2));
        juego.moverJugador(derecha);
        assertTrue(juego.jugadorEstaEn(5,2));
        juego.jugadorGolpea();
        Material golpeado = juego.obtenerMaterialEnCelda(5,3);

        assertEquals(8,golpeado.durabilidad());
    }

}
