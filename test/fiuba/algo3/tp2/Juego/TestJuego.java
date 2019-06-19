package fiuba.algo3.tp2.Juego;

import fiuba.algo3.tp2.modelo.AlgoCraft.AlgoCraft;
import fiuba.algo3.tp2.modelo.Mapa.Tablero;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class TestJuego {

    @Test
    public void SeVerificaJugadorInicializadoEnElJuego(){
        AlgoCraft juego = new AlgoCraft();

        assertFalse(juego.entidadIniciadaEnPosicion(9,9));

    }

    @Test
    public void SeVerificaMaterialInicializadoEnElJuego(){
        AlgoCraft juego = new AlgoCraft();

        assertFalse(juego.entidadIniciadaEnPosicion(2,2));

    }
}
