package fiuba.algo3.tp2.modelo.Juego;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class TestJuego {

    @Test
    public void SeVerificaJugadorInicializadoEnElJuego(){
        Juego juego = new Juego();

        assertFalse(juego.entidadIniciadaEnPosicion(9,9));

    }

    @Test
    public void SeVerificaMaterialInicializadoEnElJuego(){
        Juego juego = new Juego();

        assertFalse(juego.entidadIniciadaEnPosicion(2,2));

    }
}
