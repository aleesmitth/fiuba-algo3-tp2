package fiuba.algo3.tp2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestsJugadorTP2{

    @Test
    public void test01JugadorSeInicializaCorrectamenteConHachaDeMadera(){
        Jugador jugador = new Jugador();
        Hacha hachaDeMadera = (Hacha) jugador.getPrimerHachaDeMadera();
        hachaDeMadera.usarContra(new Madera());

        assertEquals(98, hachaDeMadera.durabilidad());

    }
}