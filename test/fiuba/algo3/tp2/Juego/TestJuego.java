package fiuba.algo3.tp2.Juego;

import fiuba.algo3.tp2.AlgoCraft.AlgoCraft;
import fiuba.algo3.tp2.Mapa.Tablero;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestJuego {

    @Test
    public void SeVerificaJugadorInicializadoEnElJuego(){
        AlgoCraft juego = new AlgoCraft();

        assertEquals(false , juego.entidadIniciadaEnPosicion(9,9));

    }

    @Test
    public void SeVerificaMaterialInicializadoEnElJuego(){
        AlgoCraft juego = new AlgoCraft();

        assertEquals(false , juego.entidadIniciadaEnPosicion(2,2));

    }
}
