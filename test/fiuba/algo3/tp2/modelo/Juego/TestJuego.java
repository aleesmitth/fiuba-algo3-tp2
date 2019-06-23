package fiuba.algo3.tp2.modelo.Juego;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestJuego {

    @Test
    public void SeVerificaJugadorInicializadoEnElJuego(){
        Juego juego = new Juego();
        juego.crearUnMapaParaTestConMateriales();

        assertTrue(juego.jugadorEstaEn(9,9));

    }

    @Test
    public void SeVerificaMaterialInicializadoEnElJuego(){
        Juego juego = new Juego();

        assertTrue(juego.posicionOcupadaEnMapa(7,7));

    }
}
