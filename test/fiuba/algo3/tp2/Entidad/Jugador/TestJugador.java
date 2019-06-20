package fiuba.algo3.tp2.Entidad.Jugador;

import fiuba.algo3.tp2.Entidad.Herramienta.Herramienta;
import fiuba.algo3.tp2.Entidad.Materiales.Madera;
import fiuba.algo3.tp2.Entidad.Materiales.Material;
import fiuba.algo3.tp2.Mapa.MovilidadJugador.*;
import fiuba.algo3.tp2.Mapa.Mapa;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class TestJugador {

    @Test
    public void test01CorrectaInicialzacionDelJugador() {
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
        Mapa mapa = Mapa.getTableroTest();

        assertFalse(mapa.puedoColocar(9,9));

    }

    @Test
    public void test04JugadorSeMueveCorrectamenteDerechaVacia() {
        Mapa mapa = Mapa.getTableroTest(10,10);
        Movimiento derecha = new Derecha();
        assertFalse(mapa.puedoColocar(9,9));

        mapa.moverJugador(derecha);

        assertFalse(mapa.puedoColocar(9,10));

    }


    @Test
    public void test05JugadorSeMueveCorrectamenteIzquierdaVacia() {
        Mapa mapa = Mapa.getTableroTest();
        Movimiento izquierda = new Izquierda();
        assertFalse(mapa.puedoColocar(9,9));

        mapa.moverJugador(izquierda);

        assertFalse(mapa.puedoColocar(9,8));

    }


    @Test
    public void test06JugadorSeMueveCorrectamenteArribaVacio() {
        Mapa mapa = Mapa.getTableroTest();
        Movimiento arriba = new Arriba();

        assertFalse(mapa.puedoColocar(9,9));


        mapa.moverJugador(arriba);

        assertFalse(mapa.puedoColocar(8,9));

    }


    @Test
    public void test07JugadorSeMueveCorrectamenteAbajoVacio() {
        Mapa mapa = Mapa.getTableroTest(10,10);
        Movimiento abajo = new Abajo();

        assertFalse(mapa.puedoColocar(9,9));

        mapa.moverJugador(abajo);

        assertFalse(mapa.puedoColocar(10,9));
    }


    @Test
    public void test08JugadorSeMueveCorrectamenteDerechaLimite() {
        Mapa mapa = Mapa.getTableroTest();
        Movimiento derecha = new Derecha();
        assertFalse(mapa.puedoColocar(9,9));

        mapa.moverJugador(derecha);

        assertFalse(mapa.puedoColocar(9,9));

    }


    @Test
    public void test09JugadorSeMueveCorrectamenteIzquierdaLimite() {
        Mapa mapa = Mapa.getTableroTest();
        Movimiento izquierda = new Izquierda();
        assertFalse(mapa.puedoColocar(9,9));

        mapa.moverJugador(izquierda);
        mapa.moverJugador(izquierda);
        mapa.moverJugador(izquierda);
        mapa.moverJugador(izquierda);
        mapa.moverJugador(izquierda);
        mapa.moverJugador(izquierda);
        mapa.moverJugador(izquierda);
        mapa.moverJugador(izquierda);
        mapa.moverJugador(izquierda);
        mapa.moverJugador(izquierda);
        assertFalse(mapa.puedoColocar(9,8));

    }


    @Test
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

    }


    @Test
    public void test11JugadorSeMueveCorrectamenteAbajoLimite() {

        Mapa mapa = Mapa.getTableroTest();
        Movimiento abajo = new Abajo();

        assertFalse(mapa.puedoColocar(9,9));


        mapa.moverJugador(abajo);

        assertFalse(mapa.puedoColocar(9,9));
    }

    @Test
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

    }




}