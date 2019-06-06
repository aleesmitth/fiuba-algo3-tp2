package fiuba.algo3.tp2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestsJugadorTP2{

    @Test
    public void test01JugadorSeInicializaCorrectamenteConHachaDeMadera(){
        Jugador jugador = new Jugador();

        assertEquals(new Hacha(2,100,new Madera()),jugador.getPrimerHachaDeMadera());

    }
}