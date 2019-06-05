package fiuba.algo3.tp2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TP2Tests {

    @Test
    public void test01JugadorCreaHachaDeMaderaConDurabilidadYFuerzaAdecuados(){
        Madera madera = new Madera();
        Jugador jugador = new Jugador();
        Hacha hacha = jugador.construirHacha(madera);

        assertEquals(100, hacha.durabilidad());         //<- aca no se si conviene hacer esto o usar objetos
        assertEquals(2, hacha.fuerza());                //<- para comparar con el Assert con el Hacha

    }


}
