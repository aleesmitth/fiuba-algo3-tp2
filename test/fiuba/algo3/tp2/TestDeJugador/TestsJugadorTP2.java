package fiuba.algo3.tp2.TestDeJugador;

import fiuba.algo3.tp2.Hacha;
import fiuba.algo3.tp2.Jugador;
import fiuba.algo3.tp2.Madera;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestsJugadorTP2{

    @Test
    public void test01JugadorSeInicializaCorrectamenteConHachaDeMadera(){
        Jugador jugador = new Jugador();

        TestCase.assertEquals(new Hacha(2,100,new Madera()),jugador.getPrimerHachaDeMadera());

    }
}