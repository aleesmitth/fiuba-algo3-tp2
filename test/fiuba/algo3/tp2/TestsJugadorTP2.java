package fiuba.algo3.tp2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestsJugadorTP2{

    @Test
    public void test01JugadorSeInicializaCorrectamenteConHachaDeMadera(){
        Jugador jugador = new Jugador();
        int durabilidadHachaDeMadera = jugador.getPrimerHachaDeMadera().durabilidad();
        jugador.equiparItem(jugador.getPrimerHachaDeMadera());
        jugador.usarHerramientaContra(new Madera());

        assertEquals(durabilidadHachaDeMadera-2,jugador.getPrimerHachaDeMadera().durabilidad());

    }
}