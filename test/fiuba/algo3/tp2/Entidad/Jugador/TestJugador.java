package fiuba.algo3.tp2.Entidad.Jugador;

import fiuba.algo3.tp2.Entidad.Herramienta.Herramienta;
import fiuba.algo3.tp2.Entidad.Materiales.Madera;
import fiuba.algo3.tp2.Entidad.Materiales.Material;
import fiuba.algo3.tp2.Mapa.MovilidadJugador.*;
import fiuba.algo3.tp2.Mapa.Tablero;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;



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
    Tablero tablero = Tablero.getTablero(9,9);

    assertEquals(false,tablero.puedoColocar(9,9));
    }

    @Test
    public void test04JugadorSeMueveCorrectamenteDerechaVacia() {
        Tablero tablero = Tablero.getTablero(10,10);
        Movimiento derecha = new Derecha();
        tablero.moverJugador(derecha);

        assertEquals(true,tablero.puedoColocar(9,9));
        assertEquals(false,tablero.puedoColocar(9,10));

    }


    @Test
    public void test05JugadorSeMueveCorrectamenteIzquierdaVacia() {
        Tablero tablero = Tablero.getTablero(9,9);
        Movimiento izquierda = new Izquierda();
        tablero.moverJugador(izquierda);

        assertEquals(true,tablero.puedoColocar(9,9));
        assertEquals(false,tablero.puedoColocar(9,8));

    }


    @Test
    public void test06JugadorSeMueveCorrectamenteArribaVacio() {
        Tablero tablero = Tablero.getTablero(9,9);
        Movimiento arriba = new Arriba();
        tablero.moverJugador(arriba);

        assertEquals(true,tablero.puedoColocar(9,9));
        assertEquals(false,tablero.puedoColocar(8,9));

    }


    @Test
    public void test07JugadorSeMueveCorrectamenteAbajoVacio() {
        Tablero tablero = Tablero.getTablero(10,9);
        Movimiento abajo = new Abajo();
        tablero.moverJugador(abajo);

        assertEquals(true,tablero.puedoColocar(9,9));
        assertEquals(false,tablero.puedoColocar(10,9));
    }







}