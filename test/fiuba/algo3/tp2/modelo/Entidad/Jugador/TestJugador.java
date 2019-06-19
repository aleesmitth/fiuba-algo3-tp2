package fiuba.algo3.tp2.modelo.Entidad.Jugador;

import fiuba.algo3.tp2.modelo.Entidad.Herramienta.Herramienta;
import fiuba.algo3.tp2.modelo.Entidad.Materiales.Madera;
import fiuba.algo3.tp2.modelo.Entidad.Materiales.Material;
import fiuba.algo3.tp2.modelo.Mapa.MovilidadJugador.*;
import fiuba.algo3.tp2.modelo.Mapa.Tablero;
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
        Tablero tablero = Tablero.getTableroTest();

        assertFalse(tablero.puedoColocar(9,9));

    }

    @Test
    public void test04JugadorSeMueveCorrectamenteDerechaVacia() {
        Tablero tablero = Tablero.getTableroTest(10,10);
        Movimiento derecha = new Derecha();
        assertFalse(tablero.puedoColocar(9,9));

        tablero.moverJugador(derecha);

        assertFalse(tablero.puedoColocar(9,10));

    }


    @Test
    public void test05JugadorSeMueveCorrectamenteIzquierdaVacia() {
        Tablero tablero = Tablero.getTableroTest();
        Movimiento izquierda = new Izquierda();
        assertFalse(tablero.puedoColocar(9,9));

        tablero.moverJugador(izquierda);

        assertFalse(tablero.puedoColocar(9,8));

    }


    @Test
    public void test06JugadorSeMueveCorrectamenteArribaVacio() {
        Tablero tablero = Tablero.getTableroTest();
        Movimiento arriba = new Arriba();

        assertFalse(tablero.puedoColocar(9,9));


        tablero.moverJugador(arriba);

        assertFalse(tablero.puedoColocar(8,9));

    }


    @Test
    public void test07JugadorSeMueveCorrectamenteAbajoVacio() {
        Tablero tablero = Tablero.getTableroTest(10,10);
        Movimiento abajo = new Abajo();

        assertFalse(tablero.puedoColocar(9,9));

        tablero.moverJugador(abajo);

        assertFalse(tablero.puedoColocar(10,9));
    }


    @Test
    public void test08JugadorSeMueveCorrectamenteDerechaLimite() {
        Tablero tablero = Tablero.getTableroTest();
        Movimiento derecha = new Derecha();
        assertFalse(tablero.puedoColocar(9,9));

        tablero.moverJugador(derecha);

        assertFalse(tablero.puedoColocar(9,9));

    }


    @Test
    public void test09JugadorSeMueveCorrectamenteIzquierdaLimite() {
        Tablero tablero = Tablero.getTableroTest();
        Movimiento izquierda = new Izquierda();
        assertFalse(tablero.puedoColocar(9,9));

        tablero.moverJugador(izquierda);
        tablero.moverJugador(izquierda);
        tablero.moverJugador(izquierda);
        tablero.moverJugador(izquierda);
        tablero.moverJugador(izquierda);
        tablero.moverJugador(izquierda);
        tablero.moverJugador(izquierda);
        tablero.moverJugador(izquierda);
        tablero.moverJugador(izquierda);
        tablero.moverJugador(izquierda);
        assertFalse(tablero.puedoColocar(9,8));

    }


    @Test
    public void test10JugadorSeMueveCorrectamenteArribaLimite() {
        Tablero tablero = Tablero.getTableroTest();
        Movimiento arriba = new Arriba();

        assertFalse(tablero.puedoColocar(9,9));

        tablero.moverJugador(arriba);
        tablero.moverJugador(arriba);
        tablero.moverJugador(arriba);
        tablero.moverJugador(arriba);
        tablero.moverJugador(arriba);
        tablero.moverJugador(arriba);
        tablero.moverJugador(arriba);
        tablero.moverJugador(arriba);
        tablero.moverJugador(arriba);

        assertFalse(tablero.puedoColocar(8,9));

    }


    @Test
    public void test11JugadorSeMueveCorrectamenteAbajoLimite() {

        Tablero tablero = Tablero.getTableroTest();
        Movimiento abajo = new Abajo();

        assertFalse(tablero.puedoColocar(9,9));


        tablero.moverJugador(abajo);

        assertFalse(tablero.puedoColocar(9,9));
    }

    @Test
    public void test12JugadorNoSeMueveSobreObjeto() {

        Tablero tablero = Tablero.getTableroTest();
        Movimiento arriba = new Arriba();
        Movimiento izquierda = new Izquierda();

        //Diamante inicial en posicion (8.8)//
        assertFalse(tablero.puedoColocar(8,8));


        assertFalse(tablero.puedoColocar(9,9));
        tablero.moverJugador(arriba);
        assertFalse(tablero.puedoColocar(8,9));
        tablero.moverJugador(izquierda);
        assertFalse(tablero.puedoColocar(8,9));

    }




}